package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.js.zzy;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import org.json.JSONException;

final class bk implements ail {
    private /* synthetic */ Context f5820a;
    private /* synthetic */ zzy f5821b;
    private /* synthetic */ bj f5822c;

    bk(bj bjVar, Context context, zzy com_google_android_gms_ads_internal_js_zzy) {
        this.f5822c = bjVar;
        this.f5820a = context;
        this.f5821b = com_google_android_gms_ads_internal_js_zzy;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        try {
            ado.m4220a(this.f5820a, zzbv.zzea().m5504a((Map) map));
            this.f5822c.f5818a.edit().putLong("js_last_update", zzbv.zzeg().mo1669a()).apply();
        } catch (JSONException e) {
            id.m5372a(6);
        } finally {
            jfVar.mo2163k().m5733b("/loadSdkConstants", this);
            this.f5821b.release();
        }
    }
}
