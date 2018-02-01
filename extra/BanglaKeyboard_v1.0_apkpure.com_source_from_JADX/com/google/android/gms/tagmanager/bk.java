package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class bk {
    final String f2359a;
    final byte[] f2360b;

    bk(String str, byte[] bArr) {
        this.f2359a = str;
        this.f2360b = bArr;
    }

    public final String toString() {
        return "KeyAndSerialized: key = " + this.f2359a + " serialized hash = " + Arrays.hashCode(this.f2360b);
    }
}
