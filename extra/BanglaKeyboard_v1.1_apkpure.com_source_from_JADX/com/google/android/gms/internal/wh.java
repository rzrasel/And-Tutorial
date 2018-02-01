package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class wh extends sd implements wf {
    wh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String mo2315a() {
        Parcel a = m3582a(1, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean mo2316b() {
        Parcel b_ = b_();
        uc.m6696a(b_, true);
        b_ = m3582a(2, b_);
        boolean a = uc.m6697a(b_);
        b_.recycle();
        return a;
    }
}
