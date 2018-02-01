package com.google.android.gms.internal;

public final class yr {
    final long f7517a;
    final String f7518b;
    final int f7519c;

    yr(long j, String str, int i) {
        this.f7517a = j;
        this.f7518b = str;
        this.f7519c = i;
    }

    public final boolean equals(Object obj) {
        return (obj == null || !(obj instanceof yr)) ? false : ((yr) obj).f7517a == this.f7517a && ((yr) obj).f7519c == this.f7519c;
    }

    public final int hashCode() {
        return (int) this.f7517a;
    }
}
