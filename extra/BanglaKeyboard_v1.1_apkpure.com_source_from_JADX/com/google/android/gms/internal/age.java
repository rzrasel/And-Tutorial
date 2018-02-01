package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;

public final class age extends sd implements agc {
    age(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final C1398a mo1714a(String str) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_ = m3582a(2, b_);
        C1398a a = C1399a.m3581a(b_.readStrongBinder());
        b_.recycle();
        return a;
    }

    public final void mo1715a() {
        m3583b(4, b_());
    }

    public final void mo1716a(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(3, b_);
    }

    public final void mo1717a(C1398a c1398a, int i) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeInt(i);
        m3583b(5, b_);
    }

    public final void mo1718a(String str, C1398a c1398a) {
        Parcel b_ = b_();
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(1, b_);
    }
}
