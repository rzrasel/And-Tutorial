package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p014a.C0468q;

public abstract class av extends Binder implements au {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                mo1046a(C0468q.m3448a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
