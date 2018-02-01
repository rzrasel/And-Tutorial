package com.bumptech.glide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.load.C1299g;
import com.bumptech.glide.load.C1300d;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p044b.C1217b;
import com.bumptech.glide.load.resource.C1367d;
import com.bumptech.glide.manager.C1375g;
import com.bumptech.glide.manager.C1387m;
import com.bumptech.glide.p036f.C1126b;
import com.bumptech.glide.p036f.C1129a;
import com.bumptech.glide.p036f.C1140c;
import com.bumptech.glide.p036f.C1141d;
import com.bumptech.glide.p036f.C1142f;
import com.bumptech.glide.p036f.p037b.C1103i;
import com.bumptech.glide.p036f.p037b.C1134e;
import com.bumptech.glide.p036f.p039a.C1117d;
import com.bumptech.glide.p036f.p039a.C1123e;
import com.bumptech.glide.p038e.C1108f;
import com.bumptech.glide.p038e.C1109a;
import com.bumptech.glide.p041g.C1146b;
import com.bumptech.glide.p042h.C1163h;
import java.io.File;

public class C1088c<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {
    private boolean f3169A;
    private Drawable f3170B;
    private int f3171C;
    protected final Class<ModelType> f3172a;
    protected final Context f3173b;
    protected final C1113e f3174c;
    protected final Class<TranscodeType> f3175d;
    protected final C1387m f3176e;
    protected final C1375g f3177f;
    private C1109a<ModelType, DataType, ResourceType, TranscodeType> f3178g;
    private ModelType f3179h;
    private C1145c f3180i = C1146b.m3124a();
    private boolean f3181j;
    private int f3182k;
    private int f3183l;
    private C1141d<? super ModelType, TranscodeType> f3184m;
    private Float f3185n;
    private C1088c<?, ?, ?, TranscodeType> f3186o;
    private Float f3187p = Float.valueOf(1.0f);
    private Drawable f3188q;
    private Drawable f3189r;
    private int f3190s = 0;
    private boolean f3191t = true;
    private C1117d<TranscodeType> f3192u = C1123e.m3042a();
    private int f3193v = -1;
    private int f3194w = -1;
    private C1217b f3195x = C1217b.RESULT;
    private C1299g<ResourceType> f3196y = C1367d.m3547b();
    private boolean f3197z;

    C1088c(Context context, Class<ModelType> cls, C1108f<ModelType, DataType, ResourceType, TranscodeType> c1108f, Class<TranscodeType> cls2, C1113e c1113e, C1387m c1387m, C1375g c1375g) {
        this.f3173b = context;
        this.f3172a = cls;
        this.f3175d = cls2;
        this.f3174c = c1113e;
        this.f3176e = c1387m;
        this.f3177f = c1375g;
        this.f3178g = c1108f != null ? new C1109a(c1108f) : null;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        } else if (cls != null && c1108f == null) {
            throw new NullPointerException("LoadProvider must not be null");
        }
    }

    private int mo1261a() {
        return this.f3190s == C1148g.f3420d ? C1148g.f3419c : this.f3190s == C1148g.f3419c ? C1148g.f3418b : C1148g.f3417a;
    }

    private C1126b m2878a(C1103i<TranscodeType> c1103i, float f, int i, C1140c c1140c) {
        return C1129a.m3059a(this.f3178g, this.f3179h, this.f3180i, this.f3173b, i, c1103i, f, this.f3188q, this.f3182k, this.f3189r, this.f3183l, this.f3170B, this.f3171C, this.f3184m, c1140c, this.f3174c.f3324a, this.f3196y, this.f3175d, this.f3191t, this.f3192u, this.f3194w, this.f3193v, this.f3195x);
    }

    private C1126b m2879a(C1103i<TranscodeType> c1103i, C1142f c1142f) {
        C1126b c1142f2;
        if (this.f3186o != null) {
            if (this.f3169A) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (this.f3186o.f3192u.equals(C1123e.m3042a())) {
                this.f3186o.f3192u = this.f3192u;
            }
            if (this.f3186o.f3190s == 0) {
                this.f3186o.f3190s = mo1261a();
            }
            if (C1163h.m3155a(this.f3194w, this.f3193v) && !C1163h.m3155a(this.f3186o.f3194w, this.f3186o.f3193v)) {
                this.f3186o.mo1269b(this.f3194w, this.f3193v);
            }
            c1142f2 = new C1142f(c1142f);
            C1126b a = m2878a(c1103i, this.f3187p.floatValue(), this.f3190s, c1142f2);
            this.f3169A = true;
            C1126b a2 = this.f3186o.m2879a(c1103i, c1142f2);
            this.f3169A = false;
            c1142f2.m3109a(a, a2);
            return c1142f2;
        } else if (this.f3185n == null) {
            return m2878a(c1103i, this.f3187p.floatValue(), this.f3190s, c1142f);
        } else {
            c1142f2 = new C1142f(c1142f);
            c1142f2.m3109a(m2878a(c1103i, this.f3187p.floatValue(), this.f3190s, c1142f2), m2878a(c1103i, this.f3185n.floatValue(), mo1261a(), c1142f2));
            return c1142f2;
        }
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1262a(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f3185n = Float.valueOf(f);
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1263a(C1117d<TranscodeType> c1117d) {
        if (c1117d == null) {
            throw new NullPointerException("Animation factory must not be null!");
        }
        this.f3192u = c1117d;
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1264a(C1249b<DataType> c1249b) {
        if (this.f3178g != null) {
            this.f3178g.f3313d = c1249b;
        }
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1265a(C1301e<File, ResourceType> c1301e) {
        if (this.f3178g != null) {
            this.f3178g.f3310a = c1301e;
        }
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1266a(C1302f<ResourceType> c1302f) {
        if (this.f3178g != null) {
            this.f3178g.f3312c = c1302f;
        }
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1267a(boolean z) {
        this.f3191t = !z;
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1268a(C1299g<ResourceType>... c1299gArr) {
        this.f3197z = true;
        if (c1299gArr.length == 1) {
            this.f3196y = c1299gArr[0];
        } else {
            this.f3196y = new C1300d(c1299gArr);
        }
        return this;
    }

    public final <Y extends C1103i<TranscodeType>> Y m2887a(Y y) {
        C1163h.m3154a();
        if (y == null) {
            throw new IllegalArgumentException("You must pass in a non null Target");
        } else if (this.f3181j) {
            C1387m c1387m;
            C1126b e = y.mo1288e();
            if (e != null) {
                e.mo1305c();
                c1387m = this.f3176e;
                c1387m.f3864a.remove(e);
                c1387m.f3865b.remove(e);
                e.mo1300a();
            }
            if (this.f3190s == 0) {
                this.f3190s = C1148g.f3419c;
            }
            e = m2879a(y, null);
            y.mo1282a(e);
            this.f3177f.mo1394a(y);
            c1387m = this.f3176e;
            c1387m.f3864a.add(e);
            if (c1387m.f3866c) {
                c1387m.f3865b.add(e);
            } else {
                e.mo1304b();
            }
            return y;
        } else {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1269b(int i, int i2) {
        if (C1163h.m3155a(i, i2)) {
            this.f3194w = i;
            this.f3193v = i2;
            return this;
        }
        throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1270b(C1217b c1217b) {
        this.f3195x = c1217b;
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1271b(C1145c c1145c) {
        if (c1145c == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f3180i = c1145c;
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1272b(C1301e<DataType, ResourceType> c1301e) {
        if (this.f3178g != null) {
            this.f3178g.f3311b = c1301e;
        }
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1273b(ModelType modelType) {
        this.f3179h = modelType;
        this.f3181j = true;
        return this;
    }

    public final C1103i<TranscodeType> m2893c(int i, int i2) {
        return m2887a(new C1134e(i, i2));
    }

    public /* synthetic */ Object clone() {
        return mo1277f();
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1275d(int i) {
        this.f3171C = i;
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1276e(int i) {
        this.f3182k = i;
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1277f() {
        try {
            C1088c<ModelType, DataType, ResourceType, TranscodeType> c1088c = (C1088c) super.clone();
            c1088c.f3178g = this.f3178g != null ? this.f3178g.m3008g() : null;
            return c1088c;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1278f(int i) {
        this.f3190s = i;
        return this;
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1279g() {
        return mo1263a(C1123e.m3042a());
    }

    public C1088c<ModelType, DataType, ResourceType, TranscodeType> mo1280h() {
        return mo1268a(C1367d.m3547b());
    }
}
