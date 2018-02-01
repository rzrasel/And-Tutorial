package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@aqv
public final class alv implements alk {
    final long f5348a;
    final long f5349b;
    final Object f5350c = new Object();
    boolean f5351d = false;
    final Map<il<als>, alp> f5352e = new HashMap();
    private final zzaak f5353f;
    private final amc f5354g;
    private final Context f5355h;
    private final alm f5356i;
    private final boolean f5357j;
    private final int f5358k;
    private final boolean f5359l;
    private final String f5360m;
    private List<als> f5361n = new ArrayList();

    public alv(Context context, zzaak com_google_android_gms_internal_zzaak, amc com_google_android_gms_internal_amc, alm com_google_android_gms_internal_alm, boolean z, boolean z2, String str, long j, long j2) {
        this.f5355h = context;
        this.f5353f = com_google_android_gms_internal_zzaak;
        this.f5354g = com_google_android_gms_internal_amc;
        this.f5356i = com_google_android_gms_internal_alm;
        this.f5357j = z;
        this.f5359l = z2;
        this.f5360m = str;
        this.f5348a = j;
        this.f5349b = j2;
        this.f5358k = 2;
    }

    private final void m4729a(il<als> ilVar) {
        gb.f6131a.post(new alx(this, ilVar));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.als m4730b(java.util.List<com.google.android.gms.internal.il<com.google.android.gms.internal.als>> r5) {
        /*
        r4 = this;
        r2 = r4.f5350c;
        monitor-enter(r2);
        r0 = r4.f5351d;	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x000f;
    L_0x0007:
        r1 = new com.google.android.gms.internal.als;	 Catch:{ all -> 0x003c }
        r0 = -1;
        r1.<init>(r0);	 Catch:{ all -> 0x003c }
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
    L_0x000e:
        return r1;
    L_0x000f:
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        r2 = r5.iterator();
    L_0x0014:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x003f;
    L_0x001a:
        r0 = r2.next();
        r0 = (com.google.android.gms.internal.il) r0;
        r1 = r0.get();	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        r1 = (com.google.android.gms.internal.als) r1;	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        r3 = r4.f5361n;	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        r3.add(r1);	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        if (r1 == 0) goto L_0x0014;
    L_0x002d:
        r3 = r1.f5341a;	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        if (r3 != 0) goto L_0x0014;
    L_0x0031:
        r4.m4729a(r0);	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        goto L_0x000e;
    L_0x0035:
        r0 = move-exception;
    L_0x0036:
        r1 = "Exception while processing an adapter; continuing with other adapters";
        com.google.android.gms.internal.id.m5371a(r1, r0);
        goto L_0x0014;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        throw r0;
    L_0x003f:
        r0 = 0;
        r4.m4729a(r0);
        r1 = new com.google.android.gms.internal.als;
        r0 = 1;
        r1.<init>(r0);
        goto L_0x000e;
    L_0x004a:
        r0 = move-exception;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.alv.b(java.util.List):com.google.android.gms.internal.als");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.als m4731c(java.util.List<com.google.android.gms.internal.il<com.google.android.gms.internal.als>> r16) {
        /*
        r15 = this;
        r1 = r15.f5350c;
        monitor-enter(r1);
        r0 = r15.f5351d;	 Catch:{ all -> 0x007e }
        if (r0 == 0) goto L_0x000f;
    L_0x0007:
        r2 = new com.google.android.gms.internal.als;	 Catch:{ all -> 0x007e }
        r0 = -1;
        r2.<init>(r0);	 Catch:{ all -> 0x007e }
        monitor-exit(r1);	 Catch:{ all -> 0x007e }
    L_0x000e:
        return r2;
    L_0x000f:
        monitor-exit(r1);	 Catch:{ all -> 0x007e }
        r4 = -1;
        r3 = 0;
        r2 = 0;
        r0 = r15.f5356i;
        r0 = r0.f5310m;
        r6 = -1;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x0081;
    L_0x001d:
        r0 = r15.f5356i;
        r0 = r0.f5310m;
    L_0x0021:
        r8 = r16.iterator();
        r6 = r0;
    L_0x0026:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x00b8;
    L_0x002c:
        r0 = r8.next();
        r0 = (com.google.android.gms.internal.il) r0;
        r1 = com.google.android.gms.ads.internal.zzbv.zzeg();
        r10 = r1.mo1669a();
        r12 = 0;
        r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r1 != 0) goto L_0x0084;
    L_0x0040:
        r1 = r0.isDone();	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        if (r1 == 0) goto L_0x0084;
    L_0x0046:
        r1 = r0.get();	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        r1 = (com.google.android.gms.internal.als) r1;	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
    L_0x004c:
        r5 = r15.f5361n;	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        r5.add(r1);	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        if (r1 == 0) goto L_0x00cb;
    L_0x0053:
        r5 = r1.f5341a;	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        if (r5 != 0) goto L_0x00cb;
    L_0x0057:
        r5 = r1.f5346f;	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        if (r5 == 0) goto L_0x00cb;
    L_0x005b:
        r9 = r5.mo1889a();	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        if (r9 <= r4) goto L_0x00cb;
    L_0x0061:
        r2 = r5.mo1889a();	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        r14 = r1;
        r1 = r0;
        r0 = r14;
    L_0x0068:
        r3 = com.google.android.gms.ads.internal.zzbv.zzeg();
        r4 = r3.mo1669a();
        r4 = r4 - r10;
        r4 = r6 - r4;
        r6 = 0;
        r4 = java.lang.Math.max(r4, r6);
        r6 = r4;
        r3 = r1;
        r4 = r2;
        r2 = r0;
        goto L_0x0026;
    L_0x007e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x007e }
        throw r0;
    L_0x0081:
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        goto L_0x0021;
    L_0x0084:
        r1 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        r1 = r0.get(r6, r1);	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        r1 = (com.google.android.gms.internal.als) r1;	 Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        goto L_0x004c;
    L_0x008d:
        r0 = move-exception;
    L_0x008e:
        r1 = "Exception while processing an adapter; continuing with other adapters";
        com.google.android.gms.internal.id.m5371a(r1, r0);	 Catch:{ all -> 0x00a6 }
        r0 = com.google.android.gms.ads.internal.zzbv.zzeg();
        r0 = r0.mo1669a();
        r0 = r0 - r10;
        r0 = r6 - r0;
        r6 = 0;
        r0 = java.lang.Math.max(r0, r6);
        r6 = r0;
        goto L_0x0026;
    L_0x00a6:
        r0 = move-exception;
        r1 = com.google.android.gms.ads.internal.zzbv.zzeg();
        r2 = r1.mo1669a();
        r2 = r2 - r10;
        r2 = r6 - r2;
        r4 = 0;
        java.lang.Math.max(r2, r4);
        throw r0;
    L_0x00b8:
        r15.m4729a(r3);
        if (r2 != 0) goto L_0x000e;
    L_0x00bd:
        r2 = new com.google.android.gms.internal.als;
        r0 = 1;
        r2.<init>(r0);
        goto L_0x000e;
    L_0x00c5:
        r0 = move-exception;
        goto L_0x008e;
    L_0x00c7:
        r0 = move-exception;
        goto L_0x008e;
    L_0x00c9:
        r0 = move-exception;
        goto L_0x008e;
    L_0x00cb:
        r0 = r2;
        r1 = r3;
        r2 = r4;
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.alv.c(java.util.List):com.google.android.gms.internal.als");
    }

    public final als mo1890a(List<all> list) {
        id.m5372a(3);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = new ArrayList();
        zzjb com_google_android_gms_internal_zzjb = this.f5353f.f7614d;
        int[] iArr = new int[2];
        if (com_google_android_gms_internal_zzjb.f7764g != null) {
            zzbv.zzeu();
            if (alu.m4728a(this.f5360m, iArr)) {
                int i = iArr[0];
                int i2 = iArr[1];
                for (zzjb com_google_android_gms_internal_zzjb2 : com_google_android_gms_internal_zzjb.f7764g) {
                    if (i == com_google_android_gms_internal_zzjb2.f7762e && i2 == com_google_android_gms_internal_zzjb2.f7759b) {
                        break;
                    }
                }
            }
        }
        zzjb com_google_android_gms_internal_zzjb22 = com_google_android_gms_internal_zzjb;
        for (all com_google_android_gms_internal_all : list) {
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(com_google_android_gms_internal_all.f5281b);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            id.m5372a(4);
            for (String com_google_android_gms_internal_alp : com_google_android_gms_internal_all.f5282c) {
                alp com_google_android_gms_internal_alp2 = new alp(this.f5355h, com_google_android_gms_internal_alp, this.f5354g, this.f5356i, com_google_android_gms_internal_all, this.f5353f.f7613c, com_google_android_gms_internal_zzjb22, this.f5353f.f7621k, this.f5357j, this.f5359l, this.f5353f.f7635y, this.f5353f.f7624n, this.f5353f.f7636z, this.f5353f.f7608X);
                il a = fv.m5426a(newCachedThreadPool, new alw(this, com_google_android_gms_internal_alp2));
                this.f5352e.put(a, com_google_android_gms_internal_alp2);
                arrayList.add(a);
            }
        }
        switch (this.f5358k) {
            case 2:
                return m4731c(arrayList);
            default:
                return m4730b(arrayList);
        }
    }

    public final void mo1891a() {
        synchronized (this.f5350c) {
            this.f5351d = true;
            for (alp a : this.f5352e.values()) {
                a.m4717a();
            }
        }
    }

    public final List<als> mo1892b() {
        return this.f5361n;
    }
}
