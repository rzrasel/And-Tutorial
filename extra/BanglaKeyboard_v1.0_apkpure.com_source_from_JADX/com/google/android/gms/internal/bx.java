package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

final class bx implements bv {
    private IBinder f1089a;

    bx(IBinder iBinder) {
        this.f1089a = iBinder;
    }

    public final C0204n mo833a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.f1089a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            C0204n a = C0205o.m862a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo834a(C0204n c0204n, ah ahVar, String str, by byVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            if (ahVar != null) {
                obtain.writeInt(1);
                ahVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            if (byVar != null) {
                iBinder = byVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f1089a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo835a(C0204n c0204n, ah ahVar, String str, String str2, by byVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            if (ahVar != null) {
                obtain.writeInt(1);
                ahVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeString(str2);
            if (byVar != null) {
                iBinder = byVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f1089a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo836a(C0204n c0204n, ak akVar, ah ahVar, String str, by byVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            if (akVar != null) {
                obtain.writeInt(1);
                akVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (ahVar != null) {
                obtain.writeInt(1);
                ahVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            if (byVar != null) {
                iBinder = byVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f1089a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo837a(C0204n c0204n, ak akVar, ah ahVar, String str, String str2, by byVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            if (akVar != null) {
                obtain.writeInt(1);
                akVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (ahVar != null) {
                obtain.writeInt(1);
                ahVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeString(str2);
            if (byVar != null) {
                iBinder = byVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f1089a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1089a;
    }

    public final void mo838b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.f1089a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo839c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.f1089a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo840d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.f1089a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo841e() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            this.f1089a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
