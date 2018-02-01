package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ci extends tc implements ch {
    public ci() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo1869a();
                break;
            case 2:
                mo1872b();
                break;
            case 3:
                mo1873c();
                break;
            case 4:
                mo1874d();
                break;
            case 5:
                bz bzVar;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    bzVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    bzVar = queryLocalInterface instanceof bz ? (bz) queryLocalInterface : new cb(readStrongBinder);
                }
                mo1871a(bzVar);
                break;
            case 6:
                mo1875e();
                break;
            case 7:
                mo1870a(parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
