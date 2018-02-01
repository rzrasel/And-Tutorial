package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.agp;
import com.google.android.gms.internal.ahd;
import com.google.android.gms.internal.id;

final class at implements Runnable {
    private /* synthetic */ agp f3993a;
    private /* synthetic */ zzq f3994b;

    at(zzq com_google_android_gms_ads_internal_zzq, agp com_google_android_gms_internal_agp) {
        this.f3994b = com_google_android_gms_ads_internal_zzq;
        this.f3993a = com_google_android_gms_internal_agp;
    }

    public final void run() {
        try {
            ((ahd) this.f3994b.zzams.f4430k.get(this.f3993a.mo1768l())).mo1863a(this.f3993a);
        } catch (Throwable e) {
            id.m5371a("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
