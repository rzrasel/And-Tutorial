package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aew;
import com.google.android.gms.internal.ahd;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.id;

final class C1476w implements Runnable {
    private /* synthetic */ String f4284a;
    private /* synthetic */ ee f4285b;
    private /* synthetic */ zzbc f4286c;

    C1476w(zzbc com_google_android_gms_ads_internal_zzbc, String str, ee eeVar) {
        this.f4286c = com_google_android_gms_ads_internal_zzbc;
        this.f4284a = str;
        this.f4285b = eeVar;
    }

    public final void run() {
        try {
            ((ahd) this.f4286c.zzams.f4430k.get(this.f4284a)).mo1863a((aew) this.f4285b.f5943B);
        } catch (Throwable e) {
            id.m5371a("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
