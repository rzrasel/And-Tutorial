package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@aqv
public final class alu {
    private static String m4725a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public static List<String> m4726a(JSONObject jSONObject, String str) {
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

    public static void m4727a(Context context, String str, ee eeVar, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String a : list) {
                String a2 = m4725a(m4725a(m4725a(m4725a(m4725a(m4725a(m4725a(a2, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", eeVar.f5968q.f5305h), "@gw_sdkver@", str), "@gw_sessid@", zzbv.zzee().f6017b), "@gw_seqnum@", eeVar.f5960i), "@gw_adnetstatus@", eeVar.f5970s);
                if (eeVar.f5965n != null) {
                    a2 = m4725a(m4725a(a2, "@gw_adnetid@", eeVar.f5965n.f5281b), "@gw_allocid@", eeVar.f5965n.f5283d);
                }
                a2 = dy.m5309a(a2, context);
                zzbv.zzea();
                gb.m5472b(context, str, a2);
            }
        }
    }

    public static boolean m4728a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(split[0]);
            iArr[1] = Integer.parseInt(split[1]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
