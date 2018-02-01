package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class aao extends tc implements aan {
    public aao() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo1687a();
        parcel2.writeNoException();
        return true;
    }
}
