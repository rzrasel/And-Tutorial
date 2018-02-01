package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class acb extends sd implements abz {
    acb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void mo1708a() {
        m3583b(1, b_());
    }

    public final void mo1709a(boolean z) {
        Parcel b_ = b_();
        uc.m6696a(b_, z);
        m3583b(5, b_);
    }

    public final void mo1710b() {
        m3583b(2, b_());
    }

    public final void mo1711c() {
        m3583b(3, b_());
    }

    public final void mo1712d() {
        m3583b(4, b_());
    }
}
