package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

final class at implements ba {
    at() {
    }

    public final void mo824a(ge geVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            gb.m2069a("URL missing from click GMSG.");
            return;
        }
        Uri a;
        Uri parse = Uri.parse(str);
        try {
            ne g = geVar.m2098g();
            if (g != null && g.m2669a(parse)) {
                a = g.m2668a(parse, geVar.getContext());
                fl.m1985a(new fy(geVar.getContext(), geVar.m2099h().f1222b, a.toString()).f1199e);
            }
        } catch (nf e) {
            gb.m2069a("Unable to append parameter to URL: " + str);
        }
        a = parse;
        fl.m1985a(new fy(geVar.getContext(), geVar.m2099h().f1222b, a.toString()).f1199e);
    }
}
