package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzai;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class afn implements ail {
    private /* synthetic */ zzai f5050a;
    private /* synthetic */ afi f5051b;

    afn(afi com_google_android_gms_internal_afi, zzai com_google_android_gms_ads_internal_js_zzai) {
        this.f5051b = com_google_android_gms_internal_afi;
        this.f5050a = com_google_android_gms_ads_internal_js_zzai;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.f5051b.f5041b);
            this.f5050a.zzb("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            id.m5372a(6);
        }
    }
}
