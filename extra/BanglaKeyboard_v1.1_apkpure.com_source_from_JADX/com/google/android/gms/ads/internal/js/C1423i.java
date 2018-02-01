package com.google.android.gms.ads.internal.js;

import org.json.JSONObject;

final class C1423i implements Runnable {
    private /* synthetic */ String f4044a;
    private /* synthetic */ JSONObject f4045b;
    private /* synthetic */ zze f4046c;

    C1423i(zze com_google_android_gms_ads_internal_js_zze, String str, JSONObject jSONObject) {
        this.f4046c = com_google_android_gms_ads_internal_js_zze;
        this.f4044a = str;
        this.f4045b = jSONObject;
    }

    public final void run() {
        this.f4046c.f4089a.zza(this.f4044a, this.f4045b);
    }
}
