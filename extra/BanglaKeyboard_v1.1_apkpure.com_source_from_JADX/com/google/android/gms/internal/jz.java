package com.google.android.gms.internal;

import java.util.Map;

final class jz implements Runnable {
    private /* synthetic */ Map f6389a;
    private /* synthetic */ jy f6390b;

    jz(jy jyVar, Map map) {
        this.f6390b = jyVar;
        this.f6389a = map;
    }

    public final void run() {
        this.f6390b.f6382f.mo2145a("pubVideoCmd", this.f6389a);
    }
}
