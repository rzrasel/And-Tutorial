package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a.C1399a;

public abstract class agd extends tc implements agc {
    public agd() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static agc m4146a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof agc ? (agc) queryLocalInterface : new age(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo1718a(parcel.readString(), C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                IInterface a = mo1714a(parcel.readString());
                parcel2.writeNoException();
                uc.m6694a(parcel2, a);
                return true;
            case 3:
                mo1716a(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                mo1715a();
                parcel2.writeNoException();
                return true;
            case 5:
                mo1717a(C1399a.m3581a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
