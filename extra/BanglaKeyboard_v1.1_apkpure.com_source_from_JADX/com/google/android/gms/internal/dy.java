package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;

@aqv
public final class dy {
    public static String m5309a(String str, Context context) {
        if (!zzbv.zzez().m5296a(context) || TextUtils.isEmpty(str)) {
            return str;
        }
        String i = zzbv.zzez().m5308i(context);
        if (i == null) {
            return str;
        }
        if (((Boolean) zzbv.zzen().m4217a(ado.am)).booleanValue()) {
            String str2 = (String) zzbv.zzen().m4217a(ado.an);
            if (!str.contains(str2)) {
                return str;
            }
            zzbv.zzea();
            if (gb.m5485d(str)) {
                zzbv.zzez().m5292a(context, i);
                return str.replace(str2, i);
            }
            zzbv.zzea();
            if (!gb.m5489e(str)) {
                return str;
            }
            zzbv.zzez().m5298b(context, i);
            return str.replace(str2, i);
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            zzbv.zzea();
            if (gb.m5485d(str)) {
                zzbv.zzez().m5292a(context, i);
                zzbv.zzea();
                return gb.m5430a(str, "fbs_aeid", i).toString();
            }
            zzbv.zzea();
            if (!gb.m5489e(str)) {
                return str;
            }
            zzbv.zzez().m5298b(context, i);
            zzbv.zzea();
            return gb.m5430a(str, "fbs_aeid", i).toString();
        }
    }
}
