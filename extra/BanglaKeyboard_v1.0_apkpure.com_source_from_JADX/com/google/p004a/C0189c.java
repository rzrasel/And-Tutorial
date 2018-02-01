package com.google.p004a;

import com.google.android.gms.ads.C0220d;

@Deprecated
public final class C0189c {
    public static final C0189c f380a = new C0189c(-1, -2);
    public static final C0189c f381b = new C0189c(320, 50);
    public static final C0189c f382c = new C0189c(300, 250);
    public static final C0189c f383d = new C0189c(468, 60);
    public static final C0189c f384e = new C0189c(728, 90);
    public static final C0189c f385f = new C0189c(160, 600);
    private final C0220d f386g;

    private C0189c(int i, int i2) {
        this(new C0220d(i, i2));
    }

    public C0189c(C0220d c0220d) {
        this.f386g = c0220d;
    }

    public final int m768a() {
        return this.f386g.m921b();
    }

    public final int m769b() {
        return this.f386g.m919a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0189c)) {
            return false;
        }
        return this.f386g.equals(((C0189c) obj).f386g);
    }

    public final int hashCode() {
        return this.f386g.hashCode();
    }

    public final String toString() {
        return this.f386g.toString();
    }
}
