package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class aby extends sd implements abv {
    aby(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final void mo1698a() {
        m3583b(1, b_());
    }

    public final void mo1699a(abz com_google_android_gms_internal_abz) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_abz);
        m3583b(8, b_);
    }

    public final void mo1700a(boolean z) {
        Parcel b_ = b_();
        uc.m6696a(b_, z);
        m3583b(3, b_);
    }

    public final void mo1701b() {
        m3583b(2, b_());
    }

    public final boolean mo1702c() {
        Parcel a = m3582a(4, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }

    public final int mo1703d() {
        Parcel a = m3582a(5, b_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final float mo1704e() {
        Parcel a = m3582a(9, b_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float mo1705f() {
        Parcel a = m3582a(6, b_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float mo1706g() {
        Parcel a = m3582a(7, b_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final boolean mo1707h() {
        Parcel a = m3582a(10, b_());
        boolean a2 = uc.m6697a(a);
        a.recycle();
        return a2;
    }
}
