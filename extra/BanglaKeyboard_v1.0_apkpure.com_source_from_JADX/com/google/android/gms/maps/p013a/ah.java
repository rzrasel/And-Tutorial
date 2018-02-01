package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;

final class ah implements af {
    private IBinder f2072a;

    ah(IBinder iBinder) {
        this.f2072a = iBinder;
    }

    public final void mo1031a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
            this.f2072a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2072a;
    }

    public final void mo1032b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
            this.f2072a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
