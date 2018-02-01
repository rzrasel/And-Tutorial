package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class aca extends tc implements abz {
    public aca() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo1708a();
                break;
            case 2:
                mo1710b();
                break;
            case 3:
                mo1711c();
                break;
            case 4:
                mo1712d();
                break;
            case 5:
                mo1709a(uc.m6697a(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
