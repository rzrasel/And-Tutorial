package com.google.android.gms.ads.internal.js;

final class C1420f implements Runnable {
    private /* synthetic */ zza f4035a;
    private /* synthetic */ C1419e f4036b;

    C1420f(C1419e c1419e, zza com_google_android_gms_ads_internal_js_zza) {
        this.f4036b = c1419e;
        this.f4035a = com_google_android_gms_ads_internal_js_zza;
    }

    public final void run() {
        this.f4036b.f4034a.f4083b.zzc(this.f4035a);
        this.f4035a.destroy();
    }
}
