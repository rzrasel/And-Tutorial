package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;

final class br implements bp {
    private IBinder f2084a;

    br(IBinder iBinder) {
        this.f2084a = iBinder;
    }

    public final boolean mo1055a() {
        boolean z = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            this.f2084a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2084a;
    }
}
