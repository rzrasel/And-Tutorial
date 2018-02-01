package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0484h;
import com.google.android.gms.maps.model.LatLng;

public abstract class bb extends Binder implements ba {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                LatLng a;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                if (parcel.readInt() != 0) {
                    C0484h c0484h = LatLng.CREATOR;
                    a = C0484h.m3548a(parcel);
                } else {
                    a = null;
                }
                mo1048a(a);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMapClickListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
