package com.google.android.gms.internal;

import java.util.List;

public abstract class my extends na {
    protected List f650m;

    public void mo697a(mw mwVar) {
        int size = this.f650m == null ? 0 : this.f650m.size();
        for (int i = 0; i < size; i++) {
            nc ncVar = (nc) this.f650m.get(i);
            mwVar.m2653d(ncVar.f1961a);
            mwVar.m2651a(ncVar.f1962b);
        }
    }

    protected final int mo698b() {
        int i = 0;
        for (int i2 = 0; i2 < (this.f650m == null ? 0 : this.f650m.size()); i2++) {
            nc ncVar = (nc) this.f650m.get(i2);
            i = (i + mw.m2643e(ncVar.f1961a)) + ncVar.f1962b.length;
        }
        return i;
    }
}
