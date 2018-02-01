package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;

public abstract class C0399w extends Binder implements C0398v {
    public C0399w() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static C0398v m2704a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0398v)) ? new C0405x(iBinder) : (C0398v) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        dl dlVar = null;
        boolean c;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        ak i4;
        switch (i) {
            case 1:
                IBinder asBinder;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                C0204n a = mo972a();
                parcel2.writeNoException();
                if (a != null) {
                    asBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                mo982b();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                c = mo983c();
                parcel2.writeNoException();
                parcel2.writeInt(c ? 1 : 0);
                return true;
            case 4:
                ah a2;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (parcel.readInt() != 0) {
                    C0400o c0400o = ah.CREATOR;
                    a2 = C0400o.m2748a(parcel);
                }
                c = mo981a(a2);
                parcel2.writeNoException();
                if (c) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                mo984d();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                mo985e();
                parcel2.writeNoException();
                return true;
            case 7:
                C0394s c0404u;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c0404u = (queryLocalInterface == null || !(queryLocalInterface instanceof C0394s)) ? new C0404u(readStrongBinder) : (C0394s) queryLocalInterface;
                }
                mo977a(c0404u);
                parcel2.writeNoException();
                return true;
            case 8:
                ab adVar;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    adVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ab)) ? new ad(readStrongBinder) : (ab) queryLocalInterface;
                }
                mo973a(adVar);
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                mo986f();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                mo987g();
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                mo988h();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                i4 = mo989i();
                parcel2.writeNoException();
                if (i4 != null) {
                    parcel2.writeInt(1);
                    i4.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (parcel.readInt() != 0) {
                    C0402q c0402q = ak.CREATOR;
                    i4 = C0402q.m2752a(parcel);
                }
                mo974a(i4);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    dlVar = (queryLocalInterface == null || !(queryLocalInterface instanceof dl)) ? new dn(readStrongBinder) : (dl) queryLocalInterface;
                }
                mo975a(dlVar);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManager");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
