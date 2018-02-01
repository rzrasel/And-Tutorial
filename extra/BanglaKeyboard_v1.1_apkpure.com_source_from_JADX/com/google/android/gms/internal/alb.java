package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzam;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.p056a.C1398a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@aqv
public final class alb extends abd {
    private final String f5262a;
    private boolean f5263b;
    private final ajr f5264c;
    private zzam f5265d;
    private final aks f5266e;

    public alb(Context context, String str, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk, zzv com_google_android_gms_ads_internal_zzv) {
        this(str, new ajr(context, com_google_android_gms_internal_amc, com_google_android_gms_internal_zzajk, com_google_android_gms_ads_internal_zzv));
    }

    private alb(String str, ajr com_google_android_gms_internal_ajr) {
        Throwable e;
        this.f5262a = str;
        this.f5264c = com_google_android_gms_internal_ajr;
        this.f5266e = new aks();
        akv zzep = zzbv.zzep();
        if (zzep.f5242c == null) {
            zzep.f5242c = new ajr(com_google_android_gms_internal_ajr.f5211a.getApplicationContext(), com_google_android_gms_internal_ajr.f5212b, com_google_android_gms_internal_ajr.f5213c, com_google_android_gms_internal_ajr.f5214d);
            if (zzep.f5242c != null) {
                akw com_google_android_gms_internal_akw;
                SharedPreferences sharedPreferences = zzep.f5242c.f5211a.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (zzep.f5241b.size() > 0) {
                    com_google_android_gms_internal_akw = (akw) zzep.f5241b.remove();
                    akx com_google_android_gms_internal_akx = (akx) zzep.f5240a.get(com_google_android_gms_internal_akw);
                    akv.m4659a("Flushing interstitial queue for %s.", com_google_android_gms_internal_akw);
                    while (com_google_android_gms_internal_akx.f5244a.size() > 0) {
                        com_google_android_gms_internal_akx.m4667a(null).f5249a.zzda();
                    }
                    zzep.f5240a.remove(com_google_android_gms_internal_akw);
                }
                try {
                    Map hashMap = new HashMap();
                    for (Entry entry : sharedPreferences.getAll().entrySet()) {
                        if (!((String) entry.getKey()).equals("PoolKeys")) {
                            alc a = alc.m4673a((String) entry.getValue());
                            akw com_google_android_gms_internal_akw2 = new akw(a.f5267a, a.f5268b, a.f5269c);
                            if (!zzep.f5240a.containsKey(com_google_android_gms_internal_akw2)) {
                                zzep.f5240a.put(com_google_android_gms_internal_akw2, new akx(a.f5267a, a.f5268b, a.f5269c));
                                hashMap.put(com_google_android_gms_internal_akw2.toString(), com_google_android_gms_internal_akw2);
                                akv.m4659a("Restored interstitial queue for %s.", com_google_android_gms_internal_akw2);
                            }
                        }
                    }
                    for (Object obj : akv.m4660a(sharedPreferences.getString("PoolKeys", ""))) {
                        com_google_android_gms_internal_akw = (akw) hashMap.get(obj);
                        if (zzep.f5240a.containsKey(com_google_android_gms_internal_akw)) {
                            zzep.f5241b.add(com_google_android_gms_internal_akw);
                        }
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    zzbv.zzee().m5336a(e, "InterstitialAdPool.restore");
                    id.m5371a("Malformed preferences value for InterstitialAdPool.", e);
                    zzep.f5240a.clear();
                    zzep.f5241b.clear();
                } catch (IOException e3) {
                    e = e3;
                    zzbv.zzee().m5336a(e, "InterstitialAdPool.restore");
                    id.m5371a("Malformed preferences value for InterstitialAdPool.", e);
                    zzep.f5240a.clear();
                    zzep.f5241b.clear();
                }
            }
        }
    }

    private final void m4672a() {
        if (this.f5265d == null) {
            ajr com_google_android_gms_internal_ajr = this.f5264c;
            this.f5265d = new zzam(com_google_android_gms_internal_ajr.f5211a, new zzjb(), this.f5262a, com_google_android_gms_internal_ajr.f5212b, com_google_android_gms_internal_ajr.f5213c, com_google_android_gms_internal_ajr.f5214d);
            this.f5266e.m4649a(this.f5265d);
        }
    }

    public final void destroy() {
        if (this.f5265d != null) {
            this.f5265d.destroy();
        }
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final String getMediationAdapterClassName() {
        return this.f5265d != null ? this.f5265d.getMediationAdapterClassName() : null;
    }

    public final abv getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final boolean isLoading() {
        return this.f5265d != null && this.f5265d.isLoading();
    }

    public final boolean isReady() {
        return this.f5265d != null && this.f5265d.isReady();
    }

    public final void pause() {
        if (this.f5265d != null) {
            this.f5265d.pause();
        }
    }

    public final void resume() {
        if (this.f5265d != null) {
            this.f5265d.resume();
        }
    }

    public final void setImmersiveMode(boolean z) {
        this.f5263b = z;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        m4672a();
        if (this.f5265d != null) {
            this.f5265d.setManualImpressionsEnabled(z);
        }
    }

    public final void setUserId(String str) {
    }

    public final void showInterstitial() {
        if (this.f5265d != null) {
            this.f5265d.setImmersiveMode(this.f5263b);
            this.f5265d.showInterstitial();
            return;
        }
        id.m5370a("Interstitial ad must be loaded before showInterstitial().");
    }

    public final void stopLoading() {
        if (this.f5265d != null) {
            this.f5265d.stopLoading();
        }
    }

    public final void zza(aan com_google_android_gms_internal_aan) {
        this.f5266e.f5236d = com_google_android_gms_internal_aan;
        if (this.f5265d != null) {
            this.f5266e.m4649a(this.f5265d);
        }
    }

    public final void zza(aaq com_google_android_gms_internal_aaq) {
        this.f5266e.f5233a = com_google_android_gms_internal_aaq;
        if (this.f5265d != null) {
            this.f5266e.m4649a(this.f5265d);
        }
    }

    public final void zza(abh com_google_android_gms_internal_abh) {
        this.f5266e.f5234b = com_google_android_gms_internal_abh;
        if (this.f5265d != null) {
            this.f5266e.m4649a(this.f5265d);
        }
    }

    public final void zza(abn com_google_android_gms_internal_abn) {
        m4672a();
        if (this.f5265d != null) {
            this.f5265d.zza(com_google_android_gms_internal_abn);
        }
    }

    public final void zza(aei com_google_android_gms_internal_aei) {
        this.f5266e.f5235c = com_google_android_gms_internal_aei;
        if (this.f5265d != null) {
            this.f5266e.m4649a(this.f5265d);
        }
    }

    public final void zza(aop com_google_android_gms_internal_aop) {
        id.m5370a("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void zza(aou com_google_android_gms_internal_aou, String str) {
        id.m5370a("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    public final void zza(ch chVar) {
        this.f5266e.f5237e = chVar;
        if (this.f5265d != null) {
            this.f5266e.m4649a(this.f5265d);
        }
    }

    public final void zza(zzjb com_google_android_gms_internal_zzjb) {
        if (this.f5265d != null) {
            this.f5265d.zza(com_google_android_gms_internal_zzjb);
        }
    }

    public final void zza(zzle com_google_android_gms_internal_zzle) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzmd com_google_android_gms_internal_zzmd) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final boolean zzb(zzix com_google_android_gms_internal_zzix) {
        if (!akv.m4657a(com_google_android_gms_internal_zzix).contains("gw")) {
            m4672a();
        }
        if (akv.m4657a(com_google_android_gms_internal_zzix).contains("_skipMediation")) {
            m4672a();
        }
        if (com_google_android_gms_internal_zzix.f7749j != null) {
            m4672a();
        }
        if (this.f5265d != null) {
            return this.f5265d.zzb(com_google_android_gms_internal_zzix);
        }
        String str;
        int i;
        akw com_google_android_gms_internal_akw;
        akx com_google_android_gms_internal_akx;
        aky com_google_android_gms_internal_aky;
        akv zzep = zzbv.zzep();
        if (akv.m4657a(com_google_android_gms_internal_zzix).contains("_ad")) {
            str = this.f5262a;
            if (zzep.f5242c != null) {
                i = new bf(zzep.f5242c.f5211a.getApplicationContext()).m5124a().f5772n;
                zzix b = akv.m4661b(com_google_android_gms_internal_zzix);
                String c = akv.m4665c(str);
                com_google_android_gms_internal_akw = new akw(b, c, i);
                com_google_android_gms_internal_akx = (akx) zzep.f5240a.get(com_google_android_gms_internal_akw);
                if (com_google_android_gms_internal_akx == null) {
                    akv.m4659a("Interstitial pool created at %s.", com_google_android_gms_internal_akw);
                    com_google_android_gms_internal_akx = new akx(b, c, i);
                    zzep.f5240a.put(com_google_android_gms_internal_akw, com_google_android_gms_internal_akx);
                }
                com_google_android_gms_internal_akx.f5244a.add(new aky(com_google_android_gms_internal_akx, zzep.f5242c, com_google_android_gms_internal_zzix));
                com_google_android_gms_internal_akx.f5248e = true;
                akv.m4659a("Inline entry added to the queue at %s.", com_google_android_gms_internal_akw);
            }
        }
        str = this.f5262a;
        if (!akv.m4663b(str)) {
            akx com_google_android_gms_internal_akx2;
            i = new bf(zzep.f5242c.f5211a.getApplicationContext()).m5124a().f5772n;
            zzix b2 = akv.m4661b(com_google_android_gms_internal_zzix);
            String c2 = akv.m4665c(str);
            com_google_android_gms_internal_akw = new akw(b2, c2, i);
            com_google_android_gms_internal_akx = (akx) zzep.f5240a.get(com_google_android_gms_internal_akw);
            if (com_google_android_gms_internal_akx == null) {
                akv.m4659a("Interstitial pool created at %s.", com_google_android_gms_internal_akw);
                com_google_android_gms_internal_akx = new akx(b2, c2, i);
                zzep.f5240a.put(com_google_android_gms_internal_akw, com_google_android_gms_internal_akx);
                com_google_android_gms_internal_akx2 = com_google_android_gms_internal_akx;
            } else {
                com_google_android_gms_internal_akx2 = com_google_android_gms_internal_akx;
            }
            zzep.f5241b.remove(com_google_android_gms_internal_akw);
            zzep.f5241b.add(com_google_android_gms_internal_akw);
            com_google_android_gms_internal_akx2.f5248e = true;
            while (true) {
                if (zzep.f5241b.size() <= ((Integer) zzbv.zzen().m4217a(ado.aI)).intValue()) {
                    break;
                }
                akw com_google_android_gms_internal_akw2 = (akw) zzep.f5241b.remove();
                akx com_google_android_gms_internal_akx3 = (akx) zzep.f5240a.get(com_google_android_gms_internal_akw2);
                akv.m4659a("Evicting interstitial queue for %s.", com_google_android_gms_internal_akw2);
                while (com_google_android_gms_internal_akx3.f5244a.size() > 0) {
                    aky a = com_google_android_gms_internal_akx3.m4667a(null);
                    if (a.f5253e) {
                        akz a2 = akz.m4669a();
                        a2.f5259c++;
                    }
                    a.f5249a.zzda();
                }
                zzep.f5240a.remove(com_google_android_gms_internal_akw2);
            }
            while (com_google_android_gms_internal_akx2.f5244a.size() > 0) {
                aky a3 = com_google_android_gms_internal_akx2.m4667a(b2);
                if (a3.f5253e) {
                    if (zzbv.zzeg().mo1669a() - a3.f5252d > 1000 * ((long) ((Integer) zzbv.zzen().m4217a(ado.aK)).intValue())) {
                        akv.m4659a("Expired interstitial at %s.", com_google_android_gms_internal_akw);
                        akz a4 = akz.m4669a();
                        a4.f5258b++;
                    }
                }
                str = a3.f5250b != null ? " (inline) " : " ";
                akv.m4659a(new StringBuilder(String.valueOf(str).length() + 34).append("Pooled interstitial").append(str).append("returned at %s.").toString(), com_google_android_gms_internal_akw);
                com_google_android_gms_internal_aky = a3;
                if (com_google_android_gms_internal_aky == null) {
                    if (com_google_android_gms_internal_aky.f5253e) {
                        com_google_android_gms_internal_aky.m4668a();
                        akz.m4669a().m4670b();
                    } else {
                        akz a5 = akz.m4669a();
                        a5.f5260d++;
                    }
                    this.f5265d = com_google_android_gms_internal_aky.f5249a;
                    com_google_android_gms_internal_aky.f5251c.m4604a(this.f5266e);
                    this.f5266e.m4649a(this.f5265d);
                    return com_google_android_gms_internal_aky.f5254f;
                }
                m4672a();
                akz.m4669a().m4670b();
                return this.f5265d.zzb(com_google_android_gms_internal_zzix);
            }
        }
        com_google_android_gms_internal_aky = null;
        if (com_google_android_gms_internal_aky == null) {
            m4672a();
            akz.m4669a().m4670b();
            return this.f5265d.zzb(com_google_android_gms_internal_zzix);
        }
        if (com_google_android_gms_internal_aky.f5253e) {
            akz a52 = akz.m4669a();
            a52.f5260d++;
        } else {
            com_google_android_gms_internal_aky.m4668a();
            akz.m4669a().m4670b();
        }
        this.f5265d = com_google_android_gms_internal_aky.f5249a;
        com_google_android_gms_internal_aky.f5251c.m4604a(this.f5266e);
        this.f5266e.m4649a(this.f5265d);
        return com_google_android_gms_internal_aky.f5254f;
    }

    public final C1398a zzbk() {
        return this.f5265d != null ? this.f5265d.zzbk() : null;
    }

    public final zzjb zzbl() {
        return this.f5265d != null ? this.f5265d.zzbl() : null;
    }

    public final void zzbn() {
        if (this.f5265d != null) {
            this.f5265d.zzbn();
        } else {
            id.m5370a("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    public final abh zzbw() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final aaq zzbx() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final String zzch() {
        return this.f5265d != null ? this.f5265d.zzch() : null;
    }
}
