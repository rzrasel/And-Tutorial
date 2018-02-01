package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C1517u;
import java.util.Map;

@aqv
public final class ajo implements ail {
    public final void mo1470a(jf jfVar, Map<String, String> map) {
        zzbv.zzex();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str == null) {
                id.m5370a("Precache video action is missing the src parameter.");
                return;
            }
            try {
                Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e) {
            }
            if (map.containsKey("mimetype")) {
                map.get("mimetype");
            }
            if (ajj.m4593b(jfVar)) {
                id.m5370a("Precache task already running.");
                return;
            }
            C1517u.m3870a(jfVar.mo2159g());
            new ajh(jfVar, jfVar.mo2159g().zzanp.mo1865a(jfVar), str).m3624h();
        } else if (!ajj.m4592a(jfVar)) {
            id.m5370a("Precache abort but no preload task running.");
        }
    }
}
