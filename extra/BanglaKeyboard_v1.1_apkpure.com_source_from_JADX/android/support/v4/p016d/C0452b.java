package android.support.v4.p016d;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.content.p015a.C0436a;
import android.support.v4.p006a.C0380c;
import android.support.v4.p006a.C0388h;
import android.support.v4.p016d.C0457c.C0446a;
import android.support.v4.p016d.C0457c.C04552;
import android.support.v4.p018f.C0477m;
import android.support.v4.p018f.C0485g;
import android.support.v4.p018f.C0499l;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class C0452b {
    private static final C0485g<String, Typeface> f1450a = new C0485g(16);
    private static final C0457c f1451b = new C0457c("fonts");
    private static final Object f1452c = new Object();
    private static final C0477m<String, ArrayList<C0446a<Typeface>>> f1453d = new C0477m();
    private static final Comparator<byte[]> f1454e = new C04494();

    static class C04494 implements Comparator<byte[]> {
        C04494() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return bArr[i] - bArr2[i];
                }
            }
            return 0;
        }
    }

    public static class C0450a {
        final int f1443a;
        final C0451b[] f1444b;

        public C0450a(int i, C0451b[] c0451bArr) {
            this.f1443a = i;
            this.f1444b = c0451bArr;
        }
    }

    public static class C0451b {
        public final Uri f1445a;
        public final int f1446b;
        public final int f1447c;
        public final boolean f1448d;
        final int f1449e;

        public C0451b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f1445a = (Uri) C0499l.m1295a(uri);
            this.f1446b = i;
            this.f1447c = i2;
            this.f1448d = z;
            this.f1449e = i3;
        }
    }

    public static Typeface m1181a(final Context context, final C0444a c0444a, final TextView textView, int i, int i2, final int i3) {
        final String str = c0444a.f1434f + "-" + i3;
        Typeface typeface = (Typeface) f1450a.get(str);
        if (typeface != null) {
            return typeface;
        }
        Object obj = i == 0 ? 1 : null;
        if (obj != null && i2 == -1) {
            return C0452b.m1187b(context, c0444a, i3);
        }
        Callable c04451 = new Callable<Typeface>() {
            public final /* synthetic */ Object call() {
                Typeface a = C0452b.m1187b(context, c0444a, i3);
                if (a != null) {
                    C0452b.f1450a.put(str, a);
                }
                return a;
            }
        };
        if (obj != null) {
            try {
                return (Typeface) f1451b.m1190a(c04451, i2);
            } catch (InterruptedException e) {
                return null;
            }
        }
        final WeakReference weakReference = new WeakReference(textView);
        C04472 c04472 = new C0446a<Typeface>() {
            public final /* synthetic */ void mo470a(Object obj) {
                Typeface typeface = (Typeface) obj;
                if (((TextView) weakReference.get()) != null) {
                    textView.setTypeface(typeface, i3);
                }
            }
        };
        synchronized (f1452c) {
            if (f1453d.containsKey(str)) {
                ((ArrayList) f1453d.get(str)).add(c04472);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(c04472);
            f1453d.put(str, arrayList);
            C0457c c0457c = f1451b;
            c0457c.m1191a(new C04552(c0457c, c04451, new Handler(), new C0446a<Typeface>() {
                public final /* synthetic */ void mo470a(Object obj) {
                    Typeface typeface = (Typeface) obj;
                    synchronized (C0452b.f1452c) {
                        ArrayList arrayList = (ArrayList) C0452b.f1453d.get(str);
                        C0452b.f1453d.remove(str);
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((C0446a) arrayList.get(i)).mo470a(typeface);
                    }
                }
            }));
            return null;
        }
    }

    private static List<byte[]> m1183a(Signature[] signatureArr) {
        List<byte[]> arrayList = new ArrayList();
        for (Signature toByteArray : signatureArr) {
            arrayList.add(toByteArray.toByteArray());
        }
        return arrayList;
    }

    public static Map<Uri, ByteBuffer> m1184a(Context context, C0451b[] c0451bArr) {
        Map hashMap = new HashMap();
        for (C0451b c0451b : c0451bArr) {
            if (c0451b.f1449e == 0) {
                Uri uri = c0451b.f1445a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C0388h.m1135a(context, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static boolean m1185a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static C0451b[] m1186a(Context context, C0444a c0444a, String str) {
        Throwable th;
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        Uri build = new Builder().scheme("content").authority(str).build();
        Uri build2 = new Builder().scheme("content").authority(str).appendPath("file").build();
        try {
            ArrayList arrayList2;
            Cursor query = VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0444a.f1431c}, null, null) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0444a.f1431c}, null);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        int columnIndex = query.getColumnIndex("result_code");
                        arrayList2 = new ArrayList();
                        int columnIndex2 = query.getColumnIndex("_id");
                        int columnIndex3 = query.getColumnIndex("file_id");
                        int columnIndex4 = query.getColumnIndex("font_ttc_index");
                        int columnIndex5 = query.getColumnIndex("font_weight");
                        int columnIndex6 = query.getColumnIndex("font_italic");
                        while (query.moveToNext()) {
                            int i = columnIndex != -1 ? query.getInt(columnIndex) : 0;
                            int i2 = columnIndex4 != -1 ? query.getInt(columnIndex4) : 0;
                            Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, query.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                            int i3 = columnIndex5 != -1 ? query.getInt(columnIndex5) : 400;
                            boolean z = columnIndex6 != -1 && query.getInt(columnIndex6) == 1;
                            arrayList2.add(new C0451b(withAppendedId, i2, i3, z, i));
                        }
                        if (query != null) {
                            query.close();
                        }
                        return (C0451b[]) arrayList2.toArray(new C0451b[0]);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                }
            }
            arrayList2 = arrayList;
            if (query != null) {
                query.close();
            }
            return (C0451b[]) arrayList2.toArray(new C0451b[0]);
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static Typeface m1187b(Context context, C0444a c0444a, int i) {
        int i2 = 0;
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = c0444a.f1429a;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new NameNotFoundException("No package found for authority: " + str);
            } else if (resolveContentProvider.packageName.equals(c0444a.f1430b)) {
                ProviderInfo providerInfo;
                List a = C0452b.m1183a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(a, f1454e);
                List a2 = c0444a.f1432d != null ? c0444a.f1432d : C0436a.m1150a(resources, c0444a.f1433e);
                while (i2 < a2.size()) {
                    List arrayList = new ArrayList((Collection) a2.get(i2));
                    Collections.sort(arrayList, f1454e);
                    if (C0452b.m1185a(a, arrayList)) {
                        providerInfo = resolveContentProvider;
                        break;
                    }
                    i2++;
                }
                providerInfo = null;
                C0450a c0450a = providerInfo == null ? new C0450a(1, null) : new C0450a(0, C0452b.m1186a(context, c0444a, providerInfo.authority));
                return c0450a.f1443a == 0 ? C0380c.m1100a(context, c0450a.f1444b, i) : null;
            } else {
                throw new NameNotFoundException("Found content provider " + str + ", but package was not " + c0444a.f1430b);
            }
        } catch (NameNotFoundException e) {
            return null;
        }
    }
}
