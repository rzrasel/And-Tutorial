package com.orange.studio.banglatype;

import android.support.v4.p006a.C0375a;

public final class C1741t {
    private int f8372a;
    private int f8373b;
    private int f8374c;
    private int f8375d;
    private int f8376e;
    private boolean f8377f;

    public C1741t(int i) {
        this(i, (byte) 0);
    }

    private C1741t(int i, byte b) {
        this.f8372a = i;
        this.f8373b = 0;
        this.f8374c = 0;
        this.f8375d = 0;
        this.f8376e = 0;
        this.f8377f = false;
    }

    private void m7526a() {
        if (this.f8372a != 0 && this.f8375d == 0 && this.f8376e == 0) {
            boolean c = aa.m7228c(this.f8372a);
            this.f8375d = aa.m7223a(c);
            this.f8376e = aa.m7227b(c);
        }
    }

    private void m7527b() {
        if (this.f8372a != 0 && this.f8374c == 0 && this.f8373b == 0) {
            int a = aa.m7222a(this.f8372a, 255);
            int a2 = C0375a.m1073a(-1, a, 4.5f);
            int a3 = C0375a.m1073a(-1, a, 3.0f);
            if (a2 == -1 || a3 == -1) {
                int a4 = C0375a.m1073a(-16777216, a, 4.5f);
                int a5 = C0375a.m1073a(-16777216, a, 3.0f);
                if (a4 == -1 || a4 == -1) {
                    this.f8374c = a2 != -1 ? aa.m7222a(-1, a2) : aa.m7222a(-16777216, a4);
                    this.f8373b = a3 != -1 ? aa.m7222a(-1, a3) : aa.m7222a(-16777216, a5);
                    return;
                }
                this.f8374c = aa.m7222a(-16777216, a4);
                this.f8373b = aa.m7222a(-16777216, a5);
                return;
            }
            this.f8374c = aa.m7222a(-1, a2);
            this.f8373b = aa.m7222a(-1, a3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1741t)) {
            return false;
        }
        C1741t c1741t = (C1741t) obj;
        boolean z = (this instanceof C1741t) && ae.m7278a((long) this.f8372a, (long) c1741t.f8372a);
        if (z && (this.f8377f || c1741t.f8377f)) {
            boolean z2 = (this.f8374c == 0 && this.f8373b == 0 && c1741t.f8374c == 0 && c1741t.f8373b == 0) ? false : true;
            boolean z3 = (this.f8375d == 0 && this.f8376e == 0 && c1741t.f8375d == 0 && c1741t.f8376e == 0) ? false : true;
            if (z3) {
                m7526a();
                c1741t.m7526a();
                z = ae.m7278a((long) this.f8375d, (long) c1741t.f8375d) && ae.m7278a((long) this.f8376e, (long) c1741t.f8376e);
            }
            if (z2) {
                m7527b();
                c1741t.m7527b();
                return z && ae.m7278a((long) this.f8373b, (long) c1741t.f8373b) && ae.m7278a((long) this.f8374c, (long) c1741t.f8374c);
            }
        }
        return z;
    }

    public final int hashCode() {
        return ai.m7292a(23, this.f8372a);
    }

    public final String toString() {
        return getClass().getName() + "[ backgroundColor: '" + aa.m7224a(this.f8372a) + "', titleTextColor: '" + aa.m7224a(this.f8373b) + "', bodyTextColor: '" + aa.m7224a(this.f8374c) + "', primaryTextColor: '" + aa.m7224a(this.f8375d) + "', secondaryTextColor: '" + aa.m7224a(this.f8376e) + "', isCustom: " + this.f8377f + "]";
    }
}
