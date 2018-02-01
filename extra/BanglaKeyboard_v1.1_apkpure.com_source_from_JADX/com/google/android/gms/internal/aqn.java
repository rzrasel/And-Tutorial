package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@aqv
public final class aqn implements aqd<aer> {
    private final boolean f5656a;
    private final boolean f5657b;

    public aqn(boolean z, boolean z2) {
        this.f5656a = z;
        this.f5657b = z2;
    }

    public final /* synthetic */ afc mo2017a(apt com_google_android_gms_internal_apt, JSONObject jSONObject) {
        View view;
        List<il> b = com_google_android_gms_internal_apt.m5062b(jSONObject, "images", this.f5656a, this.f5657b);
        Future a = com_google_android_gms_internal_apt.m5057a(jSONObject, "app_icon", true, this.f5656a);
        il a2 = com_google_android_gms_internal_apt.m5056a(jSONObject, "video");
        Future a3 = com_google_android_gms_internal_apt.m5055a(jSONObject);
        List arrayList = new ArrayList();
        for (il ilVar : b) {
            arrayList.add((aeq) ilVar.get());
        }
        jf a4 = apt.m5047a(a2);
        String string = jSONObject.getString("headline");
        String string2 = jSONObject.getString("body");
        afy com_google_android_gms_internal_afy = (afy) a.get();
        String string3 = jSONObject.getString("call_to_action");
        double optDouble = jSONObject.optDouble("rating", -1.0d);
        String optString = jSONObject.optString("store");
        String optString2 = jSONObject.optString("price");
        aeo com_google_android_gms_internal_aeo = (aeo) a3.get();
        Bundle bundle = new Bundle();
        abv y = a4 != null ? a4.mo2187y() : null;
        if (a4 == null) {
            view = null;
        } else if (a4 == null) {
            throw null;
        } else {
            view = (View) a4;
        }
        return new aer(string, arrayList, string2, com_google_android_gms_internal_afy, string3, optDouble, optString, optString2, com_google_android_gms_internal_aeo, bundle, y, view);
    }
}
