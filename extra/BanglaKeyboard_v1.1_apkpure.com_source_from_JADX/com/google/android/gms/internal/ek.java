package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;

public final class ek {
    public volatile int f6042a;
    private final Object f6043b;
    private volatile long f6044c;

    private ek() {
        this.f6043b = new Object();
        this.f6042a = el.f6045a;
        this.f6044c = 0;
    }

    public final void m5363a() {
        long a = zzbv.zzeg().mo1669a();
        synchronized (this.f6043b) {
            if (this.f6042a == el.f6047c) {
                if (this.f6044c + ((Long) zzbv.zzen().m4217a(ado.cI)).longValue() <= a) {
                    this.f6042a = el.f6045a;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m5364a(int r6, int r7) {
        /*
        r5 = this;
        r5.m5363a();
        r0 = com.google.android.gms.ads.internal.zzbv.zzeg();
        r0 = r0.mo1669a();
        r2 = r5.f6043b;
        monitor-enter(r2);
        r3 = r5.f6042a;	 Catch:{ all -> 0x0020 }
        if (r3 == r6) goto L_0x0014;
    L_0x0012:
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
    L_0x0013:
        return;
    L_0x0014:
        r5.f6042a = r7;	 Catch:{ all -> 0x0020 }
        r3 = r5.f6042a;	 Catch:{ all -> 0x0020 }
        r4 = com.google.android.gms.internal.el.f6047c;	 Catch:{ all -> 0x0020 }
        if (r3 != r4) goto L_0x001e;
    L_0x001c:
        r5.f6044c = r0;	 Catch:{ all -> 0x0020 }
    L_0x001e:
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        goto L_0x0013;
    L_0x0020:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ek.a(int, int):void");
    }
}
