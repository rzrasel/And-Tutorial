package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzai;

final class afo extends aps {
    private /* synthetic */ afi f5052a;

    afo(afi com_google_android_gms_internal_afi) {
        this.f5052a = com_google_android_gms_internal_afi;
    }

    public final void mo1818a(zzai com_google_android_gms_ads_internal_js_zzai) {
        jf jfVar = (jf) this.f5052a.f5040a.get();
        if (jfVar != null) {
            com_google_android_gms_ads_internal_js_zzai.zza("/loadHtml", new afj(this.f5052a, com_google_android_gms_ads_internal_js_zzai));
            com_google_android_gms_ads_internal_js_zzai.zza("/showOverlay", new afl(this.f5052a, com_google_android_gms_ads_internal_js_zzai));
            com_google_android_gms_ads_internal_js_zzai.zza("/hideOverlay", new afm(this.f5052a, com_google_android_gms_ads_internal_js_zzai));
            jfVar.mo2163k().m5728a("/sendMessageToSdk", new afn(this.f5052a, com_google_android_gms_ads_internal_js_zzai));
        }
    }
}
