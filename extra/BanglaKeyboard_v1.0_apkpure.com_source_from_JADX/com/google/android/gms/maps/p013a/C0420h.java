package com.google.android.gms.maps.p013a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class C0420h extends Binder implements C0419g {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                ax axVar;
                parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    axVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    axVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ax)) ? new az(readStrongBinder) : (ax) queryLocalInterface;
                }
                mo1119a(axVar);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                mo1118a();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
