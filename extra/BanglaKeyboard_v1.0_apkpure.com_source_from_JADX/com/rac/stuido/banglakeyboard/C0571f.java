package com.rac.stuido.banglakeyboard;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class C0571f implements Comparable {
    public final ResolveInfo f2819a;
    public float f2820b;
    final /* synthetic */ C0570e f2821c;

    public C0571f(C0570e c0570e, ResolveInfo resolveInfo) {
        this.f2821c = c0570e;
        this.f2819a = resolveInfo;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return Float.floatToIntBits(((C0571f) obj).f2820b) - Float.floatToIntBits(this.f2820b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return Float.floatToIntBits(this.f2820b) == Float.floatToIntBits(((C0571f) obj).f2820b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2820b) + 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("resolveInfo:").append(this.f2819a.toString());
        stringBuilder.append("; weight:").append(new BigDecimal((double) this.f2820b));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
