package com.bumptech.glide.p036f.p037b;

import com.bumptech.glide.p042h.C1163h;

public abstract class C1133f<Z> extends C1104a<Z> {
    private final int f3391a;
    private final int f3392b;

    public C1133f() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public C1133f(int i, int i2) {
        this.f3391a = i;
        this.f3392b = i2;
    }

    public final void mo1289a(C1127g c1127g) {
        if (C1163h.m3155a(this.f3391a, this.f3392b)) {
            c1127g.mo1301a(this.f3391a, this.f3392b);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f3391a + " and height: " + this.f3392b + ", either provide dimensions in the constructor or call override()");
    }
}
