package com.google.android.gms.maps.model.p014a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.C0494r;
import com.google.android.gms.maps.model.Tile;

final class aa implements C0452y {
    private IBinder f2217a;

    aa(IBinder iBinder) {
        this.f2217a = iBinder;
    }

    public final Tile mo1184a(int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            Tile a;
            obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.f2217a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                C0494r c0494r = Tile.CREATOR;
                a = C0494r.m3563a(obtain2);
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
        return this.f2217a;
    }
}
