package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aer;
import com.google.android.gms.internal.id;

final class ar implements Runnable {
    private /* synthetic */ aer f3989a;
    private /* synthetic */ zzq f3990b;

    ar(zzq com_google_android_gms_ads_internal_zzq, aer com_google_android_gms_internal_aer) {
        this.f3990b = com_google_android_gms_ads_internal_zzq;
        this.f3989a = com_google_android_gms_internal_aer;
    }

    public final void run() {
        try {
            if (this.f3990b.zzams.f4427h != null) {
                this.f3990b.zzams.f4427h.mo1860a(this.f3989a);
            }
        } catch (Throwable e) {
            id.m5371a("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }
}
