package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.common.util.C1536e;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.aan;
import com.google.android.gms.internal.aaq;
import com.google.android.gms.internal.abd;
import com.google.android.gms.internal.abh;
import com.google.android.gms.internal.abn;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aea;
import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.aei;
import com.google.android.gms.internal.ahr;
import com.google.android.gms.internal.aop;
import com.google.android.gms.internal.aou;
import com.google.android.gms.internal.ape;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.aqx;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.dy;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.eh;
import com.google.android.gms.internal.ej;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.eo;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.hz;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.wj;
import com.google.android.gms.internal.wk;
import com.google.android.gms.internal.xy;
import com.google.android.gms.internal.ya;
import com.google.android.gms.internal.yw;
import com.google.android.gms.internal.zk;
import com.google.android.gms.internal.zq;
import com.google.android.gms.internal.zv;
import com.google.android.gms.internal.zzaek;
import com.google.android.gms.internal.zzahj;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.internal.zzle;
import com.google.android.gms.internal.zzmb;
import com.google.android.gms.internal.zzmd;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

@aqv
public abstract class zza extends abd implements zzag, ahr, ape, aqx, en, zq {
    protected aec f4292a;
    protected aea f4293b;
    protected boolean f4294c = false;
    protected final zzbl f4295d;
    protected transient zzix f4296e;
    protected final wj f4297f;
    protected final zzv f4298g;
    private aea f4299h;
    public final zzbw zzams;

    zza(zzbw com_google_android_gms_ads_internal_zzbw, zzv com_google_android_gms_ads_internal_zzv) {
        this.zzams = com_google_android_gms_ads_internal_zzbw;
        this.f4295d = new zzbl(this);
        this.f4298g = com_google_android_gms_ads_internal_zzv;
        gb zzea = zzbv.zzea();
        Context context = this.zzams.zzaie;
        if (!zzea.f6134b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new zzahj(zzea, (byte) 0), intentFilter);
            zzea.f6134b = true;
        }
        zzbv.zzee().m5333a(this.zzams.zzaie, this.zzams.zzatj);
        zzbv.zzef().m7051a(this.zzams.zzaie);
        this.f4297f = zzbv.zzee().f6018c;
        xy zzed = zzbv.zzed();
        context = this.zzams.zzaie;
        synchronized (zzed.f7457a) {
            if (!zzed.f7459c) {
                if (((Boolean) zzbv.zzen().m4217a(ado.au)).booleanValue()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        id.m5370a("Can not cast Context to Application");
                    } else {
                        if (zzed.f7458b == null) {
                            zzed.f7458b = new ya();
                        }
                        ya yaVar = zzed.f7458b;
                        if (!yaVar.f7470e) {
                            application.registerActivityLifecycleCallbacks(yaVar);
                            if (context instanceof Activity) {
                                yaVar.m7026a((Activity) context);
                            }
                            yaVar.f7467b = context;
                            yaVar.f7471f = ((Long) zzbv.zzen().m4217a(ado.av)).longValue();
                            yaVar.f7470e = true;
                        }
                        zzed.f7459c = true;
                    }
                }
            }
        }
        if (((Boolean) zzbv.zzen().m4217a(ado.bW)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new C1469p(this, new CountDownLatch(((Integer) zzbv.zzen().m4217a(ado.bY)).intValue()), timer), 0, ((Long) zzbv.zzen().m4217a(ado.bX)).longValue());
        }
    }

    private static long mo2024a(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException e) {
            id.m5370a("Invalid index for Url fetch time in CSI latency info.");
            return -1;
        } catch (NumberFormatException e2) {
            id.m5370a("Cannot find valid format of Url fetch time in CSI latency info.");
            return -1;
        }
    }

    protected static boolean m3703a(zzix com_google_android_gms_internal_zzix) {
        Bundle bundle = com_google_android_gms_internal_zzix.f7752m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    protected final List<String> m3704a(List<String> list) {
        List arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(dy.m5309a(a, this.zzams.zzaie));
        }
        return arrayList;
    }

    protected void mo1609a() {
        mo1630a(false);
    }

    protected void mo1629a(int i, boolean z) {
        id.m5370a("Failed to load ad: " + i);
        this.f4294c = z;
        if (this.zzams.f4424e != null) {
            try {
                this.zzams.f4424e.mo1689a(i);
            } catch (Throwable e) {
                id.m5371a("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        if (this.zzams.f4437r != null) {
            try {
                this.zzams.f4437r.mo1870a(i);
            } catch (Throwable e2) {
                id.m5371a("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    protected final void m3707a(View view) {
        zzbx com_google_android_gms_ads_internal_zzbx = this.zzams.f4422c;
        if (com_google_android_gms_ads_internal_zzbx != null) {
            com_google_android_gms_ads_internal_zzbx.addView(view, zzbv.zzec().mo2115d());
        }
    }

    protected void mo1630a(boolean z) {
        id.m5372a(4);
        this.f4294c = z;
        if (this.zzams.f4424e != null) {
            try {
                this.zzams.f4424e.mo1691c();
            } catch (Throwable e) {
                id.m5371a("Could not call AdListener.onAdLoaded().", e);
            }
        }
        if (this.zzams.f4437r != null) {
            try {
                this.zzams.f4437r.mo1869a();
            } catch (Throwable e2) {
                id.m5371a("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    boolean mo1588a(ee eeVar) {
        return false;
    }

    protected boolean mo1589b(zzix com_google_android_gms_internal_zzix) {
        if (this.zzams.f4422c == null) {
            return false;
        }
        ViewParent parent = this.zzams.f4422c.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzbv.zzea();
        return gb.m5459a(view, view.getContext());
    }

    public void destroy() {
        C1516t.m3867b("destroy must be called on the main UI thread.");
        this.f4295d.cancel();
        wj wjVar = this.f4297f;
        ee eeVar = this.zzams.zzato;
        synchronized (wjVar.f7330a) {
            wk wkVar = (wk) wjVar.f7331b.get(eeVar);
            if (wkVar != null) {
                wkVar.m6940d();
            }
        }
        zzbw com_google_android_gms_ads_internal_zzbw = this.zzams;
        if (com_google_android_gms_ads_internal_zzbw.f4422c != null) {
            com_google_android_gms_ads_internal_zzbw.f4422c.zzfh();
        }
        com_google_android_gms_ads_internal_zzbw.f4424e = null;
        com_google_android_gms_ads_internal_zzbw.f4425f = null;
        com_google_android_gms_ads_internal_zzbw.f4436q = null;
        com_google_android_gms_ads_internal_zzbw.f4426g = null;
        com_google_android_gms_ads_internal_zzbw.zzf(false);
        if (com_google_android_gms_ads_internal_zzbw.f4422c != null) {
            com_google_android_gms_ads_internal_zzbw.f4422c.removeAllViews();
        }
        com_google_android_gms_ads_internal_zzbw.zzfb();
        com_google_android_gms_ads_internal_zzbw.zzfc();
        com_google_android_gms_ads_internal_zzbw.zzato = null;
    }

    public String getAdUnitId() {
        return this.zzams.zzath;
    }

    public abv getVideoController() {
        return null;
    }

    public final boolean isLoading() {
        return this.f4294c;
    }

    public final boolean isReady() {
        C1516t.m3867b("isLoaded must be called on the main UI thread.");
        return this.zzams.zzatl == null && this.zzams.zzatm == null && this.zzams.zzato != null;
    }

    public void onAdClicked() {
        if (this.zzams.zzato == null) {
            id.m5370a("Ad state was null when trying to ping click URLs.");
            return;
        }
        id.m5372a(3);
        if (this.zzams.zzatq != null) {
            eg egVar = this.zzams.zzatq;
            synchronized (egVar.f5989c) {
                if (egVar.f5996j != -1) {
                    eh ehVar = new eh();
                    ehVar.f5999a = SystemClock.elapsedRealtime();
                    egVar.f5988b.add(ehVar);
                    egVar.f5994h++;
                    em d = egVar.f5987a.m5345d();
                    synchronized (d.f6054f) {
                        d.f6055g++;
                    }
                    egVar.f5987a.m5335a(egVar);
                }
            }
        }
        if (this.zzams.zzato.f5954c != null) {
            zzbv.zzea();
            gb.m5449a(this.zzams.zzaie, this.zzams.zzatj.f7706a, m3704a(this.zzams.zzato.f5954c));
        }
        if (this.zzams.f4423d != null) {
            try {
                this.zzams.f4423d.mo1687a();
            } catch (Throwable e) {
                id.m5371a("Could not notify onAdClicked event.", e);
            }
        }
    }

    public final void onAppEvent(String str, String str2) {
        if (this.zzams.f4425f != null) {
            try {
                this.zzams.f4425f.mo1683a(str, str2);
            } catch (Throwable e) {
                id.m5371a("Could not call the AppEventListener.", e);
            }
        }
    }

    public void pause() {
        C1516t.m3867b("pause must be called on the main UI thread.");
    }

    public void resume() {
        C1516t.m3867b("resume must be called on the main UI thread.");
    }

    public void setImmersiveMode(boolean z) {
        throw new IllegalStateException("onImmersiveModeUpdated is not supported for current ad type");
    }

    public void setManualImpressionsEnabled(boolean z) {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public final void setUserId(String str) {
        id.m5370a("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    public final void stopLoading() {
        C1516t.m3867b("stopLoading must be called on the main UI thread.");
        this.f4294c = false;
        this.zzams.zzf(true);
    }

    public final void zza(aan com_google_android_gms_internal_aan) {
        C1516t.m3867b("setAdListener must be called on the main UI thread.");
        this.zzams.f4423d = com_google_android_gms_internal_aan;
    }

    public final void zza(aaq com_google_android_gms_internal_aaq) {
        C1516t.m3867b("setAdListener must be called on the main UI thread.");
        this.zzams.f4424e = com_google_android_gms_internal_aaq;
    }

    public final void zza(abh com_google_android_gms_internal_abh) {
        C1516t.m3867b("setAppEventListener must be called on the main UI thread.");
        this.zzams.f4425f = com_google_android_gms_internal_abh;
    }

    public final void zza(abn com_google_android_gms_internal_abn) {
        C1516t.m3867b("setCorrelationIdProvider must be called on the main UI thread");
        this.zzams.f4426g = com_google_android_gms_internal_abn;
    }

    public final void zza(aea com_google_android_gms_internal_aea) {
        this.f4292a = new aec(((Boolean) zzbv.zzen().m4217a(ado.f4868G)).booleanValue(), "load_ad", this.zzams.zzatn.f7758a);
        this.f4299h = new aea(-1, null, null);
        if (com_google_android_gms_internal_aea == null) {
            this.f4293b = new aea(-1, null, null);
        } else {
            this.f4293b = new aea(com_google_android_gms_internal_aea.f4942a, com_google_android_gms_internal_aea.f4943b, com_google_android_gms_internal_aea.f4944c);
        }
    }

    public void zza(aei com_google_android_gms_internal_aei) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void zza(aop com_google_android_gms_internal_aop) {
        id.m5370a("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void zza(aou com_google_android_gms_internal_aou, String str) {
        id.m5370a("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    public final void zza(ch chVar) {
        C1516t.m3867b("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzams.f4437r = chVar;
    }

    public final void zza(ef efVar) {
        if (!(efVar.f5979b.f7667m == -1 || TextUtils.isEmpty(efVar.f5979b.f7677w))) {
            long a = mo2024a(efVar.f5979b.f7677w);
            if (a != -1) {
                aea a2 = this.f4292a.m4234a(a + efVar.f5979b.f7667m);
                this.f4292a.m4237a(a2, "stc");
            }
        }
        aec com_google_android_gms_internal_aec = this.f4292a;
        String str = efVar.f5979b.f7677w;
        if (com_google_android_gms_internal_aec.f4947a) {
            synchronized (com_google_android_gms_internal_aec.f4948b) {
                com_google_android_gms_internal_aec.f4949c = str;
            }
        }
        this.f4292a.m4237a(this.f4293b, "arf");
        this.f4299h = this.f4292a.m4233a();
        this.f4292a.m4235a("gqi", efVar.f5979b.f7678x);
        this.zzams.zzatl = null;
        this.zzams.zzatp = efVar;
        efVar.f5986i.m7067a(new af(efVar));
        zk zkVar = efVar.f5986i;
        if (zkVar.f7545b) {
            zkVar.f7544a = true;
            zkVar.m7068b();
        }
        zza(efVar, this.f4292a);
    }

    public abstract void zza(ef efVar, aec com_google_android_gms_internal_aec);

    public final void zza(zzaek com_google_android_gms_internal_zzaek) {
        if (this.zzams.f4437r != null) {
            try {
                String str = "";
                int i = 1;
                if (com_google_android_gms_internal_zzaek != null) {
                    str = com_google_android_gms_internal_zzaek.f7696a;
                    i = com_google_android_gms_internal_zzaek.f7697b;
                }
                this.zzams.f4437r.mo1871a(new bt(str, i));
            } catch (Throwable e) {
                id.m5371a("Could not call RewardedVideoAdListener.onRewarded().", e);
            }
        }
    }

    public final void zza(zzjb com_google_android_gms_internal_zzjb) {
        C1516t.m3867b("setAdSize must be called on the main UI thread.");
        this.zzams.zzatn = com_google_android_gms_internal_zzjb;
        if (!(this.zzams.zzato == null || this.zzams.zzato.f5953b == null || this.zzams.zzauj != 0)) {
            this.zzams.zzato.f5953b.mo2143a(com_google_android_gms_internal_zzjb);
        }
        if (this.zzams.f4422c != null) {
            if (this.zzams.f4422c.getChildCount() > 1) {
                this.zzams.f4422c.removeView(this.zzams.f4422c.getNextView());
            }
            this.zzams.f4422c.setMinimumWidth(com_google_android_gms_internal_zzjb.f7763f);
            this.zzams.f4422c.setMinimumHeight(com_google_android_gms_internal_zzjb.f7760c);
            this.zzams.f4422c.requestLayout();
        }
    }

    public final void zza(zzle com_google_android_gms_internal_zzle) {
        C1516t.m3867b("setIconAdOptions must be called on the main UI thread.");
        this.zzams.f4433n = com_google_android_gms_internal_zzle;
    }

    public final void zza(zzmd com_google_android_gms_internal_zzmd) {
        C1516t.m3867b("setVideoOptions must be called on the main UI thread.");
        this.zzams.f4432m = com_google_android_gms_internal_zzmd;
    }

    public final void zza(HashSet<eg> hashSet) {
        this.zzams.zza(hashSet);
    }

    public abstract boolean zza(ee eeVar, ee eeVar2);

    protected abstract boolean zza(zzix com_google_android_gms_internal_zzix, aec com_google_android_gms_internal_aec);

    public void zzb(ee eeVar) {
        this.f4292a.m4237a(this.f4299h, "awr");
        this.zzams.zzatm = null;
        if (!(eeVar.f5955d == -2 || eeVar.f5955d == 3 || this.zzams.zzfa() == null)) {
            ej zzee = zzbv.zzee();
            Collection zzfa = this.zzams.zzfa();
            synchronized (zzee.f6016a) {
                zzee.f6019d.addAll(zzfa);
            }
        }
        if (eeVar.f5955d == -1) {
            this.f4294c = false;
            return;
        }
        if (mo1588a(eeVar)) {
            id.m5372a(3);
        }
        if (eeVar.f5955d != -2) {
            zzg(eeVar.f5955d);
            return;
        }
        if (this.zzams.zzauh == null) {
            this.zzams.zzauh = new eo(this.zzams.zzath);
        }
        this.f4297f.m6914a(this.zzams.zzato);
        if (zza(this.zzams.zzato, eeVar)) {
            this.zzams.zzato = eeVar;
            zzbw com_google_android_gms_ads_internal_zzbw = this.zzams;
            if (com_google_android_gms_ads_internal_zzbw.zzatq != null) {
                eg egVar;
                if (com_google_android_gms_ads_internal_zzbw.zzato != null) {
                    egVar = com_google_android_gms_ads_internal_zzbw.zzatq;
                    long j = com_google_android_gms_ads_internal_zzbw.zzato.f5975x;
                    synchronized (egVar.f5989c) {
                        egVar.f5996j = j;
                        if (egVar.f5996j != -1) {
                            egVar.f5987a.m5335a(egVar);
                        }
                    }
                    egVar = com_google_android_gms_ads_internal_zzbw.zzatq;
                    j = com_google_android_gms_ads_internal_zzbw.zzato.f5976y;
                    synchronized (egVar.f5989c) {
                        if (egVar.f5996j != -1) {
                            egVar.f5990d = j;
                            egVar.f5987a.m5335a(egVar);
                        }
                    }
                    egVar = com_google_android_gms_ads_internal_zzbw.zzatq;
                    boolean z = com_google_android_gms_ads_internal_zzbw.zzato.f5964m;
                    synchronized (egVar.f5989c) {
                        if (egVar.f5996j != -1) {
                            egVar.f5992f = z;
                            egVar.f5987a.m5335a(egVar);
                        }
                    }
                }
                egVar = com_google_android_gms_ads_internal_zzbw.zzatq;
                boolean z2 = com_google_android_gms_ads_internal_zzbw.zzatn.f7761d;
                synchronized (egVar.f5989c) {
                    if (egVar.f5996j != -1) {
                        egVar.f5993g = SystemClock.elapsedRealtime();
                        if (!z2) {
                            egVar.f5991e = egVar.f5993g;
                            egVar.f5987a.m5335a(egVar);
                        }
                    }
                }
            }
            this.f4292a.m4235a("is_mraid", this.zzams.zzato.m5317a() ? "1" : "0");
            this.f4292a.m4235a("is_mediation", this.zzams.zzato.f5964m ? "1" : "0");
            if (!(this.zzams.zzato.f5953b == null || this.zzams.zzato.f5953b.mo2163k() == null)) {
                this.f4292a.m4235a("is_delay_pl", this.zzams.zzato.f5953b.mo2163k().m5737e() ? "1" : "0");
            }
            this.f4292a.m4237a(this.f4293b, "ttc");
            if (zzbv.zzee().m5347e() != null) {
                zzbv.zzee().m5347e().m4224a(this.f4292a);
            }
            zzbv();
            if (this.zzams.zzfd()) {
                mo1609a();
            }
        }
        if (eeVar.f5947F != null) {
            zzbv.zzea();
            gb.m5450a(this.zzams.zzaie, eeVar.f5947F);
        }
    }

    public boolean zzb(zzix com_google_android_gms_internal_zzix) {
        zzix com_google_android_gms_internal_zzix2;
        C1516t.m3867b("loadAd must be called on the main UI thread.");
        yw zzef = zzbv.zzef();
        if (((Boolean) zzbv.zzen().m4217a(ado.co)).booleanValue()) {
            synchronized (zzef.f7533b) {
                zzef.m7050a();
                zzbv.zzea();
                gb.f6131a.removeCallbacks(zzef.f7532a);
                zzbv.zzea();
                gb.f6131a.postDelayed(zzef.f7532a, ((Long) zzbv.zzen().m4217a(ado.cp)).longValue());
            }
        }
        if (((Boolean) zzbv.zzen().m4217a(ado.aB)).booleanValue()) {
            zzix.m7104a(com_google_android_gms_internal_zzix);
        }
        if (!C1536e.m3938a(this.zzams.zzaie) || com_google_android_gms_internal_zzix.f7750k == null) {
            com_google_android_gms_internal_zzix2 = com_google_android_gms_internal_zzix;
        } else {
            zv zvVar = new zv(com_google_android_gms_internal_zzix);
            zvVar.f7573j = null;
            com_google_android_gms_internal_zzix2 = new zzix(7, zvVar.f7564a, zvVar.f7565b, zvVar.f7566c, zvVar.f7567d, zvVar.f7568e, zvVar.f7569f, zvVar.f7570g, zvVar.f7571h, zvVar.f7572i, zvVar.f7573j, zvVar.f7574k, zvVar.f7575l, zvVar.f7576m, zvVar.f7577n, zvVar.f7578o, zvVar.f7579p, false);
        }
        if (this.zzams.zzatl == null && this.zzams.zzatm == null) {
            id.m5372a(4);
            zza(null);
            this.f4293b = this.f4292a.m4233a();
            if (com_google_android_gms_internal_zzix2.f7745f) {
                id.m5372a(4);
            } else {
                aak.m4022a();
                String a = hz.m5614a(this.zzams.zzaie);
                new StringBuilder(String.valueOf(a).length() + 71).append("Use AdRequest.Builder.addTestDevice(\"").append(a).append("\") to get test ads on this device.");
                id.m5372a(4);
            }
            this.f4295d.zzf(com_google_android_gms_internal_zzix2);
            this.f4294c = zza(com_google_android_gms_internal_zzix2, this.f4292a);
            return this.f4294c;
        }
        if (this.f4296e != null) {
            id.m5370a("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        } else {
            id.m5370a("Loading already in progress, saving this object for future refreshes.");
        }
        this.f4296e = com_google_android_gms_internal_zzix2;
        return false;
    }

    public final zzv zzbj() {
        return this.f4298g;
    }

    public final C1398a zzbk() {
        C1516t.m3867b("getAdFrame must be called on the main UI thread.");
        return C1401c.m3584a(this.zzams.f4422c);
    }

    public final zzjb zzbl() {
        C1516t.m3867b("getAdSize must be called on the main UI thread.");
        return this.zzams.zzatn == null ? null : new zzmb(this.zzams.zzatn);
    }

    public final void zzbm() {
        zzbp();
    }

    public final void zzbn() {
        C1516t.m3867b("recordManualImpression must be called on the main UI thread.");
        if (this.zzams.zzato == null) {
            id.m5370a("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        id.m5372a(3);
        if (!this.zzams.zzato.f5945D) {
            List arrayList = new ArrayList();
            if (this.zzams.zzato.f5957f != null) {
                arrayList.addAll(this.zzams.zzato.f5957f);
            }
            if (!(this.zzams.zzato.f5965n == null || this.zzams.zzato.f5965n.f5287h == null)) {
                arrayList.addAll(this.zzams.zzato.f5965n.f5287h);
            }
            if (!arrayList.isEmpty()) {
                zzbv.zzea();
                gb.m5449a(this.zzams.zzaie, this.zzams.zzatj.f7706a, arrayList);
                this.zzams.zzato.f5945D = true;
            }
        }
    }

    public void zzbo() {
        id.m5372a(4);
        if (this.zzams.f4424e != null) {
            try {
                this.zzams.f4424e.mo1688a();
            } catch (Throwable e) {
                id.m5371a("Could not call AdListener.onAdClosed().", e);
            }
        }
        if (this.zzams.f4437r != null) {
            try {
                this.zzams.f4437r.mo1874d();
            } catch (Throwable e2) {
                id.m5371a("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    public final void zzbp() {
        id.m5372a(4);
        if (this.zzams.f4424e != null) {
            try {
                this.zzams.f4424e.mo1690b();
            } catch (Throwable e) {
                id.m5371a("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        if (this.zzams.f4437r != null) {
            try {
                this.zzams.f4437r.mo1875e();
            } catch (Throwable e2) {
                id.m5371a("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    public final void zzbq() {
        id.m5372a(4);
        if (this.zzams.f4424e != null) {
            try {
                this.zzams.f4424e.mo1692d();
            } catch (Throwable e) {
                id.m5371a("Could not call AdListener.onAdOpened().", e);
            }
        }
        if (this.zzams.f4437r != null) {
            try {
                this.zzams.f4437r.mo1872b();
            } catch (Throwable e2) {
                id.m5371a("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    public final void zzbs() {
        id.m5372a(4);
        if (this.zzams.f4424e != null) {
            try {
                this.zzams.f4424e.mo1694f();
            } catch (Throwable e) {
                id.m5371a("Could not call AdListener.onAdImpression().", e);
            }
        }
    }

    public final void zzbt() {
        id.m5372a(4);
        if (this.zzams.f4424e != null) {
            try {
                this.zzams.f4424e.mo1693e();
            } catch (Throwable e) {
                id.m5371a("Could not call AdListener.onAdClicked().", e);
            }
        }
    }

    public final void zzbu() {
        if (this.zzams.f4437r != null) {
            try {
                this.zzams.f4437r.mo1873c();
            } catch (Throwable e) {
                id.m5371a("Could not call RewardedVideoAdListener.onVideoStarted().", e);
            }
        }
    }

    public final void zzbv() {
        ee eeVar = this.zzams.zzato;
        if (eeVar != null && !TextUtils.isEmpty(eeVar.f5942A) && !eeVar.f5946E && zzbv.zzej().m5574b()) {
            id.m5372a(3);
            gx zzej = zzbv.zzej();
            Context context = this.zzams.zzaie;
            String str = this.zzams.zzatj.f7706a;
            String str2 = eeVar.f5942A;
            Builder buildUpon = zzej.m5571a(context, (String) zzbv.zzen().m4217a(ado.cy), this.zzams.zzath, str).buildUpon();
            buildUpon.appendQueryParameter("debugData", str2);
            zzbv.zzea();
            gb.m5472b(context, str, buildUpon.build().toString());
            eeVar.f5946E = true;
        }
    }

    public final abh zzbw() {
        return this.zzams.f4425f;
    }

    public final aaq zzbx() {
        return this.zzams.f4424e;
    }

    public void zzg(int i) {
        mo1629a(i, false);
    }
}
