package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

public abstract class C0406z extends Binder implements C0355y {
    public static C0355y m2774a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0355y)) ? new aa(iBinder) : (C0355y) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                ak a;
                bs bsVar;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                C0204n a2 = C0205o.m862a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    C0402q c0402q = ak.CREATOR;
                    a = C0402q.m2752a(parcel);
                } else {
                    a = null;
                }
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    bsVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof bs)) {
                        Object buVar = new bu(readStrongBinder);
                    } else {
                        bsVar = (bs) queryLocalInterface;
                    }
                }
                IBinder a3 = mo822a(a2, a, readString, bsVar, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
