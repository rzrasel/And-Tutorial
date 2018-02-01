package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bj {
    public final List f1056a;
    public final long f1057b;
    public final List f1058c;
    public final List f1059d;
    public final List f1060e;
    public final String f1061f;
    public final long f1062g;
    public int f1063h;
    public int f1064i;

    public bj(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (gb.m2071a(2)) {
            "Mediation Response JSON: " + jSONObject.toString(2);
            gb.m2071a(2);
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        List arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            bi biVar = new bi(jSONArray.getJSONObject(i2));
            arrayList.add(biVar);
            if (i < 0 && m1682a(biVar)) {
                i = i2;
            }
        }
        this.f1063h = i;
        this.f1064i = jSONArray.length();
        this.f1056a = Collections.unmodifiableList(arrayList);
        this.f1061f = jSONObject.getString("qdata");
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f1057b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            this.f1058c = bq.m1707a(optJSONObject, "click_urls");
            this.f1059d = bq.m1707a(optJSONObject, "imp_urls");
            this.f1060e = bq.m1707a(optJSONObject, "nofill_urls");
            long optLong = optJSONObject.optLong("refresh", -1);
            this.f1062g = optLong > 0 ? optLong * 1000 : -1;
            return;
        }
        this.f1057b = -1;
        this.f1058c = null;
        this.f1059d = null;
        this.f1060e = null;
        this.f1062g = -1;
    }

    private static boolean m1682a(bi biVar) {
        for (String equals : biVar.f1052c) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
