package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

public final class ag extends C1503w {
    private /* synthetic */ C1518v f4554a;

    public ag(C1518v c1518v, int i) {
        this.f4554a = c1518v;
        super(c1518v, i, null);
    }

    protected final void mo1658a(ConnectionResult connectionResult) {
        this.f4554a.f4589d.mo1656a(connectionResult);
        this.f4554a.m3894a(connectionResult);
    }

    protected final boolean mo1659a() {
        this.f4554a.f4589d.mo1656a(ConnectionResult.f4506a);
        return true;
    }
}
