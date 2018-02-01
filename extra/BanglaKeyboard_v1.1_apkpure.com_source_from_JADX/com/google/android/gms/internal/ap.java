package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzl;

final class ap implements Runnable {
    final /* synthetic */ ax f5535a;
    final /* synthetic */ aec f5536b;
    final /* synthetic */ String f5537c;
    private /* synthetic */ zzl f5538d;
    private /* synthetic */ aea f5539e;

    ap(zzl com_google_android_gms_ads_internal_js_zzl, ax axVar, aec com_google_android_gms_internal_aec, aea com_google_android_gms_internal_aea, String str) {
        this.f5538d = com_google_android_gms_ads_internal_js_zzl;
        this.f5535a = axVar;
        this.f5536b = com_google_android_gms_internal_aec;
        this.f5539e = com_google_android_gms_internal_aea;
        this.f5537c = str;
    }

    public final void run() {
        iy zzb = this.f5538d.zzb(null);
        this.f5535a.f5703e = zzb;
        this.f5536b.m4237a(this.f5539e, "rwc");
        zzb.zza(new aq(this, this.f5536b.m4233a()), new ar(this));
    }
}
