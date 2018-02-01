package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p056a.C1398a;

public final class df extends sd implements dd {
    df(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void mo2056a(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(1, b_);
    }

    public final void mo2057a(C1398a c1398a, int i) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeInt(i);
        m3583b(2, b_);
    }

    public final void mo2058a(C1398a c1398a, zzaek com_google_android_gms_internal_zzaek) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzaek);
        m3583b(7, b_);
    }

    public final void mo2059b(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(3, b_);
    }

    public final void mo2060b(C1398a c1398a, int i) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeInt(i);
        m3583b(9, b_);
    }

    public final void mo2061c(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(4, b_);
    }

    public final void mo2062d(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(5, b_);
    }

    public final void mo2063e(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(6, b_);
    }

    public final void mo2064f(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(8, b_);
    }

    public final void mo2065g(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(10, b_);
    }
}
