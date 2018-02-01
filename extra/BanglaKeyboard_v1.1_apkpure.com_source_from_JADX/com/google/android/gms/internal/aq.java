package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzai;

final class aq implements ix<zzai> {
    private /* synthetic */ aea f5621a;
    private /* synthetic */ ap f5622b;

    aq(ap apVar, aea com_google_android_gms_internal_aea) {
        this.f5622b = apVar;
        this.f5621a = com_google_android_gms_internal_aea;
    }

    public final /* synthetic */ void mo1472a(Object obj) {
        zzai com_google_android_gms_ads_internal_js_zzai = (zzai) obj;
        this.f5622b.f5536b.m4237a(this.f5621a, "jsf");
        aec com_google_android_gms_internal_aec = this.f5622b.f5536b;
        synchronized (com_google_android_gms_internal_aec.f4948b) {
            com_google_android_gms_internal_aec.f4950d = com_google_android_gms_internal_aec.m4233a();
        }
        com_google_android_gms_ads_internal_js_zzai.zza("/invalidRequest", this.f5622b.f5535a.f5704f);
        com_google_android_gms_ads_internal_js_zzai.zza("/loadAdURL", this.f5622b.f5535a.f5705g);
        com_google_android_gms_ads_internal_js_zzai.zza("/loadAd", this.f5622b.f5535a.f5706h);
        try {
            com_google_android_gms_ads_internal_js_zzai.zzi("AFMA_getAd", this.f5622b.f5537c);
        } catch (Exception e) {
            id.m5372a(6);
        }
    }
}
