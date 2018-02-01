package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@aqv
final class ajg implements ail {
    ajg() {
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        Throwable e;
        if (((Boolean) zzbv.zzen().m4217a(ado.bd)).booleanValue()) {
            boolean z;
            int i;
            jy y = jfVar.mo2187y();
            if (y == null) {
                try {
                    y = new jy(jfVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")));
                    jfVar.mo2142a(y);
                } catch (NullPointerException e2) {
                    e = e2;
                } catch (NumberFormatException e3) {
                    e = e3;
                }
            }
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            if (parseInt < 0 || 3 < parseInt) {
                parseInt = 0;
            }
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (id.m5372a(3)) {
                new StringBuilder(String.valueOf(str).length() + 79).append("Video Meta GMSG: isMuted : ").append(equals).append(" , playbackState : ").append(parseInt).append(" , aspectRatio : ").append(str);
                id.m5372a(3);
            }
            synchronized (y.f6377a) {
                y.f6380d = parseFloat;
                z = y.f6379c;
                y.f6379c = equals;
                i = y.f6378b;
                y.f6378b = parseInt;
                y.f6381e = parseFloat2;
            }
            zzbv.zzea();
            gb.m5451a(new ka(y, i, parseInt, z, equals));
            return;
        }
        return;
        id.m5372a(6);
        zzbv.zzee().m5336a(e, "VideoMetaGmsgHandler.onGmsg");
    }
}
