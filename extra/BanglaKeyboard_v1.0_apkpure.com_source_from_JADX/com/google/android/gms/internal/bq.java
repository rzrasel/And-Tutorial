package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bq {
    public static List m1707a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        List arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void m1708a(Context context, String str, ez ezVar, String str2, boolean z, List list) {
        String str3 = z ? "1" : "0";
        for (String replaceAll : list) {
            String replaceAll2 = replaceAll2.replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", ezVar.f1352o.f1061f).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", fd.f1380a).replaceAll("@gw_seqnum@", ezVar.f1346i);
            if (ezVar.f1349l != null) {
                replaceAll2 = replaceAll2.replaceAll("@gw_adnetid@", ezVar.f1349l.f1051b).replaceAll("@gw_allocid@", ezVar.f1349l.f1053d);
            }
            fl.m1985a(new fy(context, str, replaceAll2).f1199e);
        }
    }
}
