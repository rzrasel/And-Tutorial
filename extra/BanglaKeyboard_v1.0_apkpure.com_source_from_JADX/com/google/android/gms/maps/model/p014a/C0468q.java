package com.google.android.gms.maps.model.p014a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0484h;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.p007a.C0205o;

public abstract class C0468q extends Binder implements C0467p {
    public static C0467p m3448a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0467p)) ? new C0469r(iBinder) : (C0467p) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        String b;
        boolean z;
        boolean f;
        float m;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo1253a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b = mo1261b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                LatLng a;
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    C0484h c0484h = LatLng.CREATOR;
                    a = C0484h.m3548a(parcel);
                } else {
                    a = null;
                }
                mo1257a(a);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                LatLng c = mo1266c();
                parcel2.writeNoException();
                if (c != null) {
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo1258a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b = mo1268d();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo1264b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b = mo1269e();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1259a(z);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = mo1270f();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo1271g();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo1272h();
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = mo1273i();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1265b(z);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = mo1274j();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = mo1260a(C0468q.m3448a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                i3 = mo1275k();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo1256a(C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo1255a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1267c(z);
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = mo1276l();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo1254a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                m = mo1277m();
                parcel2.writeNoException();
                parcel2.writeFloat(m);
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo1263b(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo1262b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                m = mo1278n();
                parcel2.writeNoException();
                parcel2.writeFloat(m);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
