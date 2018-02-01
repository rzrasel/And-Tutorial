package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.tc;
import com.google.android.gms.internal.uc;

public abstract class C1502n extends tc implements C1501m {
    public C1502n() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo1655a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) uc.m6693a(parcel, Bundle.CREATOR));
                break;
            case 2:
                parcel.readInt();
                uc.m6693a(parcel, Bundle.CREATOR);
                mo1654a();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
