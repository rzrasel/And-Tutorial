package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import java.util.Map;

final class C1434t implements ail {
    private /* synthetic */ zza f4066a;
    private /* synthetic */ hs f4067b;
    private /* synthetic */ C1429o f4068c;

    C1434t(C1429o c1429o, zza com_google_android_gms_ads_internal_js_zza, hs hsVar) {
        this.f4068c = c1429o;
        this.f4066a = com_google_android_gms_ads_internal_js_zza;
        this.f4067b = hsVar;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        synchronized (this.f4068c.f4059c.f4091a) {
            id.m5372a(4);
            if (this.f4068c.f4059c.f4098h == 0) {
                id.m5372a(4);
                this.f4068c.f4059c.f4098h = 2;
                this.f4068c.f4059c.m3660a(this.f4068c.f4057a);
            }
            this.f4066a.zzb("/requestReload", (ail) this.f4067b.f6224a);
        }
    }
}
