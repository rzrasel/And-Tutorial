package com.google.android.gms.internal;

import com.google.android.gms.internal.oz.C1637b;
import java.nio.ByteBuffer;

final class po implements nt {
    private static final byte[] f6962a = new byte[0];
    private final C1637b f6963b;
    private final nt f6964c;

    po(C1637b c1637b, nt ntVar) {
        this.f6963b = c1637b;
        this.f6964c = ntVar;
    }

    public final byte[] mo2227a(byte[] bArr, byte[] bArr2) {
        byte[] h = oy.f6897a.m6308a(this.f6963b).mo2217h();
        byte[] a = this.f6964c.mo2227a(h, f6962a);
        h = ((nt) oy.f6897a.m6310a(this.f6963b.f6915a, ry.m6517a(h))).mo2227a(bArr, bArr2);
        return ByteBuffer.allocate((a.length + 4) + h.length).putInt(a.length).put(a).put(h).array();
    }
}
