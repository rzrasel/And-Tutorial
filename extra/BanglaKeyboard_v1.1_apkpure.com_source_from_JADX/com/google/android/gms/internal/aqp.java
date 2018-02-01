package com.google.android.gms.internal;

import android.support.v4.p018f.C0477m;
import android.view.View;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@aqv
public final class aqp implements aqd<aew> {
    private final boolean f5660a;

    public aqp(boolean z) {
        this.f5660a = z;
    }

    private static <K, V> C0477m<K, V> m5085a(C0477m<K, Future<V>> c0477m) {
        C0477m<K, V> c0477m2 = new C0477m();
        for (int i = 0; i < c0477m.size(); i++) {
            c0477m2.put(c0477m.m1249b(i), ((Future) c0477m.m1250c(i)).get());
        }
        return c0477m2;
    }

    public final /* synthetic */ afc mo2017a(apt com_google_android_gms_internal_apt, JSONObject jSONObject) {
        String valueOf;
        View view;
        C0477m c0477m = new C0477m();
        C0477m c0477m2 = new C0477m();
        Future a = com_google_android_gms_internal_apt.m5055a(jSONObject);
        il a2 = com_google_android_gms_internal_apt.m5056a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                c0477m2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                string = jSONObject2.getString("name");
                boolean z = this.f5660a;
                jSONObject2 = jSONObject2.getJSONObject("image_value");
                boolean optBoolean = jSONObject2.optBoolean("require", true);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                c0477m.put(string, com_google_android_gms_internal_apt.m5058a(jSONObject2, optBoolean, z));
            } else {
                String str = "Unknown custom asset type: ";
                valueOf = String.valueOf(string);
                id.m5370a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        jf a3 = apt.m5047a(a2);
        valueOf = jSONObject.getString("custom_template_id");
        c0477m = m5085a(c0477m);
        aeo com_google_android_gms_internal_aeo = (aeo) a.get();
        abv y = a3 != null ? a3.mo2187y() : null;
        if (a3 == null) {
            view = null;
        } else if (a3 == null) {
            throw null;
        } else {
            view = (View) a3;
        }
        return new aew(valueOf, c0477m, c0477m2, com_google_android_gms_internal_aeo, y, view);
    }
}
