package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;

public final class agg extends sd implements agf {
    agg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    public final IBinder mo1824a(C1398a c1398a, C1398a c1398a2, C1398a c1398a3) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6694a(b_, (IInterface) c1398a2);
        uc.m6694a(b_, (IInterface) c1398a3);
        b_.writeInt(11220000);
        b_ = m3582a(1, b_);
        IBinder readStrongBinder = b_.readStrongBinder();
        b_.recycle();
        return readStrongBinder;
    }
}
