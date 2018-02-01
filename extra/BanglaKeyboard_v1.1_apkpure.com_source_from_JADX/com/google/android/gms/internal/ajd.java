package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Map;

@aqv
public final class ajd implements ail {
    private final aje f5182a;

    public ajd(aje com_google_android_gms_internal_aje) {
        this.f5182a = com_google_android_gms_internal_aje;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzaek com_google_android_gms_internal_zzaek;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                str = (String) map.get("type");
                if (!TextUtils.isEmpty(str)) {
                    com_google_android_gms_internal_zzaek = new zzaek(str, parseInt);
                    this.f5182a.zzb(com_google_android_gms_internal_zzaek);
                }
            } catch (Throwable e) {
                id.m5371a("Unable to parse reward amount.", e);
            }
            com_google_android_gms_internal_zzaek = null;
            this.f5182a.zzb(com_google_android_gms_internal_zzaek);
        } else if ("video_start".equals(str)) {
            this.f5182a.zzdb();
        }
    }
}
