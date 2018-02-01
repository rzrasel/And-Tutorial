package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0491o;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

public abstract class bz extends Binder implements by {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                StreetViewPanoramaLocation a;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
                if (parcel.readInt() != 0) {
                    C0491o c0491o = StreetViewPanoramaLocation.CREATOR;
                    a = C0491o.m3559a(parcel);
                } else {
                    a = null;
                }
                mo1069a(a);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
