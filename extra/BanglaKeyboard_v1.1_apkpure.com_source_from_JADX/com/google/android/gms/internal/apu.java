package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzai;
import org.json.JSONObject;

final class apu extends aps {
    final /* synthetic */ String f5601a;
    final /* synthetic */ aqe f5602b;
    final /* synthetic */ ir f5603c;
    final /* synthetic */ apt f5604d;

    apu(apt com_google_android_gms_internal_apt, String str, aqe com_google_android_gms_internal_aqe, ir irVar) {
        this.f5604d = com_google_android_gms_internal_apt;
        this.f5601a = str;
        this.f5602b = com_google_android_gms_internal_aqe;
        this.f5603c = irVar;
    }

    public final void mo2012a() {
        this.f5603c.m3633b(null);
    }

    public final void mo1818a(zzai com_google_android_gms_ads_internal_js_zzai) {
        ail com_google_android_gms_internal_apv = new apv(this, com_google_android_gms_ads_internal_js_zzai);
        this.f5602b.f5632a = com_google_android_gms_internal_apv;
        com_google_android_gms_ads_internal_js_zzai.zza("/nativeAdPreProcess", com_google_android_gms_internal_apv);
        try {
            JSONObject jSONObject = new JSONObject(this.f5604d.f5593h.f5979b.f7656b);
            jSONObject.put("ads_id", this.f5601a);
            com_google_android_gms_ads_internal_js_zzai.zza("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        } catch (Throwable e) {
            id.m5371a("Exception occurred while invoking javascript", e);
            this.f5603c.m3633b(null);
        }
    }
}
