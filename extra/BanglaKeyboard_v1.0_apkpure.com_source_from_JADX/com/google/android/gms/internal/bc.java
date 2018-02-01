package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public final class bc implements ba {
    private final bb f1040a;

    public bc(bb bbVar) {
        this.f1040a = bbVar;
    }

    private static boolean m1676a(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int m1677b(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return fo.m2008c();
            }
            if ("l".equalsIgnoreCase(str)) {
                return fo.m2004b();
            }
        }
        return -1;
    }

    public final void mo824a(ge geVar, Map map) {
        String str = (String) map.get("a");
        if (str == null) {
            gb.m2069a("Action missing from an open GMSG.");
            return;
        }
        gi f = geVar.m2097f();
        if ("expand".equalsIgnoreCase(str)) {
            if (geVar.m2100i()) {
                gb.m2069a("Cannot expand WebView that is already expanded.");
            } else {
                f.m2122a(m1676a(map), m1677b(map));
            }
        } else if ("webapp".equalsIgnoreCase(str)) {
            str = (String) map.get("u");
            if (str != null) {
                f.m2123a(m1676a(map), m1677b(map), str);
            } else {
                f.m2124a(m1676a(map), m1677b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if ("in_app_purchase".equalsIgnoreCase(str)) {
            str = (String) map.get("product_id");
            String str2 = (String) map.get("report_urls");
            if (this.f1040a == null) {
                return;
            }
            if (str2 == null || str2.isEmpty()) {
                this.f1040a.mo979a(str, new ArrayList());
                return;
            }
            this.f1040a.mo979a(str, new ArrayList(Arrays.asList(str2.split(" "))));
        } else {
            f.m2118a(new cb((String) map.get("i"), (String) map.get("u"), (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        }
    }
}
