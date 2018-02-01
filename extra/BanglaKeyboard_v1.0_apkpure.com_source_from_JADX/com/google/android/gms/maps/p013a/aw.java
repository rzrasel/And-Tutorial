package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p014a.C0467p;

final class aw implements au {
    private IBinder f2077a;

    aw(IBinder iBinder) {
        this.f2077a = iBinder;
    }

    public final void mo1046a(C0467p c0467p) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            obtain.writeStrongBinder(c0467p != null ? c0467p.asBinder() : null);
            this.f2077a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2077a;
    }
}
