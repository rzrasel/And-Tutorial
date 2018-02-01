package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.js.zzl;
import com.google.android.gms.ads.internal.js.zzy;
import org.json.JSONObject;

@aqv
public final class ww implements xg {
    final wk f7376a;
    final Context f7377b;
    boolean f7378c;
    final ail f7379d = new xc(this);
    final ail f7380e = new xd(this);
    final ail f7381f = new xe(this);
    final ail f7382g = new xf(this);
    private zzy f7383h;

    public ww(wk wkVar, zzl com_google_android_gms_ads_internal_js_zzl, Context context) {
        this.f7376a = wkVar;
        this.f7377b = context;
        this.f7383h = com_google_android_gms_ads_internal_js_zzl.zzb(null);
        this.f7383h.zza(new wx(this), new wz(this));
        String str = "Core JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f7376a.f7337b.f7326c);
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        id.m5372a(3);
    }

    public final void mo2321a(JSONObject jSONObject, boolean z) {
        this.f7383h.zza(new xa(jSONObject), new iw());
    }

    public final boolean mo2322a() {
        return this.f7378c;
    }

    public final void mo2323b() {
        this.f7383h.zza(new xb(this), new iw());
        this.f7383h.release();
    }
}
