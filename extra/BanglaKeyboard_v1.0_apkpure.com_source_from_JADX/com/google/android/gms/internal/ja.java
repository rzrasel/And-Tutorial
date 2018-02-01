package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

final class ja implements iy {
    private IBinder f1844a;

    ja(IBinder iBinder) {
        this.f1844a = iBinder;
    }

    public final C0204n mo931a(C0204n c0204n, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f1844a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1844a;
    }
}
