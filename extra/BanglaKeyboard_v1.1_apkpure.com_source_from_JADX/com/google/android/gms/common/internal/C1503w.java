package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class C1503w extends aa<Boolean> {
    private int f4549a;
    private Bundle f4550b;
    private /* synthetic */ C1518v f4551c;

    protected C1503w(C1518v c1518v, int i, Bundle bundle) {
        this.f4551c = c1518v;
        super(c1518v, Boolean.valueOf(true));
        this.f4549a = i;
        this.f4550b = bundle;
    }

    protected abstract void mo1658a(ConnectionResult connectionResult);

    protected final /* synthetic */ void mo1657a(Object obj) {
        PendingIntent pendingIntent = null;
        if (((Boolean) obj) == null) {
            this.f4551c.m3873a(1, null);
            return;
        }
        switch (this.f4549a) {
            case 0:
                if (!mo1659a()) {
                    this.f4551c.m3873a(1, null);
                    mo1658a(new ConnectionResult(8, null));
                    return;
                }
                return;
            case 10:
                this.f4551c.m3873a(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                this.f4551c.m3873a(1, null);
                if (this.f4550b != null) {
                    pendingIntent = (PendingIntent) this.f4550b.getParcelable("pendingIntent");
                }
                mo1658a(new ConnectionResult(this.f4549a, pendingIntent));
                return;
        }
    }

    protected abstract boolean mo1659a();
}
