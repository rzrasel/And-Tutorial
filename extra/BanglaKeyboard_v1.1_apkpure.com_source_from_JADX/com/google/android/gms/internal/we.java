package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;

public final class we extends sd implements wc {
    we(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void mo2308a() {
        m3583b(3, b_());
    }

    public final void mo2309a(int i) {
        Parcel b_ = b_();
        b_.writeInt(i);
        m3583b(6, b_);
    }

    public final void mo2310a(C1398a c1398a, String str) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeString(str);
        m3583b(2, b_);
    }

    public final void mo2311a(byte[] bArr) {
        Parcel b_ = b_();
        b_.writeByteArray(bArr);
        m3583b(5, b_);
    }

    public final void mo2312a(int[] iArr) {
        Parcel b_ = b_();
        b_.writeIntArray(iArr);
        m3583b(4, b_);
    }

    public final void mo2313b(int i) {
        Parcel b_ = b_();
        b_.writeInt(i);
        m3583b(7, b_);
    }

    public final void mo2314b(C1398a c1398a, String str) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeString(str);
        b_.writeString(null);
        m3583b(8, b_);
    }
}
