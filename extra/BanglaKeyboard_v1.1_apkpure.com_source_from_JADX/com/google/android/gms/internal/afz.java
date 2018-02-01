package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class afz extends tc implements afy {
    public afz() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static afy m4268a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof afy ? (afy) queryLocalInterface : new aga(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                IInterface a = mo1750a();
                parcel2.writeNoException();
                uc.m6694a(parcel2, a);
                return true;
            case 2:
                Parcelable b = mo1751b();
                parcel2.writeNoException();
                uc.m6699b(parcel2, b);
                return true;
            case 3:
                double c = mo1752c();
                parcel2.writeNoException();
                parcel2.writeDouble(c);
                return true;
            default:
                return false;
        }
    }
}
