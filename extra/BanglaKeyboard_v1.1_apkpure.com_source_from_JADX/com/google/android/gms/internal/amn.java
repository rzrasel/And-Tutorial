package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class amn extends sd implements aml {
    amn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    public final int mo1889a() {
        Parcel a = m3582a(1, b_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
