package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zza;

final class apr implements Runnable {
    private /* synthetic */ zza f5585a;

    apr(zza com_google_android_gms_ads_internal_js_zza) {
        this.f5585a = com_google_android_gms_ads_internal_js_zza;
    }

    public final void run() {
        this.f5585a.destroy();
    }
}
