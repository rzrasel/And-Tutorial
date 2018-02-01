package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aet;
import com.google.android.gms.internal.id;

final class C1475v implements Runnable {
    private /* synthetic */ aet f4282a;
    private /* synthetic */ zzbc f4283b;

    C1475v(zzbc com_google_android_gms_ads_internal_zzbc, aet com_google_android_gms_internal_aet) {
        this.f4283b = com_google_android_gms_ads_internal_zzbc;
        this.f4282a = com_google_android_gms_internal_aet;
    }

    public final void run() {
        try {
            if (this.f4283b.zzams.f4428i != null) {
                this.f4283b.zzams.f4428i.mo1861a(this.f4282a);
            }
        } catch (Throwable e) {
            id.m5371a("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
