package com.google.android.gms.internal;

import java.util.Arrays;

final class vd {
    final int f7249a;
    final byte[] f7250b;

    vd(int i, byte[] bArr) {
        this.f7249a = i;
        this.f7250b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return this.f7249a == vdVar.f7249a && Arrays.equals(this.f7250b, vdVar.f7250b);
    }

    public final int hashCode() {
        return ((this.f7249a + 527) * 31) + Arrays.hashCode(this.f7250b);
    }
}
