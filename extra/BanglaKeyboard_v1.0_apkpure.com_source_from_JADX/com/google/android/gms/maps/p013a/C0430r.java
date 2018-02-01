package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0484h;
import com.google.android.gms.maps.model.C0498v;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

final class C0430r implements C0428p {
    private IBinder f2098a;

    C0430r(IBinder iBinder) {
        this.f2098a = iBinder;
    }

    public final C0204n mo1139a(LatLng latLng) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2098a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final LatLng mo1140a(C0204n c0204n) {
        LatLng latLng = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            this.f2098a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                C0484h c0484h = LatLng.CREATOR;
                latLng = C0484h.m3548a(obtain2);
            }
            obtain2.recycle();
            obtain.recycle();
            return latLng;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final VisibleRegion mo1141a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            VisibleRegion a;
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            this.f2098a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                C0498v c0498v = VisibleRegion.CREATOR;
                a = C0498v.m3567a(obtain2);
            } else {
                a = null;
            }
            obtain2.recycle();
            obtain.recycle();
            return a;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2098a;
    }
}
