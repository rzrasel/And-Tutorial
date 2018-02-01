package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class et {
    private static final SimpleDateFormat f1296a = new SimpleDateFormat("yyyyMMdd");

    public static cz m1948a(Context context, cx cxVar, String str) {
        try {
            cz czVar;
            List list;
            List list2;
            List list3;
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("ad_base_url", null);
            String optString2 = jSONObject.optString("ad_url", null);
            String optString3 = jSONObject.optString("ad_size", null);
            String optString4 = jSONObject.optString("ad_html", null);
            long j = -1;
            String optString5 = jSONObject.optString("debug_dialog", null);
            long j2 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            String optString6 = jSONObject.optString("orientation", null);
            int i = -1;
            if ("portrait".equals(optString6)) {
                i = fo.m2008c();
            } else if ("landscape".equals(optString6)) {
                i = fo.m2004b();
            }
            if (TextUtils.isEmpty(optString4)) {
                if (TextUtils.isEmpty(optString2)) {
                    gb.m2069a("Could not parse the mediation config: Missing required ad_html or ad_url field.");
                    return new cz(0);
                }
                cz a = eq.m1943a(context, cxVar.f1167k.f1222b, optString2);
                optString = a.f1171b;
                optString4 = a.f1172c;
                j = a.f1183n;
                czVar = a;
            } else if (TextUtils.isEmpty(optString)) {
                gb.m2069a("Could not parse the mediation config: Missing required ad_base_url field");
                return new cz(0);
            } else {
                czVar = null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
            List list4 = czVar == null ? null : czVar.f1173d;
            if (optJSONArray != null) {
                if (list4 == null) {
                    list4 = new LinkedList();
                }
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    list4.add(optJSONArray.getString(i2));
                }
                list = list4;
            } else {
                list = list4;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("impression_urls");
            list4 = czVar == null ? null : czVar.f1175f;
            if (optJSONArray2 != null) {
                if (list4 == null) {
                    list4 = new LinkedList();
                }
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    list4.add(optJSONArray2.getString(i3));
                }
                list2 = list4;
            } else {
                list2 = list4;
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("manual_impression_urls");
            list4 = czVar == null ? null : czVar.f1179j;
            if (optJSONArray3 != null) {
                if (list4 == null) {
                    list4 = new LinkedList();
                }
                for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                    list4.add(optJSONArray3.getString(i4));
                }
                list3 = list4;
            } else {
                list3 = list4;
            }
            if (czVar != null) {
                if (czVar.f1181l != -1) {
                    i = czVar.f1181l;
                }
                if (czVar.f1176g > 0) {
                    j2 = czVar.f1176g;
                }
            }
            String optString7 = jSONObject.optString("active_view");
            String str2 = null;
            boolean optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
                str2 = jSONObject.optString("ad_passback_url", null);
            }
            return new cz(optString, optString4, list, list2, j2, list3, i, optString3, j, optString5, optBoolean, str2, optString7);
        } catch (JSONException e) {
            gb.m2069a("Could not parse the mediation config: " + e.getMessage());
            return new cz(0);
        }
    }

    private static Integer m1949a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static String m1950a(int i) {
        return String.format(Locale.US, "#%06x", new Object[]{Integer.valueOf(16777215 & i)});
    }

    public static String m1951a(cx cxVar, ey eyVar, String str) {
        try {
            Map hashMap = new HashMap();
            if (!(str == null || str.trim() == "")) {
                hashMap.put("eid", str);
            }
            if (cxVar.f1158b != null) {
                hashMap.put("ad_pos", cxVar.f1158b);
            }
            ah ahVar = cxVar.f1159c;
            String a = fi.m1983a();
            if (a != null) {
                hashMap.put("abf", a);
            }
            if (ahVar.f915b != -1) {
                hashMap.put("cust_age", f1296a.format(new Date(ahVar.f915b)));
            }
            if (ahVar.f916c != null) {
                hashMap.put("extras", ahVar.f916c);
            }
            if (ahVar.f917d != -1) {
                hashMap.put("cust_gender", Integer.valueOf(ahVar.f917d));
            }
            if (ahVar.f918e != null) {
                hashMap.put("kw", ahVar.f918e);
            }
            if (ahVar.f920g != -1) {
                hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(ahVar.f920g));
            }
            if (ahVar.f919f) {
                hashMap.put("adtest", "on");
            }
            if (ahVar.f914a >= 2) {
                if (ahVar.f921h) {
                    hashMap.put("d_imp_hdr", Integer.valueOf(1));
                }
                if (!TextUtils.isEmpty(ahVar.f922i)) {
                    hashMap.put("ppid", ahVar.f922i);
                }
                if (ahVar.f923j != null) {
                    Object obj;
                    av avVar = ahVar.f923j;
                    if (Color.alpha(avVar.f1009b) != 0) {
                        hashMap.put("acolor", m1950a(avVar.f1009b));
                    }
                    if (Color.alpha(avVar.f1010c) != 0) {
                        hashMap.put("bgcolor", m1950a(avVar.f1010c));
                    }
                    if (!(Color.alpha(avVar.f1011d) == 0 || Color.alpha(avVar.f1012e) == 0)) {
                        hashMap.put("gradientto", m1950a(avVar.f1011d));
                        hashMap.put("gradientfrom", m1950a(avVar.f1012e));
                    }
                    if (Color.alpha(avVar.f1013f) != 0) {
                        hashMap.put("bcolor", m1950a(avVar.f1013f));
                    }
                    hashMap.put("bthick", Integer.toString(avVar.f1014g));
                    switch (avVar.f1015h) {
                        case 0:
                            obj = "none";
                            break;
                        case 1:
                            obj = "dashed";
                            break;
                        case 2:
                            obj = "dotted";
                            break;
                        case 3:
                            obj = "solid";
                            break;
                        default:
                            obj = null;
                            break;
                    }
                    if (obj != null) {
                        hashMap.put("btype", obj);
                    }
                    switch (avVar.f1016i) {
                        case 0:
                            obj = "light";
                            break;
                        case 1:
                            obj = "medium";
                            break;
                        case 2:
                            obj = "dark";
                            break;
                        default:
                            obj = null;
                            break;
                    }
                    if (obj != null) {
                        hashMap.put("callbuttoncolor", obj);
                    }
                    if (avVar.f1017j != null) {
                        hashMap.put("channel", avVar.f1017j);
                    }
                    if (Color.alpha(avVar.f1018k) != 0) {
                        hashMap.put("dcolor", m1950a(avVar.f1018k));
                    }
                    if (avVar.f1019l != null) {
                        hashMap.put("font", avVar.f1019l);
                    }
                    if (Color.alpha(avVar.f1020m) != 0) {
                        hashMap.put("hcolor", m1950a(avVar.f1020m));
                    }
                    hashMap.put("headersize", Integer.toString(avVar.f1021n));
                    if (avVar.f1022o != null) {
                        hashMap.put("q", avVar.f1022o);
                    }
                }
            }
            if (ahVar.f914a >= 3 && ahVar.f925l != null) {
                hashMap.put("url", ahVar.f925l);
            }
            hashMap.put("format", cxVar.f1160d.f935b);
            if (cxVar.f1160d.f939f == -1) {
                hashMap.put("smart_w", "full");
            }
            if (cxVar.f1160d.f936c == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (cxVar.f1160d.f941h != null) {
                StringBuilder stringBuilder = new StringBuilder();
                for (ak akVar : cxVar.f1160d.f941h) {
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("|");
                    }
                    stringBuilder.append(akVar.f939f == -1 ? (int) (((float) akVar.f940g) / eyVar.f1335q) : akVar.f939f);
                    stringBuilder.append("x");
                    stringBuilder.append(akVar.f936c == -2 ? (int) (((float) akVar.f937d) / eyVar.f1335q) : akVar.f936c);
                }
                hashMap.put("sz", stringBuilder);
            }
            hashMap.put("slotname", cxVar.f1161e);
            hashMap.put("pn", cxVar.f1162f.packageName);
            if (cxVar.f1163g != null) {
                hashMap.put("vc", Integer.valueOf(cxVar.f1163g.versionCode));
            }
            hashMap.put("ms", cxVar.f1164h);
            hashMap.put("seq_num", cxVar.f1165i);
            hashMap.put("session_id", cxVar.f1166j);
            hashMap.put("js", cxVar.f1167k.f1222b);
            hashMap.put("am", Integer.valueOf(eyVar.f1319a));
            hashMap.put("cog", m1949a(eyVar.f1320b));
            hashMap.put("coh", m1949a(eyVar.f1321c));
            if (!TextUtils.isEmpty(eyVar.f1322d)) {
                hashMap.put("carrier", eyVar.f1322d);
            }
            hashMap.put("gl", eyVar.f1323e);
            if (eyVar.f1324f) {
                hashMap.put("simulator", Integer.valueOf(1));
            }
            hashMap.put("ma", m1949a(eyVar.f1325g));
            hashMap.put("sp", m1949a(eyVar.f1326h));
            hashMap.put("hl", eyVar.f1327i);
            if (!TextUtils.isEmpty(eyVar.f1328j)) {
                hashMap.put("mv", eyVar.f1328j);
            }
            hashMap.put("muv", Integer.valueOf(eyVar.f1329k));
            if (eyVar.f1330l != -2) {
                hashMap.put("cnt", Integer.valueOf(eyVar.f1330l));
            }
            hashMap.put("gnt", Integer.valueOf(eyVar.f1331m));
            hashMap.put("pt", Integer.valueOf(eyVar.f1332n));
            hashMap.put("rm", Integer.valueOf(eyVar.f1333o));
            hashMap.put("riv", Integer.valueOf(eyVar.f1334p));
            hashMap.put("u_sd", Float.valueOf(eyVar.f1335q));
            hashMap.put("sh", Integer.valueOf(eyVar.f1337s));
            hashMap.put("sw", Integer.valueOf(eyVar.f1336r));
            if (cxVar.f1159c.f914a >= 2 && cxVar.f1159c.f924k != null) {
                Location location = cxVar.f1159c.f924k;
                HashMap hashMap2 = new HashMap();
                Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                hashMap2.put("radius", valueOf);
                hashMap2.put("lat", valueOf3);
                hashMap2.put("long", valueOf4);
                hashMap2.put("time", valueOf2);
                hashMap.put("uule", hashMap2);
            }
            if (cxVar.f1157a >= 2) {
                hashMap.put("quality_signals", cxVar.f1168l);
            }
            if (gb.m2071a(2)) {
                "Ad Request JSON: " + fo.m1992a(hashMap).toString(2);
                gb.m2071a(2);
            }
            return fo.m1992a(hashMap).toString();
        } catch (JSONException e) {
            gb.m2069a("Problem serializing ad request to JSON: " + e.getMessage());
            return null;
        }
    }
}
