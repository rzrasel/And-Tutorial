package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@aqv
public final class bd {
    final List<String> f5745a;
    final String f5746b;
    final String f5747c;
    final String f5748d;
    final boolean f5749e;
    final String f5750f;
    final String f5751g;
    String f5752h;
    int f5753i;
    private final List<String> f5754j;
    private final String f5755k;
    private final boolean f5756l;

    public bd(int i, Map<String, String> map) {
        this.f5752h = (String) map.get("url");
        this.f5746b = (String) map.get("base_uri");
        this.f5747c = (String) map.get("post_parameters");
        this.f5749e = m5116a((String) map.get("drt_include"));
        this.f5756l = m5116a((String) map.get("pan_include"));
        this.f5755k = (String) map.get("activation_overlay_url");
        this.f5754j = m5117b((String) map.get("check_packages"));
        this.f5750f = (String) map.get("request_id");
        this.f5748d = (String) map.get("type");
        this.f5745a = m5117b((String) map.get("errors"));
        this.f5753i = i;
        this.f5751g = (String) map.get("fetched_ad");
    }

    private static boolean m5116a(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    private static List<String> m5117b(String str) {
        return str == null ? null : Arrays.asList(str.split(","));
    }
}
