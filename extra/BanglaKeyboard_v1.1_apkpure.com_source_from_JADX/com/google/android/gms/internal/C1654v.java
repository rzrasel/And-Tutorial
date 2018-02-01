package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class C1654v extends sd implements C1587t {
    C1654v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    public final void mo2203a(zzaao com_google_android_gms_internal_zzaao) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzaao);
        m3583b(1, b_);
    }
}
