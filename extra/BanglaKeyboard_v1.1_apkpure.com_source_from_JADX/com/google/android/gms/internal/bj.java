package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.js.zzy;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class bj extends bn {
    SharedPreferences f5818a;
    private final Object f5819b = new Object();

    public final void mo2020a(Context context, zzajk com_google_android_gms_internal_zzajk, zzy com_google_android_gms_ads_internal_js_zzy) {
        synchronized (this.f5819b) {
            if (this.f5818a != null) {
            } else {
                this.f5818a = context.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzbv.zzeg().mo1669a() - this.f5818a.getLong("js_last_update", 0) < ((Long) zzbv.zzen().m4217a(ado.bG)).longValue()) {
            com_google_android_gms_ads_internal_js_zzy.release();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", com_google_android_gms_internal_zzajk.f7706a);
            jSONObject.put("mf", zzbv.zzen().m4217a(ado.bH));
            jSONObject.put("cl", "166993180");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            com_google_android_gms_ads_internal_js_zzy.zza(new bl(new bk(this, context, com_google_android_gms_ads_internal_js_zzy), jSONObject, com_google_android_gms_ads_internal_js_zzy), new bm(com_google_android_gms_ads_internal_js_zzy));
        } catch (JSONException e) {
            id.m5372a(6);
            com_google_android_gms_ads_internal_js_zzy.release();
        }
    }
}
