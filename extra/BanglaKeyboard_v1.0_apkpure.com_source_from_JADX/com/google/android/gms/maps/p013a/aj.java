package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.C0440c;
import com.google.android.gms.maps.C0445h;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.p014a.C0455d;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

public abstract class aj extends Binder implements ai {
    public static ai m2883a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ai)) ? new ak(iBinder) : (ai) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        C0204n a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                mo1036a(C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                C0422j b = mo1038b(C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (b != null) {
                    iBinder = b.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 3:
                GoogleMapOptions a2;
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                a = C0205o.m862a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    C0440c c0440c = GoogleMapOptions.CREATOR;
                    a2 = C0440c.m3157a(parcel);
                } else {
                    a2 = null;
                }
                C0425m a3 = mo1034a(a, a2);
                parcel2.writeNoException();
                if (a3 != null) {
                    iBinder = a3.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                C0412a a4 = mo1033a();
                parcel2.writeNoException();
                if (a4 != null) {
                    iBinder = a4.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                C0455d b2 = mo1039b();
                parcel2.writeNoException();
                if (b2 != null) {
                    iBinder = b2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                mo1037a(C0205o.m862a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                StreetViewPanoramaOptions a5;
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                a = C0205o.m862a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    C0445h c0445h = StreetViewPanoramaOptions.CREATOR;
                    a5 = C0445h.m3173a(parcel);
                } else {
                    a5 = null;
                }
                C0413y a6 = mo1035a(a, a5);
                parcel2.writeNoException();
                if (a6 != null) {
                    iBinder = a6.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                C0434v c = mo1040c(C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (c != null) {
                    iBinder = c.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ICreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
