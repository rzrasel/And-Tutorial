package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class aqy extends eq implements C1574d {
    final C1585l f5672a;
    final Object f5673b = new Object();
    final Context f5674c;
    Runnable f5675d;
    gp f5676f;
    private final aqx f5677g;
    private final zn f5678h;
    private zzaak f5679i;
    private zzaao f5680j;
    private alm f5681k;

    public aqy(Context context, C1585l c1585l, aqx com_google_android_gms_internal_aqx, zn znVar) {
        this.f5677g = com_google_android_gms_internal_aqx;
        this.f5674c = context;
        this.f5672a = c1585l;
        this.f5678h = znVar;
    }

    private final zzjb m5095a(zzaak com_google_android_gms_internal_zzaak) {
        int i = 1;
        if (this.f5679i == null || this.f5679i.f7606V == null || this.f5679i.f7606V.size() <= 1) {
            i = 0;
        }
        if (i != 0 && this.f5681k != null && !this.f5681k.f5315r) {
            return null;
        }
        if (this.f5680j.f7679y) {
            for (zzjb com_google_android_gms_internal_zzjb : com_google_android_gms_internal_zzaak.f7614d.f7764g) {
                if (com_google_android_gms_internal_zzjb.f7766i) {
                    return new zzjb(com_google_android_gms_internal_zzjb, com_google_android_gms_internal_zzaak.f7614d.f7764g);
                }
            }
        }
        if (this.f5680j.f7666l == null) {
            throw new arb("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.f5680j.f7666l.split("x");
        if (split.length != 2) {
            String str = "Invalid ad size format from the ad response: ";
            String valueOf = String.valueOf(this.f5680j.f7666l);
            throw new arb(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (zzjb com_google_android_gms_internal_zzjb2 : com_google_android_gms_internal_zzaak.f7614d.f7764g) {
                float f = this.f5674c.getResources().getDisplayMetrics().density;
                i = com_google_android_gms_internal_zzjb2.f7762e == -1 ? (int) (((float) com_google_android_gms_internal_zzjb2.f7763f) / f) : com_google_android_gms_internal_zzjb2.f7762e;
                int i2 = com_google_android_gms_internal_zzjb2.f7759b == -2 ? (int) (((float) com_google_android_gms_internal_zzjb2.f7760c) / f) : com_google_android_gms_internal_zzjb2.f7759b;
                if (parseInt == i && parseInt2 == i2 && !com_google_android_gms_internal_zzjb2.f7766i) {
                    return new zzjb(com_google_android_gms_internal_zzjb2, com_google_android_gms_internal_zzaak.f7614d.f7764g);
                }
            }
            str = "The ad size from the ad response was not one of the requested sizes: ";
            valueOf = String.valueOf(this.f5680j.f7666l);
            throw new arb(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        } catch (NumberFormatException e) {
            str = "Invalid ad size number from the ad response: ";
            valueOf = String.valueOf(this.f5680j.f7666l);
            throw new arb(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        }
    }

    public final void mo1475a() {
        id.m5372a(3);
        this.f5675d = new aqz(this);
        gb.f6131a.postDelayed(this.f5675d, ((Long) zzbv.zzen().m4217a(ado.bj)).longValue());
        long b = zzbv.zzeg().mo1670b();
        if (((Boolean) zzbv.zzen().m4217a(ado.bh)).booleanValue() && this.f5672a.f6503b.f7742c != null) {
            String string = this.f5672a.f6503b.f7742c.getString("_ad");
            if (string != null) {
                this.f5679i = new zzaak(this.f5672a, b, null, null, null);
                mo2019a(av.m5101a(this.f5674c, this.f5679i, string));
                return;
            }
        }
        it iyVar = new iy();
        fv.m5425a(new ara(this, iyVar));
        String g = zzbv.zzez().m5306g(this.f5674c);
        String h = zzbv.zzez().m5307h(this.f5674c);
        String i = zzbv.zzez().m5308i(this.f5674c);
        zzbv.zzez().m5300c(this.f5674c, i);
        this.f5679i = new zzaak(this.f5672a, b, g, h, i);
        iyVar.zzf(this.f5679i);
    }

    final void m5097a(int i, String str) {
        if (i == 3 || i == -1) {
            id.m5372a(4);
        } else {
            id.m5370a(str);
        }
        if (this.f5680j == null) {
            this.f5680j = new zzaao(i);
        } else {
            this.f5680j = new zzaao(i, this.f5680j.f7664j);
        }
        this.f5677g.zza(new ef(this.f5679i != null ? this.f5679i : new zzaak(this.f5672a, -1, null, null, null), this.f5680j, this.f5681k, null, i, -1, this.f5680j.f7667m, null, this.f5678h));
    }

    public final void mo2019a(zzaao com_google_android_gms_internal_zzaao) {
        String str;
        id.m5372a(3);
        this.f5680j = com_google_android_gms_internal_zzaao;
        long b = zzbv.zzeg().mo1670b();
        synchronized (this.f5673b) {
            this.f5676f = null;
        }
        zzbv.zzee().m5339b(this.f5674c, this.f5680j.f7642F);
        if (((Boolean) zzbv.zzen().m4217a(ado.aE)).booleanValue()) {
            Context context;
            SharedPreferences sharedPreferences;
            Collection stringSet;
            Set hashSet;
            Editor edit;
            if (this.f5680j.f7650N) {
                zzbv.zzee();
                context = this.f5674c;
                str = this.f5679i.f7615e;
                sharedPreferences = context.getSharedPreferences("admob", 0);
                stringSet = sharedPreferences.getStringSet("never_pool_slots", Collections.emptySet());
                if (!stringSet.contains(str)) {
                    hashSet = new HashSet(stringSet);
                    hashSet.add(str);
                    edit = sharedPreferences.edit();
                    edit.putStringSet("never_pool_slots", hashSet);
                    edit.apply();
                }
            } else {
                zzbv.zzee();
                context = this.f5674c;
                str = this.f5679i.f7615e;
                sharedPreferences = context.getSharedPreferences("admob", 0);
                stringSet = sharedPreferences.getStringSet("never_pool_slots", Collections.emptySet());
                if (stringSet.contains(str)) {
                    hashSet = new HashSet(stringSet);
                    hashSet.remove(str);
                    edit = sharedPreferences.edit();
                    edit.putStringSet("never_pool_slots", hashSet);
                    edit.apply();
                }
            }
        }
        try {
            if (this.f5680j.f7658d == -2 || this.f5680j.f7658d == -3) {
                JSONObject jSONObject;
                if (this.f5680j.f7658d != -3) {
                    if (TextUtils.isEmpty(this.f5680j.f7656b)) {
                        throw new arb("No fill from ad server.", 3);
                    }
                    zzbv.zzee().m5330a(this.f5674c, this.f5680j.f7674t);
                    if (this.f5680j.f7661g) {
                        this.f5681k = new alm(this.f5680j.f7656b);
                        zzbv.zzee().m5344c(this.f5681k.f5304g);
                    } else {
                        zzbv.zzee().m5344c(this.f5680j.f7645I);
                    }
                    if (!TextUtils.isEmpty(this.f5680j.f7643G)) {
                        if (((Boolean) zzbv.zzen().m4217a(ado.cl)).booleanValue()) {
                            id.m5372a(3);
                            CookieManager c = zzbv.zzec().mo2116c(this.f5674c);
                            if (c != null) {
                                c.setCookie("googleads.g.doubleclick.net", this.f5680j.f7643G);
                            }
                        }
                    }
                }
                zzjb a = this.f5679i.f7614d.f7764g != null ? m5095a(this.f5679i) : null;
                zzbv.zzee().m5337a(this.f5680j.f7675u);
                zzbv.zzee().m5341b(this.f5680j.f7649M);
                if (!TextUtils.isEmpty(this.f5680j.f7671q)) {
                    try {
                        jSONObject = new JSONObject(this.f5680j.f7671q);
                    } catch (Exception e) {
                        id.m5372a(6);
                    }
                    this.f5677g.zza(new ef(this.f5679i, this.f5680j, this.f5681k, a, -2, b, this.f5680j.f7667m, jSONObject, this.f5678h));
                    gb.f6131a.removeCallbacks(this.f5675d);
                    return;
                }
                jSONObject = null;
                this.f5677g.zza(new ef(this.f5679i, this.f5680j, this.f5681k, a, -2, b, this.f5680j.f7667m, jSONObject, this.f5678h));
                gb.f6131a.removeCallbacks(this.f5675d);
                return;
            }
            throw new arb("There was a problem getting an ad response. ErrorCode: " + this.f5680j.f7658d, this.f5680j.f7658d);
        } catch (JSONException e2) {
            id.m5372a(6);
            str = "Could not parse mediation config: ";
            String valueOf = String.valueOf(this.f5680j.f7656b);
            throw new arb(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        } catch (arb e3) {
            m5097a(e3.f5686a, e3.getMessage());
            gb.f6131a.removeCallbacks(this.f5675d);
        }
    }

    public final void mo1476b() {
        synchronized (this.f5673b) {
            if (this.f5676f != null) {
                this.f5676f.mo1473f();
            }
        }
    }
}
