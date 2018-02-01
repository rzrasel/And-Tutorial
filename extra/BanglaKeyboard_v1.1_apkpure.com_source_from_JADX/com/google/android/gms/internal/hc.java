package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1514r;
import java.util.Arrays;

public final class hc {
    public final String f6189a;
    public final double f6190b;
    public final int f6191c;
    private double f6192d;
    private double f6193e;

    public hc(String str, double d, double d2, double d3, int i) {
        this.f6189a = str;
        this.f6193e = d;
        this.f6192d = d2;
        this.f6190b = d3;
        this.f6191c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        return C1514r.m3858a(this.f6189a, hcVar.f6189a) && this.f6192d == hcVar.f6192d && this.f6193e == hcVar.f6193e && this.f6191c == hcVar.f6191c && Double.compare(this.f6190b, hcVar.f6190b) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6189a, Double.valueOf(this.f6192d), Double.valueOf(this.f6193e), Double.valueOf(this.f6190b), Integer.valueOf(this.f6191c)});
    }

    public final String toString() {
        return C1514r.m3857a(this).m3859a("name", this.f6189a).m3859a("minBound", Double.valueOf(this.f6193e)).m3859a("maxBound", Double.valueOf(this.f6192d)).m3859a("percent", Double.valueOf(this.f6190b)).m3859a("count", Integer.valueOf(this.f6191c)).toString();
    }
}
