package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0489m;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public abstract class bw extends Binder implements bv {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                StreetViewPanoramaCamera a;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                if (parcel.readInt() != 0) {
                    C0489m c0489m = StreetViewPanoramaCamera.CREATOR;
                    a = C0489m.m3556a(parcel);
                } else {
                    a = null;
                }
                mo1057a(a);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
