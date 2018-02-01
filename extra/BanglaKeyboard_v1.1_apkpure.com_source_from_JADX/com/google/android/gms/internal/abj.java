package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class abj extends sd implements abh {
    abj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void mo1683a(String str, String str2) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        m3583b(1, b_);
    }
}
