package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class C0523e {
    public final String f2363a;
    public final Object f2364b;

    C0523e(String str, Object obj) {
        this.f2363a = str;
        this.f2364b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0523e)) {
            return false;
        }
        C0523e c0523e = (C0523e) obj;
        return this.f2363a.equals(c0523e.f2363a) && this.f2364b.equals(c0523e.f2364b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Integer[]{Integer.valueOf(this.f2363a.hashCode()), Integer.valueOf(this.f2364b.hashCode())});
    }

    public final String toString() {
        return "Key: " + this.f2363a + " value: " + this.f2364b.toString();
    }
}
