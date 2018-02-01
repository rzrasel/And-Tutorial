package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p056a.C1398a;

public final class ce extends sd implements cc {
    ce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public final void mo1719a() {
        m3583b(2, b_());
    }

    public final void mo1720a(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(9, b_);
    }

    public final void mo1721a(ch chVar) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) chVar);
        m3583b(3, b_);
    }

    public final void mo1722a(zzadp com_google_android_gms_internal_zzadp) {
        Parcel b_ = b_();
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzadp);
        m3583b(1, b_);
    }

    public final void mo1723a(String str) {
        Parcel b_ = b_();
        b_.writeString(str);
        m3583b(4, b_);
    }

    public final void mo1724a(boolean z) {
        Parcel b_ = b_();
        uc.m6696a(b_, z);
        m3583b(34, b_);
    }

    public final void mo1725b(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(10, b_);
    }

    public final boolean mo1726b() {
        Parcel a = m3582a(5, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final void mo1727c() {
        m3583b(6, b_());
    }

    public final void mo1728c(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(11, b_);
    }

    public final void mo1729d() {
        m3583b(7, b_());
    }

    public final void mo1730e() {
        m3583b(8, b_());
    }

    public final String mo1731f() {
        Parcel a = m3582a(12, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
