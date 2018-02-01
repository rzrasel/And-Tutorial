package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class amk extends sd implements ami {
    amk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void mo1877a() {
        m3583b(1, b_());
    }

    public final void mo1878a(int i) {
        Parcel b_ = b_();
        b_.writeInt(i);
        m3583b(3, b_);
    }

    public final void mo1879a(agp com_google_android_gms_internal_agp, String str) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_agp);
        b_.writeString(str);
        m3583b(10, b_);
    }

    public final void mo1880a(aml com_google_android_gms_internal_aml) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_aml);
        m3583b(7, b_);
    }

    public final void mo1881a(String str, String str2) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        m3583b(9, b_);
    }

    public final void mo1882b() {
        m3583b(2, b_());
    }

    public final void mo1883c() {
        m3583b(4, b_());
    }

    public final void mo1884d() {
        m3583b(5, b_());
    }

    public final void mo1885e() {
        m3583b(6, b_());
    }

    public final void mo1886f() {
        m3583b(8, b_());
    }
}
