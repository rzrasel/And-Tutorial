package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

public final class C1505c {
    final String f4557a;
    final ComponentName f4558b = null;
    final int f4559c;
    private final String f4560d;

    public C1505c(String str, String str2, int i) {
        this.f4560d = C1516t.m3862a(str);
        this.f4557a = C1516t.m3862a(str2);
        this.f4559c = i;
    }

    public final Intent m3839a() {
        return this.f4560d != null ? new Intent(this.f4560d).setPackage(this.f4557a) : new Intent().setComponent(this.f4558b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1505c)) {
            return false;
        }
        C1505c c1505c = (C1505c) obj;
        return C1514r.m3858a(this.f4560d, c1505c.f4560d) && C1514r.m3858a(this.f4557a, c1505c.f4557a) && C1514r.m3858a(this.f4558b, c1505c.f4558b) && this.f4559c == c1505c.f4559c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4560d, this.f4557a, this.f4558b, Integer.valueOf(this.f4559c)});
    }

    public final String toString() {
        return this.f4560d == null ? this.f4558b.flattenToString() : this.f4560d;
    }
}
