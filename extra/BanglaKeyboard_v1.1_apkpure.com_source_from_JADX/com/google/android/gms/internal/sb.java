package com.google.android.gms.internal;

final class sb extends sg {
    private final int f7075d;
    private final int f7076e;

    sb(byte[] bArr, int i, int i2) {
        super(bArr);
        ry.m6515a(i, i + i2, bArr.length);
        this.f7075d = i;
        this.f7076e = i2;
    }

    public final byte mo2238a(int i) {
        int a = mo2239a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.c[this.f7075d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + a);
    }

    public final int mo2239a() {
        return this.f7076e;
    }

    protected final void mo2242a(byte[] bArr, int i) {
        System.arraycopy(this.c, mo2247e(), bArr, 0, i);
    }

    protected final int mo2247e() {
        return this.f7075d;
    }
}
