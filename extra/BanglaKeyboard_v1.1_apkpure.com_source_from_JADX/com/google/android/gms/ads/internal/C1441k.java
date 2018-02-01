package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aet;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jk;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class C1441k implements jk {
    private /* synthetic */ aet f4102a;
    private /* synthetic */ String f4103b;
    private /* synthetic */ jf f4104c;

    C1441k(aet com_google_android_gms_internal_aet, String str, jf jfVar) {
        this.f4102a = com_google_android_gms_internal_aet;
        this.f4103b = str;
        this.f4104c = jfVar;
    }

    public final void mo1477a(jf jfVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", this.f4102a.f4995a);
            jSONObject.put("body", this.f4102a.f4997c);
            jSONObject.put("call_to_action", this.f4102a.f4999e);
            jSONObject.put("advertiser", this.f4102a.f5000f);
            jSONObject.put("logo", zzas.m3743a(this.f4102a.f4998d));
            JSONArray jSONArray = new JSONArray();
            List<Object> list = this.f4102a.f4996b;
            if (list != null) {
                for (Object a : list) {
                    jSONArray.put(zzas.m3743a(zzas.m3740a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", zzas.m3744a(this.f4102a.f5001g, this.f4103b));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            this.f4104c.zza("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (Throwable e) {
            id.m5371a("Exception occurred when loading assets", e);
        }
    }
}
