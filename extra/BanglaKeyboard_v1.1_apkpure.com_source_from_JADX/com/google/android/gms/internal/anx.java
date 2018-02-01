package com.google.android.gms.internal;

import java.util.Map;

@aqv
public final class anx {
    final jf f5481a;
    final boolean f5482b;
    final String f5483c;

    public anx(jf jfVar, Map<String, String> map) {
        this.f5481a = jfVar;
        this.f5483c = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f5482b = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        } else {
            this.f5482b = true;
        }
    }
}
