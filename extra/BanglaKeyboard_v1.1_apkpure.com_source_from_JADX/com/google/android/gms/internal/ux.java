package com.google.android.gms.internal;

public final class ux implements Cloneable {
    static final uy f7238a = new uy();
    int[] f7239b;
    uy[] f7240c;
    int f7241d;
    private boolean f7242e;

    ux() {
        this(10);
    }

    private ux(int i) {
        this.f7242e = false;
        int a = m6798a(i);
        this.f7239b = new int[a];
        this.f7240c = new uy[a];
        this.f7241d = 0;
    }

    static int m6798a(int i) {
        int i2 = i << 2;
        for (int i3 = 4; i3 < 32; i3++) {
            if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            }
        }
        return i2 / 4;
    }

    final int m6799b(int i) {
        int i2 = 0;
        int i3 = this.f7241d - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.f7239b[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ -1;
    }

    public final /* synthetic */ Object clone() {
        int i = this.f7241d;
        ux uxVar = new ux(i);
        System.arraycopy(this.f7239b, 0, uxVar.f7239b, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7240c[i2] != null) {
                uxVar.f7240c[i2] = (uy) this.f7240c[i2].clone();
            }
        }
        uxVar.f7241d = i;
        return uxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ux)) {
            return false;
        }
        ux uxVar = (ux) obj;
        if (this.f7241d != uxVar.f7241d) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.f7239b;
        int[] iArr2 = uxVar.f7239b;
        int i2 = this.f7241d;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            uy[] uyVarArr = this.f7240c;
            uy[] uyVarArr2 = uxVar.f7240c;
            i2 = this.f7241d;
            for (i = 0; i < i2; i++) {
                if (!uyVarArr[i].equals(uyVarArr2[i])) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f7241d; i2++) {
            i = (((i * 31) + this.f7239b[i2]) * 31) + this.f7240c[i2].hashCode();
        }
        return i;
    }
}
