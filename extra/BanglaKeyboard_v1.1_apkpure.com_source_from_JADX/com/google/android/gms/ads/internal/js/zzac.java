package com.google.android.gms.ads.internal.js;

import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.ha;
import com.google.android.gms.internal.iw;
import com.google.android.gms.internal.iy;

public final class zzac extends iy<zza> {
    private final Object f4082a = new Object();
    private ha<zza> f4083b;
    private boolean f4084c;
    private int f4085d;

    public zzac(ha<zza> haVar) {
        this.f4083b = haVar;
        this.f4084c = false;
        this.f4085d = 0;
    }

    private final void m3647b() {
        synchronized (this.f4082a) {
            C1516t.m3864a(this.f4085d >= 0);
            if (this.f4084c && this.f4085d == 0) {
                es.m5373a();
                zza(new C1419e(this), new iw());
            } else {
                es.m5373a();
            }
        }
    }

    protected final void m3648a() {
        synchronized (this.f4082a) {
            C1516t.m3864a(this.f4085d > 0);
            es.m5373a();
            this.f4085d--;
            m3647b();
        }
    }

    public final zzy zzlc() {
        zzy com_google_android_gms_ads_internal_js_zzy = new zzy(this);
        synchronized (this.f4082a) {
            zza(new C1417c(com_google_android_gms_ads_internal_js_zzy), new C1418d(com_google_android_gms_ads_internal_js_zzy));
            C1516t.m3864a(this.f4085d >= 0);
            this.f4085d++;
        }
        return com_google_android_gms_ads_internal_js_zzy;
    }

    public final void zzle() {
        boolean z = true;
        synchronized (this.f4082a) {
            if (this.f4085d < 0) {
                z = false;
            }
            C1516t.m3864a(z);
            es.m5373a();
            this.f4084c = true;
            m3647b();
        }
    }
}
