package com.google.android.gms.p007a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class C0205o extends Binder implements C0204n {
    public C0205o() {
        attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static C0204n m862a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0204n)) ? new C0206p(iBinder) : (C0204n) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1598968902:
                parcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
