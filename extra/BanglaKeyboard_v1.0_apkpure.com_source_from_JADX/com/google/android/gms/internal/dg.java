package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;

final class dg implements de {
    private IBinder f1190a;

    dg(IBinder iBinder) {
        this.f1190a = iBinder;
    }

    public final IBinder mo869a(C0204n c0204n) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            this.f1190a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            return readStrongBinder;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1190a;
    }
}
