package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

final class ep implements en {
    private IBinder f1284a;

    ep(IBinder iBinder) {
        this.f1284a = iBinder;
    }

    public final cz mo888a(cx cxVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            cz a;
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (cxVar != null) {
                obtain.writeInt(1);
                cxVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1284a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                em emVar = cz.CREATOR;
                a = em.m1938a(obtain2);
            } else {
                a = null;
            }
            obtain2.recycle();
            obtain.recycle();
            return a;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1284a;
    }
}
