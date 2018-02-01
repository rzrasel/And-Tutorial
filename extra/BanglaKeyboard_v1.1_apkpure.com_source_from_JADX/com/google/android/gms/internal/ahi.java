package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;

public final class ahi extends sd implements ahg {
    ahi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void mo1864a(abc com_google_android_gms_internal_abc, C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) com_google_android_gms_internal_abc);
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(1, b_);
    }
}
