package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class amm extends tc implements aml {
    public amm() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        int a = mo1889a();
        parcel2.writeNoException();
        parcel2.writeInt(a);
        return true;
    }
}
