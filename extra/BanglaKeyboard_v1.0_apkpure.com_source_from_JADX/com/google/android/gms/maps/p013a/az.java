package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;

final class az implements ax {
    private IBinder f2078a;

    az(IBinder iBinder) {
        this.f2078a = iBinder;
    }

    public final void mo1047a(C0204n c0204n) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            this.f2078a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2078a;
    }
}
