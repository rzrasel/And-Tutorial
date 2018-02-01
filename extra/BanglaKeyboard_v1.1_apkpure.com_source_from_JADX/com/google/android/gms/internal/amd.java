package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class amd extends tc implements amc {
    public amd() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static amc m4741a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof amc ? (amc) queryLocalInterface : new ame(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                IInterface a = mo1893a(parcel.readString());
                parcel2.writeNoException();
                uc.m6694a(parcel2, a);
                return true;
            case 2:
                boolean b = mo1894b(parcel.readString());
                parcel2.writeNoException();
                uc.m6696a(parcel2, b);
                return true;
            default:
                return false;
        }
    }
}
