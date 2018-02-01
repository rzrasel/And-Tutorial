package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@aqv
public final class aht implements ail {
    public final void mo1470a(jf jfVar, Map<String, String> map) {
        String str = (String) map.get("action");
        aec com_google_android_gms_internal_aec;
        if ("tick".equals(str)) {
            str = (String) map.get("label");
            Object obj = (String) map.get("start_label");
            String str2 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str)) {
                id.m5370a("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str2)) {
                id.m5370a("No timestamp given for CSI tick.");
            } else {
                try {
                    long parseLong = (Long.parseLong(str2) - zzbv.zzeg().mo1669a()) + zzbv.zzeg().mo1670b();
                    if (TextUtils.isEmpty(obj)) {
                        obj = "native:view_load";
                    }
                    aeb x = jfVar.mo2186x();
                    aec com_google_android_gms_internal_aec2 = x.f4946b;
                    aea com_google_android_gms_internal_aea = (aea) x.f4945a.get(obj);
                    String[] strArr = new String[]{str};
                    if (!(com_google_android_gms_internal_aec2 == null || com_google_android_gms_internal_aea == null)) {
                        com_google_android_gms_internal_aec2.m4236a(com_google_android_gms_internal_aea, parseLong, strArr);
                    }
                    Map map2 = x.f4945a;
                    com_google_android_gms_internal_aec = x.f4946b;
                    map2.put(str, com_google_android_gms_internal_aec == null ? null : com_google_android_gms_internal_aec.m4234a(parseLong));
                } catch (Throwable e) {
                    id.m5371a("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            str = (String) map.get("value");
            if (TextUtils.isEmpty(str)) {
                id.m5370a("No value given for CSI experiment.");
                return;
            }
            com_google_android_gms_internal_aec = jfVar.mo2186x().f4946b;
            if (com_google_android_gms_internal_aec == null) {
                id.m5370a("No ticker for WebView, dropping experiment ID.");
            } else {
                com_google_android_gms_internal_aec.m4235a("e", str);
            }
        } else if ("extra".equals(str)) {
            str = (String) map.get("name");
            String str3 = (String) map.get("value");
            if (TextUtils.isEmpty(str3)) {
                id.m5370a("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str)) {
                id.m5370a("No name given for CSI extra.");
            } else {
                aec com_google_android_gms_internal_aec3 = jfVar.mo2186x().f4946b;
                if (com_google_android_gms_internal_aec3 == null) {
                    id.m5370a("No ticker for WebView, dropping extra parameter.");
                } else {
                    com_google_android_gms_internal_aec3.m4235a(str, str3);
                }
            }
        }
    }
}
