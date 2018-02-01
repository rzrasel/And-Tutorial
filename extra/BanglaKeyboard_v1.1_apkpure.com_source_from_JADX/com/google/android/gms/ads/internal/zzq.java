package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.aei;
import com.google.android.gms.internal.aer;
import com.google.android.gms.internal.aet;
import com.google.android.gms.internal.aey;
import com.google.android.gms.internal.aez;
import com.google.android.gms.internal.afa;
import com.google.android.gms.internal.afb;
import com.google.android.gms.internal.afc;
import com.google.android.gms.internal.agp;
import com.google.android.gms.internal.aha;
import com.google.android.gms.internal.amc;
import com.google.android.gms.internal.amo;
import com.google.android.gms.internal.amr;
import com.google.android.gms.internal.apd;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.p056a.C1401c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@aqv
public final class zzq extends zzd implements afb {
    private boolean f4449h;
    private ee f4450i;
    private boolean f4451j = false;

    public zzq(Context context, zzv com_google_android_gms_ads_internal_zzv, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk) {
        super(context, com_google_android_gms_internal_zzjb, str, com_google_android_gms_internal_amc, com_google_android_gms_internal_zzajk, com_google_android_gms_ads_internal_zzv);
    }

    private static ee m3777a(ef efVar, int i) {
        return new ee(efVar.f5978a.f7613c, null, efVar.f5979b.f7657c, i, efVar.f5979b.f7659e, efVar.f5979b.f7663i, efVar.f5979b.f7665k, efVar.f5979b.f7664j, efVar.f5978a.f7619i, efVar.f5979b.f7661g, null, null, null, efVar.f5980c, null, efVar.f5979b.f7662h, efVar.f5981d, efVar.f5979b.f7660f, efVar.f5983f, efVar.f5984g, efVar.f5979b.f7668n, efVar.f5985h, null, efVar.f5979b.f7637A, efVar.f5979b.f7638B, efVar.f5979b.f7638B, efVar.f5979b.f7640D, efVar.f5979b.f7641E, null, efVar.f5979b.f7644H, efVar.f5979b.f7648L, efVar.f5986i);
    }

    private final boolean m3778a(ee eeVar, ee eeVar2) {
        zzc(null);
        if (this.zzams.zzfd()) {
            try {
                amo h = eeVar2.f5966o != null ? eeVar2.f5966o.mo1913h() : null;
                amr i = eeVar2.f5966o != null ? eeVar2.f5966o.mo1914i() : null;
                agp n = eeVar2.f5966o != null ? eeVar2.f5966o.mo1919n() : null;
                if (h == null || this.zzams.f4427h == null) {
                    if (i != null) {
                        if (this.zzams.f4428i != null) {
                            aet com_google_android_gms_internal_aet = new aet(i.mo1940a(), i.mo1942b(), i.mo1944c(), i.mo1946d() != null ? i.mo1946d() : null, i.mo1947e(), i.mo1948f(), null, i.mo1952j(), i.mo1954l(), i.mo1956n() != null ? (View) C1401c.m3585a(i.mo1956n()) : null);
                            com_google_android_gms_internal_aet.mo1755a(new aez(this.zzams.zzaie, (afb) this, this.zzams.f4421b, i, (afc) com_google_android_gms_internal_aet));
                            gb.f6131a.post(new as(this, com_google_android_gms_internal_aet));
                        }
                    }
                    if (n != null) {
                        if (!(this.zzams.f4430k == null || this.zzams.f4430k.get(n.mo1768l()) == null)) {
                            gb.f6131a.post(new at(this, n));
                        }
                    }
                    id.m5370a("No matching mapper/listener for retrieved native ad template.");
                    zzg(0);
                    return false;
                }
                aer com_google_android_gms_internal_aer = new aer(h.mo1921a(), h.mo1923b(), h.mo1925c(), h.mo1927d() != null ? h.mo1927d() : null, h.mo1928e(), h.mo1929f(), h.mo1930g(), h.mo1931h(), null, h.mo1935l(), h.mo1936m(), h.mo1939p() != null ? (View) C1401c.m3585a(h.mo1939p()) : null);
                com_google_android_gms_internal_aer.mo1755a(new aez(this.zzams.zzaie, (afb) this, this.zzams.f4421b, h, (afc) com_google_android_gms_internal_aer));
                gb.f6131a.post(new ar(this, com_google_android_gms_internal_aer));
                return super.zza(eeVar, eeVar2);
            } catch (Throwable e) {
                id.m5371a("Failed to get native ad mapper", e);
                zzg(0);
                return false;
            }
        }
        id.m5370a("Native ad does not have custom rendering mode.");
        zzg(0);
        return false;
    }

    private final boolean m3779b(ee eeVar, ee eeVar2) {
        View zzd = zzas.zzd(eeVar2);
        if (zzd == null) {
            return false;
        }
        View nextView = this.zzams.f4422c.getNextView();
        if (nextView != null) {
            if (nextView instanceof jf) {
                ((jf) nextView).destroy();
            }
            this.zzams.f4422c.removeView(nextView);
        }
        if (!zzas.zze(eeVar2)) {
            try {
                m3707a(zzd);
            } catch (Throwable th) {
                zzbv.zzee().m5336a(th, "AdLoaderManager.swapBannerViews");
                id.m5371a("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.zzams.f4422c.getChildCount() > 1) {
            this.zzams.f4422c.showNext();
        }
        if (eeVar != null) {
            View nextView2 = this.zzams.f4422c.getNextView();
            if (nextView2 != null) {
                this.zzams.f4422c.removeView(nextView2);
            }
            this.zzams.zzfc();
        }
        this.zzams.f4422c.setMinimumWidth(zzbl().f7763f);
        this.zzams.f4422c.setMinimumHeight(zzbl().f7760c);
        this.zzams.f4422c.requestLayout();
        this.zzams.f4422c.setVisibility(0);
        return true;
    }

    protected final void mo1609a() {
        super.mo1609a();
        ee eeVar = this.zzams.zzato;
        if (eeVar != null && eeVar.f5965n != null && eeVar.f5965n.m4683a() && this.zzams.f4434o != null) {
            try {
                this.zzams.f4434o.mo1864a(this, C1401c.m3584a(this.zzams.zzaie));
            } catch (Throwable e) {
                id.m5371a("Could not call PublisherAdViewLoadedListener.onPublisherAdViewLoaded().", e);
            }
        }
    }

    public final abv getVideoController() {
        return null;
    }

    public final void pause() {
        if (this.f4451j) {
            super.pause();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    public final void resume() {
        if (this.f4451j) {
            super.resume();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    public final void setManualImpressionsEnabled(boolean z) {
        C1516t.m3867b("setManualImpressionsEnabled must be called from the main thread.");
        this.f4449h = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    public final void zza(aei com_google_android_gms_internal_aei) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    public final void zza(aey com_google_android_gms_internal_aey) {
        id.m5370a("Unexpected call to AdLoaderManager method");
    }

    public final void zza(afa com_google_android_gms_internal_afa) {
        id.m5370a("Unexpected call to AdLoaderManager method");
    }

    public final void zza(ef efVar, aec com_google_android_gms_internal_aec) {
        this.f4450i = null;
        if (efVar.f5982e != -2) {
            this.f4450i = m3777a(efVar, efVar.f5982e);
        } else if (!efVar.f5979b.f7661g) {
            id.m5370a("partialAdState is not mediation");
            this.f4450i = m3777a(efVar, 0);
        }
        if (this.f4450i != null) {
            gb.f6131a.post(new aq(this));
            return;
        }
        if (efVar.f5981d != null) {
            this.zzams.zzatn = efVar.f5981d;
        }
        this.zzams.zzauj = 0;
        zzbw com_google_android_gms_ads_internal_zzbw = this.zzams;
        zzbv.zzdz();
        com_google_android_gms_ads_internal_zzbw.zzatm = apd.m5022a(this.zzams.zzaie, this, efVar, this.zzams.f4421b, null, this.zzana, this, com_google_android_gms_internal_aec);
    }

    protected final boolean zza(ee eeVar, ee eeVar2) {
        if (!this.zzams.zzfd()) {
            throw new IllegalStateException("AdLoader API does not support custom rendering.");
        } else if (eeVar2.f5964m) {
            if (eeVar2.f5965n != null && eeVar2.f5965n.m4683a()) {
                boolean z;
                if (this.zzams.zzfd() && this.zzams.f4422c != null) {
                    this.zzams.f4422c.zzfg().f6149b = eeVar2.f5977z;
                }
                if (!super.zza(eeVar, eeVar2)) {
                    z = false;
                } else if (!this.zzams.zzfd() || m3779b(eeVar, eeVar2)) {
                    if (!this.zzams.zzfe()) {
                        super.zza(eeVar2, false);
                    }
                    z = true;
                } else {
                    zzg(0);
                    z = false;
                }
                if (!z) {
                    return false;
                }
                this.f4451j = true;
            } else if (eeVar2.f5965n == null || !eeVar2.f5965n.m4684b()) {
                zzg(0);
                id.m5370a("Response is neither banner nor native.");
                return false;
            } else if (!m3778a(eeVar, eeVar2)) {
                return false;
            }
            zzd(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(2)})));
            return true;
        } else {
            zzg(0);
            id.m5370a("newState is not mediation.");
            return false;
        }
    }

    protected final boolean zza(zzix com_google_android_gms_internal_zzix, ee eeVar, boolean z) {
        return false;
    }

    public final boolean zzb(zzix com_google_android_gms_internal_zzix) {
        Object obj = (this.zzams.f4435p != null && this.zzams.f4435p.size() == 1 && ((Integer) this.zzams.f4435p.get(0)).intValue() == 2) ? 1 : null;
        if (obj != null) {
            id.m5372a(6);
            zzg(0);
            return false;
        } else if (this.zzams.f4434o == null) {
            return super.zzb(com_google_android_gms_internal_zzix);
        } else {
            if (com_google_android_gms_internal_zzix.f7747h != this.f4449h) {
                int i = com_google_android_gms_internal_zzix.f7740a;
                long j = com_google_android_gms_internal_zzix.f7741b;
                Bundle bundle = com_google_android_gms_internal_zzix.f7742c;
                int i2 = com_google_android_gms_internal_zzix.f7743d;
                List list = com_google_android_gms_internal_zzix.f7744e;
                boolean z = com_google_android_gms_internal_zzix.f7745f;
                int i3 = com_google_android_gms_internal_zzix.f7746g;
                boolean z2 = com_google_android_gms_internal_zzix.f7747h || this.f4449h;
                com_google_android_gms_internal_zzix = new zzix(i, j, bundle, i2, list, z, i3, z2, com_google_android_gms_internal_zzix.f7748i, com_google_android_gms_internal_zzix.f7749j, com_google_android_gms_internal_zzix.f7750k, com_google_android_gms_internal_zzix.f7751l, com_google_android_gms_internal_zzix.f7752m, com_google_android_gms_internal_zzix.f7753n, com_google_android_gms_internal_zzix.f7754o, com_google_android_gms_internal_zzix.f7755p, com_google_android_gms_internal_zzix.f7756q, com_google_android_gms_internal_zzix.f7757r);
            }
            return super.zzb(com_google_android_gms_internal_zzix);
        }
    }

    public final void zzc(List<String> list) {
        C1516t.m3867b("setNativeTemplates must be called on the main UI thread.");
        this.zzams.f4438s = list;
    }

    public final void zzcb() {
        if (this.zzams.zzato == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzams.zzato.f5967p) || this.zzams.zzato.f5965n == null || !this.zzams.zzato.f5965n.m4684b()) {
            super.zzcb();
        } else {
            zzbt();
        }
    }

    public final void zzcg() {
        if (this.zzams.zzato == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzams.zzato.f5967p) || this.zzams.zzato.f5965n == null || !this.zzams.zzato.f5965n.m4684b()) {
            super.zzcg();
        } else {
            zzbs();
        }
    }

    public final void zzcn() {
        id.m5370a("Unexpected call to AdLoaderManager method");
    }

    public final boolean zzco() {
        return this.zzams.zzato != null && this.zzams.zzato.f5964m && this.zzams.zzato.f5968q != null && this.zzams.zzato.f5968q.f5312o;
    }

    public final void zzd(List<Integer> list) {
        C1516t.m3867b("setAllowedAdTypes must be called on the main UI thread.");
        this.zzams.f4435p = list;
    }

    public final aha zzr(String str) {
        C1516t.m3867b("getOnCustomClickListener must be called on the main UI thread.");
        return (aha) this.zzams.f4429j.get(str);
    }
}
