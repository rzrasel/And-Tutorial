package com.google.android.gms.maps.model.p014a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public abstract class C0453b extends Binder implements C0451a {
    public static C0451a m3297a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0451a)) ? new C0454c(iBinder) : (C0451a) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        float d;
        boolean z;
        boolean g;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                mo1185a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                String b = mo1191b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                mo1188a(parcel.createTypedArrayList(LatLng.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                List c = mo1194c();
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                mo1186a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                d = mo1195d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                mo1187a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                i3 = mo1196e();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                mo1192b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                d = mo1197f();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1189a(z);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = mo1198g();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo1193b(z);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = mo1199h();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = mo1190a(C0453b.m3297a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                i3 = mo1200i();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
