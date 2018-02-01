package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class aiv implements ail {
    HashMap<String, ir<JSONObject>> f5162a = new HashMap();

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = (String) map.get("fetched_ad");
        id.m5372a(3);
        ir irVar = (ir) this.f5162a.get(str);
        if (irVar == null) {
            id.m5372a(6);
            return;
        }
        try {
            irVar.m3633b(new JSONObject(str2));
        } catch (JSONException e) {
            id.m5372a(6);
            irVar.m3633b(null);
        } finally {
            this.f5162a.remove(str);
        }
    }

    public final void m4572a(String str) {
        ir irVar = (ir) this.f5162a.get(str);
        if (irVar == null) {
            id.m5372a(6);
            return;
        }
        if (!irVar.isDone()) {
            irVar.cancel(true);
        }
        this.f5162a.remove(str);
    }
}
