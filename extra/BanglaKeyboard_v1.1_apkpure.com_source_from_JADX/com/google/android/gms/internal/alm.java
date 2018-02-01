package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@aqv
public final class alm {
    public final List<all> f5298a;
    public final long f5299b;
    public final List<String> f5300c;
    public final List<String> f5301d;
    public final List<String> f5302e;
    public final List<String> f5303f;
    public final boolean f5304g;
    public final String f5305h;
    public final long f5306i;
    public final String f5307j;
    public final int f5308k;
    public final int f5309l;
    public final long f5310m;
    public final boolean f5311n;
    public final boolean f5312o;
    public int f5313p;
    public int f5314q;
    public boolean f5315r;

    public alm(String str) {
        this(new JSONObject(str));
    }

    public alm(List<all> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, boolean z, String str) {
        this.f5298a = list;
        this.f5299b = j;
        this.f5300c = list2;
        this.f5301d = list3;
        this.f5302e = list4;
        this.f5303f = list5;
        this.f5304g = z;
        this.f5305h = str;
        this.f5306i = -1;
        this.f5313p = 0;
        this.f5314q = 1;
        this.f5307j = null;
        this.f5308k = 0;
        this.f5309l = -1;
        this.f5310m = -1;
        this.f5311n = false;
        this.f5312o = false;
        this.f5315r = false;
    }

    public alm(JSONObject jSONObject) {
        if (id.m5372a(2)) {
            String str = "Mediation Response JSON: ";
            String valueOf = String.valueOf(jSONObject.toString(2));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            es.m5373a();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        List arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            all com_google_android_gms_internal_all = new all(jSONArray.getJSONObject(i2));
            if (com_google_android_gms_internal_all.m4683a()) {
                this.f5315r = true;
            }
            arrayList.add(com_google_android_gms_internal_all);
            if (i < 0 && m4685a(com_google_android_gms_internal_all)) {
                i = i2;
            }
        }
        this.f5313p = i;
        this.f5314q = jSONArray.length();
        this.f5298a = Collections.unmodifiableList(arrayList);
        this.f5305h = jSONObject.optString("qdata");
        this.f5309l = jSONObject.optInt("fs_model_type", -1);
        this.f5310m = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f5299b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            zzbv.zzeu();
            this.f5300c = alu.m4726a(optJSONObject, "click_urls");
            zzbv.zzeu();
            this.f5301d = alu.m4726a(optJSONObject, "imp_urls");
            zzbv.zzeu();
            this.f5302e = alu.m4726a(optJSONObject, "nofill_urls");
            zzbv.zzeu();
            this.f5303f = alu.m4726a(optJSONObject, "remote_ping_urls");
            this.f5304g = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            this.f5306i = optLong > 0 ? optLong * 1000 : -1;
            zzaek a = zzaek.m7091a(optJSONObject.optJSONArray("rewards"));
            if (a == null) {
                this.f5307j = null;
                this.f5308k = 0;
            } else {
                this.f5307j = a.f7696a;
                this.f5308k = a.f7697b;
            }
            this.f5311n = optJSONObject.optBoolean("use_displayed_impression", false);
            this.f5312o = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            return;
        }
        this.f5299b = -1;
        this.f5300c = null;
        this.f5301d = null;
        this.f5302e = null;
        this.f5303f = null;
        this.f5306i = -1;
        this.f5307j = null;
        this.f5308k = 0;
        this.f5311n = false;
        this.f5304g = false;
        this.f5312o = false;
    }

    private static boolean m4685a(all com_google_android_gms_internal_all) {
        for (String equals : com_google_android_gms_internal_all.f5282c) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
