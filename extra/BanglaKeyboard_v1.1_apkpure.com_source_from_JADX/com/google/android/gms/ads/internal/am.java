package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.aed;
import com.google.android.gms.internal.aef;
import com.google.android.gms.internal.apd;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jr;

final class am implements Runnable {
    final /* synthetic */ ef f3979a;
    final /* synthetic */ dq f3980b;
    final /* synthetic */ zzi f3981c;
    private /* synthetic */ aec f3982d;

    am(zzi com_google_android_gms_ads_internal_zzi, ef efVar, dq dqVar, aec com_google_android_gms_internal_aec) {
        this.f3981c = com_google_android_gms_ads_internal_zzi;
        this.f3979a = efVar;
        this.f3980b = dqVar;
        this.f3982d = com_google_android_gms_internal_aec;
    }

    public final void run() {
        if (this.f3979a.f5979b.f7672r && this.f3981c.zzams.f4436q != null) {
            String str = null;
            if (this.f3979a.f5979b.f7655a != null) {
                zzbv.zzea();
                str = gb.m5441a(this.f3979a.f5979b.f7655a);
            }
            aef com_google_android_gms_internal_aed = new aed(this.f3981c, str, this.f3979a.f5979b.f7656b);
            this.f3981c.zzams.zzauj = 1;
            try {
                this.f3981c.c = false;
                this.f3981c.zzams.f4436q.mo1747a(com_google_android_gms_internal_aed);
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call the onCustomRenderedAdLoadedListener.", e);
                this.f3981c.c = true;
            }
        }
        zzw com_google_android_gms_ads_internal_zzw = new zzw(this.f3981c.zzams.zzaie, this.f3980b, this.f3979a.f5979b.f7641E);
        try {
            jf a = this.f3981c.mo1616a(this.f3979a, com_google_android_gms_ads_internal_zzw, this.f3980b);
            a.setOnTouchListener(new ao(this, com_google_android_gms_ads_internal_zzw));
            a.setOnClickListener(new ap(this, com_google_android_gms_ads_internal_zzw));
            this.f3981c.zzams.zzauj = 0;
            zzbw com_google_android_gms_ads_internal_zzbw = this.f3981c.zzams;
            zzbv.zzdz();
            com_google_android_gms_ads_internal_zzbw.zzatm = apd.m5022a(this.f3981c.zzams.zzaie, this.f3981c, this.f3979a, this.f3981c.zzams.f4421b, a, this.f3981c.zzana, this.f3981c, this.f3982d);
        } catch (jr e2) {
            id.m5372a(6);
            gb.f6131a.post(new an(this));
        }
    }
}
