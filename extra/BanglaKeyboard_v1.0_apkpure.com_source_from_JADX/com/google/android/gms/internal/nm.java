package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class nm extends Binder implements nl {
    public static nl m2684a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof nl)) ? new nn(iBinder) : (nl) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        String a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                a = mo968a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                int i3;
                parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean a2 = mo971a(parcel.readInt() != 0);
                parcel2.writeNoException();
                if (a2) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                a = mo969a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                a = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo970a(a, z);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
