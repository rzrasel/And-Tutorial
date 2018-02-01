package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

final class nt implements nx {
    private ge f2005a;

    public nt(ge geVar) {
        this.f2005a = geVar;
    }

    public final void mo999a(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        this.f2005a.m2090a("onAdVisibilityChanged", hashMap);
    }
}
