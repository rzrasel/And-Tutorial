package com.bumptech.glide.p036f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.load.C1299g;
import com.bumptech.glide.load.p043a.C1165c;
import com.bumptech.glide.load.p044b.C1198a;
import com.bumptech.glide.load.p044b.C1217b;
import com.bumptech.glide.load.p044b.C1233c;
import com.bumptech.glide.load.p044b.C1233c.C1218a;
import com.bumptech.glide.load.p044b.C1233c.C1220c;
import com.bumptech.glide.load.p044b.C1233c.C1222e;
import com.bumptech.glide.load.p044b.C1238d;
import com.bumptech.glide.load.p044b.C1239f;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.p044b.C1242h;
import com.bumptech.glide.load.p044b.C1244i;
import com.bumptech.glide.load.resource.p055e.C1368c;
import com.bumptech.glide.p036f.p037b.C1103i;
import com.bumptech.glide.p036f.p037b.C1127g;
import com.bumptech.glide.p036f.p039a.C1117d;
import com.bumptech.glide.p038e.C1108f;
import com.bumptech.glide.p042h.C1158d;
import com.bumptech.glide.p042h.C1163h;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.Future;

public final class C1129a<A, T, Z, R> implements C1126b, C1127g, C1128e {
    private static final Queue<C1129a<?, ?, ?, ?>> f3359a = C1163h.m3153a(0);
    private C1241l<?> f3360A;
    private C1220c f3361B;
    private long f3362C;
    private int f3363D;
    private final String f3364b = String.valueOf(hashCode());
    private C1145c f3365c;
    private Drawable f3366d;
    private int f3367e;
    private int f3368f;
    private int f3369g;
    private Context f3370h;
    private C1299g<Z> f3371i;
    private C1108f<A, T, Z, R> f3372j;
    private C1140c f3373k;
    private A f3374l;
    private Class<R> f3375m;
    private boolean f3376n;
    private int f3377o;
    private C1103i<R> f3378p;
    private C1141d<? super A, R> f3379q;
    private float f3380r;
    private C1233c f3381s;
    private C1117d<R> f3382t;
    private int f3383u;
    private int f3384v;
    private C1217b f3385w;
    private Drawable f3386x;
    private Drawable f3387y;
    private boolean f3388z;

    private enum C1114a {
        ;

        static {
            f3338a = 1;
            f3339b = 2;
            f3340c = 3;
            f3341d = 4;
            f3342e = 5;
            f3343f = 6;
            f3344g = 7;
            f3345h = 8;
            f3346i = new int[]{f3338a, f3339b, f3340c, f3341d, f3342e, f3343f, f3344g, f3345h};
        }
    }

    private C1129a() {
    }

    public static <A, T, Z, R> C1129a<A, T, Z, R> m3059a(C1108f<A, T, Z, R> c1108f, A a, C1145c c1145c, Context context, int i, C1103i<R> c1103i, float f, Drawable drawable, int i2, Drawable drawable2, int i3, Drawable drawable3, int i4, C1141d<? super A, R> c1141d, C1140c c1140c, C1233c c1233c, C1299g<Z> c1299g, Class<R> cls, boolean z, C1117d<R> c1117d, int i5, int i6, C1217b c1217b) {
        C1129a<A, T, Z, R> c1129a = (C1129a) f3359a.poll();
        if (c1129a == null) {
            c1129a = new C1129a();
        }
        c1129a.f3372j = c1108f;
        c1129a.f3374l = a;
        c1129a.f3365c = c1145c;
        c1129a.f3366d = drawable3;
        c1129a.f3367e = i4;
        c1129a.f3370h = context.getApplicationContext();
        c1129a.f3377o = i;
        c1129a.f3378p = c1103i;
        c1129a.f3380r = f;
        c1129a.f3386x = drawable;
        c1129a.f3368f = i2;
        c1129a.f3387y = drawable2;
        c1129a.f3369g = i3;
        c1129a.f3379q = c1141d;
        c1129a.f3373k = c1140c;
        c1129a.f3381s = c1233c;
        c1129a.f3371i = c1299g;
        c1129a.f3375m = cls;
        c1129a.f3376n = z;
        c1129a.f3382t = c1117d;
        c1129a.f3383u = i5;
        c1129a.f3384v = i6;
        c1129a.f3385w = c1217b;
        c1129a.f3363D = C1114a.f3338a;
        if (a != null) {
            C1129a.m3061a("ModelLoader", c1108f.mo1295e(), "try .using(ModelLoader)");
            C1129a.m3061a("Transcoder", c1108f.mo1296f(), "try .as*(Class).transcode(ResourceTranscoder)");
            C1129a.m3061a("Transformation", c1299g, "try .transform(UnitTransformation.get())");
            if (c1217b.f3556e) {
                C1129a.m3061a("SourceEncoder", c1108f.mo1293c(), "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)");
            } else {
                C1129a.m3061a("SourceDecoder", c1108f.mo1292b(), "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)");
            }
            if (c1217b.f3556e || c1217b.f3557f) {
                C1129a.m3061a("CacheDecoder", c1108f.mo1291a(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (c1217b.f3557f) {
                C1129a.m3061a("Encoder", c1108f.mo1294d(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
        return c1129a;
    }

    private void m3060a(String str) {
        new StringBuilder().append(str).append(" this: ").append(this.f3364b);
    }

    private static void m3061a(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append(" must not be null");
            stringBuilder.append(", ");
            stringBuilder.append(str2);
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    private void m3062b(C1241l c1241l) {
        C1163h.m3154a();
        if (c1241l instanceof C1242h) {
            ((C1242h) c1241l).m3334e();
            this.f3360A = null;
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    private Drawable m3063i() {
        if (this.f3386x == null && this.f3368f > 0) {
            this.f3386x = this.f3370h.getResources().getDrawable(this.f3368f);
        }
        return this.f3386x;
    }

    private boolean m3064j() {
        return this.f3373k == null || this.f3373k.mo1317b(this);
    }

    private boolean m3065k() {
        return this.f3373k == null || !this.f3373k.mo1319i();
    }

    public final void mo1300a() {
        this.f3372j = null;
        this.f3374l = null;
        this.f3370h = null;
        this.f3378p = null;
        this.f3386x = null;
        this.f3387y = null;
        this.f3366d = null;
        this.f3379q = null;
        this.f3373k = null;
        this.f3371i = null;
        this.f3382t = null;
        this.f3388z = false;
        this.f3361B = null;
        f3359a.offer(this);
    }

    public final void mo1301a(int i, int i2) {
        if (Log.isLoggable("GenericRequest", 2)) {
            m3060a("Got onSizeReady in " + C1158d.m3138a(this.f3362C));
        }
        if (this.f3363D == C1114a.f3340c) {
            this.f3363D = C1114a.f3339b;
            int round = Math.round(this.f3380r * ((float) i));
            int round2 = Math.round(this.f3380r * ((float) i2));
            C1165c a = this.f3372j.mo1295e().mo1372a(this.f3374l, round, round2);
            if (a == null) {
                mo1303a(new Exception("Failed to load model: '" + this.f3374l + "'"));
                return;
            }
            C1241l a2;
            C1242h c1242h;
            C1220c c1220c;
            C1368c f = this.f3372j.mo1296f();
            if (Log.isLoggable("GenericRequest", 2)) {
                m3060a("finished setup for calling load in " + C1158d.m3138a(this.f3362C));
            }
            this.f3388z = true;
            C1233c c1233c = this.f3381s;
            C1145c c1145c = this.f3365c;
            C1108f c1108f = this.f3372j;
            C1299g c1299g = this.f3371i;
            int i3 = this.f3377o;
            boolean z = this.f3376n;
            C1217b c1217b = this.f3385w;
            C1163h.m3154a();
            long a3 = C1158d.m3139a();
            C1145c c1239f = new C1239f(a.mo1326b(), c1145c, round, round2, c1108f.mo1291a(), c1108f.mo1292b(), c1299g, c1108f.mo1294d(), f, c1108f.mo1293c());
            if (z) {
                a2 = c1233c.f3579b.mo1353a(c1239f);
                if (a2 == null) {
                    a2 = null;
                } else if (a2 instanceof C1242h) {
                    c1242h = (C1242h) a2;
                } else {
                    Object c1242h2 = new C1242h(a2, true);
                }
                if (a2 != null) {
                    a2.m3333d();
                    c1233c.f3581d.put(c1239f, new C1222e(c1239f, a2, c1233c.m3312a()));
                }
            } else {
                a2 = null;
            }
            if (a2 != null) {
                mo1302a(a2);
                if (Log.isLoggable("Engine", 2)) {
                    C1233c.m3311a("Loaded resource from cache", a3, c1239f);
                }
                c1220c = null;
            } else {
                if (z) {
                    WeakReference weakReference = (WeakReference) c1233c.f3581d.get(c1239f);
                    if (weakReference != null) {
                        c1242h = (C1242h) weakReference.get();
                        if (c1242h != null) {
                            c1242h.m3333d();
                        } else {
                            c1233c.f3581d.remove(c1239f);
                        }
                    } else {
                        a2 = null;
                    }
                } else {
                    a2 = null;
                }
                if (a2 != null) {
                    mo1302a(a2);
                    if (Log.isLoggable("Engine", 2)) {
                        C1233c.m3311a("Loaded resource from active resources", a3, c1239f);
                    }
                    c1220c = null;
                } else {
                    C1238d c1238d = (C1238d) c1233c.f3578a.get(c1239f);
                    if (c1238d != null) {
                        c1238d.m3321a((C1128e) this);
                        if (Log.isLoggable("Engine", 2)) {
                            C1233c.m3311a("Added to existing load", a3, c1239f);
                        }
                        c1220c = new C1220c(this, c1238d);
                    } else {
                        C1218a c1218a = c1233c.f3580c;
                        C1238d c1238d2 = new C1238d(c1239f, c1218a.f3558a, c1218a.f3559b, z, c1218a.f3560c);
                        Runnable c1244i = new C1244i(c1238d2, new C1198a(c1239f, round, round2, a, c1108f, c1299g, f, c1233c.f3582e, c1217b, i3), i3);
                        c1233c.f3578a.put(c1239f, c1238d2);
                        c1238d2.m3321a((C1128e) this);
                        c1238d2.f3600i = c1244i;
                        c1238d2.f3601j = c1238d2.f3595d.submit(c1244i);
                        if (Log.isLoggable("Engine", 2)) {
                            C1233c.m3311a("Started new load", a3, c1239f);
                        }
                        c1220c = new C1220c(this, c1238d2);
                    }
                }
            }
            this.f3361B = c1220c;
            this.f3388z = this.f3360A != null;
            if (Log.isLoggable("GenericRequest", 2)) {
                m3060a("finished onSizeReady in " + C1158d.m3138a(this.f3362C));
            }
        }
    }

    public final void mo1302a(C1241l<?> c1241l) {
        if (c1241l == null) {
            mo1303a(new Exception("Expected to receive a Resource<R> with an object of " + this.f3375m + " inside, but instead got null."));
            return;
        }
        Object a = c1241l.mo1367a();
        if (a == null || !this.f3375m.isAssignableFrom(a.getClass())) {
            m3062b(c1241l);
            mo1303a(new Exception("Expected to receive an object of " + this.f3375m + " but instead got " + (a != null ? a.getClass() : "") + "{" + a + "} inside Resource{" + c1241l + "}." + (a != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")));
            return;
        }
        Object obj = (this.f3373k == null || this.f3373k.mo1316a(this)) ? 1 : null;
        if (obj == null) {
            m3062b(c1241l);
            this.f3363D = C1114a.f3341d;
            return;
        }
        boolean k = m3065k();
        this.f3363D = C1114a.f3341d;
        this.f3360A = c1241l;
        if (this.f3379q == null || !this.f3379q.m3107b()) {
            this.f3378p.mo1290a(a, this.f3382t.mo1298a(this.f3388z, k));
        }
        if (this.f3373k != null) {
            this.f3373k.mo1318c(this);
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            m3060a("Resource ready in " + C1158d.m3138a(this.f3362C) + " size: " + (((double) c1241l.mo1368b()) * 9.5367431640625E-7d) + " fromCache: " + this.f3388z);
        }
    }

    public final void mo1303a(Exception exception) {
        Log.isLoggable("GenericRequest", 3);
        this.f3363D = C1114a.f3342e;
        if (this.f3379q != null) {
            C1141d c1141d = this.f3379q;
            m3065k();
            if (c1141d.m3106a()) {
                return;
            }
        }
        if (m3064j()) {
            Drawable drawable;
            if (this.f3374l == null) {
                if (this.f3366d == null && this.f3367e > 0) {
                    this.f3366d = this.f3370h.getResources().getDrawable(this.f3367e);
                }
                drawable = this.f3366d;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                if (this.f3387y == null && this.f3369g > 0) {
                    this.f3387y = this.f3370h.getResources().getDrawable(this.f3369g);
                }
                drawable = this.f3387y;
            }
            if (drawable == null) {
                drawable = m3063i();
            }
            this.f3378p.mo1283a(exception, drawable);
        }
    }

    public final void mo1304b() {
        this.f3362C = C1158d.m3139a();
        if (this.f3374l == null) {
            mo1303a(null);
            return;
        }
        this.f3363D = C1114a.f3340c;
        if (C1163h.m3155a(this.f3383u, this.f3384v)) {
            mo1301a(this.f3383u, this.f3384v);
        } else {
            this.f3378p.mo1289a((C1127g) this);
        }
        if (!mo1308f()) {
            if ((this.f3363D == C1114a.f3342e ? 1 : null) == null && m3064j()) {
                this.f3378p.mo1281a(m3063i());
            }
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            m3060a("finished run method in " + C1158d.m3138a(this.f3362C));
        }
    }

    public final void mo1305c() {
        C1163h.m3154a();
        if (this.f3363D != C1114a.f3344g) {
            this.f3363D = C1114a.f3343f;
            if (this.f3361B != null) {
                C1220c c1220c = this.f3361B;
                C1238d c1238d = c1220c.f3563a;
                C1128e c1128e = c1220c.f3564b;
                C1163h.m3154a();
                if (c1238d.f3597f || c1238d.f3598g) {
                    if (c1238d.f3599h == null) {
                        c1238d.f3599h = new HashSet();
                    }
                    c1238d.f3599h.add(c1128e);
                } else {
                    c1238d.f3592a.remove(c1128e);
                    if (!(!c1238d.f3592a.isEmpty() || c1238d.f3598g || c1238d.f3597f || c1238d.f3596e)) {
                        C1244i c1244i = c1238d.f3600i;
                        c1244i.f3631b = true;
                        C1198a c1198a = c1244i.f3630a;
                        c1198a.f3521d = true;
                        c1198a.f3519b.mo1327c();
                        Future future = c1238d.f3601j;
                        if (future != null) {
                            future.cancel(true);
                        }
                        c1238d.f3596e = true;
                        c1238d.f3593b.mo1362a(c1238d, c1238d.f3594c);
                    }
                }
                this.f3361B = null;
            }
            if (this.f3360A != null) {
                m3062b(this.f3360A);
            }
            if (m3064j()) {
                this.f3378p.mo1286b(m3063i());
            }
            this.f3363D = C1114a.f3344g;
        }
    }

    public final void mo1306d() {
        mo1305c();
        this.f3363D = C1114a.f3345h;
    }

    public final boolean mo1307e() {
        return this.f3363D == C1114a.f3339b || this.f3363D == C1114a.f3340c;
    }

    public final boolean mo1308f() {
        return this.f3363D == C1114a.f3341d;
    }

    public final boolean mo1309g() {
        return mo1308f();
    }

    public final boolean mo1310h() {
        return this.f3363D == C1114a.f3343f || this.f3363D == C1114a.f3344g;
    }
}
