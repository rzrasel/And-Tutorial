package com.orange.studio.banglatype;

import java.util.Arrays;

public final class C1743u implements C1742v {
    private int f8378a;
    private int f8379b;
    private C1741t[] f8380c;

    public C1743u() {
        this(10);
    }

    public C1743u(int i) {
        this.f8379b = i;
    }

    public final C1741t mo2415a(int i) {
        return (i < 0 || i >= this.f8378a || this.f8380c == null) ? null : this.f8380c[i];
    }

    public final void mo2416a(int i, C1741t c1741t) {
        if (i >= 0 && i < this.f8379b) {
            if (this.f8380c == null) {
                this.f8380c = new C1741t[this.f8379b];
            }
            this.f8380c[i] = c1741t;
            if (c1741t != null && i >= this.f8378a) {
                this.f8378a = i + 1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        C1743u c1743u = (C1743u) obj;
        return ae.m7278a((long) this.f8378a, (long) c1743u.f8378a) && Arrays.equals(this.f8380c, c1743u.f8380c);
    }

    public final int hashCode() {
        return ai.m7293a(ai.m7292a(23, this.f8378a), this.f8380c);
    }

    public final String toString() {
        String str = getClass().getName() + "{";
        for (int i = 0; i < this.f8378a; i++) {
            if (i > 0) {
                str = str + ", ";
            }
            str = this.f8380c[i] == null ? str + i + ":null" : str + i + ":" + this.f8380c[i].toString();
        }
        return str + "}";
    }
}
