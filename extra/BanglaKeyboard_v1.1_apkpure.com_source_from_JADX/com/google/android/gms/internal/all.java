package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@aqv
public final class all {
    public final String f5280a;
    public final String f5281b;
    public final List<String> f5282c;
    public final String f5283d;
    public final String f5284e;
    public final List<String> f5285f;
    public final List<String> f5286g;
    public final List<String> f5287h;
    public final List<String> f5288i;
    public final String f5289j;
    public final List<String> f5290k;
    public final List<String> f5291l;
    public final String f5292m;
    public final String f5293n;
    public final String f5294o;
    public final List<String> f5295p;
    public final String f5296q;
    private String f5297r;

    public all(String str, List<String> list, List<String> list2, List<String> list3, List<String> list4, String str2, List<String> list5, List<String> list6, List<String> list7) {
        this.f5280a = str;
        this.f5281b = null;
        this.f5282c = list;
        this.f5283d = null;
        this.f5284e = null;
        this.f5285f = list2;
        this.f5286g = list3;
        this.f5287h = list4;
        this.f5289j = str2;
        this.f5290k = list5;
        this.f5291l = list6;
        this.f5292m = null;
        this.f5293n = null;
        this.f5294o = null;
        this.f5295p = null;
        this.f5296q = null;
        this.f5288i = list7;
        this.f5297r = null;
    }

    public all(JSONObject jSONObject) {
        List a;
        this.f5281b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f5282c = Collections.unmodifiableList(arrayList);
        this.f5283d = jSONObject.optString("allocation_id", null);
        zzbv.zzeu();
        this.f5285f = alu.m4726a(jSONObject, "clickurl");
        zzbv.zzeu();
        this.f5286g = alu.m4726a(jSONObject, "imp_urls");
        zzbv.zzeu();
        this.f5288i = alu.m4726a(jSONObject, "fill_urls");
        zzbv.zzeu();
        this.f5290k = alu.m4726a(jSONObject, "video_start_urls");
        zzbv.zzeu();
        this.f5291l = alu.m4726a(jSONObject, "video_complete_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzbv.zzeu();
            a = alu.m4726a(optJSONObject, "manual_impression_urls");
        } else {
            a = null;
        }
        this.f5287h = a;
        this.f5280a = optJSONObject != null ? optJSONObject.toString() : null;
        optJSONObject = jSONObject.optJSONObject("data");
        this.f5289j = optJSONObject != null ? optJSONObject.toString() : null;
        this.f5284e = optJSONObject != null ? optJSONObject.optString("class_name") : null;
        this.f5292m = jSONObject.optString("html_template", null);
        this.f5293n = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("assets");
        this.f5294o = optJSONObject2 != null ? optJSONObject2.toString() : null;
        zzbv.zzeu();
        this.f5295p = alu.m4726a(jSONObject, "template_ids");
        optJSONObject2 = jSONObject.optJSONObject("ad_loader_options");
        this.f5296q = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f5297r = jSONObject.optString("response_type", null);
    }

    public final boolean m4683a() {
        return "banner".equalsIgnoreCase(this.f5297r);
    }

    public final boolean m4684b() {
        return "native".equalsIgnoreCase(this.f5297r);
    }
}
