package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class qi implements nt {
    private final qs f7002a;
    private final ou f7003b;
    private final int f7004c;

    public qi(qs qsVar, ou ouVar, int i) {
        this.f7002a = qsVar;
        this.f7003b = ouVar;
        this.f7004c = i;
    }

    public final byte[] mo2227a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.f7002a.mo2229a(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(8 * ((long) bArr2.length)).array(), 8);
        copyOf = this.f7003b.mo2231a(qv.m6478a(bArr2, a, copyOf));
        return qv.m6478a(a, copyOf);
    }
}
