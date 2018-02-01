package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

final class C0415c implements C0412a {
    private IBinder f2087a;

    C0415c(IBinder iBinder) {
        this.f2087a = iBinder;
    }

    public final C0204n mo1058a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            this.f2087a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0204n mo1059a(float f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(f);
            this.f2087a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0204n mo1060a(float f, float f2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(f);
            obtain.writeFloat(f2);
            this.f2087a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0204n mo1061a(float f, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(f);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f2087a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0204n mo1062a(CameraPosition cameraPosition) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (cameraPosition != null) {
                obtain.writeInt(1);
                cameraPosition.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2087a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0204n mo1063a(LatLng latLng) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2087a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0204n mo1064a(LatLng latLng, float f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLng != null) {
                obtain.writeInt(1);
                latLng.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeFloat(f);
            this.f2087a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0204n mo1065a(LatLngBounds latLngBounds, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLngBounds != null) {
                obtain.writeInt(1);
                latLngBounds.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            this.f2087a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0204n mo1066a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLngBounds != null) {
                obtain.writeInt(1);
                latLngBounds.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.f2087a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2087a;
    }

    public final C0204n mo1067b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            this.f2087a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0204n mo1068b(float f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            obtain.writeFloat(f);
            this.f2087a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
