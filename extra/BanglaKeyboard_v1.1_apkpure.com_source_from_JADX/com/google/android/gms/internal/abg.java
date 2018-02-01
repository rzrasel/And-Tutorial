package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p056a.C1398a;

public final class abg extends sd implements abf {
    abg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder mo1696a(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, int i) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        uc.m6695a(b_, (Parcelable) com_google_android_gms_internal_zzjb);
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_amc);
        b_.writeInt(11220000);
        b_.writeInt(i);
        b_ = m3582a(2, b_);
        IBinder readStrongBinder = b_.readStrongBinder();
        b_.recycle();
        return readStrongBinder;
    }
}
