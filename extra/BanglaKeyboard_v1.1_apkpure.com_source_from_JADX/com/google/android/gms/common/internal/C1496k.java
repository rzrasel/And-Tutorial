package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.tc;
import com.google.android.gms.internal.uc;

public abstract class C1496k extends tc implements C1495j {
    public C1496k() {
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
    }

    public static C1495j m3810a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C1495j ? (C1495j) queryLocalInterface : new C1510l(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                IInterface a = mo1651a();
                parcel2.writeNoException();
                uc.m6694a(parcel2, a);
                return true;
            case 2:
                int b = mo1652b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            default:
                return false;
        }
    }
}
