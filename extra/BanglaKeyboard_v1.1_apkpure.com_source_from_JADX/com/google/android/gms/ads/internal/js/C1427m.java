package com.google.android.gms.ads.internal.js;

final class C1427m implements Runnable {
    private /* synthetic */ String f4054a;
    private /* synthetic */ zze f4055b;

    C1427m(zze com_google_android_gms_ads_internal_js_zze, String str) {
        this.f4055b = com_google_android_gms_ads_internal_js_zze;
        this.f4054a = str;
    }

    public final void run() {
        this.f4055b.f4089a.loadUrl(this.f4054a);
    }
}
