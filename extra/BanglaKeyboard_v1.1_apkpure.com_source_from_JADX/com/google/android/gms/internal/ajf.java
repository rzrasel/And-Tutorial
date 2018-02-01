package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzaq;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C1516t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@aqv
public final class ajf implements ail {
    private boolean f5183a;

    private static int m4587a(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                aak.m4022a();
                i = hz.m5612a(context, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                id.m5370a(new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("Could not parse ").append(str).append(" in a video GMSG: ").append(str2).toString());
            }
        }
        return i;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        String str = (String) map.get("action");
        if (str == null) {
            id.m5370a("Action missing from video GMSG.");
            return;
        }
        if (id.m5372a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(jSONObject2).length()).append("Video GMSG: ").append(str).append(" ").append(jSONObject2);
            id.m5372a(3);
        }
        if ("background".equals(str)) {
            str = (String) map.get("color");
            if (TextUtils.isEmpty(str)) {
                id.m5370a("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                jfVar.setBackgroundColor(Color.parseColor(str));
            } catch (IllegalArgumentException e) {
                id.m5370a("Invalid color parameter in video GMSG.");
            }
        } else if ("decoderProps".equals(str)) {
            str = (String) map.get("mimeTypes");
            if (str == null) {
                id.m5370a("No MIME types specified for decoder properties inspection.");
                zzaa.zza(jfVar, "missingMimeTypes");
            } else if (VERSION.SDK_INT < 16) {
                id.m5370a("Video decoder properties available on API versions >= 16.");
                zzaa.zza(jfVar, "deficientApiVersion");
            } else {
                Map hashMap = new HashMap();
                for (String str2 : str.split(",")) {
                    hashMap.put(str2, hx.m5604a(str2.trim()));
                }
                zzaa.zzc(jfVar, hashMap);
            }
        } else {
            je v = jfVar.mo2184v();
            if (v == null) {
                id.m5370a("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            Context context;
            int a;
            if (equals || equals2) {
                int min;
                int i;
                context = jfVar.getContext();
                int a2 = m4587a(context, map, "x", 0);
                int a3 = m4587a(context, map, "y", 0);
                a = m4587a(context, map, "w", -1);
                int a4 = m4587a(context, map, "h", -1);
                if (((Boolean) zzbv.zzen().m4217a(ado.bS)).booleanValue()) {
                    a = Math.min(a, jfVar.getMeasuredWidth() - a2);
                    min = Math.min(a4, jfVar.getMeasuredHeight() - a3);
                    i = a;
                } else {
                    min = a4;
                    i = a;
                }
                try {
                    r3 = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException e2) {
                    r3 = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (equals && v.m5666a() == null) {
                    zzaq com_google_android_gms_ads_internal_overlay_zzaq = new zzaq((String) map.get("flags"));
                    if (v.f6280d == null) {
                        adv.m4226a(v.f6277a.mo2186x().f4946b, v.f6277a.mo2185w(), "vpr2");
                        v.f6280d = new zzaa(v.f6278b, v.f6277a, r3, parseBoolean, v.f6277a.mo2186x().f4946b, com_google_android_gms_ads_internal_overlay_zzaq);
                        v.f6279c.addView(v.f6280d, 0, new LayoutParams(-1, -1));
                        v.f6280d.zzd(a2, a3, i, min);
                        v.f6277a.mo2163k().f6292f = false;
                        return;
                    }
                    return;
                }
                C1516t.m3867b("The underlay may only be modified from the UI thread.");
                if (v.f6280d != null) {
                    v.f6280d.zzd(a2, a3, i, min);
                    return;
                }
                return;
            }
            zzaa a5 = v.m5666a();
            if (a5 == null) {
                zzaa.zzh(jfVar);
            } else if ("click".equals(str)) {
                context = jfVar.getContext();
                a = m4587a(context, map, "x", 0);
                r3 = m4587a(context, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a, (float) r3, 0);
                a5.zze(obtain);
                obtain.recycle();
            } else if ("currentTime".equals(str)) {
                str = (String) map.get("time");
                if (str == null) {
                    id.m5370a("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    a5.seekTo((int) (Float.parseFloat(str) * 1000.0f));
                } catch (NumberFormatException e3) {
                    jSONObject2 = "Could not parse time parameter from currentTime video GMSG: ";
                    str = String.valueOf(str);
                    id.m5370a(str.length() != 0 ? jSONObject2.concat(str) : new String(jSONObject2));
                }
            } else if ("hide".equals(str)) {
                a5.setVisibility(4);
            } else if ("load".equals(str)) {
                a5.zznb();
            } else if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    a5.zznc();
                } else {
                    a5.zznd();
                }
            } else if ("pause".equals(str)) {
                a5.pause();
            } else if ("play".equals(str)) {
                a5.play();
            } else if ("show".equals(str)) {
                a5.setVisibility(0);
            } else if ("src".equals(str)) {
                a5.zzbq((String) map.get("src"));
            } else if ("touchMove".equals(str)) {
                context = jfVar.getContext();
                a5.zza((float) m4587a(context, map, "dx", 0), (float) m4587a(context, map, "dy", 0));
                if (!this.f5183a) {
                    jfVar.mo2160h().zzmt();
                    this.f5183a = true;
                }
            } else if ("volume".equals(str)) {
                str = (String) map.get("volume");
                if (str == null) {
                    id.m5370a("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    a5.zzb(Float.parseFloat(str));
                } catch (NumberFormatException e4) {
                    jSONObject2 = "Could not parse volume parameter from volume video GMSG: ";
                    str = String.valueOf(str);
                    id.m5370a(str.length() != 0 ? jSONObject2.concat(str) : new String(jSONObject2));
                }
            } else if ("watermark".equals(str)) {
                a5.zzne();
            } else {
                jSONObject2 = "Unknown video action: ";
                str = String.valueOf(str);
                id.m5370a(str.length() != 0 ? jSONObject2.concat(str) : new String(jSONObject2));
            }
        }
    }
}
