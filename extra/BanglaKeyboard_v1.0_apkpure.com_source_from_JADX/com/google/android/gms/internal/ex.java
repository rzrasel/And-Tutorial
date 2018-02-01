package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class ex {
    String f1306a;
    String f1307b;
    String f1308c;
    List f1309d;
    String f1310e;
    String f1311f;
    List f1312g;
    long f1313h = -1;
    boolean f1314i = false;
    List f1315j;
    long f1316k = -1;
    int f1317l = -1;
    private final long f1318m = -1;

    private static String m1956a(Map map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    private static long m1957b(Map map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                gb.m2069a("Could not parse float from " + str + " header: " + str2);
            }
        }
        return -1;
    }

    private static List m1958c(Map map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    public final void m1959a(Map map) {
        this.f1306a = m1956a(map, "X-Afma-Ad-Size");
        List c = m1958c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f1309d = c;
        }
        c = (List) map.get("X-Afma-Debug-Dialog");
        if (!(c == null || c.isEmpty())) {
            this.f1310e = (String) c.get(0);
        }
        c = m1958c(map, "X-Afma-Tracking-Urls");
        if (c != null) {
            this.f1312g = c;
        }
        long b = m1957b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f1313h = b;
        }
        c = (List) map.get("X-Afma-Mediation");
        if (!(c == null || c.isEmpty())) {
            this.f1314i = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        c = m1958c(map, "X-Afma-Manual-Tracking-Urls");
        if (c != null) {
            this.f1315j = c;
        }
        b = m1957b(map, "X-Afma-Refresh-Rate");
        if (b != -1) {
            this.f1316k = b;
        }
        c = (List) map.get("X-Afma-Orientation");
        if (!(c == null || c.isEmpty())) {
            String str = (String) c.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.f1317l = fo.m2008c();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.f1317l = fo.m2004b();
            }
        }
        this.f1311f = m1956a(map, "X-Afma-ActiveView");
    }
}
