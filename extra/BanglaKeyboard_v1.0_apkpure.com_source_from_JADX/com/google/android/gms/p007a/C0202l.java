package com.google.android.gms.p007a;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class C0202l extends Binder implements C0201k {
    public C0202l() {
        attachInterface(this, "com.google.android.gms.dynamic.IFragmentWrapper");
    }

    public static C0201k m835a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0201k)) ? new C0203m(iBinder) : (C0201k) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Intent intent = null;
        boolean z = false;
        C0204n a;
        IBinder asBinder;
        int c;
        C0201k d;
        boolean f;
        int i3;
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                a = mo666a();
                parcel2.writeNoException();
                if (a != null) {
                    asBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                Bundle b = mo671b();
                parcel2.writeNoException();
                if (b != null) {
                    parcel2.writeInt(1);
                    b.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                c = mo674c();
                parcel2.writeNoException();
                parcel2.writeInt(c);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                d = mo676d();
                parcel2.writeNoException();
                if (d != null) {
                    asBinder = d.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                a = mo678e();
                parcel2.writeNoException();
                if (a != null) {
                    asBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                f = mo679f();
                parcel2.writeNoException();
                parcel2.writeInt(f ? 1 : 0);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                String g = mo680g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                d = mo681h();
                parcel2.writeNoException();
                if (d != null) {
                    asBinder = d.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                c = mo682i();
                parcel2.writeNoException();
                parcel2.writeInt(c);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                f = mo683j();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                a = mo684k();
                parcel2.writeNoException();
                if (a != null) {
                    asBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                f = mo685l();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                f = mo686m();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                f = mo687n();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                f = mo688o();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                f = mo689p();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                f = mo690q();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                f = mo691r();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                mo669a(C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo670a(z);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo673b(z);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo675c(z);
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo677d(z);
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                mo667a(intent);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                mo668a(intent, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                mo672b(C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.dynamic.IFragmentWrapper");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
