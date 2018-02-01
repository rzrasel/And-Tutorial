package com.google.android.gms.maps.p013a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.p014a.C0455d;
import com.google.android.gms.maps.model.p014a.C0456e;
import com.google.android.gms.p007a.C0204n;

final class ak implements ai {
    private IBinder f2073a;

    ak(IBinder iBinder) {
        this.f2073a = iBinder;
    }

    public final C0412a mo1033a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            this.f2073a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            C0412a a = C0414b.m2906a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0425m mo1034a(C0204n c0204n, GoogleMapOptions googleMapOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            if (googleMapOptions != null) {
                obtain.writeInt(1);
                googleMapOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2073a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            C0425m a = C0426n.m3078a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0413y mo1035a(C0204n c0204n, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            if (streetViewPanoramaOptions != null) {
                obtain.writeInt(1);
                streetViewPanoramaOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2073a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            C0413y a = C0437z.m3156a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1036a(C0204n c0204n) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            this.f2073a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo1037a(C0204n c0204n, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            obtain.writeInt(i);
            this.f2073a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2073a;
    }

    public final C0422j mo1038b(C0204n c0204n) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            this.f2073a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0422j a = C0423k.m3058a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0455d mo1039b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            this.f2073a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            C0455d a = C0456e.m3321a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final C0434v mo1040c(C0204n c0204n) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            this.f2073a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            C0434v a = C0435w.m3144a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
