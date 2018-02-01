package com.google.android.gms.internal;

public final class rr {
    private final byte[] f7063a = new byte[256];
    private int f7064b;
    private int f7065c;

    public rr(byte[] bArr) {
        int i;
        for (i = 0; i < 256; i++) {
            this.f7063a[i] = (byte) i;
        }
        i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            i = ((i + this.f7063a[i2]) + bArr[i2 % bArr.length]) & 255;
            byte b = this.f7063a[i2];
            this.f7063a[i2] = this.f7063a[i];
            this.f7063a[i] = b;
        }
        this.f7064b = 0;
        this.f7065c = 0;
    }

    public final void m6507a(byte[] bArr) {
        int i = this.f7064b;
        int i2 = this.f7065c;
        for (int i3 = 0; i3 < 256; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f7063a[i]) & 255;
            byte b = this.f7063a[i];
            this.f7063a[i] = this.f7063a[i2];
            this.f7063a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f7063a[(this.f7063a[i] + this.f7063a[i2]) & 255]);
        }
        this.f7064b = i;
        this.f7065c = i2;
    }
}
