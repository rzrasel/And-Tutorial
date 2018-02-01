package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class aas extends sd implements aaq {
    aas(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void mo1688a() {
        m3583b(1, b_());
    }

    public final void mo1689a(int i) {
        Parcel b_ = b_();
        b_.writeInt(i);
        m3583b(2, b_);
    }

    public final void mo1690b() {
        m3583b(3, b_());
    }

    public final void mo1691c() {
        m3583b(4, b_());
    }

    public final void mo1692d() {
        m3583b(5, b_());
    }

    public final void mo1693e() {
        m3583b(6, b_());
    }

    public final void mo1694f() {
        m3583b(7, b_());
    }
}
