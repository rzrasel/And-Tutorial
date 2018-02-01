package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class mb extends sd implements ma {
    mb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzbwa mo2201a(zzbvy com_google_android_gms_internal_zzbvy) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzbvy);
        Parcel a = m3582a(1, b_);
        zzbwa com_google_android_gms_internal_zzbwa = (zzbwa) uc.m6693a(a, zzbwa.CREATOR);
        a.recycle();
        return com_google_android_gms_internal_zzbwa;
    }
}
