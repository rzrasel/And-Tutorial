package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class af extends C1503w {
    private IBinder f4552a;
    private /* synthetic */ C1518v f4553b;

    public af(C1518v c1518v, int i, IBinder iBinder, Bundle bundle) {
        this.f4553b = c1518v;
        super(c1518v, i, bundle);
        this.f4552a = iBinder;
    }

    protected final void mo1658a(ConnectionResult connectionResult) {
        if (this.f4553b.f4607v != null) {
            this.f4553b.f4607v.mo2128c();
        }
        this.f4553b.m3894a(connectionResult);
    }

    protected final boolean mo1659a() {
        try {
            String interfaceDescriptor = this.f4552a.getInterfaceDescriptor();
            if (this.f4553b.mo2191b().equals(interfaceDescriptor)) {
                IInterface a = this.f4553b.mo2189a(this.f4552a);
                if (a == null) {
                    return false;
                }
                if (!this.f4553b.m3876a(2, 4, a) && !this.f4553b.m3876a(3, 4, a)) {
                    return false;
                }
                this.f4553b.f4610y = null;
                C1518v.m3883g();
                if (this.f4553b.f4606u != null) {
                    this.f4553b.f4606u.mo2126a();
                }
                return true;
            }
            String b = this.f4553b.mo2191b();
            new StringBuilder((String.valueOf(b).length() + 34) + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(b).append(" vs. ").append(interfaceDescriptor);
            return false;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
