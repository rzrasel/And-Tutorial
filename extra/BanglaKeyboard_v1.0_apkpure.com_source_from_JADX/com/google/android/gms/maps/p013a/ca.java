package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

final class ca implements by {
    private IBinder f2088a;

    ca(IBinder iBinder) {
        this.f2088a = iBinder;
    }

    public final void mo1069a(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
            if (streetViewPanoramaLocation != null) {
                obtain.writeInt(1);
                streetViewPanoramaLocation.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2088a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2088a;
    }
}
