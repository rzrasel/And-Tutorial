package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;

public final class aeh extends sd implements aef {
    aeh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public final String mo1737a() {
        Parcel a = m3582a(1, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void mo1738a(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(3, b_);
    }

    public final String mo1739b() {
        Parcel a = m3582a(2, b_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void mo1740c() {
        m3583b(4, b_());
    }

    public final void mo1741d() {
        m3583b(5, b_());
    }
}
