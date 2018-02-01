package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@aqv
public final class aiw implements ail {
    public final void mo1470a(jf jfVar, Map<String, String> map) {
        if (zzbv.zzez().m5296a(jfVar.getContext())) {
            int i = -1;
            try {
                i = Integer.parseInt((String) map.get("eventType"));
            } catch (Exception e) {
                id.m5372a(6);
            }
            String str = (String) map.get("eventId");
            switch (i) {
                case 0:
                    zzbv.zzez().m5292a(jfVar.getContext(), str);
                    return;
                case 1:
                    zzbv.zzez().m5298b(jfVar.getContext(), str);
                    return;
                case 2:
                    du zzez = zzbv.zzez();
                    Context context = jfVar.getContext();
                    if (zzez.m5296a(context)) {
                        zzez.m5293a(context, "_aa", du.m5287a(str));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
