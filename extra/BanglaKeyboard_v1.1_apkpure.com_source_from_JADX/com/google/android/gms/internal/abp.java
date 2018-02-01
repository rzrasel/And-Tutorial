package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class abp extends sd implements abn {
    abp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    public final long mo1686b() {
        Parcel a = m3582a(1, b_());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
