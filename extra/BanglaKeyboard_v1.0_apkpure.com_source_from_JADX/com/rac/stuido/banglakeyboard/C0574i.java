package com.rac.stuido.banglakeyboard;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class C0574i {
    public final ComponentName f2824a;
    public final long f2825b;
    public final float f2826c;

    public C0574i(ComponentName componentName, long j, float f) {
        this.f2824a = componentName;
        this.f2825b = j;
        this.f2826c = f;
    }

    public C0574i(String str, long j, float f) {
        this(ComponentName.unflattenFromString(str), j, f);
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
        C0574i c0574i = (C0574i) obj;
        if (this.f2824a == null) {
            if (c0574i.f2824a != null) {
                return false;
            }
        } else if (!this.f2824a.equals(c0574i.f2824a)) {
            return false;
        }
        return this.f2825b != c0574i.f2825b ? false : Float.floatToIntBits(this.f2826c) == Float.floatToIntBits(c0574i.f2826c);
    }

    public final int hashCode() {
        return (((((this.f2824a == null ? 0 : this.f2824a.hashCode()) + 31) * 31) + ((int) (this.f2825b ^ (this.f2825b >>> 32)))) * 31) + Float.floatToIntBits(this.f2826c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("; activity:").append(this.f2824a);
        stringBuilder.append("; time:").append(this.f2825b);
        stringBuilder.append("; weight:").append(new BigDecimal((double) this.f2826c));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
