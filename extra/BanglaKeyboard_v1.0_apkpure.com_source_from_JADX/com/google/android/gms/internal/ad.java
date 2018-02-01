package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

final class ad implements ab {
    private IBinder f880a;

    ad(IBinder iBinder) {
        this.f880a = iBinder;
    }

    public final void mo823a(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAppEventListener");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f880a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f880a;
    }
}
