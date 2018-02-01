package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0493q;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public abstract class cc extends Binder implements cb {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                StreetViewPanoramaOrientation a;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
                if (parcel.readInt() != 0) {
                    C0493q c0493q = StreetViewPanoramaOrientation.CREATOR;
                    a = C0493q.m3561a(parcel);
                } else {
                    a = null;
                }
                mo1070a(a);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
