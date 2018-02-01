package com.google.android.gms.plus.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

final class C0509c implements C0507a {
    private IBinder f2255a;

    C0509c(IBinder iBinder) {
        this.f2255a = iBinder;
    }

    public final C0204n mo1313a(C0204n c0204n, int i, int i2, String str, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeString(str);
            obtain.writeInt(i3);
            this.f2255a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0204n mo1314a(C0204n c0204n, int i, int i2, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f2255a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2255a;
    }
}
