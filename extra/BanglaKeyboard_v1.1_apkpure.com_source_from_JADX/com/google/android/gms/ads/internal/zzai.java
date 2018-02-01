package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.p018f.C0477m;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.aaq;
import com.google.android.gms.internal.aau;
import com.google.android.gms.internal.abn;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.agt;
import com.google.android.gms.internal.agx;
import com.google.android.gms.internal.aha;
import com.google.android.gms.internal.ahd;
import com.google.android.gms.internal.ahg;
import com.google.android.gms.internal.amc;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.internal.zzot;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@aqv
public final class zzai extends aau {
    private final Context f4309a;
    private final aaq f4310b;
    private final amc f4311c;
    private final agt f4312d;
    private final agx f4313e;
    private final ahg f4314f;
    private final zzjb f4315g;
    private final PublisherAdViewOptions f4316h;
    private final C0477m<String, ahd> f4317i;
    private final C0477m<String, aha> f4318j;
    private final zzot f4319k;
    private final List<String> f4320l;
    private final abn f4321m;
    private final String f4322n;
    private final zzajk f4323o;
    private WeakReference<zzd> f4324p;
    private final zzv f4325q;
    private final Object f4326r = new Object();

    zzai(Context context, String str, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk, aaq com_google_android_gms_internal_aaq, agt com_google_android_gms_internal_agt, agx com_google_android_gms_internal_agx, C0477m<String, ahd> c0477m, C0477m<String, aha> c0477m2, zzot com_google_android_gms_internal_zzot, abn com_google_android_gms_internal_abn, zzv com_google_android_gms_ads_internal_zzv, ahg com_google_android_gms_internal_ahg, zzjb com_google_android_gms_internal_zzjb, PublisherAdViewOptions publisherAdViewOptions) {
        this.f4309a = context;
        this.f4322n = str;
        this.f4311c = com_google_android_gms_internal_amc;
        this.f4323o = com_google_android_gms_internal_zzajk;
        this.f4310b = com_google_android_gms_internal_aaq;
        this.f4313e = com_google_android_gms_internal_agx;
        this.f4312d = com_google_android_gms_internal_agt;
        this.f4317i = c0477m;
        this.f4318j = c0477m2;
        this.f4319k = com_google_android_gms_internal_zzot;
        this.f4320l = m3722b();
        this.f4321m = com_google_android_gms_internal_abn;
        this.f4325q = com_google_android_gms_ads_internal_zzv;
        this.f4314f = com_google_android_gms_internal_ahg;
        this.f4315g = com_google_android_gms_internal_zzjb;
        this.f4316h = publisherAdViewOptions;
        ado.m4219a(this.f4309a);
    }

    static /* synthetic */ void m3718a(zzai com_google_android_gms_ads_internal_zzai, zzix com_google_android_gms_internal_zzix) {
        zza com_google_android_gms_ads_internal_zzq = new zzq(com_google_android_gms_ads_internal_zzai.f4309a, com_google_android_gms_ads_internal_zzai.f4325q, com_google_android_gms_ads_internal_zzai.f4315g, com_google_android_gms_ads_internal_zzai.f4322n, com_google_android_gms_ads_internal_zzai.f4311c, com_google_android_gms_ads_internal_zzai.f4323o);
        com_google_android_gms_ads_internal_zzai.f4324p = new WeakReference(com_google_android_gms_ads_internal_zzq);
        ahg com_google_android_gms_internal_ahg = com_google_android_gms_ads_internal_zzai.f4314f;
        C1516t.m3867b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
        com_google_android_gms_ads_internal_zzq.zzams.f4434o = com_google_android_gms_internal_ahg;
        if (com_google_android_gms_ads_internal_zzai.f4316h != null) {
            if (com_google_android_gms_ads_internal_zzai.f4316h.zzbh() != null) {
                com_google_android_gms_ads_internal_zzq.zza(com_google_android_gms_ads_internal_zzai.f4316h.zzbh());
            }
            com_google_android_gms_ads_internal_zzq.setManualImpressionsEnabled(com_google_android_gms_ads_internal_zzai.f4316h.getManualImpressionsEnabled());
        }
        agt com_google_android_gms_internal_agt = com_google_android_gms_ads_internal_zzai.f4312d;
        C1516t.m3867b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        com_google_android_gms_ads_internal_zzq.zzams.f4427h = com_google_android_gms_internal_agt;
        agx com_google_android_gms_internal_agx = com_google_android_gms_ads_internal_zzai.f4313e;
        C1516t.m3867b("setOnContentAdLoadedListener must be called on the main UI thread.");
        com_google_android_gms_ads_internal_zzq.zzams.f4428i = com_google_android_gms_internal_agx;
        C0477m c0477m = com_google_android_gms_ads_internal_zzai.f4317i;
        C1516t.m3867b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        com_google_android_gms_ads_internal_zzq.zzams.f4430k = c0477m;
        c0477m = com_google_android_gms_ads_internal_zzai.f4318j;
        C1516t.m3867b("setOnCustomClickListener must be called on the main UI thread.");
        com_google_android_gms_ads_internal_zzq.zzams.f4429j = c0477m;
        zzot com_google_android_gms_internal_zzot = com_google_android_gms_ads_internal_zzai.f4319k;
        C1516t.m3867b("setNativeAdOptions must be called on the main UI thread.");
        com_google_android_gms_ads_internal_zzq.zzams.f4431l = com_google_android_gms_internal_zzot;
        com_google_android_gms_ads_internal_zzq.zzc(com_google_android_gms_ads_internal_zzai.m3722b());
        com_google_android_gms_ads_internal_zzq.zza(com_google_android_gms_ads_internal_zzai.f4310b);
        com_google_android_gms_ads_internal_zzq.zza(com_google_android_gms_ads_internal_zzai.f4321m);
        List arrayList = new ArrayList();
        if (com_google_android_gms_ads_internal_zzai.m3721a()) {
            arrayList.add(Integer.valueOf(1));
        }
        if (com_google_android_gms_ads_internal_zzai.f4314f != null) {
            arrayList.add(Integer.valueOf(2));
        }
        com_google_android_gms_ads_internal_zzq.zzd(arrayList);
        if (com_google_android_gms_ads_internal_zzai.m3721a()) {
            com_google_android_gms_internal_zzix.f7742c.putBoolean("ina", true);
        }
        if (com_google_android_gms_ads_internal_zzai.f4314f != null) {
            com_google_android_gms_internal_zzix.f7742c.putBoolean("iba", true);
        }
        com_google_android_gms_ads_internal_zzq.zzb(com_google_android_gms_internal_zzix);
    }

    static /* synthetic */ void m3719a(zzai com_google_android_gms_ads_internal_zzai, zzix com_google_android_gms_internal_zzix, int i) {
        zza com_google_android_gms_ads_internal_zzbc = new zzbc(com_google_android_gms_ads_internal_zzai.f4309a, com_google_android_gms_ads_internal_zzai.f4325q, zzjb.m7106a(), com_google_android_gms_ads_internal_zzai.f4322n, com_google_android_gms_ads_internal_zzai.f4311c, com_google_android_gms_ads_internal_zzai.f4323o);
        com_google_android_gms_ads_internal_zzai.f4324p = new WeakReference(com_google_android_gms_ads_internal_zzbc);
        agt com_google_android_gms_internal_agt = com_google_android_gms_ads_internal_zzai.f4312d;
        C1516t.m3867b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        com_google_android_gms_ads_internal_zzbc.zzams.f4427h = com_google_android_gms_internal_agt;
        agx com_google_android_gms_internal_agx = com_google_android_gms_ads_internal_zzai.f4313e;
        C1516t.m3867b("setOnContentAdLoadedListener must be called on the main UI thread.");
        com_google_android_gms_ads_internal_zzbc.zzams.f4428i = com_google_android_gms_internal_agx;
        C0477m c0477m = com_google_android_gms_ads_internal_zzai.f4317i;
        C1516t.m3867b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        com_google_android_gms_ads_internal_zzbc.zzams.f4430k = c0477m;
        com_google_android_gms_ads_internal_zzbc.zza(com_google_android_gms_ads_internal_zzai.f4310b);
        c0477m = com_google_android_gms_ads_internal_zzai.f4318j;
        C1516t.m3867b("setOnCustomClickListener must be called on the main UI thread.");
        com_google_android_gms_ads_internal_zzbc.zzams.f4429j = c0477m;
        com_google_android_gms_ads_internal_zzbc.zzc(com_google_android_gms_ads_internal_zzai.m3722b());
        zzot com_google_android_gms_internal_zzot = com_google_android_gms_ads_internal_zzai.f4319k;
        C1516t.m3867b("setNativeAdOptions must be called on the main UI thread.");
        com_google_android_gms_ads_internal_zzbc.zzams.f4431l = com_google_android_gms_internal_zzot;
        com_google_android_gms_ads_internal_zzbc.zza(com_google_android_gms_ads_internal_zzai.f4321m);
        com_google_android_gms_ads_internal_zzbc.zzh(i);
        com_google_android_gms_ads_internal_zzbc.zzb(com_google_android_gms_internal_zzix);
    }

    private static void m3720a(Runnable runnable) {
        gb.f6131a.post(runnable);
    }

    private final boolean m3721a() {
        return (this.f4312d == null && this.f4313e == null && (this.f4317i == null || this.f4317i.size() <= 0)) ? false : true;
    }

    private final List<String> m3722b() {
        List<String> arrayList = new ArrayList();
        if (this.f4313e != null) {
            arrayList.add("1");
        }
        if (this.f4312d != null) {
            arrayList.add("2");
        }
        if (this.f4317i.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    static /* synthetic */ boolean m3723b(zzai com_google_android_gms_ads_internal_zzai) {
        return ((Boolean) zzbv.zzen().m4217a(ado.aA)).booleanValue() && com_google_android_gms_ads_internal_zzai.f4314f != null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMediationAdapterClassName() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.f4326r;
        monitor-enter(r2);
        r0 = r3.f4324p;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.f4324p;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.zzd) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.getMediationAdapterClassName();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzai.getMediationAdapterClassName():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isLoading() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.f4326r;
        monitor-enter(r2);
        r0 = r3.f4324p;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.f4324p;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.zzd) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.isLoading();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzai.isLoading():boolean");
    }

    public final void zza(zzix com_google_android_gms_internal_zzix, int i) {
        int intValue = ((Integer) zzbv.zzen().m4217a(ado.bU)).intValue();
        if (i > intValue) {
            throw new IllegalArgumentException("Cannot request more than " + intValue + " ads at once");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Number of ads has to be more than 0");
        } else {
            m3720a(new C1410f(this, com_google_android_gms_internal_zzix, i));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzch() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.f4326r;
        monitor-enter(r2);
        r0 = r3.f4324p;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.f4324p;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.zzd) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.zzch();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzai.zzch():java.lang.String");
    }

    public final void zzd(zzix com_google_android_gms_internal_zzix) {
        m3720a(new C1409e(this, com_google_android_gms_internal_zzix));
    }
}
