package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.es;
import com.google.android.gms.internal.ix;

final class C1437w implements ix<zza> {
    private /* synthetic */ zzac f4072a;
    private /* synthetic */ zzl f4073b;

    C1437w(zzl com_google_android_gms_ads_internal_js_zzl, zzac com_google_android_gms_ads_internal_js_zzac) {
        this.f4073b = com_google_android_gms_ads_internal_js_zzl;
        this.f4072a = com_google_android_gms_ads_internal_js_zzac;
    }

    public final /* synthetic */ void mo1472a(Object obj) {
        synchronized (this.f4073b.f4091a) {
            this.f4073b.f4098h = 0;
            if (!(this.f4073b.f4097g == null || this.f4072a == this.f4073b.f4097g)) {
                es.m5373a();
                this.f4073b.f4097g.zzle();
            }
            this.f4073b.f4097g = this.f4072a;
        }
    }
}
