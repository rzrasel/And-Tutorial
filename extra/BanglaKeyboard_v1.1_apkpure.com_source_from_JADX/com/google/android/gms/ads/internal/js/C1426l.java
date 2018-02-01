package com.google.android.gms.ads.internal.js;

final class C1426l implements Runnable {
    private /* synthetic */ String f4052a;
    private /* synthetic */ zze f4053b;

    C1426l(zze com_google_android_gms_ads_internal_js_zze, String str) {
        this.f4053b = com_google_android_gms_ads_internal_js_zze;
        this.f4052a = str;
    }

    public final void run() {
        this.f4053b.f4089a.loadData(this.f4052a, "text/html", "UTF-8");
    }
}
