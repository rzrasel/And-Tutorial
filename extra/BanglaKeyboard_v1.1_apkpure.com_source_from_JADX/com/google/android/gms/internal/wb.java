package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;

public final class wb extends sd implements wa {
    wb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder mo2307a(String str, C1398a c1398a) {
        Parcel b_ = b_();
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) c1398a);
        b_ = m3582a(2, b_);
        IBinder readStrongBinder = b_.readStrongBinder();
        b_.recycle();
        return readStrongBinder;
    }
}
