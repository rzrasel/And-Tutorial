package com.bumptech.glide;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.manager.C1102h;
import com.bumptech.glide.manager.C1373l;
import com.bumptech.glide.manager.C1375g;
import com.bumptech.glide.manager.C1378c.C1153a;
import com.bumptech.glide.manager.C1379d;
import com.bumptech.glide.manager.C1381e;
import com.bumptech.glide.manager.C1383i;
import com.bumptech.glide.manager.C1387m;
import com.bumptech.glide.p036f.C1126b;
import com.bumptech.glide.p042h.C1163h;

public final class C1164h implements C1102h {
    final Context f3453a;
    final C1375g f3454b;
    final C1387m f3455c;
    public final C1113e f3456d;
    final C1152b f3457e;
    private final C1373l f3458f;

    public final class C1151a<A, T> {
        final C1252l<A, T> f3429a;
        final Class<T> f3430b;
        final /* synthetic */ C1164h f3431c;

        public final class C1150a {
            final /* synthetic */ C1151a f3425a;
            private final A f3426b;
            private final Class<A> f3427c;
            private final boolean f3428d;

            C1150a(C1151a c1151a, Class<A> cls) {
                this.f3425a = c1151a;
                this.f3428d = false;
                this.f3426b = null;
                this.f3427c = cls;
            }

            public C1150a(C1151a c1151a, A a) {
                this.f3425a = c1151a;
                this.f3428d = true;
                this.f3426b = a;
                this.f3427c = a != null ? a.getClass() : null;
            }

            public final <Z> C1101d<A, T, Z> m3127a(Class<Z> cls) {
                C1101d<A, T, Z> c1101d = new C1101d(this.f3425a.f3431c.f3453a, this.f3425a.f3431c.f3456d, this.f3427c, this.f3425a.f3429a, this.f3425a.f3430b, cls, this.f3425a.f3431c.f3455c, this.f3425a.f3431c.f3454b, this.f3425a.f3431c.f3457e);
                if (this.f3428d) {
                    c1101d.mo1273b(this.f3426b);
                }
                return c1101d;
            }
        }

        C1151a(C1164h c1164h, C1252l<A, T> c1252l, Class<T> cls) {
            this.f3431c = c1164h;
            this.f3429a = c1252l;
            this.f3430b = cls;
        }

        public final C1150a m3128a(Class<A> cls) {
            return new C1150a(this, (Class) cls);
        }
    }

    class C1152b {
        final /* synthetic */ C1164h f3432a;

        C1152b(C1164h c1164h) {
            this.f3432a = c1164h;
        }
    }

    private static class C1154c implements C1153a {
        private final C1387m f3433a;

        public C1154c(C1387m c1387m) {
            this.f3433a = c1387m;
        }

        public final void mo1323a(boolean z) {
            if (z) {
                C1387m c1387m = this.f3433a;
                for (C1126b c1126b : C1163h.m3152a(c1387m.f3864a)) {
                    if (!(c1126b.mo1308f() || c1126b.mo1310h())) {
                        c1126b.mo1306d();
                        if (c1387m.f3866c) {
                            c1387m.f3865b.add(c1126b);
                        } else {
                            c1126b.mo1304b();
                        }
                    }
                }
            }
        }
    }

    public C1164h(Context context, C1375g c1375g, C1373l c1373l) {
        C1387m c1387m = new C1387m();
        C1379d c1379d = new C1379d();
        this(context, c1375g, c1373l, c1387m);
    }

    private C1164h(Context context, final C1375g c1375g, C1373l c1373l, C1387m c1387m) {
        this.f3453a = context.getApplicationContext();
        this.f3454b = c1375g;
        this.f3458f = c1373l;
        this.f3455c = c1387m;
        this.f3456d = C1113e.m3022a(context);
        this.f3457e = new C1152b(this);
        C1102h c1381e = (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? 1 : null) != null ? new C1381e(context, new C1154c(c1387m)) : new C1383i();
        if (C1163h.m3158c()) {
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                final /* synthetic */ C1164h f3424b;

                public final void run() {
                    c1375g.mo1394a(this.f3424b);
                }
            });
        } else {
            c1375g.mo1394a(this);
        }
        c1375g.mo1394a(c1381e);
    }

    public final <T> C1095b<T> m3159a(Class<T> cls) {
        C1252l a = C1113e.m3024a((Class) cls, this.f3453a);
        C1252l b = C1113e.m3030b(cls, this.f3453a);
        if (a == null && b == null) {
            throw new IllegalArgumentException("Unknown type " + cls + ". You must provide a Model of a type for which there is a registered ModelLoader, if you are using a custom model, you must first call Glide#register with a ModelLoaderFactory for your custom model class");
        }
        return new C1095b(cls, a, b, this.f3453a, this.f3456d, this.f3455c, this.f3454b, this.f3457e);
    }

    public final <A, T> C1151a<A, T> m3160a(C1252l<A, T> c1252l, Class<T> cls) {
        return new C1151a(this, c1252l, cls);
    }

    public final void m3161a() {
        C1113e c1113e = this.f3456d;
        C1163h.m3154a();
        c1113e.f3326c.m3285a();
        c1113e.f3325b.mo1343a();
    }

    public final void a_() {
        C1387m c1387m = this.f3455c;
        for (C1126b c : C1163h.m3152a(c1387m.f3864a)) {
            c.mo1305c();
        }
        c1387m.f3865b.clear();
    }

    public final void mo1285b() {
        C1163h.m3154a();
        C1387m c1387m = this.f3455c;
        c1387m.f3866c = false;
        for (C1126b c1126b : C1163h.m3152a(c1387m.f3864a)) {
            if (!(c1126b.mo1308f() || c1126b.mo1310h() || c1126b.mo1307e())) {
                c1126b.mo1304b();
            }
        }
        c1387m.f3865b.clear();
    }

    public final void mo1287c() {
        C1163h.m3154a();
        C1387m c1387m = this.f3455c;
        c1387m.f3866c = true;
        for (C1126b c1126b : C1163h.m3152a(c1387m.f3864a)) {
            if (c1126b.mo1307e()) {
                c1126b.mo1306d();
                c1387m.f3865b.add(c1126b);
            }
        }
    }
}
