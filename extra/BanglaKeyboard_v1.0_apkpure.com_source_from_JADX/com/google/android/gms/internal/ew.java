package com.google.android.gms.internal;

import java.util.Map;

final class ew implements ba {
    final /* synthetic */ eu f1305a;

    ew(eu euVar) {
        this.f1305a = euVar;
    }

    public final void mo824a(ge geVar, Map map) {
        synchronized (this.f1305a.f1297a) {
            String str = (String) map.get("url");
            if (str == null) {
                gb.m2069a("URL missing in loadAdUrl GMSG.");
                return;
            }
            if (str.contains("%40mediation_adapters%40")) {
                str = str.replaceAll("%40mediation_adapters%40", fi.m1984a(geVar.getContext(), (String) map.get("check_adapters"), this.f1305a.f1299c));
                "Ad request URL modified to " + str;
                gb.m2071a(2);
            }
            this.f1305a.f1301e = str;
            this.f1305a.f1297a.notify();
        }
    }
}
