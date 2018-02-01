package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class aav extends sd implements aat {
    aav(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String getMediationAdapterClassName() {
        Parcel a = m3582a(2, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean isLoading() {
        Parcel a = m3582a(3, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final void zza(zzix com_google_android_gms_internal_zzix, int i) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzix);
        b_.writeInt(i);
        m3583b(5, b_);
    }

    public final String zzch() {
        Parcel a = m3582a(4, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void zzd(zzix com_google_android_gms_internal_zzix) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzix);
        m3583b(1, b_);
    }
}
