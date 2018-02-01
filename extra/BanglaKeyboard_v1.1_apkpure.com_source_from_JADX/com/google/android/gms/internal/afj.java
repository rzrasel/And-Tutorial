package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.js.zzai;
import java.util.Map;

final class afj implements ail {
    final /* synthetic */ zzai f5042a;
    final /* synthetic */ afi f5043b;

    afj(afi com_google_android_gms_internal_afi, zzai com_google_android_gms_ads_internal_js_zzai) {
        this.f5043b = com_google_android_gms_internal_afi;
        this.f5042a = com_google_android_gms_ads_internal_js_zzai;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        jf jfVar2 = (jf) this.f5043b.f5040a.get();
        if (jfVar2 == null) {
            this.f5042a.zzb("/loadHtml", (ail) this);
            return;
        }
        jfVar2.mo2163k().f6289c = new afk(this, map);
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            jfVar2.loadData(str, "text/html", "UTF-8");
        } else {
            jfVar2.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
