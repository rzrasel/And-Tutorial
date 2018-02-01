package com.google.android.gms.internal;

import java.util.Map;

public final class am implements ba {
    private final ao f944a;

    public am(ao aoVar) {
        this.f944a = aoVar;
    }

    public final void mo824a(ge geVar, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            gb.m2069a("App event with no name parameter.");
        } else {
            this.f944a.mo978a(str, (String) map.get("info"));
        }
    }
}
