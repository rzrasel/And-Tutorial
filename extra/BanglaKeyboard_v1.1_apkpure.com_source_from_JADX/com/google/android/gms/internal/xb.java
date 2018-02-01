package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzai;
import com.google.android.gms.ads.internal.zzbv;

final class xb implements ix<zzai> {
    private /* synthetic */ ww f7391a;

    xb(ww wwVar) {
        this.f7391a = wwVar;
    }

    public final /* synthetic */ void mo1472a(Object obj) {
        zzai com_google_android_gms_ads_internal_js_zzai = (zzai) obj;
        ww wwVar = this.f7391a;
        com_google_android_gms_ads_internal_js_zzai.zzb("/visibilityChanged", wwVar.f7381f);
        com_google_android_gms_ads_internal_js_zzai.zzb("/untrackActiveViewUnit", wwVar.f7380e);
        com_google_android_gms_ads_internal_js_zzai.zzb("/updateActiveView", wwVar.f7379d);
        if (zzbv.zzez().m5296a(wwVar.f7377b)) {
            com_google_android_gms_ads_internal_js_zzai.zzb("/logScionEvent", wwVar.f7382g);
        }
    }
}
