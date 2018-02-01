package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0484h;
import com.google.android.gms.maps.model.C0489m;
import com.google.android.gms.maps.model.C0493q;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

public abstract class C0432t extends Binder implements C0431s {
    public static C0431s m3113a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0431s)) ? new C0433u(iBinder) : (C0431s) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        int i3 = 0;
        boolean z;
        boolean a;
        C0484h c0484h;
        LatLng a2;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1151a(z);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1153b(z);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1155c(z);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1157d(z);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                a = mo1152a();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                a = mo1154b();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                a = mo1156c();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                a = mo1158d();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 9:
                StreetViewPanoramaCamera a3;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0) {
                    C0489m c0489m = StreetViewPanoramaCamera.CREATOR;
                    a3 = C0489m.m3556a(parcel);
                } else {
                    a3 = null;
                }
                mo1149a(a3, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                StreetViewPanoramaCamera e = mo1159e();
                parcel2.writeNoException();
                if (e != null) {
                    parcel2.writeInt(1);
                    e.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                mo1150a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0) {
                    c0484h = LatLng.CREATOR;
                    a2 = C0484h.m3548a(parcel);
                }
                mo1147a(a2);
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0) {
                    c0484h = LatLng.CREATOR;
                    a2 = C0484h.m3548a(parcel);
                }
                mo1148a(a2, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                StreetViewPanoramaLocation f = mo1160f();
                parcel2.writeNoException();
                if (f != null) {
                    parcel2.writeInt(1);
                    f.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 15:
                by caVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
                    caVar = (queryLocalInterface == null || !(queryLocalInterface instanceof by)) ? new ca(readStrongBinder) : (by) queryLocalInterface;
                }
                mo1145a(caVar);
                parcel2.writeNoException();
                return true;
            case 16:
                bv bxVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    bxVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bv)) ? new bx(readStrongBinder) : (bv) queryLocalInterface;
                }
                mo1144a(bxVar);
                parcel2.writeNoException();
                return true;
            case 17:
                cb cdVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
                    cdVar = (queryLocalInterface == null || !(queryLocalInterface instanceof cb)) ? new cd(readStrongBinder) : (cb) queryLocalInterface;
                }
                mo1146a(cdVar);
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                StreetViewPanoramaOrientation a4 = mo1143a(C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a4 != null) {
                    parcel2.writeInt(1);
                    a4.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 19:
                StreetViewPanoramaOrientation a5;
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (parcel.readInt() != 0) {
                    C0493q c0493q = StreetViewPanoramaOrientation.CREATOR;
                    a5 = C0493q.m3561a(parcel);
                } else {
                    a5 = null;
                }
                C0204n a6 = mo1142a(a5);
                parcel2.writeNoException();
                if (a6 != null) {
                    iBinder = a6.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
