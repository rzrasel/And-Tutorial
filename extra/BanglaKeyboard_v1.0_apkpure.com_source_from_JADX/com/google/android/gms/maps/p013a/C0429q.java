package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0484h;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

public abstract class C0429q extends Binder implements C0428p {
    public static C0428p m3090a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0428p)) ? new C0430r(iBinder) : (C0428p) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        LatLng a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                a = mo1140a(C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                if (parcel.readInt() != 0) {
                    C0484h c0484h = LatLng.CREATOR;
                    a = C0484h.m3548a(parcel);
                } else {
                    a = null;
                }
                C0204n a2 = mo1139a(a);
                parcel2.writeNoException();
                if (a2 != null) {
                    iBinder = a2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                VisibleRegion a3 = mo1141a();
                parcel2.writeNoException();
                if (a3 != null) {
                    parcel2.writeInt(1);
                    a3.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
