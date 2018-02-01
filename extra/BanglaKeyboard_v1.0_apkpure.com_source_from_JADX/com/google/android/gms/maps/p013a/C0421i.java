package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;

final class C0421i implements C0419g {
    private IBinder f2095a;

    C0421i(IBinder iBinder) {
        this.f2095a = iBinder;
    }

    public final void mo1118a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            this.f2095a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1119a(ax axVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            obtain.writeStrongBinder(axVar != null ? axVar.asBinder() : null);
            this.f2095a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2095a;
    }
}
