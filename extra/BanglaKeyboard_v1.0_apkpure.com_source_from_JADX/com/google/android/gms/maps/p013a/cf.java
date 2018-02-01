package com.google.android.gms.maps.p013a;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.p007a.C0205o;

public abstract class cf extends Binder implements ce {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                mo1071a(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                mo1072a(C0205o.m862a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
