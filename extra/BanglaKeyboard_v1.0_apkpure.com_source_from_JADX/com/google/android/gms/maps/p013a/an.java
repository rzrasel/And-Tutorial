package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p014a.C0467p;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

final class an implements al {
    private IBinder f2074a;

    an(IBinder iBinder) {
        this.f2074a = iBinder;
    }

    public final C0204n mo1041a(C0467p c0467p) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            obtain.writeStrongBinder(c0467p != null ? c0467p.asBinder() : null);
            this.f2074a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2074a;
    }

    public final C0204n mo1042b(C0467p c0467p) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            obtain.writeStrongBinder(c0467p != null ? c0467p.asBinder() : null);
            this.f2074a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
