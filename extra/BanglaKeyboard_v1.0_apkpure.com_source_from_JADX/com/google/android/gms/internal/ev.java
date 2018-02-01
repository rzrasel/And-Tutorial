package com.google.android.gms.internal;

import java.util.Map;

final class ev implements ba {
    final /* synthetic */ eu f1304a;

    ev(eu euVar) {
        this.f1304a = euVar;
    }

    public final void mo824a(ge geVar, Map map) {
        synchronized (this.f1304a.f1297a) {
            String str = (String) map.get("errors");
            gb.m2069a("Invalid " + ((String) map.get("type")) + " request error: " + str);
            this.f1304a.f1300d = 1;
            this.f1304a.f1297a.notify();
        }
    }
}
