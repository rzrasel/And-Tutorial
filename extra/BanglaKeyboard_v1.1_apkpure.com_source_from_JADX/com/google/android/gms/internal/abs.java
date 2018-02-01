package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;

public final class abs extends sd implements abq {
    abs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final void initialize() {
        m3583b(1, b_());
    }

    public final void setAppMuted(boolean z) {
        Parcel b_ = b_();
        uc.m6696a(b_, z);
        m3583b(4, b_);
    }

    public final void setAppVolume(float f) {
        Parcel b_ = b_();
        b_.writeFloat(f);
        m3583b(2, b_);
    }

    public final void zzc(C1398a c1398a, String str) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeString(str);
        m3583b(5, b_);
    }

    public final void zzc(String str, C1398a c1398a) {
        Parcel b_ = b_();
        b_.writeString(str);
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(6, b_);
    }

    public final void zzt(String str) {
        Parcel b_ = b_();
        b_.writeString(str);
        m3583b(3, b_);
    }
}
