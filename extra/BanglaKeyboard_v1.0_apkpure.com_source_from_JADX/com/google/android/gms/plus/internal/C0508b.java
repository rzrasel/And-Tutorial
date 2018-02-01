package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

public abstract class C0508b extends Binder implements C0507a {
    public static C0507a m3590a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0507a)) ? new C0509c(iBinder) : (C0507a) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        C0204n a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                a = mo1313a(C0205o.m862a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                a = mo1314a(C0205o.m862a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
