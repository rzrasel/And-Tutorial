package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@aqv
public final class bb {
    boolean f5710A = false;
    String f5711B;
    List<String> f5712C;
    boolean f5713D;
    String f5714E;
    zzaes f5715F;
    boolean f5716G;
    final zzaak f5717H;
    private final long f5718I = -1;
    String f5719a;
    String f5720b;
    String f5721c;
    List<String> f5722d;
    String f5723e;
    String f5724f;
    String f5725g;
    List<String> f5726h;
    long f5727i = -1;
    boolean f5728j = false;
    List<String> f5729k;
    long f5730l = -1;
    int f5731m = -1;
    boolean f5732n = false;
    boolean f5733o = false;
    boolean f5734p = false;
    boolean f5735q = true;
    boolean f5736r = true;
    String f5737s = "";
    boolean f5738t = false;
    boolean f5739u = false;
    zzaek f5740v;
    List<String> f5741w;
    List<String> f5742x;
    boolean f5743y = false;
    zzaaq f5744z;

    public bb(zzaak com_google_android_gms_internal_zzaak, String str) {
        this.f5720b = str;
        this.f5717H = com_google_android_gms_internal_zzaak;
    }

    private static String m5111a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    private static long m5112b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                id.m5370a(new StringBuilder((String.valueOf(str).length() + 36) + String.valueOf(str2).length()).append("Could not parse float from ").append(str).append(" header: ").append(str2).toString());
            }
        }
        return -1;
    }

    private static List<String> m5113c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    private static boolean m5114d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty() || !Boolean.valueOf((String) list.get(0)).booleanValue()) ? false : true;
    }

    public final void m5115a(Map<String, List<String>> map) {
        String str;
        this.f5719a = m5111a(map, "X-Afma-Ad-Size");
        this.f5714E = m5111a(map, "X-Afma-Ad-Slot-Size");
        List c = m5113c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f5722d = c;
        }
        this.f5723e = m5111a(map, "X-Afma-Debug-Signals");
        c = (List) map.get("X-Afma-Debug-Dialog");
        if (!(c == null || c.isEmpty())) {
            this.f5724f = (String) c.get(0);
        }
        c = m5113c(map, "X-Afma-Tracking-Urls");
        if (c != null) {
            this.f5726h = c;
        }
        long b = m5112b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f5727i = b;
        }
        this.f5728j |= m5114d(map, "X-Afma-Mediation");
        c = m5113c(map, "X-Afma-Manual-Tracking-Urls");
        if (c != null) {
            this.f5729k = c;
        }
        b = m5112b(map, "X-Afma-Refresh-Rate");
        if (b != -1) {
            this.f5730l = b;
        }
        c = (List) map.get("X-Afma-Orientation");
        if (!(c == null || c.isEmpty())) {
            str = (String) c.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.f5731m = zzbv.zzec().mo2097b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.f5731m = zzbv.zzec().mo2095a();
            }
        }
        this.f5725g = m5111a(map, "X-Afma-ActiveView");
        c = (List) map.get("X-Afma-Use-HTTPS");
        if (!(c == null || c.isEmpty())) {
            this.f5734p = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        this.f5732n |= m5114d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f5733o = "native".equals(m5111a(map, "X-Afma-Ad-Format"));
        c = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (!(c == null || c.isEmpty())) {
            this.f5735q = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        c = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (!(c == null || c.isEmpty())) {
            this.f5736r = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        c = (List) map.get("X-Afma-Gws-Query-Id");
        if (!(c == null || c.isEmpty())) {
            this.f5737s = (String) c.get(0);
        }
        str = m5111a(map, "X-Afma-Fluid");
        if (str != null && str.equals("height")) {
            this.f5738t = true;
        }
        this.f5739u = "native_express".equals(m5111a(map, "X-Afma-Ad-Format"));
        this.f5740v = zzaek.m7090a(m5111a(map, "X-Afma-Rewards"));
        if (this.f5741w == null) {
            this.f5741w = m5113c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f5742x == null) {
            this.f5742x = m5113c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f5743y |= m5114d(map, "X-Afma-Use-Displayed-Impression");
        this.f5710A |= m5114d(map, "X-Afma-Auto-Collect-Location");
        this.f5711B = m5111a(map, "Set-Cookie");
        Object a = m5111a(map, "X-Afma-Auto-Protection-Configuration");
        if (a == null || TextUtils.isEmpty(a)) {
            Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f5724f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f5724f);
            }
            boolean booleanValue = ((Boolean) zzbv.zzen().m4217a(ado.f4893e)).booleanValue();
            String[] strArr = new String[1];
            String builder = buildUpon.toString();
            String str2 = "navigationURL";
            strArr[0] = new StringBuilder((String.valueOf(builder).length() + 18) + String.valueOf(str2).length()).append(builder).append("&").append(str2).append("={NAVIGATION_URL}").toString();
            this.f5744z = new zzaaq(booleanValue, Arrays.asList(strArr));
        } else {
            try {
                this.f5744z = zzaaq.m7087a(new JSONObject(a));
            } catch (Throwable e) {
                id.m5371a("Error parsing configuration JSON", e);
                this.f5744z = new zzaaq();
            }
        }
        c = m5113c(map, "X-Afma-Remote-Ping-Urls");
        if (c != null) {
            this.f5712C = c;
        }
        a = m5111a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a)) {
            try {
                this.f5715F = zzaes.m7092a(new JSONObject(a));
            } catch (Throwable e2) {
                id.m5371a("Error parsing safe browsing header", e2);
            }
        }
        this.f5713D |= m5114d(map, "X-Afma-Render-In-Browser");
        a = m5111a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a)) {
            try {
                this.f5716G = new JSONObject(a).getBoolean("never_pool");
            } catch (Throwable e22) {
                id.m5371a("Error parsing interstitial pool header", e22);
            }
        }
    }
}
