package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.js.zzai;
import java.lang.ref.WeakReference;
import java.util.Map;

final class afh extends aps implements ail {
    private final WeakReference<afb> f5038a;
    private final String f5039b;

    public afh(afb com_google_android_gms_internal_afb, String str) {
        this.f5038a = new WeakReference(com_google_android_gms_internal_afb);
        this.f5039b = str;
    }

    public final void mo1818a(zzai com_google_android_gms_ads_internal_js_zzai) {
        com_google_android_gms_ads_internal_js_zzai.zza("/logScionEvent", (ail) this);
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        String str = (String) map.get("ads_id");
        if (!TextUtils.isEmpty(str) && this.f5039b.equals(str)) {
            int parseInt;
            try {
                parseInt = Integer.parseInt((String) map.get("eventType"));
            } catch (Exception e) {
                id.m5372a(6);
                parseInt = -1;
            }
            afb com_google_android_gms_internal_afb;
            if (1 == parseInt) {
                com_google_android_gms_internal_afb = (afb) this.f5038a.get();
                if (com_google_android_gms_internal_afb != null) {
                    com_google_android_gms_internal_afb.zzbs();
                }
            } else if (parseInt == 0) {
                com_google_android_gms_internal_afb = (afb) this.f5038a.get();
                if (com_google_android_gms_internal_afb != null) {
                    com_google_android_gms_internal_afb.zzbt();
                }
            }
        }
    }
}
