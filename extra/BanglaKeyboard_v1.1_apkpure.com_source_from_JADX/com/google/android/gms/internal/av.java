package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
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

@aqv
public final class av {
    private static final SimpleDateFormat f5695a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    public static zzaao m5101a(Context context, zzaak com_google_android_gms_internal_zzaak, String str) {
        String optString;
        try {
            String str2;
            JSONObject jSONObject = new JSONObject(str);
            String optString2 = jSONObject.optString("ad_base_url", null);
            Object optString3 = jSONObject.optString("ad_url", null);
            String optString4 = jSONObject.optString("ad_size", null);
            String optString5 = jSONObject.optString("ad_slot_size", optString4);
            boolean z = (com_google_android_gms_internal_zzaak == null || com_google_android_gms_internal_zzaak.f7623m == 0) ? false : true;
            CharSequence optString6 = jSONObject.optString("ad_json", null);
            if (optString6 == null) {
                optString6 = jSONObject.optString("ad_html", null);
            }
            if (optString6 == null) {
                optString6 = jSONObject.optString("body", null);
            }
            if (optString6 == null) {
                if (jSONObject.has("ads")) {
                    optString6 = jSONObject.toString();
                }
            }
            long j = -1;
            String optString7 = jSONObject.optString("debug_dialog", null);
            String optString8 = jSONObject.optString("debug_signals", null);
            long j2 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            optString = jSONObject.optString("orientation", null);
            int i = -1;
            if ("portrait".equals(optString)) {
                i = zzbv.zzec().mo2097b();
            } else if ("landscape".equals(optString)) {
                i = zzbv.zzec().mo2095a();
            }
            zzaao com_google_android_gms_internal_zzaao = null;
            if (!TextUtils.isEmpty(optString6) || TextUtils.isEmpty(optString3)) {
                CharSequence charSequence = optString6;
            } else {
                com_google_android_gms_internal_zzaao = ao.m4995a(com_google_android_gms_internal_zzaak, context, com_google_android_gms_internal_zzaak.f7621k.f7706a, optString3, null, null, null, null);
                optString2 = com_google_android_gms_internal_zzaao.f7655a;
                str2 = com_google_android_gms_internal_zzaao.f7656b;
                j = com_google_android_gms_internal_zzaao.f7667m;
            }
            if (str2 == null) {
                return new zzaao(0);
            }
            long j3;
            String optString9;
            String str3;
            boolean optBoolean;
            JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
            List list = com_google_android_gms_internal_zzaao == null ? null : com_google_android_gms_internal_zzaao.f7657c;
            if (optJSONArray != null) {
                list = m5103a(optJSONArray, list);
            }
            optJSONArray = jSONObject.optJSONArray("impression_urls");
            List list2 = com_google_android_gms_internal_zzaao == null ? null : com_google_android_gms_internal_zzaao.f7659e;
            if (optJSONArray != null) {
                list2 = m5103a(optJSONArray, list2);
            }
            optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
            List list3 = com_google_android_gms_internal_zzaao == null ? null : com_google_android_gms_internal_zzaao.f7663i;
            if (optJSONArray != null) {
                list3 = m5103a(optJSONArray, list3);
            }
            if (com_google_android_gms_internal_zzaao != null) {
                if (com_google_android_gms_internal_zzaao.f7665k != -1) {
                    i = com_google_android_gms_internal_zzaao.f7665k;
                }
                if (com_google_android_gms_internal_zzaao.f7660f > 0) {
                    j3 = com_google_android_gms_internal_zzaao.f7660f;
                    optString9 = jSONObject.optString("active_view");
                    str3 = null;
                    optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                    if (optBoolean) {
                        str3 = jSONObject.optString("ad_passback_url", null);
                    }
                    return new zzaao(com_google_android_gms_internal_zzaak, optString2, str2, list, list2, j3, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, str3, optString9, jSONObject.optBoolean("custom_render_allowed", false), z, com_google_android_gms_internal_zzaak.f7626p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzaek.m7091a(jSONObject.optJSONArray("rewards")), m5103a(jSONObject.optJSONArray("video_start_urls"), null), m5103a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzaaq.m7087a(jSONObject.optJSONObject("auto_protection_configuration")), com_google_android_gms_internal_zzaak.f7591G, jSONObject.optString("set_cookie", ""), m5103a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", com_google_android_gms_internal_zzaak.f7595K), optString5, zzaes.m7092a(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), com_google_android_gms_internal_zzaak.f7605U);
                }
            }
            j3 = j2;
            optString9 = jSONObject.optString("active_view");
            str3 = null;
            optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
                str3 = jSONObject.optString("ad_passback_url", null);
            }
            return new zzaao(com_google_android_gms_internal_zzaak, optString2, str2, list, list2, j3, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, str3, optString9, jSONObject.optBoolean("custom_render_allowed", false), z, com_google_android_gms_internal_zzaak.f7626p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzaek.m7091a(jSONObject.optJSONArray("rewards")), m5103a(jSONObject.optJSONArray("video_start_urls"), null), m5103a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzaaq.m7087a(jSONObject.optJSONObject("auto_protection_configuration")), com_google_android_gms_internal_zzaak.f7591G, jSONObject.optString("set_cookie", ""), m5103a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", com_google_android_gms_internal_zzaak.f7595K), optString5, zzaes.m7092a(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), com_google_android_gms_internal_zzaak.f7605U);
        } catch (JSONException e) {
            String str4 = "Could not parse the inline ad response: ";
            optString = String.valueOf(e.getMessage());
            id.m5370a(optString.length() != 0 ? str4.concat(optString) : new String(str4));
            return new zzaao(0);
        }
    }

    private static Integer m5102a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static List<String> m5103a(JSONArray jSONArray, List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new LinkedList();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    private static JSONArray m5104a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public static JSONObject m5105a(Context context, am amVar) {
        Object obj;
        Object obj2;
        String valueOf;
        zzaak com_google_android_gms_internal_zzaak = amVar.f5389i;
        Location location = amVar.f5384d;
        be beVar = amVar.f5390j;
        Bundle bundle = amVar.f5381a;
        JSONObject jSONObject = amVar.f5391k;
        Map hashMap = new HashMap();
        hashMap.put("extra_caps", zzbv.zzen().m4217a(ado.bF));
        if (amVar.f5383c.size() > 0) {
            hashMap.put("eid", TextUtils.join(",", amVar.f5383c));
        }
        if (com_google_android_gms_internal_zzaak.f7612b != null) {
            hashMap.put("ad_pos", com_google_android_gms_internal_zzaak.f7612b);
        }
        zzix com_google_android_gms_internal_zzix = com_google_android_gms_internal_zzaak.f7613c;
        String a = ep.m5368a();
        if (a != null) {
            hashMap.put("abf", a);
        }
        if (com_google_android_gms_internal_zzix.f7741b != -1) {
            hashMap.put("cust_age", f5695a.format(new Date(com_google_android_gms_internal_zzix.f7741b)));
        }
        if (com_google_android_gms_internal_zzix.f7742c != null) {
            hashMap.put("extras", com_google_android_gms_internal_zzix.f7742c);
        }
        if (com_google_android_gms_internal_zzix.f7743d != -1) {
            hashMap.put("cust_gender", Integer.valueOf(com_google_android_gms_internal_zzix.f7743d));
        }
        if (com_google_android_gms_internal_zzix.f7744e != null) {
            hashMap.put("kw", com_google_android_gms_internal_zzix.f7744e);
        }
        if (com_google_android_gms_internal_zzix.f7746g != -1) {
            hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(com_google_android_gms_internal_zzix.f7746g));
        }
        if (com_google_android_gms_internal_zzix.f7745f) {
            hashMap.put("adtest", "on");
        }
        if (com_google_android_gms_internal_zzix.f7740a >= 2) {
            if (com_google_android_gms_internal_zzix.f7747h) {
                hashMap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(com_google_android_gms_internal_zzix.f7748i)) {
                hashMap.put("ppid", com_google_android_gms_internal_zzix.f7748i);
            }
        }
        if (com_google_android_gms_internal_zzix.f7740a >= 3 && com_google_android_gms_internal_zzix.f7751l != null) {
            hashMap.put("url", com_google_android_gms_internal_zzix.f7751l);
        }
        if (com_google_android_gms_internal_zzix.f7740a >= 5) {
            if (com_google_android_gms_internal_zzix.f7753n != null) {
                hashMap.put("custom_targeting", com_google_android_gms_internal_zzix.f7753n);
            }
            if (com_google_android_gms_internal_zzix.f7754o != null) {
                hashMap.put("category_exclusions", com_google_android_gms_internal_zzix.f7754o);
            }
            if (com_google_android_gms_internal_zzix.f7755p != null) {
                hashMap.put("request_agent", com_google_android_gms_internal_zzix.f7755p);
            }
        }
        if (com_google_android_gms_internal_zzix.f7740a >= 6 && com_google_android_gms_internal_zzix.f7756q != null) {
            hashMap.put("request_pkg", com_google_android_gms_internal_zzix.f7756q);
        }
        if (com_google_android_gms_internal_zzix.f7740a >= 7) {
            hashMap.put("is_designed_for_families", Boolean.valueOf(com_google_android_gms_internal_zzix.f7757r));
        }
        if (com_google_android_gms_internal_zzaak.f7614d.f7764g != null) {
            obj = null;
            obj2 = null;
            for (zzjb com_google_android_gms_internal_zzjb : com_google_android_gms_internal_zzaak.f7614d.f7764g) {
                if (!com_google_android_gms_internal_zzjb.f7766i && r3 == null) {
                    hashMap.put("format", com_google_android_gms_internal_zzjb.f7758a);
                    obj2 = 1;
                }
                if (com_google_android_gms_internal_zzjb.f7766i && r2 == null) {
                    hashMap.put("fluid", "height");
                    obj = 1;
                }
                if (obj2 != null && r2 != null) {
                    break;
                }
            }
        } else {
            hashMap.put("format", com_google_android_gms_internal_zzaak.f7614d.f7758a);
            if (com_google_android_gms_internal_zzaak.f7614d.f7766i) {
                hashMap.put("fluid", "height");
            }
        }
        if (com_google_android_gms_internal_zzaak.f7614d.f7762e == -1) {
            hashMap.put("smart_w", "full");
        }
        if (com_google_android_gms_internal_zzaak.f7614d.f7759b == -2) {
            hashMap.put("smart_h", "auto");
        }
        if (com_google_android_gms_internal_zzaak.f7614d.f7764g != null) {
            StringBuilder stringBuilder = new StringBuilder();
            obj = null;
            for (zzjb com_google_android_gms_internal_zzjb2 : com_google_android_gms_internal_zzaak.f7614d.f7764g) {
                if (com_google_android_gms_internal_zzjb2.f7766i) {
                    obj = 1;
                } else {
                    int i;
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("|");
                    }
                    if (com_google_android_gms_internal_zzjb2.f7762e == -1) {
                        i = (int) (((float) com_google_android_gms_internal_zzjb2.f7763f) / beVar.f5777s);
                    } else {
                        try {
                            i = com_google_android_gms_internal_zzjb2.f7762e;
                        } catch (JSONException e) {
                            a = "Problem serializing ad request to JSON: ";
                            valueOf = String.valueOf(e.getMessage());
                            id.m5370a(valueOf.length() != 0 ? a.concat(valueOf) : new String(a));
                            return null;
                        }
                    }
                    stringBuilder.append(i);
                    stringBuilder.append("x");
                    stringBuilder.append(com_google_android_gms_internal_zzjb2.f7759b == -2 ? (int) (((float) com_google_android_gms_internal_zzjb2.f7760c) / beVar.f5777s) : com_google_android_gms_internal_zzjb2.f7759b);
                }
            }
            if (obj != null) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.insert(0, "|");
                }
                stringBuilder.insert(0, "320x50");
            }
            hashMap.put("sz", stringBuilder);
        }
        if (com_google_android_gms_internal_zzaak.f7623m != 0) {
            hashMap.put("native_version", Integer.valueOf(com_google_android_gms_internal_zzaak.f7623m));
            hashMap.put("native_templates", com_google_android_gms_internal_zzaak.f7624n);
            a = "native_image_orientation";
            zzot com_google_android_gms_internal_zzot = com_google_android_gms_internal_zzaak.f7635y;
            switch (com_google_android_gms_internal_zzot != null ? com_google_android_gms_internal_zzot.f7789c : 0) {
                case 0:
                    obj = "any";
                    break;
                case 1:
                    obj = "portrait";
                    break;
                case 2:
                    obj = "landscape";
                    break;
                default:
                    obj = "not_set";
                    break;
            }
            hashMap.put(a, obj);
            if (!com_google_android_gms_internal_zzaak.f7636z.isEmpty()) {
                hashMap.put("native_custom_templates", com_google_android_gms_internal_zzaak.f7636z);
            }
            if (com_google_android_gms_internal_zzaak.f7611a >= 24) {
                hashMap.put("max_num_ads", Integer.valueOf(com_google_android_gms_internal_zzaak.f7609Y));
            }
            if (!TextUtils.isEmpty(com_google_android_gms_internal_zzaak.f7607W)) {
                try {
                    hashMap.put("native_advanced_settings", new JSONArray(com_google_android_gms_internal_zzaak.f7607W));
                } catch (Throwable e2) {
                    id.m5371a("Problem creating json from native advanced settings", e2);
                }
            }
        }
        if (com_google_android_gms_internal_zzaak.f7606V != null && com_google_android_gms_internal_zzaak.f7606V.size() > 0) {
            for (Integer num : com_google_android_gms_internal_zzaak.f7606V) {
                if (num.intValue() == 2) {
                    hashMap.put("iba", Boolean.valueOf(true));
                } else if (num.intValue() == 1) {
                    hashMap.put("ina", Boolean.valueOf(true));
                }
            }
        }
        if (com_google_android_gms_internal_zzaak.f7614d.f7767j) {
            hashMap.put("ene", Boolean.valueOf(true));
        }
        if (com_google_android_gms_internal_zzaak.f7599O != null) {
            hashMap.put("is_icon_ad", Boolean.valueOf(true));
            hashMap.put("icon_ad_expansion_behavior", Integer.valueOf(com_google_android_gms_internal_zzaak.f7599O.f7770a));
        }
        hashMap.put("slotname", com_google_android_gms_internal_zzaak.f7615e);
        hashMap.put("pn", com_google_android_gms_internal_zzaak.f7616f.packageName);
        if (com_google_android_gms_internal_zzaak.f7617g != null) {
            hashMap.put("vc", Integer.valueOf(com_google_android_gms_internal_zzaak.f7617g.versionCode));
        }
        hashMap.put("ms", amVar.f5387g);
        hashMap.put("seq_num", com_google_android_gms_internal_zzaak.f7619i);
        hashMap.put("session_id", com_google_android_gms_internal_zzaak.f7620j);
        hashMap.put("js", com_google_android_gms_internal_zzaak.f7621k.f7706a);
        bq bqVar = amVar.f5385e;
        Bundle bundle2 = com_google_android_gms_internal_zzaak.f7597M;
        Bundle bundle3 = amVar.f5382b;
        hashMap.put("am", Integer.valueOf(beVar.f5759a));
        hashMap.put("cog", m5102a(beVar.f5760b));
        hashMap.put("coh", m5102a(beVar.f5761c));
        if (!TextUtils.isEmpty(beVar.f5762d)) {
            hashMap.put("carrier", beVar.f5762d);
        }
        hashMap.put("gl", beVar.f5763e);
        if (beVar.f5764f) {
            hashMap.put("simulator", Integer.valueOf(1));
        }
        if (beVar.f5765g) {
            hashMap.put("is_sidewinder", Integer.valueOf(1));
        }
        hashMap.put("ma", m5102a(beVar.f5766h));
        hashMap.put("sp", m5102a(beVar.f5767i));
        hashMap.put("hl", beVar.f5768j);
        if (!TextUtils.isEmpty(beVar.f5769k)) {
            hashMap.put("mv", beVar.f5769k);
        }
        hashMap.put("muv", Integer.valueOf(beVar.f5771m));
        if (beVar.f5772n != -2) {
            hashMap.put("cnt", Integer.valueOf(beVar.f5772n));
        }
        hashMap.put("gnt", Integer.valueOf(beVar.f5773o));
        hashMap.put("pt", Integer.valueOf(beVar.f5774p));
        hashMap.put("rm", Integer.valueOf(beVar.f5775q));
        hashMap.put("riv", Integer.valueOf(beVar.f5776r));
        Bundle bundle4 = new Bundle();
        bundle4.putString("build_build", beVar.f5784z);
        bundle4.putString("build_device", beVar.f5757A);
        Bundle bundle5 = new Bundle();
        bundle5.putBoolean("is_charging", beVar.f5781w);
        bundle5.putDouble("battery_level", beVar.f5780v);
        bundle4.putBundle("battery", bundle5);
        bundle5 = new Bundle();
        bundle5.putInt("active_network_state", beVar.f5783y);
        bundle5.putBoolean("active_network_metered", beVar.f5782x);
        if (bqVar != null) {
            Bundle bundle6 = new Bundle();
            bundle6.putInt("predicted_latency_micros", bqVar.f5827a);
            bundle6.putLong("predicted_down_throughput_bps", bqVar.f5828b);
            bundle6.putLong("predicted_up_throughput_bps", bqVar.f5829c);
            bundle5.putBundle("predictions", bundle6);
        }
        bundle4.putBundle("network", bundle5);
        Bundle bundle7 = new Bundle();
        bundle7.putBoolean("is_browser_custom_tabs_capable", beVar.f5758B);
        bundle4.putBundle("browser", bundle7);
        if (bundle2 != null) {
            String str = "android_mem_info";
            bundle6 = new Bundle();
            bundle6.putString("runtime_free", Long.toString(bundle2.getLong("runtime_free_memory", -1)));
            bundle6.putString("runtime_max", Long.toString(bundle2.getLong("runtime_max_memory", -1)));
            bundle6.putString("runtime_total", Long.toString(bundle2.getLong("runtime_total_memory", -1)));
            bundle6.putString("web_view_count", Integer.toString(bundle2.getInt("web_view_count", 0)));
            MemoryInfo memoryInfo = (MemoryInfo) bundle2.getParcelable("debug_memory_info");
            if (memoryInfo != null) {
                bundle6.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                bundle6.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                bundle6.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                bundle6.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                bundle6.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                bundle6.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                bundle6.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                bundle6.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                bundle6.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
            }
            bundle4.putBundle(str, bundle6);
        }
        bundle7 = new Bundle();
        bundle7.putBundle("parental_controls", bundle3);
        if (!TextUtils.isEmpty(beVar.f5770l)) {
            bundle7.putString("package_version", beVar.f5770l);
        }
        bundle4.putBundle("play_store", bundle7);
        hashMap.put("device", bundle4);
        bundle3 = new Bundle();
        bundle3.putString("doritos", amVar.f5386f);
        if (((Boolean) zzbv.zzen().m4217a(ado.ax)).booleanValue()) {
            obj2 = null;
            boolean z = false;
            if (amVar.f5388h != null) {
                obj2 = amVar.f5388h.getId();
                z = amVar.f5388h.isLimitAdTrackingEnabled();
            }
            if (TextUtils.isEmpty(obj2)) {
                aak.m4022a();
                bundle3.putString("pdid", hz.m5625b(context));
                bundle3.putString("pdidtype", "ssaid");
            } else {
                bundle3.putString("rdid", obj2);
                bundle3.putBoolean("is_lat", z);
                bundle3.putString("idtype", "adid");
            }
        }
        hashMap.put("pii", bundle3);
        hashMap.put("platform", Build.MANUFACTURER);
        hashMap.put("submodel", Build.MODEL);
        if (location != null) {
            m5107a((HashMap) hashMap, location);
        } else if (com_google_android_gms_internal_zzaak.f7613c.f7740a >= 2 && com_google_android_gms_internal_zzaak.f7613c.f7750k != null) {
            m5107a((HashMap) hashMap, com_google_android_gms_internal_zzaak.f7613c.f7750k);
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 2) {
            hashMap.put("quality_signals", com_google_android_gms_internal_zzaak.f7622l);
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 4 && com_google_android_gms_internal_zzaak.f7626p) {
            hashMap.put("forceHttps", Boolean.valueOf(com_google_android_gms_internal_zzaak.f7626p));
        }
        if (bundle != null) {
            hashMap.put("content_info", bundle);
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 5) {
            hashMap.put("u_sd", Float.valueOf(com_google_android_gms_internal_zzaak.f7629s));
            hashMap.put("sh", Integer.valueOf(com_google_android_gms_internal_zzaak.f7628r));
            hashMap.put("sw", Integer.valueOf(com_google_android_gms_internal_zzaak.f7627q));
        } else {
            hashMap.put("u_sd", Float.valueOf(beVar.f5777s));
            hashMap.put("sh", Integer.valueOf(beVar.f5779u));
            hashMap.put("sw", Integer.valueOf(beVar.f5778t));
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 6) {
            if (!TextUtils.isEmpty(com_google_android_gms_internal_zzaak.f7630t)) {
                try {
                    hashMap.put("view_hierarchy", new JSONObject(com_google_android_gms_internal_zzaak.f7630t));
                } catch (Throwable e22) {
                    id.m5371a("Problem serializing view hierarchy to JSON", e22);
                }
            }
            hashMap.put("correlation_id", Long.valueOf(com_google_android_gms_internal_zzaak.f7631u));
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 7) {
            hashMap.put("request_id", com_google_android_gms_internal_zzaak.f7632v);
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 12 && !TextUtils.isEmpty(com_google_android_gms_internal_zzaak.f7586B)) {
            hashMap.put("anchor", com_google_android_gms_internal_zzaak.f7586B);
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 13) {
            hashMap.put("android_app_volume", Float.valueOf(com_google_android_gms_internal_zzaak.f7587C));
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 18) {
            hashMap.put("android_app_muted", Boolean.valueOf(com_google_android_gms_internal_zzaak.f7593I));
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 14 && com_google_android_gms_internal_zzaak.f7588D > 0) {
            hashMap.put("target_api", Integer.valueOf(com_google_android_gms_internal_zzaak.f7588D));
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 15) {
            hashMap.put("scroll_index", Integer.valueOf(com_google_android_gms_internal_zzaak.f7589E == -1 ? -1 : com_google_android_gms_internal_zzaak.f7589E));
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 16) {
            hashMap.put("_activity_context", Boolean.valueOf(com_google_android_gms_internal_zzaak.f7590F));
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 18) {
            if (!TextUtils.isEmpty(com_google_android_gms_internal_zzaak.f7594J)) {
                try {
                    hashMap.put("app_settings", new JSONObject(com_google_android_gms_internal_zzaak.f7594J));
                } catch (Throwable e222) {
                    id.m5371a("Problem creating json from app settings", e222);
                }
            }
            hashMap.put("render_in_browser", Boolean.valueOf(com_google_android_gms_internal_zzaak.f7595K));
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 18) {
            hashMap.put("android_num_video_cache_tasks", Integer.valueOf(com_google_android_gms_internal_zzaak.f7596L));
        }
        zzajk com_google_android_gms_internal_zzajk = com_google_android_gms_internal_zzaak.f7621k;
        boolean z2 = com_google_android_gms_internal_zzaak.f7610Z;
        boolean z3 = amVar.f5392l;
        Bundle bundle8 = new Bundle();
        bundle7 = new Bundle();
        bundle7.putString("cl", "166993180");
        bundle7.putString("rapid_rc", "dev");
        bundle7.putString("rapid_rollup", "HEAD");
        bundle8.putBundle("build_meta", bundle7);
        bundle8.putString("mf", Boolean.toString(((Boolean) zzbv.zzen().m4217a(ado.bH)).booleanValue()));
        bundle8.putBoolean("instant_app", z2);
        bundle8.putBoolean("lite", com_google_android_gms_internal_zzajk.f7710e);
        bundle8.putBoolean("local_service", z3);
        hashMap.put("sdk_env", bundle8);
        hashMap.put("cache_state", jSONObject);
        if (com_google_android_gms_internal_zzaak.f7611a >= 19) {
            hashMap.put("gct", com_google_android_gms_internal_zzaak.f7598N);
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 21 && com_google_android_gms_internal_zzaak.f7600P) {
            hashMap.put("de", "1");
        }
        if (((Boolean) zzbv.zzen().m4217a(ado.aE)).booleanValue()) {
            valueOf = com_google_android_gms_internal_zzaak.f7614d.f7758a;
            obj2 = (valueOf.equals("interstitial_mb") || valueOf.equals("reward_mb")) ? 1 : null;
            bundle3 = com_google_android_gms_internal_zzaak.f7601Q;
            obj = bundle3 != null ? 1 : null;
            if (!(obj2 == null || obj == null)) {
                bundle7 = new Bundle();
                bundle7.putBundle("interstitial_pool", bundle3);
                hashMap.put("counters", bundle7);
            }
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 22 && zzbv.zzez().m5296a(context)) {
            hashMap.put("gmp_app_id", com_google_android_gms_internal_zzaak.f7602R);
            if ("TIME_OUT".equals(com_google_android_gms_internal_zzaak.f7603S)) {
                hashMap.put("sai_timeout", zzbv.zzen().m4217a(ado.ao));
            } else if (com_google_android_gms_internal_zzaak.f7603S == null) {
                hashMap.put("fbs_aiid", "");
            } else {
                hashMap.put("fbs_aiid", com_google_android_gms_internal_zzaak.f7603S);
            }
            hashMap.put("fbs_aeid", com_google_android_gms_internal_zzaak.f7604T);
        }
        if (com_google_android_gms_internal_zzaak.f7611a >= 24) {
            hashMap.put("disable_ml", Boolean.valueOf(com_google_android_gms_internal_zzaak.aa));
        }
        valueOf = (String) zzbv.zzen().m4217a(ado.f4914z);
        if (!(valueOf == null || valueOf.isEmpty())) {
            if (VERSION.SDK_INT >= ((Integer) zzbv.zzen().m4217a(ado.f4862A)).intValue()) {
                HashMap hashMap2 = new HashMap();
                for (String str2 : valueOf.split(",")) {
                    hashMap2.put(str2, hx.m5604a(str2));
                }
                hashMap.put("video_decoders", hashMap2);
            }
        }
        if (id.m5372a(2)) {
            a = "Ad Request JSON: ";
            valueOf = String.valueOf(zzbv.zzea().m5504a(hashMap).toString(2));
            if (valueOf.length() != 0) {
                a.concat(valueOf);
            } else {
                valueOf = new String(a);
            }
            es.m5373a();
        }
        return zzbv.zzea().m5504a(hashMap);
    }

    public static JSONObject m5106a(zzaao com_google_android_gms_internal_zzaao) {
        JSONObject jSONObject = new JSONObject();
        if (com_google_android_gms_internal_zzaao.f7655a != null) {
            jSONObject.put("ad_base_url", com_google_android_gms_internal_zzaao.f7655a);
        }
        if (com_google_android_gms_internal_zzaao.f7666l != null) {
            jSONObject.put("ad_size", com_google_android_gms_internal_zzaao.f7666l);
        }
        jSONObject.put("native", com_google_android_gms_internal_zzaao.f7673s);
        if (com_google_android_gms_internal_zzaao.f7673s) {
            jSONObject.put("ad_json", com_google_android_gms_internal_zzaao.f7656b);
        } else {
            jSONObject.put("ad_html", com_google_android_gms_internal_zzaao.f7656b);
        }
        if (com_google_android_gms_internal_zzaao.f7668n != null) {
            jSONObject.put("debug_dialog", com_google_android_gms_internal_zzaao.f7668n);
        }
        if (com_google_android_gms_internal_zzaao.f7648L != null) {
            jSONObject.put("debug_signals", com_google_android_gms_internal_zzaao.f7648L);
        }
        if (com_google_android_gms_internal_zzaao.f7660f != -1) {
            jSONObject.put("interstitial_timeout", ((double) com_google_android_gms_internal_zzaao.f7660f) / 1000.0d);
        }
        if (com_google_android_gms_internal_zzaao.f7665k == zzbv.zzec().mo2097b()) {
            jSONObject.put("orientation", "portrait");
        } else if (com_google_android_gms_internal_zzaao.f7665k == zzbv.zzec().mo2095a()) {
            jSONObject.put("orientation", "landscape");
        }
        if (com_google_android_gms_internal_zzaao.f7657c != null) {
            jSONObject.put("click_urls", m5104a(com_google_android_gms_internal_zzaao.f7657c));
        }
        if (com_google_android_gms_internal_zzaao.f7659e != null) {
            jSONObject.put("impression_urls", m5104a(com_google_android_gms_internal_zzaao.f7659e));
        }
        if (com_google_android_gms_internal_zzaao.f7663i != null) {
            jSONObject.put("manual_impression_urls", m5104a(com_google_android_gms_internal_zzaao.f7663i));
        }
        if (com_google_android_gms_internal_zzaao.f7671q != null) {
            jSONObject.put("active_view", com_google_android_gms_internal_zzaao.f7671q);
        }
        jSONObject.put("ad_is_javascript", com_google_android_gms_internal_zzaao.f7669o);
        if (com_google_android_gms_internal_zzaao.f7670p != null) {
            jSONObject.put("ad_passback_url", com_google_android_gms_internal_zzaao.f7670p);
        }
        jSONObject.put("mediation", com_google_android_gms_internal_zzaao.f7661g);
        jSONObject.put("custom_render_allowed", com_google_android_gms_internal_zzaao.f7672r);
        jSONObject.put("content_url_opted_out", com_google_android_gms_internal_zzaao.f7675u);
        jSONObject.put("content_vertical_opted_out", com_google_android_gms_internal_zzaao.f7649M);
        jSONObject.put("prefetch", com_google_android_gms_internal_zzaao.f7676v);
        if (com_google_android_gms_internal_zzaao.f7664j != -1) {
            jSONObject.put("refresh_interval_milliseconds", com_google_android_gms_internal_zzaao.f7664j);
        }
        if (com_google_android_gms_internal_zzaao.f7662h != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", com_google_android_gms_internal_zzaao.f7662h);
        }
        if (!TextUtils.isEmpty(com_google_android_gms_internal_zzaao.f7678x)) {
            jSONObject.put("gws_query_id", com_google_android_gms_internal_zzaao.f7678x);
        }
        jSONObject.put("fluid", com_google_android_gms_internal_zzaao.f7679y ? "height" : "");
        jSONObject.put("native_express", com_google_android_gms_internal_zzaao.f7680z);
        if (com_google_android_gms_internal_zzaao.f7638B != null) {
            jSONObject.put("video_start_urls", m5104a(com_google_android_gms_internal_zzaao.f7638B));
        }
        if (com_google_android_gms_internal_zzaao.f7639C != null) {
            jSONObject.put("video_complete_urls", m5104a(com_google_android_gms_internal_zzaao.f7639C));
        }
        if (com_google_android_gms_internal_zzaao.f7637A != null) {
            zzaek com_google_android_gms_internal_zzaek = com_google_android_gms_internal_zzaao.f7637A;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("rb_type", com_google_android_gms_internal_zzaek.f7696a);
            jSONObject2.put("rb_amount", com_google_android_gms_internal_zzaek.f7697b);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("rewards", jSONArray);
        }
        jSONObject.put("use_displayed_impression", com_google_android_gms_internal_zzaao.f7640D);
        jSONObject.put("auto_protection_configuration", com_google_android_gms_internal_zzaao.f7641E);
        jSONObject.put("render_in_browser", com_google_android_gms_internal_zzaao.f7645I);
        return jSONObject;
    }

    private static void m5107a(HashMap<String, Object> hashMap, Location location) {
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
}
