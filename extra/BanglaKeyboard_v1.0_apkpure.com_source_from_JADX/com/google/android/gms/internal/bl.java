package com.google.android.gms.internal;

public final class bl extends bz {
    private final Object f1065a = new Object();
    private bp f1066b;
    private bk f1067c;

    public final void mo825a() {
        synchronized (this.f1065a) {
            if (this.f1067c != null) {
                this.f1067c.mo990j();
            }
        }
    }

    public final void mo826a(int i) {
        synchronized (this.f1065a) {
            if (this.f1066b != null) {
                this.f1066b.mo831a(i == 3 ? 1 : 2);
                this.f1066b = null;
            }
        }
    }

    public final void m1697a(bk bkVar) {
        synchronized (this.f1065a) {
            this.f1067c = bkVar;
        }
    }

    public final void m1698a(bp bpVar) {
        synchronized (this.f1065a) {
            this.f1066b = bpVar;
        }
    }

    public final void mo827b() {
        synchronized (this.f1065a) {
            if (this.f1067c != null) {
                this.f1067c.mo991k();
            }
        }
    }

    public final void mo828c() {
        synchronized (this.f1065a) {
            if (this.f1067c != null) {
                this.f1067c.mo992l();
            }
        }
    }

    public final void mo829d() {
        synchronized (this.f1065a) {
            if (this.f1067c != null) {
                this.f1067c.mo993m();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo830e() {
        /*
        r3 = this;
        r1 = r3.f1065a;
        monitor-enter(r1);
        r0 = r3.f1066b;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r3.f1066b;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r0.mo831a(r2);	 Catch:{ all -> 0x001d }
        r0 = 0;
        r3.f1066b = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.f1067c;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.f1067c;	 Catch:{ all -> 0x001d }
        r0.mo994n();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bl.e():void");
    }
}
