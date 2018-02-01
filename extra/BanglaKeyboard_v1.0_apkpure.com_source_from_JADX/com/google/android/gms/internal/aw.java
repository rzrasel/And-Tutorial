package com.google.android.gms.internal;

import java.util.Map;

final class aw implements ba {
    aw() {
    }

    public final void mo824a(ge geVar, Map map) {
        cl d = geVar.m2095d();
        if (d == null) {
            gb.m2069a("A GMSG tried to use a custom close button on something that wasn't an overlay.");
        } else {
            d.m1809a("1".equals(map.get("custom_close")));
        }
    }
}
