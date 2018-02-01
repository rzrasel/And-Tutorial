package com.google.android.gms.internal;

public abstract class ed extends fj {
    private final cx f1240a;
    private final ec f1241b;

    public ed(cx cxVar, ec ecVar) {
        this.f1240a = cxVar;
        this.f1241b = ecVar;
    }

    private static cz m1896a(en enVar, cx cxVar) {
        try {
            return enVar.mo888a(cxVar);
        } catch (Throwable e) {
            gb.m2070a("Could not fetch ad response from ad request service.", e);
            return null;
        }
    }

    public final void mo874a() {
        try {
            cz czVar;
            en d = mo878d();
            if (d == null) {
                czVar = new cz(0);
            } else {
                czVar = m1896a(d, this.f1240a);
                if (czVar == null) {
                    czVar = new cz(0);
                }
            }
            mo877c();
            this.f1241b.mo875a(czVar);
        } catch (Throwable th) {
            mo877c();
        }
    }

    public final void b_() {
        mo877c();
    }

    public abstract void mo877c();

    public abstract en mo878d();
}
