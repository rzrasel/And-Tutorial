package com.google.android.gms.ads.internal.js;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.ahr;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.aiu;
import com.google.android.gms.internal.aog;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.hz;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.zk;
import com.google.android.gms.internal.zq;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzjb;
import org.json.JSONObject;

@aqv
public final class zze implements zza {
    private final jf f4089a;
    private final Context f4090b;

    public zze(Context context, zzajk com_google_android_gms_internal_zzajk, nh nhVar, zzv com_google_android_gms_ads_internal_zzv) {
        this.f4090b = context;
        zzbv.zzeb();
        this.f4089a = jp.m5744a(context, new zzjb(), false, false, nhVar, com_google_android_gms_internal_zzajk, null, null, com_google_android_gms_ads_internal_zzv, new zk());
        this.f4089a.mo2136a().setWillNotDraw(true);
    }

    private static void m3650a(Runnable runnable) {
        aak.m4022a();
        if (hz.m5626b()) {
            runnable.run();
        } else {
            gb.f6131a.post(runnable);
        }
    }

    public final void destroy() {
        this.f4089a.destroy();
    }

    public final void zza(zzb com_google_android_gms_ads_internal_js_zzb) {
        this.f4089a.mo2163k().f6289c = new C1428n(com_google_android_gms_ads_internal_js_zzb);
    }

    public final void zza(zq zqVar, zzw com_google_android_gms_ads_internal_overlay_zzw, ahr com_google_android_gms_internal_ahr, zzag com_google_android_gms_ads_internal_overlay_zzag, boolean z, aiu com_google_android_gms_internal_aiu, com.google.android.gms.ads.internal.zzw com_google_android_gms_ads_internal_zzw, aog com_google_android_gms_internal_aog) {
        this.f4089a.mo2163k().m5727a(zqVar, com_google_android_gms_ads_internal_overlay_zzw, com_google_android_gms_internal_ahr, com_google_android_gms_ads_internal_overlay_zzag, false, null, new com.google.android.gms.ads.internal.zzw(this.f4090b, null, null), null, null);
    }

    public final void zza(String str, ail com_google_android_gms_internal_ail) {
        this.f4089a.mo2163k().m5728a(str, com_google_android_gms_internal_ail);
    }

    public final void zza(String str, JSONObject jSONObject) {
        m3650a(new C1423i(this, str, jSONObject));
    }

    public final void zzb(String str, ail com_google_android_gms_internal_ail) {
        this.f4089a.mo2163k().m5733b(str, com_google_android_gms_internal_ail);
    }

    public final void zzb(String str, JSONObject jSONObject) {
        this.f4089a.zzb(str, jSONObject);
    }

    public final void zzbc(String str) {
        m3650a(new C1425k(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void zzbd(String str) {
        m3650a(new C1427m(this, str));
    }

    public final void zzbe(String str) {
        m3650a(new C1426l(this, str));
    }

    public final void zzi(String str, String str2) {
        m3650a(new C1424j(this, str, str2));
    }

    public final zzaj zzla() {
        return new zzak(this);
    }
}
