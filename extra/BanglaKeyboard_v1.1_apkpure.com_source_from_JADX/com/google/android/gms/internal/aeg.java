package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.p056a.C1398a.C1399a;

public abstract class aeg extends tc implements aef {
    public aeg() {
        attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        String a;
        switch (i) {
            case 1:
                a = mo1737a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                a = mo1739b();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 3:
                mo1738a(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                mo1740c();
                parcel2.writeNoException();
                return true;
            case 5:
                mo1741d();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
