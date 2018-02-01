package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;

final class bu implements bs {
    private IBinder f2085a;

    bu(IBinder iBinder) {
        this.f2085a = iBinder;
    }

    public final void mo1056a(C0204n c0204n) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            this.f2085a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2085a;
    }
}
