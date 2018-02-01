package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

final class dn implements dl {
    private IBinder f1196a;

    dn(IBinder iBinder) {
        this.f1196a = iBinder;
    }

    public final void mo873a(di diVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
            obtain.writeStrongBinder(diVar != null ? diVar.asBinder() : null);
            this.f1196a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1196a;
    }
}
