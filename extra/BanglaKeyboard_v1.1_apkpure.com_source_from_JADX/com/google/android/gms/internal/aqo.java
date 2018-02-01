package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@aqv
public final class aqo implements aqd<aet> {
    private final boolean f5658a;
    private final boolean f5659b;

    public aqo(boolean z, boolean z2) {
        this.f5658a = z;
        this.f5659b = z2;
    }

    public final /* synthetic */ afc mo2017a(apt com_google_android_gms_internal_apt, JSONObject jSONObject) {
        View view;
        List<il> b = com_google_android_gms_internal_apt.m5062b(jSONObject, "images", this.f5658a, this.f5659b);
        Future a = com_google_android_gms_internal_apt.m5057a(jSONObject, "secondary_image", false, this.f5658a);
        Future a2 = com_google_android_gms_internal_apt.m5055a(jSONObject);
        il a3 = com_google_android_gms_internal_apt.m5056a(jSONObject, "video");
        List arrayList = new ArrayList();
        for (il ilVar : b) {
            arrayList.add((aeq) ilVar.get());
        }
        jf a4 = apt.m5047a(a3);
        String string = jSONObject.getString("headline");
        String string2 = jSONObject.getString("body");
        afy com_google_android_gms_internal_afy = (afy) a.get();
        String string3 = jSONObject.getString("call_to_action");
        String string4 = jSONObject.getString("advertiser");
        aeo com_google_android_gms_internal_aeo = (aeo) a2.get();
        Bundle bundle = new Bundle();
        abv y = a4 != null ? a4.mo2187y() : null;
        if (a4 == null) {
            view = null;
        } else if (a4 == null) {
            throw null;
        } else {
            view = (View) a4;
        }
        return new aet(string, arrayList, string2, com_google_android_gms_internal_afy, string3, string4, com_google_android_gms_internal_aeo, bundle, y, view);
    }
}
