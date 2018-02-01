package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.apn;

final class C1478y implements Runnable {
    private /* synthetic */ zzbc f4289a;

    C1478y(zzbc com_google_android_gms_ads_internal_zzbc) {
        this.f4289a = com_google_android_gms_ads_internal_zzbc;
    }

    public final void run() {
        synchronized (this.f4289a.f4362i) {
            apn zzdi = this.f4289a.zzdi();
            if (zzdi != null) {
                zzdi.m5042c();
            }
        }
    }
}
