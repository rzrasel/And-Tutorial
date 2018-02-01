package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

final class bu implements bs {
    private IBinder f1088a;

    bu(IBinder iBinder) {
        this.f1088a = iBinder;
    }

    public final bv mo832a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            obtain.writeString(str);
            this.f1088a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            bv a = bw.m1724a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1088a;
    }
}
