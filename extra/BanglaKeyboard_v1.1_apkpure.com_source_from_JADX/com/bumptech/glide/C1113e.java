package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.load.C1176a;
import com.bumptech.glide.load.p044b.C1233c;
import com.bumptech.glide.load.p044b.p045b.C1209f;
import com.bumptech.glide.load.p044b.p045b.C1210h;
import com.bumptech.glide.load.p044b.p045b.C1211g;
import com.bumptech.glide.load.p044b.p045b.C1215i;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.load.p044b.p046a.C1188d;
import com.bumptech.glide.load.p044b.p046a.C1193f;
import com.bumptech.glide.load.p044b.p047c.C1229a;
import com.bumptech.glide.load.p044b.p048d.C1236a;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1283c;
import com.bumptech.glide.load.p049c.C1284d;
import com.bumptech.glide.load.p049c.C1289g;
import com.bumptech.glide.load.p049c.p050a.C1255a.C1251a;
import com.bumptech.glide.load.p049c.p050a.C1258c.C1256a;
import com.bumptech.glide.load.p049c.p050a.C1261d.C1259a;
import com.bumptech.glide.load.p049c.p050a.C1264e.C1262a;
import com.bumptech.glide.load.p049c.p051b.C1268a.C1266a;
import com.bumptech.glide.load.p049c.p051b.C1270b.C1269a;
import com.bumptech.glide.load.p049c.p051b.C1272c.C1271a;
import com.bumptech.glide.load.p049c.p051b.C1274e.C1273a;
import com.bumptech.glide.load.p049c.p051b.C1276f.C1275a;
import com.bumptech.glide.load.p049c.p051b.C1278g.C1277a;
import com.bumptech.glide.load.p049c.p051b.C1281h.C1279a;
import com.bumptech.glide.load.resource.bitmap.C1319e;
import com.bumptech.glide.load.resource.bitmap.C1324g;
import com.bumptech.glide.load.resource.bitmap.C1326i;
import com.bumptech.glide.load.resource.bitmap.C1328j;
import com.bumptech.glide.load.resource.bitmap.C1331m;
import com.bumptech.glide.load.resource.bitmap.C1334o;
import com.bumptech.glide.load.resource.p040a.C1136b;
import com.bumptech.glide.load.resource.p052b.C1311d;
import com.bumptech.glide.load.resource.p053c.C1342b;
import com.bumptech.glide.load.resource.p053c.C1343c;
import com.bumptech.glide.load.resource.p054d.C1358a;
import com.bumptech.glide.load.resource.p054d.C1365f;
import com.bumptech.glide.load.resource.p054d.C1366g;
import com.bumptech.glide.load.resource.p055e.C1369a;
import com.bumptech.glide.load.resource.p055e.C1370b;
import com.bumptech.glide.load.resource.p055e.C1371d;
import com.bumptech.glide.manager.C1386k;
import com.bumptech.glide.p035d.C1099a;
import com.bumptech.glide.p035d.C1100b;
import com.bumptech.glide.p036f.C1126b;
import com.bumptech.glide.p036f.p037b.C1103i;
import com.bumptech.glide.p036f.p037b.C1105j;
import com.bumptech.glide.p036f.p037b.C1132d;
import com.bumptech.glide.p036f.p039a.C1119c;
import com.bumptech.glide.p038e.C1107b;
import com.bumptech.glide.p038e.C1110c;
import com.bumptech.glide.p042h.C1163h;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class C1113e {
    private static volatile C1113e f3322g;
    private static boolean f3323h = true;
    final C1233c f3324a;
    public final C1187c f3325b;
    public final C1210h f3326c;
    final C1371d f3327d = new C1371d();
    final C1365f f3328e;
    final C1365f f3329f;
    private final C1283c f3330i;
    private final C1176a f3331j;
    private final C1132d f3332k = new C1132d();
    private final C1110c f3333l;
    private final C1319e f3334m;
    private final C1326i f3335n;
    private final Handler f3336o;
    private final C1236a f3337p;

    private static class C1106a extends C1105j<View, Object> {
        public C1106a(View view) {
            super(view);
        }

        public final void mo1281a(Drawable drawable) {
        }

        public final void mo1283a(Exception exception, Drawable drawable) {
        }

        public final void mo1290a(Object obj, C1119c<? super Object> c1119c) {
        }

        public final void mo1286b(Drawable drawable) {
        }
    }

    private C1113e(C1233c c1233c, C1210h c1210h, C1187c c1187c, Context context, C1176a c1176a) {
        this.f3324a = c1233c;
        this.f3325b = c1187c;
        this.f3326c = c1210h;
        this.f3331j = c1176a;
        this.f3330i = new C1283c(context);
        this.f3336o = new Handler(Looper.getMainLooper());
        this.f3337p = new C1236a(c1210h, c1187c, c1176a);
        this.f3333l = new C1110c();
        C1107b c1334o = new C1334o(c1187c, c1176a);
        this.f3333l.m3010a(InputStream.class, Bitmap.class, c1334o);
        C1107b c1324g = new C1324g(c1187c, c1176a);
        this.f3333l.m3010a(ParcelFileDescriptor.class, Bitmap.class, c1324g);
        C1107b c1331m = new C1331m(c1334o, c1324g);
        this.f3333l.m3010a(C1289g.class, Bitmap.class, c1331m);
        c1334o = new C1343c(context, c1187c);
        this.f3333l.m3010a(InputStream.class, C1342b.class, c1334o);
        this.f3333l.m3010a(C1289g.class, C1358a.class, new C1366g(c1331m, c1334o, c1187c));
        this.f3333l.m3010a(InputStream.class, File.class, new C1311d());
        m3028a(File.class, ParcelFileDescriptor.class, new C1251a());
        m3028a(File.class, InputStream.class, new C1271a());
        m3028a(Integer.TYPE, ParcelFileDescriptor.class, new C1256a());
        m3028a(Integer.TYPE, InputStream.class, new C1273a());
        m3028a(Integer.class, ParcelFileDescriptor.class, new C1256a());
        m3028a(Integer.class, InputStream.class, new C1273a());
        m3028a(String.class, ParcelFileDescriptor.class, new C1259a());
        m3028a(String.class, InputStream.class, new C1275a());
        m3028a(Uri.class, ParcelFileDescriptor.class, new C1262a());
        m3028a(Uri.class, InputStream.class, new C1277a());
        m3028a(URL.class, InputStream.class, new C1279a());
        m3028a(C1284d.class, InputStream.class, new C1266a());
        m3028a(byte[].class, InputStream.class, new C1269a());
        this.f3327d.m3557a(Bitmap.class, C1328j.class, new C1370b(context.getResources(), c1187c));
        this.f3327d.m3557a(C1358a.class, C1136b.class, new C1369a(new C1370b(context.getResources(), c1187c)));
        this.f3334m = new C1319e(c1187c);
        this.f3328e = new C1365f(c1187c, this.f3334m);
        this.f3335n = new C1326i(c1187c);
        this.f3329f = new C1365f(c1187c, this.f3335n);
    }

    public static C1113e m3022a(Context context) {
        if (f3322g == null) {
            synchronized (C1113e.class) {
                if (f3322g == null) {
                    Context applicationContext = context.getApplicationContext();
                    C1143f c1143f = new C1143f(applicationContext);
                    List<C1099a> a = f3323h ? new C1100b(applicationContext).m2971a() : Collections.emptyList();
                    for (C1099a a2 : a) {
                        a2.mo2371a(c1143f);
                    }
                    if (c1143f.f3410e == null) {
                        c1143f.f3410e = new C1229a(Math.max(1, Runtime.getRuntime().availableProcessors()));
                    }
                    if (c1143f.f3411f == null) {
                        c1143f.f3411f = new C1229a(1);
                    }
                    C1215i c1215i = new C1215i(c1143f.f3406a);
                    if (c1143f.f3408c == null) {
                        if (VERSION.SDK_INT >= 11) {
                            c1143f.f3408c = new C1193f(c1215i.f3547a);
                        } else {
                            c1143f.f3408c = new C1188d();
                        }
                    }
                    if (c1143f.f3409d == null) {
                        c1143f.f3409d = new C1211g(c1215i.f3548b);
                    }
                    if (c1143f.f3413h == null) {
                        c1143f.f3413h = new C1209f(c1143f.f3406a);
                    }
                    if (c1143f.f3407b == null) {
                        c1143f.f3407b = new C1233c(c1143f.f3409d, c1143f.f3413h, c1143f.f3411f, c1143f.f3410e);
                    }
                    if (c1143f.f3412g == null) {
                        c1143f.f3412g = C1176a.f3477d;
                    }
                    f3322g = new C1113e(c1143f.f3407b, c1143f.f3409d, c1143f.f3408c, c1143f.f3406a, c1143f.f3412g);
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        it.next();
                        C1113e c1113e = f3322g;
                    }
                }
            }
        }
        return f3322g;
    }

    public static C1164h m3023a(FragmentActivity fragmentActivity) {
        return C1386k.m3572a().m3576a(fragmentActivity);
    }

    public static <T> C1252l<T, InputStream> m3024a(Class<T> cls, Context context) {
        return C1113e.m3025a((Class) cls, InputStream.class, context);
    }

    private static <T, Y> C1252l<T, Y> m3025a(Class<T> cls, Class<Y> cls2, Context context) {
        if (cls != null) {
            return C1113e.m3022a(context).f3330i.m3374a(cls, cls2);
        }
        Log.isLoggable("Glide", 3);
        return null;
    }

    public static void m3026a(View view) {
        C1113e.m3027a(new C1106a(view));
    }

    public static void m3027a(C1103i<?> c1103i) {
        C1163h.m3154a();
        C1126b e = c1103i.mo1288e();
        if (e != null) {
            e.mo1305c();
            c1103i.mo1282a(null);
        }
    }

    private <T, Y> void m3028a(Class<T> cls, Class<Y> cls2, C1250m<T, Y> c1250m) {
        this.f3330i.m3375a((Class) cls, (Class) cls2, (C1250m) c1250m);
    }

    public static C1164h m3029b(Context context) {
        return C1386k.m3572a().m3575a(context);
    }

    public static <T> C1252l<T, ParcelFileDescriptor> m3030b(Class<T> cls, Context context) {
        return C1113e.m3025a((Class) cls, ParcelFileDescriptor.class, context);
    }

    final <T, Z> C1107b<T, Z> m3031a(Class<T> cls, Class<Z> cls2) {
        return this.f3333l.m3009a(cls, cls2);
    }
}
