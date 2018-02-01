package com.orange.studio.banglatype;

import android.support.v7.p012d.C0872b;
import java.util.Arrays;

public final class ay implements be {
    int f8192a;
    C0872b[] f8193b;
    private int f8194c;

    public ay() {
        this(10);
    }

    public ay(int i) {
        this.f8194c = i;
    }

    public final C0872b mo2399a(int i) {
        return (i < 0 || i >= this.f8192a || this.f8193b == null) ? null : this.f8193b[i];
    }

    public final void mo2400a(int i, C0872b c0872b) {
        if (i >= 0 && i < this.f8194c) {
            if (this.f8193b == null) {
                this.f8193b = new C0872b[this.f8194c];
            }
            this.f8193b[i] = c0872b;
            if (c0872b != null && i >= this.f8192a) {
                this.f8192a = i + 1;
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
        ay ayVar = (ay) obj;
        return ae.m7278a((long) this.f8192a, (long) ayVar.f8192a) && Arrays.equals(this.f8193b, ayVar.f8193b);
    }

    public final int hashCode() {
        return ai.m7293a(ai.m7292a(23, this.f8192a), this.f8193b);
    }

    public final String toString() {
        String str = getClass().getName() + "{";
        for (int i = 0; i < this.f8192a; i++) {
            if (i > 0) {
                str = str + ", ";
            }
            str = this.f8193b[i] == null ? str + i + ":null" : str + i + ":" + this.f8193b[i].toString();
        }
        return str + "}";
    }
}
