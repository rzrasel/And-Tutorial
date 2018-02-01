package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p014a.C0468q;

public abstract class bk extends Binder implements bj {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                boolean a = mo1051a(C0468q.m3448a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
