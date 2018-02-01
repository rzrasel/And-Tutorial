package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class abo extends tc implements abn {
    public abo() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        long b = mo1686b();
        parcel2.writeNoException();
        parcel2.writeLong(b);
        return true;
    }
}
