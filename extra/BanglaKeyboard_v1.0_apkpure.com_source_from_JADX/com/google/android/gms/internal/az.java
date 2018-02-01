package com.google.android.gms.internal;

import java.util.Map;

final class az implements ba {
    az() {
    }

    public final void mo824a(ge geVar, Map map) {
        String str = (String) map.get("ty");
        String str2 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt((String) map.get("tx"));
            int parseInt2 = Integer.parseInt(str);
            int parseInt3 = Integer.parseInt(str2);
            ne g = geVar.m2098g();
            if (g != null) {
                g.f1971a.mo940a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException e) {
            gb.m2069a("Could not parse touch parameters from gmsg.");
        }
    }
}
