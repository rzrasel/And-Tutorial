package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class C1512p implements C1511o {
    private final IBinder f4578a;

    C1512p(IBinder iBinder) {
        this.f4578a = iBinder;
    }

    public final void mo1662a(C1501m c1501m, zzy com_google_android_gms_common_internal_zzy) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(c1501m.asBinder());
            obtain.writeInt(1);
            com_google_android_gms_common_internal_zzy.writeToParcel(obtain, 0);
            this.f4578a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f4578a;
    }
}
