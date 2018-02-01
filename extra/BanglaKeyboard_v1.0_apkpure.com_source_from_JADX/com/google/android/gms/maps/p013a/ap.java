package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0480d;
import com.google.android.gms.maps.model.CameraPosition;

public abstract class ap extends Binder implements ao {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                CameraPosition a;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                if (parcel.readInt() != 0) {
                    C0480d c0480d = CameraPosition.CREATOR;
                    a = C0480d.m3540a(parcel);
                } else {
                    a = null;
                }
                mo1043a(a);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
