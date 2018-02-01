package com.google.android.gms.internal;

import java.util.Map;

final class ahw implements ail {
    ahw() {
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        String str = (String) map.get("ty");
        String str2 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt((String) map.get("tx"));
            int parseInt2 = Integer.parseInt(str);
            int parseInt3 = Integer.parseInt(str2);
            nh m = jfVar.mo2168m();
            if (m != null) {
                m.f6707e.zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException e) {
            id.m5370a("Could not parse touch parameters from gmsg.");
        }
    }
}
