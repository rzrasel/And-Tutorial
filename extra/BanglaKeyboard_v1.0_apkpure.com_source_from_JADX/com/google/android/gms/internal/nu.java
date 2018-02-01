package com.google.android.gms.internal;

public final class nu {
    final nw f2006a;
    final Runnable f2007b;
    ah f2008c;
    boolean f2009d;
    boolean f2010e;
    long f2011f;

    public nu(np npVar) {
        this(npVar, new nw(fz.f1434a));
    }

    private nu(np npVar, nw nwVar) {
        this.f2009d = false;
        this.f2010e = false;
        this.f2011f = 0;
        this.f2006a = nwVar;
        this.f2007b = new nv(this, npVar);
    }

    public final void m2744a() {
        this.f2009d = false;
        this.f2006a.m2747a(this.f2007b);
    }

    public final void m2745a(ah ahVar) {
        m2746a(ahVar, 60000);
    }

    public final void m2746a(ah ahVar, long j) {
        if (this.f2009d) {
            gb.m2069a("An ad refresh is already scheduled.");
            return;
        }
        this.f2008c = ahVar;
        this.f2009d = true;
        this.f2011f = j;
        if (!this.f2010e) {
            "Scheduling ad refresh " + j + " milliseconds from now.";
            gb.m2071a(4);
            nw nwVar = this.f2006a;
            nwVar.f2015a.postDelayed(this.f2007b, j);
        }
    }
}
