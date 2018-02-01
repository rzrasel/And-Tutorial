package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

class C0534s {
    static Map f2375a = new HashMap();
    private static String f2376b;

    C0534s() {
    }

    static void m3727a(Context context, String str) {
        au.m3649a(context, "gtm_install_referrer", "referrer", str);
        C0534s.m3729b(context, str);
    }

    static void m3728a(String str) {
        synchronized (C0534s.class) {
            f2376b = str;
        }
    }

    static void m3729b(Context context, String str) {
        String queryParameter = Uri.parse("http://hostname/?" + str).getQueryParameter("conv");
        if (queryParameter != null && queryParameter.length() > 0) {
            f2375a.put(queryParameter, str);
            au.m3649a(context, "gtm_click_referrers", queryParameter, str);
        }
    }
}
