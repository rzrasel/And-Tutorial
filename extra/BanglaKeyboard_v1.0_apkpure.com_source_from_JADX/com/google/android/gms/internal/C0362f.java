package com.google.android.gms.internal;

import java.util.Map;

final class C0362f implements ba {
    final /* synthetic */ C0356b f1360a;

    C0362f(C0356b c0356b) {
        this.f1360a = c0356b;
    }

    public final void mo824a(ge geVar, Map map) {
        if (map.containsKey("pingType") && "unloadPing".equals(map.get("pingType"))) {
            C0356b c0356b = this.f1360a;
            C0356b.m1660a(this.f1360a.f1030g);
            "Unregistered GMSG handlers for: " + this.f1360a.f1028e.f2018c;
            gb.m2071a(4);
        }
    }
}
