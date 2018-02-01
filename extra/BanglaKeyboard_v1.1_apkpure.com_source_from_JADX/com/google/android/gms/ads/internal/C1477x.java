package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.agp;
import com.google.android.gms.internal.ahd;
import com.google.android.gms.internal.id;

final class C1477x implements Runnable {
    private /* synthetic */ agp f4287a;
    private /* synthetic */ zzbc f4288b;

    C1477x(zzbc com_google_android_gms_ads_internal_zzbc, agp com_google_android_gms_internal_agp) {
        this.f4288b = com_google_android_gms_ads_internal_zzbc;
        this.f4287a = com_google_android_gms_internal_agp;
    }

    public final void run() {
        try {
            ((ahd) this.f4288b.zzams.f4430k.get(this.f4287a.mo1768l())).mo1863a(this.f4287a);
        } catch (Throwable e) {
            id.m5371a("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
