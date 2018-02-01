package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zh extends sd implements zg {
    zh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzib mo2332a(zzie com_google_android_gms_internal_zzie) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzie);
        Parcel a = m3582a(1, b_);
        zzib com_google_android_gms_internal_zzib = (zzib) uc.m6693a(a, zzib.CREATOR);
        a.recycle();
        return com_google_android_gms_internal_zzib;
    }
}
