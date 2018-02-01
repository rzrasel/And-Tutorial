package com.google.android.gms.internal;

@aqv
public final class alo extends amj {
    final Object f5316a = new Object();
    alt f5317b;
    private aln f5318c;

    public final void mo1877a() {
        synchronized (this.f5316a) {
            if (this.f5318c != null) {
                this.f5318c.zzcb();
            }
        }
    }

    public final void mo1878a(int i) {
        synchronized (this.f5316a) {
            if (this.f5317b != null) {
                this.f5317b.mo1887a(i == 3 ? 1 : 2);
                this.f5317b = null;
            }
        }
    }

    public final void mo1879a(agp com_google_android_gms_internal_agp, String str) {
        synchronized (this.f5316a) {
            if (this.f5318c != null) {
                this.f5318c.zza(com_google_android_gms_internal_agp, str);
            }
        }
    }

    public final void m4699a(aln com_google_android_gms_internal_aln) {
        synchronized (this.f5316a) {
            this.f5318c = com_google_android_gms_internal_aln;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1880a(com.google.android.gms.internal.aml r3) {
        /*
        r2 = this;
        r1 = r2.f5316a;
        monitor-enter(r1);
        r0 = r2.f5317b;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x0011;
    L_0x0007:
        r0 = r2.f5317b;	 Catch:{ all -> 0x001c }
        r0.mo1888a(r3);	 Catch:{ all -> 0x001c }
        r0 = 0;
        r2.f5317b = r0;	 Catch:{ all -> 0x001c }
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
    L_0x0010:
        return;
    L_0x0011:
        r0 = r2.f5318c;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x001a;
    L_0x0015:
        r0 = r2.f5318c;	 Catch:{ all -> 0x001c }
        r0.zzcf();	 Catch:{ all -> 0x001c }
    L_0x001a:
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        goto L_0x0010;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.alo.a(com.google.android.gms.internal.aml):void");
    }

    public final void mo1881a(String str, String str2) {
        synchronized (this.f5316a) {
            if (this.f5318c != null) {
                this.f5318c.zze(str, str2);
            }
        }
    }

    public final void mo1882b() {
        synchronized (this.f5316a) {
            if (this.f5318c != null) {
                this.f5318c.zzcc();
            }
        }
    }

    public final void mo1883c() {
        synchronized (this.f5316a) {
            if (this.f5318c != null) {
                this.f5318c.zzcd();
            }
        }
    }

    public final void mo1884d() {
        synchronized (this.f5316a) {
            if (this.f5318c != null) {
                this.f5318c.zzce();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1885e() {
        /*
        r3 = this;
        r1 = r3.f5316a;
        monitor-enter(r1);
        r0 = r3.f5317b;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r3.f5317b;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r0.mo1887a(r2);	 Catch:{ all -> 0x001d }
        r0 = 0;
        r3.f5317b = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.f5318c;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.f5318c;	 Catch:{ all -> 0x001d }
        r0.zzcf();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.alo.e():void");
    }

    public final void mo1886f() {
        synchronized (this.f5316a) {
            if (this.f5318c != null) {
                this.f5318c.zzcg();
            }
        }
    }
}
