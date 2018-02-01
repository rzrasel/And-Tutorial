package com.bumptech.glide.p038e;

import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.resource.p055e.C1368c;
import java.io.File;

public final class C1109a<A, T, Z, R> implements C1108f<A, T, Z, R>, Cloneable {
    public C1301e<File, Z> f3310a;
    public C1301e<T, Z> f3311b;
    public C1302f<Z> f3312c;
    public C1249b<T> f3313d;
    private final C1108f<A, T, Z, R> f3314e;
    private C1368c<Z, R> f3315f;

    public C1109a(C1108f<A, T, Z, R> c1108f) {
        this.f3314e = c1108f;
    }

    public final C1301e<File, Z> mo1291a() {
        return this.f3310a != null ? this.f3310a : this.f3314e.mo1291a();
    }

    public final C1301e<T, Z> mo1292b() {
        return this.f3311b != null ? this.f3311b : this.f3314e.mo1292b();
    }

    public final C1249b<T> mo1293c() {
        return this.f3313d != null ? this.f3313d : this.f3314e.mo1293c();
    }

    public final /* synthetic */ Object clone() {
        return m3008g();
    }

    public final C1302f<Z> mo1294d() {
        return this.f3312c != null ? this.f3312c : this.f3314e.mo1294d();
    }

    public final C1252l<A, T> mo1295e() {
        return this.f3314e.mo1295e();
    }

    public final C1368c<Z, R> mo1296f() {
        return this.f3315f != null ? this.f3315f : this.f3314e.mo1296f();
    }

    public final C1109a<A, T, Z, R> m3008g() {
        try {
            return (C1109a) super.clone();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
