package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.js.JavascriptEngineFactory;
import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.ads.internal.js.zzah;
import com.google.android.gms.ads.internal.js.zzai;
import com.google.android.gms.ads.internal.js.zzl;
import com.google.android.gms.ads.internal.js.zzx;
import com.google.android.gms.ads.internal.zzbc;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@aqv
public final class apn {
    private static final long f5568a = TimeUnit.SECONDS.toMillis(60);
    private static final Object f5569b = new Object();
    private static boolean f5570c = false;
    private static zzl f5571d = null;
    private final Context f5572e;
    private final zzajk f5573f;
    private final zzbc f5574g;
    private final nh f5575h;
    private final Object f5576i;
    private JavascriptEngineFactory f5577j;
    private zzah f5578k;
    private il<zza> f5579l;
    private boolean f5580m;
    private boolean f5581n;

    public apn(Context context, zzbc com_google_android_gms_ads_internal_zzbc, nh nhVar, zzajk com_google_android_gms_internal_zzajk) {
        this.f5576i = new Object();
        this.f5580m = false;
        this.f5581n = false;
        this.f5572e = context;
        this.f5574g = com_google_android_gms_ads_internal_zzbc;
        this.f5575h = nhVar;
        this.f5573f = com_google_android_gms_internal_zzajk;
        this.f5580m = ((Boolean) zzbv.zzen().m4217a(ado.bL)).booleanValue();
    }

    public apn(Context context, ef efVar, zzbc com_google_android_gms_ads_internal_zzbc, nh nhVar) {
        zzajk com_google_android_gms_internal_zzajk = (efVar == null || efVar.f5978a == null) ? null : efVar.f5978a.f7621k;
        this(context, com_google_android_gms_ads_internal_zzbc, nhVar, com_google_android_gms_internal_zzajk);
    }

    private final zza m5038d() {
        zza com_google_android_gms_ads_internal_js_zza = null;
        if (this.f5579l != null) {
            com_google_android_gms_ads_internal_js_zza = (zza) this.f5579l.get(f5568a, TimeUnit.MILLISECONDS);
            synchronized (this.f5576i) {
                if (!this.f5581n) {
                    com_google_android_gms_ads_internal_js_zza.zza(this.f5574g, this.f5574g, this.f5574g, this.f5574g, false, null, null, null);
                    this.f5581n = true;
                }
            }
        }
        return com_google_android_gms_ads_internal_js_zza;
    }

    public final void m5039a() {
        if (this.f5580m) {
            synchronized (f5569b) {
                if (!f5570c) {
                    f5571d = new zzl(this.f5572e.getApplicationContext() != null ? this.f5572e.getApplicationContext() : this.f5572e, this.f5573f, (String) zzbv.zzen().m4217a(ado.bJ), new apq(this), new zzx());
                    f5570c = true;
                }
            }
            return;
        }
        this.f5577j = new JavascriptEngineFactory();
    }

    public final void m5040a(aps com_google_android_gms_internal_aps) {
        Throwable e;
        if (this.f5580m) {
            iy iyVar = this.f5578k;
            if (iyVar == null) {
                id.m5370a("SharedJavascriptEngine not initialized");
                return;
            } else {
                iyVar.zza(new apo(com_google_android_gms_internal_aps), new app(com_google_android_gms_internal_aps));
                return;
            }
        }
        try {
            zzai d = m5038d();
            if (d == null) {
                id.m5370a("JavascriptEngine not initialized");
            } else {
                com_google_android_gms_internal_aps.mo1818a(d);
            }
        } catch (Throwable e2) {
            Thread.currentThread().interrupt();
            id.m5371a("Exception occurred during execution", e2);
        } catch (CancellationException e3) {
            e2 = e3;
            id.m5371a("Exception occurred during execution", e2);
        } catch (ExecutionException e4) {
            e2 = e4;
            id.m5371a("Exception occurred during execution", e2);
        } catch (TimeoutException e5) {
            e2 = e5;
            id.m5371a("Exception occurred during execution", e2);
        }
    }

    public final void m5041b() {
        if (this.f5580m) {
            this.f5578k = new zzah(f5571d.zzb(this.f5575h));
            return;
        }
        this.f5579l = this.f5577j.zza(this.f5572e, this.f5573f, (String) zzbv.zzen().m4217a(ado.bJ), this.f5575h, this.f5574g.zzbj());
    }

    public final void m5042c() {
        Throwable e;
        if (!this.f5580m) {
            try {
                zza d = m5038d();
                if (d != null) {
                    zzbv.zzea();
                    gb.m5451a(new apr(d));
                }
            } catch (CancellationException e2) {
                e = e2;
                id.m5371a("Exception occurred while destroying engine", e);
            } catch (ExecutionException e3) {
                e = e3;
                id.m5371a("Exception occurred while destroying engine", e);
            } catch (InterruptedException e4) {
                e = e4;
                id.m5371a("Exception occurred while destroying engine", e);
            } catch (TimeoutException e5) {
                e = e5;
                id.m5371a("Exception occurred while destroying engine", e);
            }
        }
    }
}
