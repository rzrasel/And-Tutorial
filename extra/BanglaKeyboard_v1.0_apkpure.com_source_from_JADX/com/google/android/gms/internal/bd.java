package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

public final class bd implements ba {
    private static int m1679a(DisplayMetrics displayMetrics, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                i = fz.m2029a(displayMetrics, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                gb.m2069a("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        return i;
    }

    public final void mo824a(ge geVar, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            gb.m2069a("Action missing from video GMSG.");
            return;
        }
        cl d = geVar.m2095d();
        if (d == null) {
            gb.m2069a("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean equalsIgnoreCase = "new".equalsIgnoreCase(str);
        boolean equalsIgnoreCase2 = "position".equalsIgnoreCase(str);
        int a;
        if (equalsIgnoreCase || equalsIgnoreCase2) {
            DisplayMetrics displayMetrics = geVar.getContext().getResources().getDisplayMetrics();
            a = m1679a(displayMetrics, map, "x", 0);
            int a2 = m1679a(displayMetrics, map, "y", 0);
            int a3 = m1679a(displayMetrics, map, "w", -1);
            int a4 = m1679a(displayMetrics, map, "h", -1);
            if (equalsIgnoreCase && d.m1810b() == null) {
                d.m1811b(a, a2, a3, a4);
                return;
            } else {
                d.m1806a(a, a2, a3, a4);
                return;
            }
        }
        cs b = d.m1810b();
        if (b == null) {
            cs.m1827a(geVar, "no_video_view", null);
        } else if ("click".equalsIgnoreCase(str)) {
            displayMetrics = geVar.getContext().getResources().getDisplayMetrics();
            int a5 = m1679a(displayMetrics, map, "x", 0);
            a = m1679a(displayMetrics, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a5, (float) a, 0);
            b.m1832a(obtain);
            obtain.recycle();
        } else if ("controls".equalsIgnoreCase(str)) {
            str = (String) map.get("enabled");
            if (str == null) {
                gb.m2069a("Enabled parameter missing from controls video GMSG.");
            } else {
                b.m1834a(Boolean.parseBoolean(str));
            }
        } else if ("currentTime".equalsIgnoreCase(str)) {
            str = (String) map.get("time");
            if (str == null) {
                gb.m2069a("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                b.m1831a((int) (Float.parseFloat(str) * 1000.0f));
            } catch (NumberFormatException e) {
                gb.m2069a("Could not parse time parameter from currentTime video GMSG: " + str);
            }
        } else if ("hide".equalsIgnoreCase(str)) {
            b.setVisibility(4);
        } else if ("load".equalsIgnoreCase(str)) {
            b.m1835b();
        } else if ("pause".equalsIgnoreCase(str)) {
            b.m1836c();
        } else if ("play".equalsIgnoreCase(str)) {
            b.m1837d();
        } else if ("show".equalsIgnoreCase(str)) {
            b.setVisibility(0);
        } else if ("src".equalsIgnoreCase(str)) {
            b.m1833a((String) map.get("src"));
        } else {
            gb.m2069a("Unknown video action: " + str);
        }
    }
}
