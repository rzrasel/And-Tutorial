package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;

final class bf implements bd {
    private IBinder f2080a;

    bf(IBinder iBinder) {
        this.f2080a = iBinder;
    }

    public final void mo1049a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
            this.f2080a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2080a;
    }
}
