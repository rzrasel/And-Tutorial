package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzai;
import com.google.android.gms.ads.internal.zzbv;

final class wx implements ix<zzai> {
    private /* synthetic */ ww f7384a;

    wx(ww wwVar) {
        this.f7384a = wwVar;
    }

    public final /* synthetic */ void mo1472a(Object obj) {
        zzai com_google_android_gms_ads_internal_js_zzai = (zzai) obj;
        this.f7384a.f7378c = true;
        ww wwVar = this.f7384a;
        com_google_android_gms_ads_internal_js_zzai.zza("/updateActiveView", wwVar.f7379d);
        com_google_android_gms_ads_internal_js_zzai.zza("/untrackActiveViewUnit", wwVar.f7380e);
        com_google_android_gms_ads_internal_js_zzai.zza("/visibilityChanged", wwVar.f7381f);
        if (zzbv.zzez().m5296a(wwVar.f7377b)) {
            com_google_android_gms_ads_internal_js_zzai.zza("/logScionEvent", wwVar.f7382g);
        }
    }
}
