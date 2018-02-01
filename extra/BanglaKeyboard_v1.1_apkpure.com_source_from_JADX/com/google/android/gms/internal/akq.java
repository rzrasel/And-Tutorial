package com.google.android.gms.internal;

final class akq implements Runnable {
    private /* synthetic */ akr f5231a;
    private /* synthetic */ aks f5232b;

    akq(akr com_google_android_gms_internal_akr, aks com_google_android_gms_internal_aks) {
        this.f5231a = com_google_android_gms_internal_akr;
        this.f5232b = com_google_android_gms_internal_aks;
    }

    public final void run() {
        try {
            this.f5231a.mo1868a(this.f5232b);
        } catch (Throwable e) {
            id.m5371a("Could not propagate interstitial ad event.", e);
        }
    }
}
