package com.google.android.gms.internal;

import java.util.Map;

final class ax implements ba {
    ax() {
    }

    public final void mo824a(ge geVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            gb.m2069a("URL missing from httpTrack GMSG.");
        } else {
            fl.m1985a(new fy(geVar.getContext(), geVar.m2099h().f1222b, str).f1199e);
        }
    }
}
