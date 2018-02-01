package com.google.android.gms.internal;

import java.util.Map;

@aqv
public final class ait implements ail {
    private final aiu f5161a;

    public ait(aiu com_google_android_gms_internal_aiu) {
        this.f5161a = com_google_android_gms_internal_aiu;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        float parseFloat;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        try {
            if (map.get("blurRadius") != null) {
                parseFloat = Float.parseFloat((String) map.get("blurRadius"));
                this.f5161a.zzd(equals);
                this.f5161a.zza(equals2, parseFloat);
            }
        } catch (NumberFormatException e) {
            id.m5372a(6);
        }
        parseFloat = 0.0f;
        this.f5161a.zzd(equals);
        this.f5161a.zza(equals2, parseFloat);
    }
}
