package com.google.android.gms.ads.internal.overlay;

final class C1459n implements Runnable {
    private /* synthetic */ int f4136a;
    private /* synthetic */ int f4137b;
    private /* synthetic */ zzd f4138c;

    C1459n(zzd com_google_android_gms_ads_internal_overlay_zzd, int i, int i2) {
        this.f4138c = com_google_android_gms_ads_internal_overlay_zzd;
        this.f4136a = i;
        this.f4137b = i2;
    }

    public final void run() {
        if (this.f4138c.f4243r != null) {
            this.f4138c.f4243r.zzd(this.f4136a, this.f4137b);
        }
    }
}
