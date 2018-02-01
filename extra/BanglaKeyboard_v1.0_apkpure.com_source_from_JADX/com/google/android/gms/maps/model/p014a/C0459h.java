package com.google.android.gms.maps.model.p014a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0484h;
import com.google.android.gms.maps.model.LatLng;

public abstract class C0459h extends Binder implements C0458g {
    public static C0458g m3347a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0458g)) ? new C0460i(iBinder) : (C0458g) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        float e;
        boolean i4;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo1208a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                String b = mo1215b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                LatLng a;
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (parcel.readInt() != 0) {
                    C0484h c0484h = LatLng.CREATOR;
                    a = C0484h.m3548a(parcel);
                } else {
                    a = null;
                }
                mo1212a(a);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                LatLng c = mo1218c();
                parcel2.writeNoException();
                if (c != null) {
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo1209a(parcel.readDouble());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                double d = mo1219d();
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo1210a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                e = mo1220e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo1211a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i3 = mo1221f();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo1217b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i3 = mo1222g();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo1216b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                e = mo1223h();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 15:
                boolean z;
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1213a(z);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i4 = mo1224i();
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i4 = mo1214a(C0459h.m3347a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i3 = mo1225j();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.ICircleDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
