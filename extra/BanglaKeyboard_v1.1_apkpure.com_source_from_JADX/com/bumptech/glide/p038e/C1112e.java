package com.bumptech.glide.p038e;

import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.resource.p055e.C1368c;
import java.io.File;

public final class C1112e<A, T, Z, R> implements C1108f<A, T, Z, R> {
    private final C1252l<A, T> f3319a;
    private final C1368c<Z, R> f3320b;
    private final C1107b<T, Z> f3321c;

    public C1112e(C1252l<A, T> c1252l, C1368c<Z, R> c1368c, C1107b<T, Z> c1107b) {
        if (c1252l == null) {
            throw new NullPointerException("ModelLoader must not be null");
        }
        this.f3319a = c1252l;
        if (c1368c == null) {
            throw new NullPointerException("Transcoder must not be null");
        }
        this.f3320b = c1368c;
        if (c1107b == null) {
            throw new NullPointerException("DataLoadProvider must not be null");
        }
        this.f3321c = c1107b;
    }

    public final C1301e<File, Z> mo1291a() {
        return this.f3321c.mo1291a();
    }

    public final C1301e<T, Z> mo1292b() {
        return this.f3321c.mo1292b();
    }

    public final C1249b<T> mo1293c() {
        return this.f3321c.mo1293c();
    }

    public final C1302f<Z> mo1294d() {
        return this.f3321c.mo1294d();
    }

    public final C1252l<A, T> mo1295e() {
        return this.f3319a;
    }

    public final C1368c<Z, R> mo1296f() {
        return this.f3320b;
    }
}
