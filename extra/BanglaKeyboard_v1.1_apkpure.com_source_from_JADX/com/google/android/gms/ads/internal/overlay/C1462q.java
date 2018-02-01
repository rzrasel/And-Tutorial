package com.google.android.gms.ads.internal.overlay;

final class C1462q implements Runnable {
    private /* synthetic */ zzd f4141a;

    C1462q(zzd com_google_android_gms_ads_internal_overlay_zzd) {
        this.f4141a = com_google_android_gms_ads_internal_overlay_zzd;
    }

    public final void run() {
        if (this.f4141a.f4243r != null) {
            this.f4141a.f4243r.onPaused();
        }
    }
}
