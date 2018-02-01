package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.es;
import com.google.android.gms.internal.iv;

final class C1438x implements iv {
    private /* synthetic */ zzac f4074a;
    private /* synthetic */ zzl f4075b;

    C1438x(zzl com_google_android_gms_ads_internal_js_zzl, zzac com_google_android_gms_ads_internal_js_zzac) {
        this.f4075b = com_google_android_gms_ads_internal_js_zzl;
        this.f4074a = com_google_android_gms_ads_internal_js_zzac;
    }

    public final void mo1479a() {
        synchronized (this.f4075b.f4091a) {
            this.f4075b.f4098h = 1;
            es.m5373a();
            this.f4074a.zzle();
        }
    }
}
