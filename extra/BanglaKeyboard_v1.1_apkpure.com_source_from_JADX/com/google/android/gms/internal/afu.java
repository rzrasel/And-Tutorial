package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class afu extends tc implements aft {
    public afu() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static aft m4262a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof aft ? (aft) queryLocalInterface : new afw(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                String a = mo1748a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 3:
                List b = mo1749b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            default:
                return false;
        }
    }
}
