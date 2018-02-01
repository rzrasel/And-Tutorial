package com.google.android.gms.internal;

public abstract class na {
    protected volatile int f649n = -1;

    public int mo699a() {
        int b = mo698b();
        this.f649n = b;
        return b;
    }

    public void mo697a(mw mwVar) {
    }

    protected int mo698b() {
        return 0;
    }

    public final int m1116c() {
        if (this.f649n < 0) {
            mo699a();
        }
        return this.f649n;
    }

    public String toString() {
        return nb.m2661a(this);
    }
}
