package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class cb extends sd implements bz {
    cb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final String mo2022a() {
        Parcel a = m3582a(1, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final int mo2023b() {
        Parcel a = m3582a(2, b_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
