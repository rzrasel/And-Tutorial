package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.nh;

final class C1429o implements Runnable {
    final /* synthetic */ nh f4057a;
    final /* synthetic */ zzac f4058b;
    final /* synthetic */ zzl f4059c;

    C1429o(zzl com_google_android_gms_ads_internal_js_zzl, nh nhVar, zzac com_google_android_gms_ads_internal_js_zzac) {
        this.f4059c = com_google_android_gms_ads_internal_js_zzl;
        this.f4057a = nhVar;
        this.f4058b = com_google_android_gms_ads_internal_js_zzac;
    }

    public final void run() {
        try {
            zza com_google_android_gms_ads_internal_js_zze = new zze(this.f4059c.f4092b, this.f4059c.f4094d, this.f4057a, null);
            com_google_android_gms_ads_internal_js_zze.zza(new C1430p(this, com_google_android_gms_ads_internal_js_zze));
            com_google_android_gms_ads_internal_js_zze.zza("/jsLoaded", new C1433s(this, com_google_android_gms_ads_internal_js_zze));
            hs hsVar = new hs();
            ail c1434t = new C1434t(this, com_google_android_gms_ads_internal_js_zze, hsVar);
            hsVar.f6224a = c1434t;
            com_google_android_gms_ads_internal_js_zze.zza("/requestReload", c1434t);
            if (this.f4059c.f4093c.endsWith(".js")) {
                com_google_android_gms_ads_internal_js_zze.zzbc(this.f4059c.f4093c);
            } else if (this.f4059c.f4093c.startsWith("<html>")) {
                com_google_android_gms_ads_internal_js_zze.zzbe(this.f4059c.f4093c);
            } else {
                com_google_android_gms_ads_internal_js_zze.zzbd(this.f4059c.f4093c);
            }
            gb.f6131a.postDelayed(new C1435u(this, com_google_android_gms_ads_internal_js_zze), (long) C1439y.f4076a);
        } catch (Throwable th) {
            id.m5372a(6);
            zzbv.zzee().m5336a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            this.f4058b.reject();
        }
    }
}
