package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class ahc extends sd implements aha {
    ahc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void mo1862a(agp com_google_android_gms_internal_agp, String str) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_agp);
        b_.writeString(str);
        m3583b(1, b_);
    }
}
