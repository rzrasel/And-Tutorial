package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

@aqv
public final class cp extends eq implements cu, cy {
    final Context f5857a;
    final String f5858b;
    final String f5859c;
    final all f5860d;
    private final ef f5861f;
    private final dc f5862g;
    private final cy f5863h;
    private final Object f5864i;
    private final long f5865j;
    private int f5866k = 0;
    private int f5867l = 3;
    private cs f5868m;

    public cp(Context context, String str, String str2, all com_google_android_gms_internal_all, ef efVar, dc dcVar, cy cyVar, long j) {
        this.f5857a = context;
        this.f5858b = str;
        this.f5859c = str2;
        this.f5860d = com_google_android_gms_internal_all;
        this.f5861f = efVar;
        this.f5862g = dcVar;
        this.f5864i = new Object();
        this.f5863h = cyVar;
        this.f5865j = j;
    }

    private final boolean m5212a(long j) {
        long b = this.f5865j - (zzbv.zzeg().mo1670b() - j);
        if (b <= 0) {
            this.f5867l = 4;
            return false;
        }
        try {
            this.f5864i.wait(b);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f5867l = 5;
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1475a() {
        /*
        r10 = this;
        r9 = 1;
        r8 = 0;
        r0 = r10.f5862g;
        if (r0 == 0) goto L_0x0012;
    L_0x0006:
        r0 = r10.f5862g;
        r0 = r0.f5907b;
        if (r0 == 0) goto L_0x0012;
    L_0x000c:
        r0 = r10.f5862g;
        r0 = r0.f5906a;
        if (r0 != 0) goto L_0x0013;
    L_0x0012:
        return;
    L_0x0013:
        r0 = r10.f5862g;
        r1 = r0.f5907b;
        r1.f5890b = r8;
        r1.f5889a = r10;
        r0 = r10.f5861f;
        r0 = r0.f5978a;
        r0 = r0.f7613c;
        r2 = r10.f5862g;
        r2 = r2.f5906a;
        r3 = r2.mo1912g();	 Catch:{ RemoteException -> 0x0088 }
        if (r3 == 0) goto L_0x007d;
    L_0x002b:
        r3 = com.google.android.gms.internal.hz.f6240a;	 Catch:{ RemoteException -> 0x0088 }
        r4 = new com.google.android.gms.internal.cq;	 Catch:{ RemoteException -> 0x0088 }
        r4.<init>(r10, r0, r2);	 Catch:{ RemoteException -> 0x0088 }
        r3.post(r4);	 Catch:{ RemoteException -> 0x0088 }
    L_0x0035:
        r0 = com.google.android.gms.ads.internal.zzbv.zzeg();
        r2 = r0.mo1670b();
    L_0x003d:
        r4 = r10.f5864i;
        monitor-enter(r4);
        r0 = r10.f5866k;	 Catch:{ all -> 0x00c3 }
        if (r0 == 0) goto L_0x0096;
    L_0x0044:
        r5 = new com.google.android.gms.internal.ct;	 Catch:{ all -> 0x00c3 }
        r5.<init>();	 Catch:{ all -> 0x00c3 }
        r0 = com.google.android.gms.ads.internal.zzbv.zzeg();	 Catch:{ all -> 0x00c3 }
        r6 = r0.mo1670b();	 Catch:{ all -> 0x00c3 }
        r2 = r6 - r2;
        r5.f5883d = r2;	 Catch:{ all -> 0x00c3 }
        r0 = r10.f5866k;	 Catch:{ all -> 0x00c3 }
        if (r9 != r0) goto L_0x0093;
    L_0x0059:
        r0 = 6;
    L_0x005a:
        r5.f5882c = r0;	 Catch:{ all -> 0x00c3 }
        r0 = r10.f5858b;	 Catch:{ all -> 0x00c3 }
        r5.f5880a = r0;	 Catch:{ all -> 0x00c3 }
        r0 = r10.f5860d;	 Catch:{ all -> 0x00c3 }
        r0 = r0.f5283d;	 Catch:{ all -> 0x00c3 }
        r5.f5881b = r0;	 Catch:{ all -> 0x00c3 }
        r0 = r5.m5221a();	 Catch:{ all -> 0x00c3 }
        r10.f5868m = r0;	 Catch:{ all -> 0x00c3 }
        monitor-exit(r4);	 Catch:{ all -> 0x00c3 }
    L_0x006d:
        r1.f5890b = r8;
        r1.f5889a = r8;
        r0 = r10.f5866k;
        if (r0 != r9) goto L_0x00c9;
    L_0x0075:
        r0 = r10.f5863h;
        r1 = r10.f5858b;
        r0.mo2053a(r1);
        goto L_0x0012;
    L_0x007d:
        r3 = com.google.android.gms.internal.hz.f6240a;	 Catch:{ RemoteException -> 0x0088 }
        r4 = new com.google.android.gms.internal.cr;	 Catch:{ RemoteException -> 0x0088 }
        r4.<init>(r10, r2, r0, r1);	 Catch:{ RemoteException -> 0x0088 }
        r3.post(r4);	 Catch:{ RemoteException -> 0x0088 }
        goto L_0x0035;
    L_0x0088:
        r0 = move-exception;
        r2 = "Fail to check if adapter is initialized.";
        com.google.android.gms.internal.id.m5371a(r2, r0);
        r0 = 0;
        r10.mo2052a(r0);
        goto L_0x0035;
    L_0x0093:
        r0 = r10.f5867l;	 Catch:{ all -> 0x00c3 }
        goto L_0x005a;
    L_0x0096:
        r0 = r10.m5212a(r2);	 Catch:{ all -> 0x00c3 }
        if (r0 != 0) goto L_0x00c6;
    L_0x009c:
        r0 = new com.google.android.gms.internal.ct;	 Catch:{ all -> 0x00c3 }
        r0.<init>();	 Catch:{ all -> 0x00c3 }
        r5 = r10.f5867l;	 Catch:{ all -> 0x00c3 }
        r0.f5882c = r5;	 Catch:{ all -> 0x00c3 }
        r5 = com.google.android.gms.ads.internal.zzbv.zzeg();	 Catch:{ all -> 0x00c3 }
        r6 = r5.mo1670b();	 Catch:{ all -> 0x00c3 }
        r2 = r6 - r2;
        r0.f5883d = r2;	 Catch:{ all -> 0x00c3 }
        r2 = r10.f5858b;	 Catch:{ all -> 0x00c3 }
        r0.f5880a = r2;	 Catch:{ all -> 0x00c3 }
        r2 = r10.f5860d;	 Catch:{ all -> 0x00c3 }
        r2 = r2.f5283d;	 Catch:{ all -> 0x00c3 }
        r0.f5881b = r2;	 Catch:{ all -> 0x00c3 }
        r0 = r0.m5221a();	 Catch:{ all -> 0x00c3 }
        r10.f5868m = r0;	 Catch:{ all -> 0x00c3 }
        monitor-exit(r4);	 Catch:{ all -> 0x00c3 }
        goto L_0x006d;
    L_0x00c3:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00c3 }
        throw r0;
    L_0x00c6:
        monitor-exit(r4);	 Catch:{ all -> 0x00c3 }
        goto L_0x003d;
    L_0x00c9:
        r0 = r10.f5863h;
        r1 = r10.f5867l;
        r0.mo2052a(r1);
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cp.a():void");
    }

    public final void mo2052a(int i) {
        synchronized (this.f5864i) {
            this.f5866k = 2;
            this.f5867l = i;
            this.f5864i.notify();
        }
    }

    final void m5215a(zzix com_google_android_gms_internal_zzix, amf com_google_android_gms_internal_amf) {
        this.f5862g.f5907b.f5890b = this;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f5858b)) {
                com_google_android_gms_internal_amf.mo1905a(com_google_android_gms_internal_zzix, this.f5859c, this.f5860d.f5280a);
            } else {
                com_google_android_gms_internal_amf.mo1904a(com_google_android_gms_internal_zzix, this.f5859c);
            }
        } catch (Throwable e) {
            id.m5371a("Fail to load ad from adapter.", e);
            mo2052a(0);
        }
    }

    public final void mo2053a(String str) {
        synchronized (this.f5864i) {
            this.f5866k = 1;
            this.f5864i.notify();
        }
    }

    public final void mo1476b() {
    }

    public final cs m5218c() {
        cs csVar;
        synchronized (this.f5864i) {
            csVar = this.f5868m;
        }
        return csVar;
    }

    public final void mo2054d() {
        m5215a(this.f5861f.f5978a.f7613c, this.f5862g.f5906a);
    }

    public final void mo2055e() {
        mo2052a(0);
    }
}
