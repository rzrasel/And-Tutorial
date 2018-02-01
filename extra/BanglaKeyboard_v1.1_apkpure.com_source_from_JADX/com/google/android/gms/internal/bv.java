package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzbw;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.C1516t;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class bv extends zzd implements cv {
    private static bv f5836k;
    private static final ama f5837l = new ama();
    final Map<String, dc> f5838h = new HashMap();
    boolean f5839i;
    boolean f5840j;
    private dt f5841m;

    public bv(Context context, zzv com_google_android_gms_ads_internal_zzv, zzjb com_google_android_gms_internal_zzjb, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk) {
        dt dtVar = null;
        super(context, com_google_android_gms_internal_zzjb, null, com_google_android_gms_internal_amc, com_google_android_gms_internal_zzajk, com_google_android_gms_ads_internal_zzv);
        f5836k = this;
        if (zzbv.zzez().m5304e(context)) {
            dtVar = new dt(context, null);
        }
        this.f5841m = dtVar;
    }

    private static ef m5156a(ef efVar) {
        es.m5373a();
        try {
            String jSONObject = av.m5106a(efVar.f5979b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, efVar.f5978a.f7615e);
            all com_google_android_gms_internal_all = new all(jSONObject, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
            return new ef(efVar.f5978a, efVar.f5979b, new alm(Arrays.asList(new all[]{com_google_android_gms_internal_all}), ((Long) zzbv.zzen().m4217a(ado.bk)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, ""), efVar.f5981d, efVar.f5982e, efVar.f5983f, efVar.f5984g, efVar.f5985h, efVar.f5986i);
        } catch (JSONException e) {
            id.m5372a(6);
            return new ef(efVar.f5978a, efVar.f5979b, null, efVar.f5981d, 0, efVar.f5983f, efVar.f5984g, efVar.f5985h, efVar.f5986i);
        }
    }

    public static bv m5158b() {
        return f5836k;
    }

    public final dc mo2024a(String str) {
        dc dcVar;
        Throwable th;
        String str2;
        String valueOf;
        dc dcVar2 = (dc) this.f5838h.get(str);
        if (dcVar2 != null) {
            return dcVar2;
        }
        try {
            dcVar = new dc(("com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? f5837l : this.zzana).mo1893a(str), this);
            try {
                this.f5838h.put(str, dcVar);
                return dcVar;
            } catch (Throwable e) {
                th = e;
                str2 = "Fail to instantiate adapter ";
                valueOf = String.valueOf(str);
                id.m5371a(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
                return dcVar;
            }
        } catch (Throwable e2) {
            th = e2;
            dcVar = dcVar2;
            str2 = "Fail to instantiate adapter ";
            valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
            }
            id.m5371a(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
            return dcVar;
        }
    }

    public final void m5160a(zzadp com_google_android_gms_internal_zzadp) {
        C1516t.m3867b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(com_google_android_gms_internal_zzadp.f7695b)) {
            id.m5370a("Invalid ad unit id. Aborting.");
            gb.f6131a.post(new bw(this));
            return;
        }
        this.f5839i = false;
        this.zzams.zzath = com_google_android_gms_internal_zzadp.f7695b;
        if (this.f5841m != null) {
            this.f5841m.f5925a = com_google_android_gms_internal_zzadp.f7695b;
        }
        super.zzb(com_google_android_gms_internal_zzadp.f7694a);
    }

    public final void mo2025a(zzaek com_google_android_gms_internal_zzaek) {
        if (!(this.zzams.zzato == null || this.zzams.zzato.f5965n == null)) {
            zzbv.zzeu();
            alu.m4727a(this.zzams.zzaie, this.zzams.zzatj.f7706a, this.zzams.zzato, this.zzams.zzath, false, this.zzams.zzato.f5965n.f5291l);
        }
        if (!(this.zzams.zzato == null || this.zzams.zzato.f5968q == null || TextUtils.isEmpty(this.zzams.zzato.f5968q.f5307j))) {
            com_google_android_gms_internal_zzaek = new zzaek(this.zzams.zzato.f5968q.f5307j, this.zzams.zzato.f5968q.f5308k);
        }
        zza(com_google_android_gms_internal_zzaek);
    }

    public final boolean m5162d() {
        C1516t.m3867b("isLoaded must be called on the main UI thread.");
        return this.zzams.zzatl == null && this.zzams.zzatm == null && this.zzams.zzato != null && !this.f5839i;
    }

    public final void destroy() {
        C1516t.m3867b("destroy must be called on the main UI thread.");
        for (String str : this.f5838h.keySet()) {
            String str2;
            try {
                dc dcVar = (dc) this.f5838h.get(str2);
                if (!(dcVar == null || dcVar.f5906a == null)) {
                    dcVar.f5906a.mo1908c();
                }
            } catch (RemoteException e) {
                String str3 = "Fail to destroy adapter: ";
                str2 = String.valueOf(str2);
                id.m5370a(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    public final void mo2026e() {
        if (zzbv.zzez().m5304e(this.zzams.zzaie)) {
            this.f5841m.m5286a(true);
        }
        zza(this.zzams.zzato, false);
        zzbq();
    }

    public final void mo2027f() {
        if (!(this.zzams.zzato == null || this.zzams.zzato.f5965n == null)) {
            zzbv.zzeu();
            alu.m4727a(this.zzams.zzaie, this.zzams.zzatj.f7706a, this.zzams.zzato, this.zzams.zzath, false, this.zzams.zzato.f5965n.f5290k);
        }
        zzbu();
    }

    public final void mo2028g() {
        if (zzbv.zzez().m5304e(this.zzams.zzaie)) {
            this.f5841m.m5286a(false);
        }
        zzbo();
    }

    public final void mo2029h() {
        onAdClicked();
    }

    public final void mo2030i() {
        zzbp();
    }

    public final void pause() {
        C1516t.m3867b("pause must be called on the main UI thread.");
        for (String str : this.f5838h.keySet()) {
            String str2;
            try {
                dc dcVar = (dc) this.f5838h.get(str2);
                if (!(dcVar == null || dcVar.f5906a == null)) {
                    dcVar.f5906a.mo1909d();
                }
            } catch (RemoteException e) {
                String str3 = "Fail to pause adapter: ";
                str2 = String.valueOf(str2);
                id.m5370a(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    public final void resume() {
        C1516t.m3867b("resume must be called on the main UI thread.");
        for (String str : this.f5838h.keySet()) {
            String str2;
            try {
                dc dcVar = (dc) this.f5838h.get(str2);
                if (!(dcVar == null || dcVar.f5906a == null)) {
                    dcVar.f5906a.mo1910e();
                }
            } catch (RemoteException e) {
                String str3 = "Fail to resume adapter: ";
                str2 = String.valueOf(str2);
                id.m5370a(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    public final void setImmersiveMode(boolean z) {
        C1516t.m3867b("setImmersiveMode must be called on the main UI thread.");
        this.f5840j = z;
    }

    public final void zza(ef efVar, aec com_google_android_gms_internal_aec) {
        if (efVar.f5982e != -2) {
            gb.f6131a.post(new by(this, efVar));
            return;
        }
        this.zzams.zzatp = efVar;
        if (efVar.f5980c == null) {
            this.zzams.zzatp = m5156a(efVar);
        }
        this.zzams.zzauj = 0;
        zzbw com_google_android_gms_ads_internal_zzbw = this.zzams;
        zzbv.zzdz();
        gp czVar = new cz(this.zzams.zzaie, this.zzams.zzatp, this);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(czVar.getClass().getName());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        id.m5372a(3);
        czVar.mo1474g();
        com_google_android_gms_ads_internal_zzbw.zzatm = czVar;
    }

    public final boolean zza(ee eeVar, ee eeVar2) {
        return true;
    }

    protected final boolean zza(zzix com_google_android_gms_internal_zzix, ee eeVar, boolean z) {
        return false;
    }

    protected final void zzbo() {
        this.zzams.zzato = null;
        super.zzbo();
    }
}
