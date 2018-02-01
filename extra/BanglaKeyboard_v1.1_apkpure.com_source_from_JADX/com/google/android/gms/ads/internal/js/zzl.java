package com.google.android.gms.ads.internal.js;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.ha;
import com.google.android.gms.internal.iy;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.zzajk;

@aqv
public final class zzl {
    private final Object f4091a;
    private final Context f4092b;
    private final String f4093c;
    private final zzajk f4094d;
    private ha<zza> f4095e;
    private ha<zza> f4096f;
    private zzac f4097g;
    private int f4098h;

    public zzl(Context context, zzajk com_google_android_gms_internal_zzajk, String str) {
        this.f4091a = new Object();
        this.f4098h = 1;
        this.f4093c = str;
        this.f4092b = context.getApplicationContext();
        this.f4094d = com_google_android_gms_internal_zzajk;
        this.f4095e = new zzx();
        this.f4096f = new zzx();
    }

    public zzl(Context context, zzajk com_google_android_gms_internal_zzajk, String str, ha<zza> haVar, ha<zza> haVar2) {
        this(context, com_google_android_gms_internal_zzajk, str);
        this.f4095e = haVar;
        this.f4096f = haVar2;
    }

    protected final zzac m3660a(nh nhVar) {
        iy com_google_android_gms_ads_internal_js_zzac = new zzac(this.f4096f);
        zzbv.zzea();
        gb.m5451a(new C1429o(this, nhVar, com_google_android_gms_ads_internal_js_zzac));
        com_google_android_gms_ads_internal_js_zzac.zza(new C1437w(this, com_google_android_gms_ads_internal_js_zzac), new C1438x(this, com_google_android_gms_ads_internal_js_zzac));
        return com_google_android_gms_ads_internal_js_zzac;
    }

    public final zzy zzb(nh nhVar) {
        zzy zzlc;
        synchronized (this.f4091a) {
            if (this.f4097g == null || this.f4097g.getStatus() == -1) {
                this.f4098h = 2;
                this.f4097g = m3660a(nhVar);
                zzlc = this.f4097g.zzlc();
            } else if (this.f4098h == 0) {
                zzlc = this.f4097g.zzlc();
            } else if (this.f4098h == 1) {
                this.f4098h = 2;
                m3660a(nhVar);
                zzlc = this.f4097g.zzlc();
            } else if (this.f4098h == 2) {
                zzlc = this.f4097g.zzlc();
            } else {
                zzlc = this.f4097g.zzlc();
            }
        }
        return zzlc;
    }
}
