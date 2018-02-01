package com.google.android.gms.internal;

import java.util.Arrays;

public final class ue {
    private static final ue f7158b = new ue(0, new int[0], new Object[0], false);
    boolean f7159a;
    private int f7160c;
    private int[] f7161d;
    private Object[] f7162e;
    private int f7163f;

    private ue() {
        this(0, new int[8], new Object[8], true);
    }

    private ue(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f7163f = -1;
        this.f7160c = i;
        this.f7161d = iArr;
        this.f7162e = objArr;
        this.f7159a = z;
    }

    public static ue m6701a() {
        return f7158b;
    }

    static ue m6702a(ue ueVar, ue ueVar2) {
        int i = ueVar.f7160c + ueVar2.f7160c;
        Object copyOf = Arrays.copyOf(ueVar.f7161d, i);
        System.arraycopy(ueVar2.f7161d, 0, copyOf, ueVar.f7160c, ueVar2.f7160c);
        Object copyOf2 = Arrays.copyOf(ueVar.f7162e, i);
        System.arraycopy(ueVar2.f7162e, 0, copyOf2, ueVar.f7160c, ueVar2.f7160c);
        return new ue(i, copyOf, copyOf2, true);
    }

    final void m6703a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.f7160c; i2++) {
            to.m6666a(stringBuilder, i, String.valueOf(this.f7161d[i2] >>> 3), this.f7162e[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ue)) {
            return false;
        }
        ue ueVar = (ue) obj;
        if (this.f7160c == ueVar.f7160c) {
            int i;
            boolean z;
            int[] iArr = this.f7161d;
            int[] iArr2 = ueVar.f7161d;
            int i2 = this.f7160c;
            for (i = 0; i < i2; i++) {
                if (iArr[i] != iArr2[i]) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                Object[] objArr = this.f7162e;
                Object[] objArr2 = ueVar.f7162e;
                i2 = this.f7160c;
                for (i = 0; i < i2; i++) {
                    if (!objArr[i].equals(objArr2[i])) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7160c + 527) * 31) + Arrays.hashCode(this.f7161d)) * 31) + Arrays.deepHashCode(this.f7162e);
    }
}
