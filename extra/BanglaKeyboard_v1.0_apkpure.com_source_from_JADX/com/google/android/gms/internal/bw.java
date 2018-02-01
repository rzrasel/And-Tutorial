package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;

public abstract class bw extends Binder implements bv {
    public bw() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static bv m1724a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof bv)) ? new bx(iBinder) : (bv) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ah ahVar = null;
        C0204n a;
        C0402q c0402q;
        ak a2;
        C0400o c0400o;
        ah a3;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = C0205o.m862a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0402q = ak.CREATOR;
                    a2 = C0402q.m2752a(parcel);
                } else {
                    a2 = null;
                }
                if (parcel.readInt() != 0) {
                    c0400o = ah.CREATOR;
                    a3 = C0400o.m2748a(parcel);
                } else {
                    a3 = null;
                }
                mo836a(a, a2, a3, parcel.readString(), bz.m1694a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder asBinder;
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = mo833a();
                parcel2.writeNoException();
                if (a != null) {
                    asBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = C0205o.m862a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0400o = ah.CREATOR;
                    ahVar = C0400o.m2748a(parcel);
                }
                mo834a(a, ahVar, parcel.readString(), bz.m1694a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                mo838b();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                mo839c();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = C0205o.m862a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0402q = ak.CREATOR;
                    a2 = C0402q.m2752a(parcel);
                } else {
                    a2 = null;
                }
                if (parcel.readInt() != 0) {
                    c0400o = ah.CREATOR;
                    a3 = C0400o.m2748a(parcel);
                } else {
                    a3 = null;
                }
                mo837a(a, a2, a3, parcel.readString(), parcel.readString(), bz.m1694a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                ah a4;
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = C0205o.m862a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0400o = ah.CREATOR;
                    a4 = C0400o.m2748a(parcel);
                } else {
                    a4 = null;
                }
                mo835a(a, a4, parcel.readString(), parcel.readString(), bz.m1694a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                mo840d();
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                mo841e();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
