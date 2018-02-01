package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzai;
import com.google.android.gms.ads.internal.js.zzy;
import org.json.JSONObject;

final class bl implements ix<zzai> {
    private /* synthetic */ ail f5823a;
    private /* synthetic */ JSONObject f5824b;
    private /* synthetic */ zzy f5825c;

    bl(ail com_google_android_gms_internal_ail, JSONObject jSONObject, zzy com_google_android_gms_ads_internal_js_zzy) {
        this.f5823a = com_google_android_gms_internal_ail;
        this.f5824b = jSONObject;
        this.f5825c = com_google_android_gms_ads_internal_js_zzy;
    }

    public final /* synthetic */ void mo1472a(Object obj) {
        zzai com_google_android_gms_ads_internal_js_zzai = (zzai) obj;
        com_google_android_gms_ads_internal_js_zzai.zza("/loadSdkConstants", this.f5823a);
        try {
            com_google_android_gms_ads_internal_js_zzai.zza("AFMA_getSdkConstants", this.f5824b);
        } catch (Exception e) {
            id.m5372a(6);
            this.f5825c.release();
        }
    }
}
