package com.google.android.gms.ads.internal.js;

final class C1425k implements Runnable {
    private /* synthetic */ String f4050a;
    private /* synthetic */ zze f4051b;

    C1425k(zze com_google_android_gms_ads_internal_js_zze, String str) {
        this.f4051b = com_google_android_gms_ads_internal_js_zze;
        this.f4050a = str;
    }

    public final void run() {
        this.f4051b.f4089a.loadData(this.f4050a, "text/html", "UTF-8");
    }
}
