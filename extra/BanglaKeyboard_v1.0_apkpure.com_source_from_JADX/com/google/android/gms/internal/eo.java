package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class eo extends Binder implements en {
    public eo() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public static en m1941a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof en)) ? new ep(iBinder) : (en) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                cx a;
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                if (parcel.readInt() != 0) {
                    ej ejVar = cx.CREATOR;
                    a = ej.m1933a(parcel);
                } else {
                    a = null;
                }
                cz a2 = mo888a(a);
                parcel2.writeNoException();
                if (a2 != null) {
                    parcel2.writeInt(1);
                    a2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
