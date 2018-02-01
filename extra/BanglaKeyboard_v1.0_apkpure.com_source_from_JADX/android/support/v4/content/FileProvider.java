package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.HashMap;

public class FileProvider extends ContentProvider {
    private static final String[] f39a = new String[]{"_display_name", "_size"};
    private static final File f40b = new File("/");
    private static HashMap f41c = new HashMap();
    private C0041b f42d;

    private static C0041b m48a(Context context, String str) {
        C0041b c0041b;
        synchronized (f41c) {
            c0041b = (C0041b) f41c.get(str);
            if (c0041b == null) {
                Object a;
                try {
                    c0041b = new C0042c(str);
                    XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(str, NotificationCompat.FLAG_HIGH_PRIORITY).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                    if (loadXmlMetaData == null) {
                        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                    }
                    while (true) {
                        int next = loadXmlMetaData.next();
                        if (next == 1) {
                            break;
                        } else if (next == 2) {
                            String name = loadXmlMetaData.getName();
                            CharSequence attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                            String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                            if ("root-path".equals(name)) {
                                a = m49a(f40b, attributeValue2);
                            } else if ("files-path".equals(name)) {
                                a = m49a(context.getFilesDir(), attributeValue2);
                            } else if ("cache-path".equals(name)) {
                                a = m49a(context.getCacheDir(), attributeValue2);
                            } else if ("external-path".equals(name)) {
                                a = m49a(Environment.getExternalStorageDirectory(), attributeValue2);
                            } else {
                                a = null;
                            }
                            if (a == null) {
                                continue;
                            } else if (TextUtils.isEmpty(attributeValue)) {
                                throw new IllegalArgumentException("Name must not be empty");
                            } else {
                                c0041b.f45a.put(attributeValue, a.getCanonicalFile());
                            }
                        }
                    }
                    f41c.put(str, c0041b);
                } catch (Throwable e) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + a, e);
                } catch (Throwable e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (Throwable e22) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e22);
                }
            }
        }
        return c0041b;
    }

    private static File m49a(File file, String... strArr) {
        int length = strArr.length;
        int i = 0;
        File file2 = file;
        while (i < length) {
            String str = strArr[i];
            i++;
            file2 = str != null ? new File(file2, str) : file2;
        }
        return file2;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.f42d = m48a(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f42d.mo143a(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        File a = this.f42d.mo143a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File a = this.f42d.mo143a(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            throw new IllegalArgumentException("Invalid mode: " + str);
        }
        return ParcelFileDescriptor.open(a, i);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Object obj;
        File a = this.f42d.mo143a(uri);
        if (strArr == null) {
            strArr = f39a;
        }
        Object obj2 = new String[strArr.length];
        Object obj3 = new Object[strArr.length];
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3;
            obj = strArr[i];
            if ("_display_name".equals(obj)) {
                obj2[i2] = "_display_name";
                i3 = i2 + 1;
                obj3[i2] = a.getName();
            } else if ("_size".equals(obj)) {
                obj2[i2] = "_size";
                i3 = i2 + 1;
                obj3[i2] = Long.valueOf(a.length());
            } else {
                i3 = i2;
            }
            i++;
            i2 = i3;
        }
        obj = new String[i2];
        System.arraycopy(obj2, 0, obj, 0, i2);
        Object obj4 = new Object[i2];
        System.arraycopy(obj3, 0, obj4, 0, i2);
        Cursor matrixCursor = new MatrixCursor(obj, 1);
        matrixCursor.addRow(obj4);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
