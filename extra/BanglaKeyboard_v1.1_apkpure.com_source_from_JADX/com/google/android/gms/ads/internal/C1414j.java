package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aer;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jk;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class C1414j implements jk {
    private /* synthetic */ aer f4021a;
    private /* synthetic */ String f4022b;
    private /* synthetic */ jf f4023c;

    C1414j(aer com_google_android_gms_internal_aer, String str, jf jfVar) {
        this.f4021a = com_google_android_gms_internal_aer;
        this.f4022b = str;
        this.f4023c = jfVar;
    }

    public final void mo1477a(jf jfVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", this.f4021a.f4980a);
            jSONObject.put("body", this.f4021a.f4982c);
            jSONObject.put("call_to_action", this.f4021a.f4984e);
            jSONObject.put("price", this.f4021a.f4987h);
            jSONObject.put("star_rating", String.valueOf(this.f4021a.f4985f));
            jSONObject.put("store", this.f4021a.f4986g);
            jSONObject.put("icon", zzas.m3743a(this.f4021a.f4983d));
            JSONArray jSONArray = new JSONArray();
            List<Object> list = this.f4021a.f4981b;
            if (list != null) {
                for (Object a : list) {
                    jSONArray.put(zzas.m3743a(zzas.m3740a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", zzas.m3744a(this.f4021a.f4988i, this.f4022b));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            this.f4023c.zza("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (Throwable e) {
            id.m5371a("Exception occurred when loading assets", e);
        }
    }
}
