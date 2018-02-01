package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class ajb implements ail {
    private final Object f5180a = new Object();
    private final Map<String, ajc> f5181b = new HashMap();

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        map.get("fail_reason");
        String str3 = (String) map.get("result");
        synchronized (this.f5180a) {
            if (((ajc) this.f5181b.remove(str)) == null) {
                str2 = "Received result for unexpected method invocation: ";
                str = String.valueOf(str);
                id.m5370a(str.length() != 0 ? str2.concat(str) : new String(str2));
            } else if (!TextUtils.isEmpty(str2)) {
            } else if (str3 == null) {
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                } catch (JSONException e) {
                    e.getMessage();
                }
            }
        }
    }
}
