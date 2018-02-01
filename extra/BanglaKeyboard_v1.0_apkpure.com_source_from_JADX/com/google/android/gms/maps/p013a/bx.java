package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

final class bx implements bv {
    private IBinder f2086a;

    bx(IBinder iBinder) {
        this.f2086a = iBinder;
    }

    public final void mo1057a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
            if (streetViewPanoramaCamera != null) {
                obtain.writeInt(1);
                streetViewPanoramaCamera.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2086a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2086a;
    }
}
