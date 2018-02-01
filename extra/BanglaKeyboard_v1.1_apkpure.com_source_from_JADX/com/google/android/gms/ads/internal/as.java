package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aet;
import com.google.android.gms.internal.id;

final class as implements Runnable {
    private /* synthetic */ aet f3991a;
    private /* synthetic */ zzq f3992b;

    as(zzq com_google_android_gms_ads_internal_zzq, aet com_google_android_gms_internal_aet) {
        this.f3992b = com_google_android_gms_ads_internal_zzq;
        this.f3991a = com_google_android_gms_internal_aet;
    }

    public final void run() {
        try {
            if (this.f3992b.zzams.f4428i != null) {
                this.f3992b.zzams.f4428i.mo1861a(this.f3991a);
            }
        } catch (Throwable e) {
            id.m5371a("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
