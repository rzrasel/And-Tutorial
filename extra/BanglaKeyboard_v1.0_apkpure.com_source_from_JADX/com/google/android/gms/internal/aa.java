package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;

final class aa implements C0355y {
    private IBinder f879a;

    aa(IBinder iBinder) {
        this.f879a = iBinder;
    }

    public final IBinder mo822a(C0204n c0204n, ak akVar, String str, bs bsVar, int i) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            if (akVar != null) {
                obtain.writeInt(1);
                akVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            if (bsVar != null) {
                iBinder = bsVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i);
            this.f879a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            iBinder = obtain2.readStrongBinder();
            return iBinder;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f879a;
    }
}
