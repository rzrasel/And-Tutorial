package com.google.android.gms.internal;

import java.util.Map;

final class au implements ba {
    au() {
    }

    public final void mo824a(ge geVar, Map map) {
        cl d = geVar.m2095d();
        if (d == null) {
            gb.m2069a("A GMSG tried to close something that wasn't an overlay.");
        } else {
            d.m1804a();
        }
    }
}
