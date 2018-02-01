package com.google.android.gms.ads.internal.overlay;

final class C1457l implements Runnable {
    private /* synthetic */ String f4132a;
    private /* synthetic */ String f4133b;
    private /* synthetic */ zzd f4134c;

    C1457l(zzd com_google_android_gms_ads_internal_overlay_zzd, String str, String str2) {
        this.f4134c = com_google_android_gms_ads_internal_overlay_zzd;
        this.f4132a = str;
        this.f4133b = str2;
    }

    public final void run() {
        if (this.f4134c.f4243r != null) {
            this.f4134c.f4243r.zzj(this.f4132a, this.f4133b);
        }
    }
}
