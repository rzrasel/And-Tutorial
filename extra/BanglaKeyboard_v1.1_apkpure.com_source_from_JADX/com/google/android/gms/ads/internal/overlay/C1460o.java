package com.google.android.gms.ads.internal.overlay;

final class C1460o implements Runnable {
    private /* synthetic */ zzd f4139a;

    C1460o(zzd com_google_android_gms_ads_internal_overlay_zzd) {
        this.f4139a = com_google_android_gms_ads_internal_overlay_zzd;
    }

    public final void run() {
        if (this.f4139a.f4243r != null) {
            this.f4139a.f4243r.onPaused();
            this.f4139a.f4243r.zzmz();
        }
    }
}
