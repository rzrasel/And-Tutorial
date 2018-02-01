package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.js.zzai;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.aiu;
import com.google.android.gms.internal.ajd;
import com.google.android.gms.internal.aje;
import com.google.android.gms.internal.all;
import com.google.android.gms.internal.alm;
import com.google.android.gms.internal.amc;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.dt;
import com.google.android.gms.internal.du;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.hp;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.xh;
import com.google.android.gms.internal.zzaao;
import com.google.android.gms.internal.zzaek;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzjb;
import java.lang.reflect.Method;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class zzam extends zzi implements aiu, aje {
    private transient boolean f4344h = false;
    private int f4345i = -1;
    private boolean f4346j;
    private float f4347k;
    private boolean f4348l;
    private dt f4349m;
    private String f4350n;
    private final String f4351o;

    public zzam(Context context, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk, zzv com_google_android_gms_ads_internal_zzv) {
        super(context, com_google_android_gms_internal_zzjb, str, com_google_android_gms_internal_amc, com_google_android_gms_internal_zzajk, com_google_android_gms_ads_internal_zzv);
        String str2 = (com_google_android_gms_internal_zzjb == null || !"reward_mb".equals(com_google_android_gms_internal_zzjb.f7758a)) ? "/Interstitial" : "/Rewarded";
        this.f4351o = str2;
    }

    private static ef m3732a(ef efVar) {
        try {
            String jSONObject = av.m5106a(efVar.f5979b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, efVar.f5978a.f7615e);
            all com_google_android_gms_internal_all = new all(jSONObject, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
            zzaao com_google_android_gms_internal_zzaao = efVar.f5979b;
            alm com_google_android_gms_internal_alm = new alm(Collections.singletonList(com_google_android_gms_internal_all), ((Long) zzbv.zzen().m4217a(ado.bk)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), com_google_android_gms_internal_zzaao.f7644H, com_google_android_gms_internal_zzaao.f7645I, "");
            return new ef(efVar.f5978a, new zzaao(efVar.f5978a, com_google_android_gms_internal_zzaao.f7655a, com_google_android_gms_internal_zzaao.f7656b, Collections.emptyList(), Collections.emptyList(), com_google_android_gms_internal_zzaao.f7660f, true, com_google_android_gms_internal_zzaao.f7662h, Collections.emptyList(), com_google_android_gms_internal_zzaao.f7664j, com_google_android_gms_internal_zzaao.f7665k, com_google_android_gms_internal_zzaao.f7666l, com_google_android_gms_internal_zzaao.f7667m, com_google_android_gms_internal_zzaao.f7668n, com_google_android_gms_internal_zzaao.f7669o, com_google_android_gms_internal_zzaao.f7670p, null, com_google_android_gms_internal_zzaao.f7672r, com_google_android_gms_internal_zzaao.f7673s, com_google_android_gms_internal_zzaao.f7674t, com_google_android_gms_internal_zzaao.f7675u, com_google_android_gms_internal_zzaao.f7676v, com_google_android_gms_internal_zzaao.f7678x, com_google_android_gms_internal_zzaao.f7679y, com_google_android_gms_internal_zzaao.f7680z, null, Collections.emptyList(), Collections.emptyList(), com_google_android_gms_internal_zzaao.f7640D, com_google_android_gms_internal_zzaao.f7641E, com_google_android_gms_internal_zzaao.f7642F, com_google_android_gms_internal_zzaao.f7643G, com_google_android_gms_internal_zzaao.f7644H, com_google_android_gms_internal_zzaao.f7645I, com_google_android_gms_internal_zzaao.f7646J, null, com_google_android_gms_internal_zzaao.f7648L, com_google_android_gms_internal_zzaao.f7649M, com_google_android_gms_internal_zzaao.f7650N), com_google_android_gms_internal_alm, efVar.f5981d, efVar.f5982e, efVar.f5983f, efVar.f5984g, null, efVar.f5986i);
        } catch (JSONException e) {
            id.m5372a(6);
            return efVar;
        }
    }

    private final void m3733a(Bundle bundle) {
        zzbv.zzea();
        gb.m5473b(this.zzams.zzaie, this.zzams.zzatj.f7706a, "gmob-apps", bundle, false);
    }

    protected final jf mo1616a(ef efVar, zzw com_google_android_gms_ads_internal_zzw, dq dqVar) {
        zzbv.zzeb();
        zzai a = jp.m5744a(this.zzams.zzaie, this.zzams.zzatn, false, false, this.zzams.f4421b, this.zzams.zzatj, this.a, this, this.g, efVar.f5986i);
        a.mo2163k().m5727a(this, null, this, this, ((Boolean) zzbv.zzen().m4217a(ado.ab)).booleanValue(), this, com_google_android_gms_ads_internal_zzw, null, dqVar);
        m3730a(a);
        a.mo2150b(efVar.f5978a.f7632v);
        a.mo2163k().m5728a("/reward", new ajd(this));
        return a;
    }

    protected final void mo1609a() {
        super.mo1609a();
        this.f4344h = true;
    }

    protected final boolean m3739b() {
        if (!(this.zzams.zzaie instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.zzams.zzaie).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        return (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
    }

    public final void setImmersiveMode(boolean z) {
        C1516t.m3867b("setImmersiveMode must be called on the main UI thread.");
        this.f4348l = z;
    }

    public final void showInterstitial() {
        Object obj = null;
        C1516t.m3867b("showInterstitial must be called on the main UI thread.");
        if (zzbv.zzez().m5303d(this.zzams.zzaie)) {
            this.f4350n = zzbv.zzez().m5305f(this.zzams.zzaie);
            String valueOf = String.valueOf(this.f4350n);
            String valueOf2 = String.valueOf(this.f4351o);
            this.f4350n = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.zzams.zzato == null) {
            id.m5370a("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) zzbv.zzen().m4217a(ado.ba)).booleanValue()) {
            Bundle bundle;
            valueOf2 = this.zzams.zzaie.getApplicationContext() != null ? this.zzams.zzaie.getApplicationContext().getPackageName() : this.zzams.zzaie.getPackageName();
            if (!this.f4344h) {
                id.m5370a("It is not recommended to show an interstitial before onAdLoaded completes.");
                bundle = new Bundle();
                bundle.putString("appid", valueOf2);
                bundle.putString("action", "show_interstitial_before_load_finish");
                m3733a(bundle);
            }
            zzbv.zzea();
            if (!gb.m5488e(this.zzams.zzaie)) {
                id.m5370a("It is not recommended to show an interstitial when app is not in foreground.");
                bundle = new Bundle();
                bundle.putString("appid", valueOf2);
                bundle.putString("action", "show_interstitial_app_not_in_foreground");
                m3733a(bundle);
            }
        }
        if (!this.zzams.zzfe()) {
            if (this.zzams.zzato.f5964m && this.zzams.zzato.f5966o != null) {
                try {
                    if (((Boolean) zzbv.zzen().m4217a(ado.aD)).booleanValue()) {
                        this.zzams.zzato.f5966o.mo1906a(this.f4348l);
                    }
                    this.zzams.zzato.f5966o.mo1907b();
                } catch (Throwable e) {
                    id.m5371a("Could not show interstitial.", e);
                    zzda();
                }
            } else if (this.zzams.zzato.f5953b == null) {
                id.m5370a("The interstitial failed to load.");
            } else if (this.zzams.zzato.f5953b.mo2170o()) {
                id.m5370a("The interstitial is already showing.");
            } else {
                int i;
                this.zzams.zzato.f5953b.mo2146a(true);
                if (this.zzams.zzato.f5961j != null) {
                    this.f.m6916a(this.zzams.zzatn, this.zzams.zzato);
                }
                ee eeVar = this.zzams.zzato;
                if (eeVar.m5317a()) {
                    Context context = this.zzams.zzaie;
                    jf jfVar = eeVar.f5953b;
                    if (jfVar == null) {
                        throw null;
                    }
                    new xh(context, (View) jfVar).m6989a(eeVar.f5953b);
                } else {
                    eeVar.f5953b.mo2163k().f6291e = new C1411g(this, eeVar);
                }
                if (this.zzams.f4440u) {
                    zzbv.zzea();
                    obj = gb.m5490f(this.zzams.zzaie);
                }
                hp zzew = zzbv.zzew();
                if (obj == null) {
                    id.m5372a(3);
                    i = -1;
                } else {
                    i = zzew.f6218b.getAndIncrement();
                    zzew.f6217a.put(Integer.valueOf(i), obj);
                }
                this.f4345i = i;
                if (!((Boolean) zzbv.zzen().m4217a(ado.bD)).booleanValue() || obj == null) {
                    zzaq com_google_android_gms_ads_internal_zzaq = new zzaq(this.zzams.f4440u, m3739b(), false, 0.0f, -1, this.f4348l);
                    int p = this.zzams.zzato.f5953b.mo2173p();
                    if (p == -1) {
                        p = this.zzams.zzato.f5958g;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.zzams.zzato.f5953b, p, this.zzams.zzatj, this.zzams.zzato.f5977z, com_google_android_gms_ads_internal_zzaq);
                    zzbv.zzdy();
                    zzu.zza(this.zzams.zzaie, adOverlayInfoParcel, true);
                    return;
                }
                new C1412h(this, this.f4345i).m3624h();
            }
        }
    }

    public final void zza(ef efVar, aec com_google_android_gms_internal_aec) {
        if (!((Boolean) zzbv.zzen().m4217a(ado.aE)).booleanValue()) {
            super.zza(efVar, com_google_android_gms_internal_aec);
        } else if (efVar.f5982e != -2) {
            super.zza(efVar, com_google_android_gms_internal_aec);
        } else {
            Object obj = !efVar.f5979b.f7661g ? 1 : null;
            if (zza.m3703a(efVar.f5978a.f7613c) && obj != null) {
                this.zzams.zzatp = m3732a(efVar);
            }
            super.zza(this.zzams.zzatp, com_google_android_gms_internal_aec);
        }
    }

    public final void zza(boolean z, float f) {
        this.f4346j = z;
        this.f4347k = f;
    }

    public final boolean zza(ee eeVar, ee eeVar2) {
        if (!super.zza(eeVar, eeVar2)) {
            return false;
        }
        if (!(this.zzams.zzfd() || this.zzams.f4439t == null || eeVar2.f5961j == null)) {
            this.f.m6917a(this.zzams.zzatn, eeVar2, this.zzams.f4439t);
        }
        return true;
    }

    public final boolean zza(zzix com_google_android_gms_internal_zzix, aec com_google_android_gms_internal_aec) {
        if (this.zzams.zzato != null) {
            id.m5370a("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.f4349m == null && zza.m3703a(com_google_android_gms_internal_zzix) && zzbv.zzez().m5303d(this.zzams.zzaie) && !TextUtils.isEmpty(this.zzams.zzath)) {
            this.f4349m = new dt(this.zzams.zzaie, this.zzams.zzath);
        }
        return super.zza(com_google_android_gms_internal_zzix, com_google_android_gms_internal_aec);
    }

    protected final boolean zza(zzix com_google_android_gms_internal_zzix, ee eeVar, boolean z) {
        if (this.zzams.zzfd() && eeVar.f5953b != null) {
            zzbv.zzec();
            gf.m5508a(eeVar.f5953b);
        }
        return this.d.zzdp();
    }

    public final void zzb(zzaek com_google_android_gms_internal_zzaek) {
        if (this.zzams.zzato != null) {
            if (this.zzams.zzato.f5974w != null) {
                zzbv.zzea();
                gb.m5449a(this.zzams.zzaie, this.zzams.zzatj.f7706a, this.zzams.zzato.f5974w);
            }
            if (this.zzams.zzato.f5972u != null) {
                com_google_android_gms_internal_zzaek = this.zzams.zzato.f5972u;
            }
        }
        zza(com_google_android_gms_internal_zzaek);
    }

    protected final void zzbo() {
        zzda();
        super.zzbo();
    }

    public final void zzbz() {
        super.zzbz();
        this.f.m6914a(this.zzams.zzato);
        if (this.f4349m != null) {
            this.f4349m.m5286a(false);
        }
    }

    public final void zzca() {
        recordImpression();
        super.zzca();
        if (!(this.zzams.zzato == null || this.zzams.zzato.f5953b == null)) {
            jg k = this.zzams.zzato.f5953b.mo2163k();
            if (k != null) {
                k.m5739g();
            }
        }
        if (!(!zzbv.zzez().m5303d(this.zzams.zzaie) || this.zzams.zzato == null || this.zzams.zzato.f5953b == null)) {
            du zzez = zzbv.zzez();
            Context context = this.zzams.zzato.f5953b.getContext();
            String str = this.f4350n;
            if (zzez.m5296a(context) && (context instanceof Activity) && zzez.m5297a(context, "com.google.firebase.analytics.FirebaseAnalytics", zzez.f5929a, false)) {
                Method d = zzez.m5302d(context, "setCurrentScreen");
                try {
                    Activity activity = (Activity) context;
                    d.invoke(zzez.f5929a.get(), new Object[]{activity, str, context.getPackageName()});
                } catch (Exception e) {
                    zzez.m5295a(e, "setCurrentScreen", false);
                }
            }
        }
        if (this.f4349m != null) {
            this.f4349m.m5286a(true);
        }
    }

    public final void zzd(boolean z) {
        this.zzams.f4440u = z;
    }

    public final void zzda() {
        hp zzew = zzbv.zzew();
        zzew.f6217a.remove(Integer.valueOf(this.f4345i));
        if (this.zzams.zzfd()) {
            this.zzams.zzfb();
            this.zzams.zzato = null;
            this.zzams.f4440u = false;
            this.f4344h = false;
        }
    }

    public final void zzdb() {
        if (!(this.zzams.zzato == null || this.zzams.zzato.f5973v == null)) {
            zzbv.zzea();
            gb.m5449a(this.zzams.zzaie, this.zzams.zzatj.f7706a, this.zzams.zzato.f5973v);
        }
        zzbu();
    }
}
