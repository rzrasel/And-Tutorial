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
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileProvider extends ContentProvider {
    private static final String[] f1405a = new String[]{"_display_name", "_size"};
    private static final File f1406b = new File("/");
    private static HashMap<String, C0430a> f1407c = new HashMap();
    private C0430a f1408d;

    interface C0430a {
        File mo469a(Uri uri);
    }

    static class C0431b implements C0430a {
        final HashMap<String, File> f1403a = new HashMap();
        private final String f1404b;

        public C0431b(String str) {
            this.f1404b = str;
        }

        public final File mo469a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f1403a.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }
    }

    private static C0430a m1147a(Context context, String str) {
        C0430a c0430a;
        synchronized (f1407c) {
            c0430a = (C0430a) f1407c.get(str);
            if (c0430a == null) {
                Object a;
                try {
                    C0431b c0431b = new C0431b(str);
                    XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(str, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                    if (loadXmlMetaData == null) {
                        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                    }
                    while (true) {
                        int next = loadXmlMetaData.next();
                        if (next == 1) {
                            break;
                        } else if (next == 2) {
                            File file;
                            String name = loadXmlMetaData.getName();
                            CharSequence attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                            String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                            if ("root-path".equals(name)) {
                                file = f1406b;
                            } else if ("files-path".equals(name)) {
                                file = context.getFilesDir();
                            } else if ("cache-path".equals(name)) {
                                file = context.getCacheDir();
                            } else if ("external-path".equals(name)) {
                                file = Environment.getExternalStorageDirectory();
                            } else {
                                File[] externalFilesDirs;
                                if ("external-files-path".equals(name)) {
                                    externalFilesDirs = C0392a.getExternalFilesDirs(context, null);
                                    if (externalFilesDirs.length > 0) {
                                        file = externalFilesDirs[0];
                                    }
                                } else if ("external-cache-path".equals(name)) {
                                    externalFilesDirs = C0392a.getExternalCacheDirs(context);
                                    if (externalFilesDirs.length > 0) {
                                        file = externalFilesDirs[0];
                                    }
                                }
                                file = null;
                            }
                            if (file != null) {
                                a = m1148a(file, attributeValue2);
                                if (TextUtils.isEmpty(attributeValue)) {
                                    throw new IllegalArgumentException("Name must not be empty");
                                }
                                c0431b.f1403a.put(attributeValue, a.getCanonicalFile());
                            } else {
                                continue;
                            }
                        }
                    }
                    f1407c.put(str, c0431b);
                    c0430a = c0431b;
                } catch (Throwable e) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + a, e);
                } catch (Throwable e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (Throwable e22) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e22);
                }
            }
        }
        return c0430a;
    }

    private static File m1148a(File file, String... strArr) {
        int i = 0;
        File file2 = file;
        while (i <= 0) {
            String str = strArr[0];
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
            this.f1408d = m1147a(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f1408d.mo469a(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        File a = this.f1408d.mo469a(uri);
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
        File a = this.f1408d.mo469a(uri);
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
        File a = this.f1408d.mo469a(uri);
        if (strArr == null) {
            strArr = f1405a;
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
