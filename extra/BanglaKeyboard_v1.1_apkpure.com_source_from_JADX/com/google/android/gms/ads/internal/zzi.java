package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.js.zzai;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.aei;
import com.google.android.gms.internal.amc;
import com.google.android.gms.internal.aog;
import com.google.android.gms.internal.apd;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.wj;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzjb;

@aqv
public class zzi extends zzd implements zzag, aog {
    private boolean f4343h;

    public zzi(Context context, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk, zzv com_google_android_gms_ads_internal_zzv) {
        super(context, com_google_android_gms_internal_zzjb, str, com_google_android_gms_internal_amc, com_google_android_gms_internal_zzajk, com_google_android_gms_ads_internal_zzv);
    }

    protected jf mo1616a(ef efVar, zzw com_google_android_gms_ads_internal_zzw, dq dqVar) {
        zzai com_google_android_gms_ads_internal_js_zzai;
        jf jfVar = null;
        View nextView = this.zzams.f4422c.getNextView();
        if (nextView instanceof jf) {
            jfVar = (jf) nextView;
            if (((Boolean) zzbv.zzen().m4217a(ado.aq)).booleanValue()) {
                id.m5372a(3);
                jfVar.mo2139a(this.zzams.zzaie, this.zzams.zzatn, this.a);
            } else {
                jfVar.destroy();
                jfVar = null;
            }
        }
        if (jfVar == null) {
            if (nextView != null) {
                this.zzams.f4422c.removeView(nextView);
            }
            zzbv.zzeb();
            jf a = jp.m5744a(this.zzams.zzaie, this.zzams.zzatn, false, false, this.zzams.f4421b, this.zzams.zzatj, this.a, this, this.g, efVar.f5986i);
            if (this.zzams.zzatn.f7764g == null) {
                if (a == null) {
                    throw null;
                }
                m3707a((View) a);
            }
            com_google_android_gms_ads_internal_js_zzai = a;
        } else {
            Object obj = jfVar;
        }
        com_google_android_gms_ads_internal_js_zzai.mo2163k().m5727a(this, this, this, this, false, null, com_google_android_gms_ads_internal_zzw, this, dqVar);
        m3730a(com_google_android_gms_ads_internal_js_zzai);
        com_google_android_gms_ads_internal_js_zzai.mo2150b(efVar.f5978a.f7632v);
        return com_google_android_gms_ads_internal_js_zzai;
    }

    protected void mo1609a() {
        super.mo1609a();
        if (this.f4343h) {
            if (((Boolean) zzbv.zzen().m4217a(ado.bT)).booleanValue()) {
                m3731a(this.zzams.zzato.f5953b);
            }
        }
    }

    protected final void m3730a(zzai com_google_android_gms_ads_internal_js_zzai) {
        com_google_android_gms_ads_internal_js_zzai.zza("/trackActiveViewUnit", new ak(this));
    }

    final void m3731a(jf jfVar) {
        if (this.zzams.zzato != null) {
            wj wjVar = this.f;
            zzjb com_google_android_gms_internal_zzjb = this.zzams.zzatn;
            ee eeVar = this.zzams.zzato;
            if (jfVar == null) {
                throw null;
            }
            wjVar.m6918a(com_google_android_gms_internal_zzjb, eeVar, (View) jfVar, (zzai) jfVar);
            this.f4343h = false;
            return;
        }
        this.f4343h = true;
        id.m5370a("Request to enable ActiveView before adState is available.");
    }

    public final void zza(int i, int i2, int i3, int i4) {
        zzbq();
    }

    public final void zza(aei com_google_android_gms_internal_aei) {
        C1516t.m3867b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzams.f4436q = com_google_android_gms_internal_aei;
    }

    protected void zza(ef efVar, aec com_google_android_gms_internal_aec) {
        if (efVar.f5982e != -2) {
            gb.f6131a.post(new al(this, efVar));
            return;
        }
        if (efVar.f5981d != null) {
            this.zzams.zzatn = efVar.f5981d;
        }
        if (!efVar.f5979b.f7661g || efVar.f5979b.f7680z) {
            gb.f6131a.post(new am(this, efVar, this.g.zzanr.mo2083a(this.zzams.zzaie, this.zzams.zzatj, efVar.f5979b), com_google_android_gms_internal_aec));
            return;
        }
        this.zzams.zzauj = 0;
        zzbw com_google_android_gms_ads_internal_zzbw = this.zzams;
        zzbv.zzdz();
        com_google_android_gms_ads_internal_zzbw.zzatm = apd.m5022a(this.zzams.zzaie, this, efVar, this.zzams.f4421b, null, this.zzana, this, com_google_android_gms_internal_aec);
    }

    protected boolean zza(ee eeVar, ee eeVar2) {
        if (this.zzams.zzfd() && this.zzams.f4422c != null) {
            this.zzams.f4422c.zzfg().f6149b = eeVar2.f5977z;
        }
        return super.zza(eeVar, eeVar2);
    }

    public final void zzc(View view) {
        this.zzams.f4439t = view;
        zzb(new ee(this.zzams.zzatp));
    }

    public final void zzck() {
        onAdClicked();
    }

    public final void zzcl() {
        recordImpression();
        zzbn();
    }

    public final void zzcm() {
        zzbo();
    }
}
