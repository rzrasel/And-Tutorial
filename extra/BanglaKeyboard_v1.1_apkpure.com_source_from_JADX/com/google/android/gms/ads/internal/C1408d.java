package com.google.android.gms.ads.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.js.zzai;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.ix;
import org.json.JSONObject;

final class C1408d implements ix<zzai> {
    private /* synthetic */ C1407c f4006a;

    C1408d(C1407c c1407c) {
        this.f4006a = c1407c;
    }

    public final /* synthetic */ void mo1472a(Object obj) {
        zzai com_google_android_gms_ads_internal_js_zzai = (zzai) obj;
        com_google_android_gms_ads_internal_js_zzai.zza("/appSettingsFetched", this.f4006a.f4000a);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(this.f4006a.f4001b)) {
                jSONObject.put("app_id", this.f4006a.f4001b);
            } else if (!TextUtils.isEmpty(this.f4006a.f4002c)) {
                jSONObject.put("ad_unit_id", this.f4006a.f4002c);
            }
            jSONObject.put("is_init", this.f4006a.f4003d);
            jSONObject.put("pn", this.f4006a.f4004e.getPackageName());
            com_google_android_gms_ads_internal_js_zzai.zza("AFMA_fetchAppSettings", jSONObject);
        } catch (Exception e) {
            com_google_android_gms_ads_internal_js_zzai.zzb("/appSettingsFetched", this.f4006a.f4000a);
            id.m5372a(6);
        }
    }
}
