package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class C1588u extends tc implements C1587t {
    public C1588u() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo2203a((zzaao) uc.m6693a(parcel, zzaao.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
