package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzai;
import org.json.JSONObject;

@aqv
public final class ws implements xg {
    final wk f7368a;
    private final zzai f7369b;
    private final ail f7370c = new wt(this);
    private final ail f7371d = new wu(this);
    private final ail f7372e = new wv(this);

    public ws(wk wkVar, zzai com_google_android_gms_ads_internal_js_zzai) {
        this.f7368a = wkVar;
        this.f7369b = com_google_android_gms_ads_internal_js_zzai;
        zzai com_google_android_gms_ads_internal_js_zzai2 = this.f7369b;
        com_google_android_gms_ads_internal_js_zzai2.zza("/updateActiveView", this.f7370c);
        com_google_android_gms_ads_internal_js_zzai2.zza("/untrackActiveViewUnit", this.f7371d);
        com_google_android_gms_ads_internal_js_zzai2.zza("/visibilityChanged", this.f7372e);
        String str = "Custom JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f7368a.f7337b.f7326c);
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        id.m5372a(3);
    }

    public final void mo2321a(JSONObject jSONObject, boolean z) {
        if (z) {
            this.f7368a.m6938c(this);
        } else {
            this.f7369b.zza("AFMA_updateActiveView", jSONObject);
        }
    }

    public final boolean mo2322a() {
        return true;
    }

    public final void mo2323b() {
        zzai com_google_android_gms_ads_internal_js_zzai = this.f7369b;
        com_google_android_gms_ads_internal_js_zzai.zzb("/visibilityChanged", this.f7372e);
        com_google_android_gms_ads_internal_js_zzai.zzb("/untrackActiveViewUnit", this.f7371d);
        com_google_android_gms_ads_internal_js_zzai.zzb("/updateActiveView", this.f7370c);
    }
}
