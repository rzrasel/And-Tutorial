package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;

public final class abb extends sd implements aba {
    abb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder mo1695a(C1398a c1398a, String str, amc com_google_android_gms_internal_amc) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_amc);
        b_.writeInt(11220000);
        b_ = m3582a(1, b_);
        IBinder readStrongBinder = b_.readStrongBinder();
        b_.recycle();
        return readStrongBinder;
    }
}
