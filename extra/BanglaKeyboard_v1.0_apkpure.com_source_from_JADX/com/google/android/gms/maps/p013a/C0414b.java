package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0480d;
import com.google.android.gms.maps.model.C0483g;
import com.google.android.gms.maps.model.C0484h;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.p007a.C0204n;

public abstract class C0414b extends Binder implements C0412a {
    public static C0412a m2906a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0412a)) ? new C0415c(iBinder) : (C0412a) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        C0204n a;
        C0484h c0484h;
        LatLng a2;
        C0483g c0483g;
        LatLngBounds a3;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo1058a();
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo1067b();
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo1060a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo1059a(parcel.readFloat());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo1068b(parcel.readFloat());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo1061a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 7:
                CameraPosition a4;
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0) {
                    C0480d c0480d = CameraPosition.CREATOR;
                    a4 = C0480d.m3540a(parcel);
                } else {
                    a4 = null;
                }
                a = mo1062a(a4);
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0) {
                    c0484h = LatLng.CREATOR;
                    a2 = C0484h.m3548a(parcel);
                } else {
                    a2 = null;
                }
                a = mo1063a(a2);
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0) {
                    c0484h = LatLng.CREATOR;
                    a2 = C0484h.m3548a(parcel);
                } else {
                    a2 = null;
                }
                a = mo1064a(a2, parcel.readFloat());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0) {
                    c0483g = LatLngBounds.CREATOR;
                    a3 = C0483g.m3546a(parcel);
                } else {
                    a3 = null;
                }
                a = mo1065a(a3, parcel.readInt());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0) {
                    c0483g = LatLngBounds.CREATOR;
                    a3 = C0483g.m3546a(parcel);
                } else {
                    a3 = null;
                }
                a = mo1066a(a3, parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
