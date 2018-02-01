package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p014a.C0468q;
import com.google.android.gms.p007a.C0204n;

public abstract class am extends Binder implements al {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        C0204n a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                a = mo1041a(C0468q.m3448a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                a = mo1042b(C0468q.m3448a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
