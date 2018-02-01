package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.ak;
import com.google.android.gms.internal.fz;

public final class C0220d {
    public static final C0220d f420a = new C0220d(320, 50, "320x50_mb");
    public static final C0220d f421b = new C0220d(468, 60, "468x60_as");
    public static final C0220d f422c = new C0220d(320, 100, "320x100_as");
    public static final C0220d f423d = new C0220d(728, 90, "728x90_as");
    public static final C0220d f424e = new C0220d(300, 250, "300x250_as");
    public static final C0220d f425f = new C0220d(160, 600, "160x600_as");
    public static final C0220d f426g = new C0220d(-1, -2, "smart_banner");
    private final int f427h;
    private final int f428i;
    private final String f429j;

    public C0220d(int i, int i2) {
        this(i, i2, (i == -1 ? "FULL" : String.valueOf(i)) + "x" + (i2 == -2 ? "AUTO" : String.valueOf(i2)) + "_as");
    }

    C0220d(int i, int i2, String str) {
        if (i < 0 && i != -1) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2) {
            this.f427h = i;
            this.f428i = i2;
            this.f429j = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    public final int m919a() {
        return this.f428i;
    }

    public final int m920a(Context context) {
        return this.f428i == -2 ? ak.m1642b(context.getResources().getDisplayMetrics()) : fz.m2028a(context, this.f428i);
    }

    public final int m921b() {
        return this.f427h;
    }

    public final int m922b(Context context) {
        return this.f427h == -1 ? ak.m1641a(context.getResources().getDisplayMetrics()) : fz.m2028a(context, this.f427h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0220d)) {
            return false;
        }
        C0220d c0220d = (C0220d) obj;
        return this.f427h == c0220d.f427h && this.f428i == c0220d.f428i && this.f429j.equals(c0220d.f429j);
    }

    public final int hashCode() {
        return this.f429j.hashCode();
    }

    public final String toString() {
        return this.f429j;
    }
}
