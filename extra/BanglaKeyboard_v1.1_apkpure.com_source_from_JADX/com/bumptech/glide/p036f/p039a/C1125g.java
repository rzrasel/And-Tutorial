package com.bumptech.glide.p036f.p039a;

import com.bumptech.glide.p036f.p039a.C1124f.C1115a;

public final class C1125g<R> implements C1117d<R> {
    private final C1115a f3357a;
    private C1119c<R> f3358b;

    C1125g(C1115a c1115a) {
        this.f3357a = c1115a;
    }

    public final C1119c<R> mo1298a(boolean z, boolean z2) {
        if (z || !z2) {
            return C1123e.m3043b();
        }
        if (this.f3358b == null) {
            this.f3358b = new C1124f(this.f3357a);
        }
        return this.f3358b;
    }
}
