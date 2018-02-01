package com.google.android.gms.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class afk implements jk {
    private /* synthetic */ Map f5044a;
    private /* synthetic */ afj f5045b;

    afk(afj com_google_android_gms_internal_afj, Map map) {
        this.f5045b = com_google_android_gms_internal_afj;
        this.f5044a = map;
    }

    public final void mo1477a(jf jfVar, boolean z) {
        this.f5045b.f5043b.f5041b = (String) this.f5044a.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", this.f5045b.f5043b.f5041b);
            this.f5045b.f5042a.zzb("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            id.m5372a(6);
        }
    }
}
