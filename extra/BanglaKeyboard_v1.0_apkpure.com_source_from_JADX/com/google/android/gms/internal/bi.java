package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bi {
    public final String f1050a;
    public final String f1051b;
    public final List f1052c;
    public final String f1053d;
    public final List f1054e;
    public final String f1055f;

    public bi(JSONObject jSONObject) {
        String str = null;
        this.f1051b = jSONObject.getString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f1052c = Collections.unmodifiableList(arrayList);
        this.f1053d = jSONObject.optString("allocation_id", null);
        this.f1054e = bq.m1707a(jSONObject, "imp_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        this.f1050a = optJSONObject != null ? optJSONObject.toString() : null;
        optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            str = optJSONObject.toString();
        }
        this.f1055f = str;
    }
}
