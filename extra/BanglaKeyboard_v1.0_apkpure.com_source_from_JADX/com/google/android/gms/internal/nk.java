package com.google.android.gms.internal;

import java.io.IOException;

final class nk implements nh {
    private mw f1979a;
    private byte[] f1980b;
    private final int f1981c = 239;

    public nk() {
        mo964a();
    }

    public final void mo964a() {
        this.f1980b = new byte[this.f1981c];
        byte[] bArr = this.f1980b;
        this.f1979a = mw.m2634a(bArr, bArr.length);
    }

    public final void mo965a(int i, long j) {
        this.f1979a.m2647a(i, j);
    }

    public final void mo966a(int i, String str) {
        this.f1979a.m2649a(i, str);
    }

    public final byte[] mo967b() {
        int a = this.f1979a.m2645a();
        if (a < 0) {
            throw new IOException();
        } else if (a == 0) {
            return this.f1980b;
        } else {
            Object obj = new byte[(this.f1980b.length - a)];
            System.arraycopy(this.f1980b, 0, obj, 0, obj.length);
            return obj;
        }
    }
}
