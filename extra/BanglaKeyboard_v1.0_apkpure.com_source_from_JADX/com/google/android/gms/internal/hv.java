package com.google.android.gms.internal;

import java.util.Arrays;

public final class hv {
    public final int f1651a;
    public final int f1652b;

    public hv(int i, int i2) {
        this.f1651a = i;
        this.f1652b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hv)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        hv hvVar = (hv) obj;
        return hvVar.f1651a == this.f1651a && hvVar.f1652b == this.f1652b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1651a), Integer.valueOf(this.f1652b)});
    }
}
