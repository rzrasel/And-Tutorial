package com.google.android.gms.internal;

import java.util.Map;

final class aia implements ail {
    aia() {
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        if (map.keySet().contains("start")) {
            jfVar.mo2163k().m5740h();
        } else if (map.keySet().contains("stop")) {
            jfVar.mo2163k().m5741i();
        } else if (map.keySet().contains("cancel")) {
            jfVar.mo2163k().m5742j();
        }
    }
}
