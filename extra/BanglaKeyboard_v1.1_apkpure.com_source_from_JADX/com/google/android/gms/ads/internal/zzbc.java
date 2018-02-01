package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.p018f.C0477m;
import android.view.View;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.aei;
import com.google.android.gms.internal.aer;
import com.google.android.gms.internal.aet;
import com.google.android.gms.internal.aew;
import com.google.android.gms.internal.aey;
import com.google.android.gms.internal.aez;
import com.google.android.gms.internal.afa;
import com.google.android.gms.internal.afb;
import com.google.android.gms.internal.afc;
import com.google.android.gms.internal.agp;
import com.google.android.gms.internal.aha;
import com.google.android.gms.internal.ahd;
import com.google.android.gms.internal.amc;
import com.google.android.gms.internal.amo;
import com.google.android.gms.internal.amr;
import com.google.android.gms.internal.aop;
import com.google.android.gms.internal.apd;
import com.google.android.gms.internal.apn;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.fv;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.il;
import com.google.android.gms.internal.ir;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.wj;
import com.google.android.gms.internal.wm;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.p056a.C1401c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONObject;

@aqv
public final class zzbc extends zzd implements afb {
    ir<afc> f4361h;
    private final Object f4362i;
    private boolean f4363j;
    private jf f4364k;
    private boolean f4365l;
    private int f4366m;
    private apn f4367n;

    public zzbc(Context context, zzv com_google_android_gms_ads_internal_zzv, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk) {
        this(context, com_google_android_gms_ads_internal_zzv, com_google_android_gms_internal_zzjb, str, com_google_android_gms_internal_amc, com_google_android_gms_internal_zzajk, false);
    }

    public zzbc(Context context, zzv com_google_android_gms_ads_internal_zzv, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk, boolean z) {
        super(context, com_google_android_gms_internal_zzjb, str, com_google_android_gms_internal_amc, com_google_android_gms_internal_zzajk, com_google_android_gms_ads_internal_zzv);
        this.f4362i = new Object();
        this.f4361h = new ir();
        this.f4366m = 1;
        this.f4363j = z;
    }

    static /* synthetic */ void m3749a(zzbw com_google_android_gms_ads_internal_zzbw, zzbw com_google_android_gms_ads_internal_zzbw2) {
        if (com_google_android_gms_ads_internal_zzbw2.f4427h == null) {
            com_google_android_gms_ads_internal_zzbw2.f4427h = com_google_android_gms_ads_internal_zzbw.f4427h;
        }
        if (com_google_android_gms_ads_internal_zzbw2.f4428i == null) {
            com_google_android_gms_ads_internal_zzbw2.f4428i = com_google_android_gms_ads_internal_zzbw.f4428i;
        }
        if (com_google_android_gms_ads_internal_zzbw2.f4429j == null) {
            com_google_android_gms_ads_internal_zzbw2.f4429j = com_google_android_gms_ads_internal_zzbw.f4429j;
        }
        if (com_google_android_gms_ads_internal_zzbw2.f4430k == null) {
            com_google_android_gms_ads_internal_zzbw2.f4430k = com_google_android_gms_ads_internal_zzbw.f4430k;
        }
        if (com_google_android_gms_ads_internal_zzbw2.f4432m == null) {
            com_google_android_gms_ads_internal_zzbw2.f4432m = com_google_android_gms_ads_internal_zzbw.f4432m;
        }
        if (com_google_android_gms_ads_internal_zzbw2.f4431l == null) {
            com_google_android_gms_ads_internal_zzbw2.f4431l = com_google_android_gms_ads_internal_zzbw.f4431l;
        }
        if (com_google_android_gms_ads_internal_zzbw2.f4438s == null) {
            com_google_android_gms_ads_internal_zzbw2.f4438s = com_google_android_gms_ads_internal_zzbw.f4438s;
        }
        if (com_google_android_gms_ads_internal_zzbw2.zzatq == null) {
            com_google_android_gms_ads_internal_zzbw2.zzatq = com_google_android_gms_ads_internal_zzbw.zzatq;
        }
        if (com_google_android_gms_ads_internal_zzbw2.zzauh == null) {
            com_google_android_gms_ads_internal_zzbw2.zzauh = com_google_android_gms_ads_internal_zzbw.zzauh;
        }
        if (com_google_android_gms_ads_internal_zzbw2.f4423d == null) {
            com_google_android_gms_ads_internal_zzbw2.f4423d = com_google_android_gms_ads_internal_zzbw.f4423d;
        }
        if (com_google_android_gms_ads_internal_zzbw2.f4424e == null) {
            com_google_android_gms_ads_internal_zzbw2.f4424e = com_google_android_gms_ads_internal_zzbw.f4424e;
        }
        if (com_google_android_gms_ads_internal_zzbw2.zzatn == null) {
            com_google_android_gms_ads_internal_zzbw2.zzatn = com_google_android_gms_ads_internal_zzbw.zzatn;
        }
        if (com_google_android_gms_ads_internal_zzbw2.zzato == null) {
            com_google_android_gms_ads_internal_zzbw2.zzato = com_google_android_gms_ads_internal_zzbw.zzato;
        }
        if (com_google_android_gms_ads_internal_zzbw2.zzatp == null) {
            com_google_android_gms_ads_internal_zzbw2.zzatp = com_google_android_gms_ads_internal_zzbw.zzatp;
        }
    }

    private final void m3750a(aer com_google_android_gms_internal_aer) {
        gb.f6131a.post(new C1474u(this, com_google_android_gms_internal_aer));
    }

    private final void m3751a(aet com_google_android_gms_internal_aet) {
        gb.f6131a.post(new C1475v(this, com_google_android_gms_internal_aet));
    }

    private final void m3752d() {
        gb.m5474b(new C1478y(this));
    }

    protected final void mo1609a() {
        mo1630a(false);
    }

    protected final void mo1629a(int i, boolean z) {
        if (((Boolean) zzbv.zzen().m4217a(ado.bM)).booleanValue()) {
            m3752d();
        }
        super.mo1629a(i, z);
    }

    protected final void mo1630a(boolean z) {
        super.mo1630a(z);
        if (this.f4365l) {
            if (((Boolean) zzbv.zzen().m4217a(ado.bT)).booleanValue()) {
                zzdk();
            }
        }
    }

    final void m3756b() {
        if (((Boolean) zzbv.zzen().m4217a(ado.bM)).booleanValue()) {
            synchronized (this.f4362i) {
                this.f4367n = new apn(this.zzams.zzaie, this, this.zzams.f4421b, this.zzams.zzatj);
                this.f4367n.m5039a();
                this.f4367n.m5041b();
            }
        }
    }

    public final String getAdUnitId() {
        return this.zzams.zzath;
    }

    public final void pause() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public final void resume() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final void zza(aei com_google_android_gms_internal_aei) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void zza(aey com_google_android_gms_internal_aey) {
        if (this.f4364k != null) {
            this.f4364k.mo2141a(com_google_android_gms_internal_aey);
        }
    }

    public final void zza(afa com_google_android_gms_internal_afa) {
        if (this.zzams.zzato.f5961j != null) {
            zzbv.zzee().f6018c.m6919a(this.zzams.zzatn, this.zzams.zzato, new wm(com_google_android_gms_internal_afa), null);
        }
    }

    public final void zza(aop com_google_android_gms_internal_aop) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public final void zza(ef efVar, aec com_google_android_gms_internal_aec) {
        Throwable e;
        if (efVar.f5981d != null) {
            this.zzams.zzatn = efVar.f5981d;
        }
        if (efVar.f5982e != -2) {
            gb.f6131a.post(new C1471r(this, efVar));
            return;
        }
        int i = efVar.f5978a.f7609Y;
        if (i == 1) {
            this.zzams.zzauj = 0;
            zzbw com_google_android_gms_ads_internal_zzbw = this.zzams;
            zzbv.zzdz();
            com_google_android_gms_ads_internal_zzbw.zzatm = apd.m5022a(this.zzams.zzaie, this, efVar, this.zzams.f4421b, null, this.zzana, this, com_google_android_gms_internal_aec);
            String str = "AdRenderer: ";
            String valueOf = String.valueOf(this.zzams.zzatm.getClass().getName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            id.m5372a(3);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            int i2;
            JSONArray jSONArray2 = new JSONObject(efVar.f5979b.f7656b).getJSONArray("slots");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i3).getJSONArray("ads");
                for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                    jSONArray.put(jSONArray3.get(i4));
                }
            }
            m3752d();
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i);
            List arrayList = new ArrayList();
            for (i2 = 0; i2 < i; i2++) {
                arrayList.add(fv.m5426a(newFixedThreadPool, new C1472s(this, i2, jSONArray, i, efVar)));
            }
            for (i2 = 0; i2 < arrayList.size(); i2++) {
                try {
                    gb.f6131a.post(new C1473t(this, (afc) ((il) arrayList.get(i2)).get(((Long) zzbv.zzen().m4217a(ado.bk)).longValue(), TimeUnit.MILLISECONDS), i2, arrayList));
                } catch (Throwable e2) {
                    id.m5371a("Exception occurred while getting an ad response", e2);
                    Thread.currentThread().interrupt();
                } catch (CancellationException e3) {
                    e2 = e3;
                    id.m5371a("Exception occurred while getting an ad response", e2);
                } catch (ExecutionException e4) {
                    e2 = e4;
                    id.m5371a("Exception occurred while getting an ad response", e2);
                } catch (TimeoutException e5) {
                    e2 = e5;
                    id.m5371a("Exception occurred while getting an ad response", e2);
                }
            }
        } catch (Throwable e22) {
            id.m5371a("Malformed native ad response", e22);
            zzg(0);
        }
    }

    protected final boolean zza(ee eeVar, ee eeVar2) {
        zzc(null);
        if (this.zzams.zzfd()) {
            if (eeVar2.f5964m) {
                if (((Boolean) zzbv.zzen().m4217a(ado.bM)).booleanValue()) {
                    m3752d();
                }
                try {
                    amo h = eeVar2.f5966o != null ? eeVar2.f5966o.mo1913h() : null;
                    amr i = eeVar2.f5966o != null ? eeVar2.f5966o.mo1914i() : null;
                    agp n = eeVar2.f5966o != null ? eeVar2.f5966o.mo1919n() : null;
                    if (h == null || this.zzams.f4427h == null) {
                        if (i != null) {
                            if (this.zzams.f4428i != null) {
                                aet com_google_android_gms_internal_aet = new aet(i.mo1940a(), i.mo1942b(), i.mo1944c(), i.mo1946d() != null ? i.mo1946d() : null, i.mo1947e(), i.mo1948f(), null, i.mo1952j(), i.mo1954l(), i.mo1956n() != null ? (View) C1401c.m3585a(i.mo1956n()) : null);
                                com_google_android_gms_internal_aet.mo1755a(new aez(this.zzams.zzaie, (afb) this, this.zzams.f4421b, i, (afc) com_google_android_gms_internal_aet));
                                m3751a(com_google_android_gms_internal_aet);
                            }
                        }
                        if (n != null) {
                            if (!(this.zzams.f4430k == null || this.zzams.f4430k.get(n.mo1768l()) == null)) {
                                gb.f6131a.post(new C1477x(this, n));
                            }
                        }
                        id.m5370a("No matching mapper/listener for retrieved native ad template.");
                        zzg(0);
                        return false;
                    }
                    aer com_google_android_gms_internal_aer = new aer(h.mo1921a(), h.mo1923b(), h.mo1925c(), h.mo1927d() != null ? h.mo1927d() : null, h.mo1928e(), h.mo1929f(), h.mo1930g(), h.mo1931h(), null, h.mo1935l(), h.mo1936m(), h.mo1939p() != null ? (View) C1401c.m3585a(h.mo1939p()) : null);
                    com_google_android_gms_internal_aer.mo1755a(new aez(this.zzams.zzaie, (afb) this, this.zzams.f4421b, h, (afc) com_google_android_gms_internal_aer));
                    m3750a(com_google_android_gms_internal_aer);
                } catch (Throwable e) {
                    id.m5371a("Failed to get native ad mapper", e);
                }
            } else {
                afc com_google_android_gms_internal_afc = eeVar2.f5943B;
                if (this.f4363j) {
                    this.f4361h.m3633b(com_google_android_gms_internal_afc);
                } else if ((com_google_android_gms_internal_afc instanceof aet) && this.zzams.f4428i != null) {
                    m3751a((aet) eeVar2.f5943B);
                } else if ((com_google_android_gms_internal_afc instanceof aer) && this.zzams.f4427h != null) {
                    m3750a((aer) eeVar2.f5943B);
                } else if (!(com_google_android_gms_internal_afc instanceof aew) || this.zzams.f4430k == null || this.zzams.f4430k.get(((aew) com_google_android_gms_internal_afc).f5008a) == null) {
                    id.m5370a("No matching listener for retrieved native ad template.");
                    zzg(0);
                    return false;
                } else {
                    gb.f6131a.post(new C1476w(this, ((aew) com_google_android_gms_internal_afc).f5008a, eeVar2));
                }
            }
            return super.zza(eeVar, eeVar2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    public final boolean zza(zzix com_google_android_gms_internal_zzix, aec com_google_android_gms_internal_aec) {
        try {
            m3756b();
            return super.zza(com_google_android_gms_internal_zzix, com_google_android_gms_internal_aec, this.f4366m);
        } catch (Exception e) {
            id.m5372a(4);
            return false;
        }
    }

    protected final boolean zza(zzix com_google_android_gms_internal_zzix, ee eeVar, boolean z) {
        return this.d.zzdp();
    }

    public final void zzc(List<String> list) {
        C1516t.m3867b("setNativeTemplates must be called on the main UI thread.");
        this.zzams.f4438s = list;
    }

    public final void zzcb() {
        if (this.zzams.zzato == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzams.zzato.f5967p)) {
            super.zzcb();
        } else {
            zzbt();
        }
    }

    public final void zzcg() {
        if (this.zzams.zzato == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzams.zzato.f5967p)) {
            super.zzcg();
        } else {
            zzbs();
        }
    }

    public final void zzcn() {
        if (this.f4364k != null) {
            this.f4364k.destroy();
            this.f4364k = null;
        }
    }

    public final boolean zzco() {
        return this.zzams.zzato != null && this.zzams.zzato.f5964m && this.zzams.zzato.f5968q != null && this.zzams.zzato.f5968q.f5312o;
    }

    public final void zzd(jf jfVar) {
        this.f4364k = jfVar;
    }

    public final apn zzdi() {
        apn com_google_android_gms_internal_apn;
        synchronized (this.f4362i) {
            com_google_android_gms_internal_apn = this.f4367n;
        }
        return com_google_android_gms_internal_apn;
    }

    public final void zzdk() {
        if (this.zzams.zzato == null || this.f4364k == null) {
            this.f4365l = true;
            id.m5370a("Request to enable ActiveView before adState is available.");
            return;
        }
        wj wjVar = zzbv.zzee().f6018c;
        zzjb com_google_android_gms_internal_zzjb = this.zzams.zzatn;
        ee eeVar = this.zzams.zzato;
        jf jfVar = this.f4364k;
        if (jfVar == null) {
            throw null;
        }
        wjVar.m6918a(com_google_android_gms_internal_zzjb, eeVar, (View) jfVar, this.f4364k);
        this.f4365l = false;
    }

    public final void zzdl() {
        this.f4365l = false;
        if (this.zzams.zzato == null || this.f4364k == null) {
            id.m5370a("Request to enable ActiveView before adState is available.");
        } else {
            zzbv.zzee().f6018c.m6914a(this.zzams.zzato);
        }
    }

    public final C0477m<String, ahd> zzdm() {
        C1516t.m3867b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.zzams.f4430k;
    }

    public final void zzdn() {
        if (this.f4364k != null && this.f4364k.mo2187y() != null && this.zzams.f4431l != null && this.zzams.f4431l.f7792f != null) {
            this.f4364k.mo2187y().m5868a(this.zzams.f4431l.f7792f);
        }
    }

    protected final void zzg(int i) {
        mo1629a(i, false);
    }

    public final void zzh(int i) {
        C1516t.m3867b("setMaxNumberOfAds must be called on the main UI thread.");
        this.f4366m = i;
    }

    public final aha zzr(String str) {
        C1516t.m3867b("getOnCustomClickListener must be called on the main UI thread.");
        return this.zzams.f4429j == null ? null : (aha) this.zzams.f4429j.get(str);
    }
}
