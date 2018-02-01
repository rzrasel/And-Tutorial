package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p014a.C0467p;

final class bl implements bj {
    private IBinder f2082a;

    bl(IBinder iBinder) {
        this.f2082a = iBinder;
    }

    public final boolean mo1051a(C0467p c0467p) {
        boolean z = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            obtain.writeStrongBinder(c0467p != null ? c0467p.asBinder() : null);
            this.f2082a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2082a;
    }
}
