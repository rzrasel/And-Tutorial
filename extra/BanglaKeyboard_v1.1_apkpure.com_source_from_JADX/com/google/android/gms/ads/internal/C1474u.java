package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aer;
import com.google.android.gms.internal.id;

final class C1474u implements Runnable {
    private /* synthetic */ aer f4280a;
    private /* synthetic */ zzbc f4281b;

    C1474u(zzbc com_google_android_gms_ads_internal_zzbc, aer com_google_android_gms_internal_aer) {
        this.f4281b = com_google_android_gms_ads_internal_zzbc;
        this.f4280a = com_google_android_gms_internal_aer;
    }

    public final void run() {
        try {
            if (this.f4281b.zzams.f4427h != null) {
                this.f4281b.zzams.f4427h.mo1860a(this.f4280a);
            }
        } catch (Throwable e) {
            id.m5371a("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }
}
