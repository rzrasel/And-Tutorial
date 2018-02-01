package com.google.android.gms.internal;

import java.util.Arrays;

public final class nc {
    final int f1961a;
    final byte[] f1962b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) obj;
        return this.f1961a == ncVar.f1961a && Arrays.equals(this.f1962b, ncVar.f1962b);
    }

    public final int hashCode() {
        return ((this.f1961a + 527) * 31) + Arrays.hashCode(this.f1962b);
    }
}
