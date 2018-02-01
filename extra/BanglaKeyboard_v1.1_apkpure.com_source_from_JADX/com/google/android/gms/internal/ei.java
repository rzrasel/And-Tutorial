package com.google.android.gms.internal;

import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@aqv
public final class ei {
    public final long f6001a;
    public final Map<String, alm> f6002b = new HashMap();
    public String f6003c;
    public String f6004d;
    public boolean f6005e = false;
    private final List<String> f6006f = new ArrayList();
    private final List<String> f6007g = new ArrayList();

    public ei(String str, long j) {
        this.f6004d = str;
        this.f6001a = j;
        m5319a(str);
    }

    private final void m5319a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                    this.f6005e = false;
                    id.m5370a("App settings could not be fetched successfully.");
                    return;
                }
                this.f6005e = true;
                this.f6003c = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        CharSequence optString2 = jSONObject2.optString("ad_unit_id");
                        if (!(TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2))) {
                            if ("interstitial".equalsIgnoreCase(optString)) {
                                this.f6007g.add(optString2);
                            } else if ("rewarded".equalsIgnoreCase(optString)) {
                                jSONObject2 = jSONObject2.optJSONObject("mediation_config");
                                if (jSONObject2 != null) {
                                    this.f6002b.put(optString2, new alm(jSONObject2));
                                }
                            }
                        }
                    }
                }
                m5320a(jSONObject);
            } catch (Throwable e) {
                id.m5371a("Exception occurred while processing app setting json", e);
                zzbv.zzee().m5336a(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    private final void m5320a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("persistable_banner_ad_unit_ids");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f6006f.add(optJSONArray.optString(i));
            }
        }
    }
}
