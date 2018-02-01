package com.google.android.gms.maps.model.p014a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class C0474w extends Binder implements C0473v {
    public static C0473v m3527a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0473v)) ? new C0475x(iBinder) : (C0473v) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        boolean z;
        boolean e;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                mo1299a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                mo1303b();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                String c = mo1305c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                mo1300a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                float d = mo1306d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1301a(z);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                e = mo1307e();
                parcel2.writeNoException();
                if (e) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                e = mo1302a(C0474w.m3527a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (e) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                i3 = mo1308f();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1304b(z);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                e = mo1309g();
                parcel2.writeNoException();
                if (e) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
