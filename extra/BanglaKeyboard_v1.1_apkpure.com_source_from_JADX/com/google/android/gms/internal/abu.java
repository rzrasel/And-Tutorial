package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;

public final class abu extends sd implements abt {
    abu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder mo1697a(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeInt(11220000);
        b_ = m3582a(1, b_);
        IBinder readStrongBinder = b_.readStrongBinder();
        b_.recycle();
        return readStrongBinder;
    }
}
