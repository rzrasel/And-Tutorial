package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class ca extends tc implements bz {
    public ca() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                String a = mo2022a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                int b = mo2023b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            default:
                return false;
        }
    }
}
