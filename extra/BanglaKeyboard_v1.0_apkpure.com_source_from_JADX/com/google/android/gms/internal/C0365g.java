package com.google.android.gms.internal;

import java.util.Map;

final class C0365g implements ba {
    final /* synthetic */ C0356b f1435a;

    C0365g(C0356b c0356b) {
        this.f1435a = c0356b;
    }

    public final void mo824a(ge geVar, Map map) {
        if (map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
            this.f1435a.m1670a(Boolean.valueOf(z).booleanValue());
        }
    }
}
