package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.js.zzai;
import com.google.android.gms.common.internal.C1516t;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class apv implements ail {
    private /* synthetic */ zzai f5605a;
    private /* synthetic */ apu f5606b;

    apv(apu com_google_android_gms_internal_apu, zzai com_google_android_gms_ads_internal_js_zzai) {
        this.f5606b = com_google_android_gms_internal_apu;
        this.f5605a = com_google_android_gms_ads_internal_js_zzai;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        try {
            JSONObject jSONObject;
            int i;
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str);
                i = 1;
            } else {
                jSONObject = new JSONObject(str2);
                i = 0;
            }
            if (this.f5606b.f5601a.equals(jSONObject.optString("ads_id", ""))) {
                this.f5605a.zzb("/nativeAdPreProcess", this.f5606b.f5602b.f5632a);
                if (i != 0) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("ads");
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        this.f5606b.f5604d.m5059a(3);
                        this.f5606b.f5603c.m3633b(null);
                        return;
                    }
                    this.f5606b.f5603c.m3633b(optJSONArray.getJSONObject(0));
                    return;
                }
                this.f5606b.f5604d.m5059a(0);
                C1516t.m3865a(this.f5606b.f5604d.m5061a(), (Object) "Unable to set the ad state error!");
                this.f5606b.f5603c.m3633b(null);
            }
        } catch (JSONException e) {
            id.m5372a(6);
        }
    }
}
