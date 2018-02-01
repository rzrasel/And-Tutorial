package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzai;
import org.json.JSONObject;

final class afg extends aps {
    private /* synthetic */ JSONObject f5037a;

    afg(JSONObject jSONObject) {
        this.f5037a = jSONObject;
    }

    public final void mo1818a(zzai com_google_android_gms_ads_internal_js_zzai) {
        com_google_android_gms_ads_internal_js_zzai.zza("google.afma.nativeAds.handleImpressionPing", this.f5037a);
    }
}
