package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

public final class ae implements ab {
    private /* synthetic */ C1518v f4548a;

    public ae(C1518v c1518v) {
        this.f4548a = c1518v;
    }

    public final void mo1656a(ConnectionResult connectionResult) {
        if ((connectionResult.f4507b == 0 ? 1 : null) != null) {
            this.f4548a.m3895a(C1518v.m3886i());
        } else if (this.f4548a.f4607v != null) {
            this.f4548a.f4607v.mo2128c();
        }
    }
}
