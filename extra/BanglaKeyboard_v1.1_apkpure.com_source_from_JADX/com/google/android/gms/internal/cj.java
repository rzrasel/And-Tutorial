package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class cj extends sd implements ch {
    cj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void mo1869a() {
        m3583b(1, b_());
    }

    public final void mo1870a(int i) {
        Parcel b_ = b_();
        b_.writeInt(i);
        m3583b(7, b_);
    }

    public final void mo1871a(bz bzVar) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) bzVar);
        m3583b(5, b_);
    }

    public final void mo1872b() {
        m3583b(2, b_());
    }

    public final void mo1873c() {
        m3583b(3, b_());
    }

    public final void mo1874d() {
        m3583b(4, b_());
    }

    public final void mo1875e() {
        m3583b(6, b_());
    }
}
