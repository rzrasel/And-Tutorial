package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;

public final class qz extends rs {
    private static volatile lq f7034d = null;
    private static final Object f7035e = new Object();
    private kw f7036f = null;

    public qz(np npVar, String str, String str2, kz kzVar, int i, kw kwVar) {
        super(npVar, str, str2, kzVar, i, 27);
        this.f7036f = kwVar;
    }

    private static String m6485a(kw kwVar) {
        return (kwVar == null || kwVar.f6423b == null || pd.m6377b(kwVar.f6423b.f6425a)) ? null : kwVar.f6423b.f6425a;
    }

    private final String m6486c() {
        try {
            if (this.a.f6734h != null) {
                this.a.f6734h.get();
            }
            kz kzVar = this.a.f6733g;
            if (!(kzVar == null || kzVar.f6467n == null)) {
                return kzVar.f6467n;
            }
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void mo2232a() {
        /*
        r10 = this;
        r3 = 3;
        r4 = 2;
        r1 = 1;
        r2 = 0;
        r0 = f7034d;
        if (r0 == 0) goto L_0x002a;
    L_0x0008:
        r0 = f7034d;
        r0 = r0.f6579a;
        r0 = com.google.android.gms.internal.pd.m6377b(r0);
        if (r0 != 0) goto L_0x002a;
    L_0x0012:
        r0 = f7034d;
        r0 = r0.f6579a;
        r5 = "E";
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x002a;
    L_0x001e:
        r0 = f7034d;
        r0 = r0.f6579a;
        r5 = "0000000000000000000000000000000000000000000000000000000000000000";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x00b1;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        if (r0 == 0) goto L_0x007c;
    L_0x002d:
        r5 = f7035e;
        monitor-enter(r5);
        r0 = r10.f7036f;	 Catch:{ all -> 0x011e }
        r0 = m6485a(r0);	 Catch:{ all -> 0x011e }
        r0 = com.google.android.gms.internal.pd.m6377b(r0);	 Catch:{ all -> 0x011e }
        if (r0 != 0) goto L_0x00b4;
    L_0x003c:
        r0 = 4;
        r3 = r0;
    L_0x003e:
        r6 = r10.c;	 Catch:{ all -> 0x011e }
        r7 = 0;
        r0 = 2;
        r8 = new java.lang.Object[r0];	 Catch:{ all -> 0x011e }
        r0 = 0;
        r9 = r10.a;	 Catch:{ all -> 0x011e }
        r9 = r9.m6083a();	 Catch:{ all -> 0x011e }
        r8[r0] = r9;	 Catch:{ all -> 0x011e }
        r9 = 1;
        if (r3 != r4) goto L_0x010f;
    L_0x0050:
        r0 = r1;
    L_0x0051:
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x011e }
        r8[r9] = r0;	 Catch:{ all -> 0x011e }
        r0 = r6.invoke(r7, r8);	 Catch:{ all -> 0x011e }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x011e }
        r1 = new com.google.android.gms.internal.lq;	 Catch:{ all -> 0x011e }
        r1.<init>(r0);	 Catch:{ all -> 0x011e }
        f7034d = r1;	 Catch:{ all -> 0x011e }
        r0 = r1.f6579a;	 Catch:{ all -> 0x011e }
        r0 = com.google.android.gms.internal.pd.m6377b(r0);	 Catch:{ all -> 0x011e }
        if (r0 != 0) goto L_0x0078;
    L_0x006c:
        r0 = f7034d;	 Catch:{ all -> 0x011e }
        r0 = r0.f6579a;	 Catch:{ all -> 0x011e }
        r1 = "E";
        r0 = r0.equals(r1);	 Catch:{ all -> 0x011e }
        if (r0 == 0) goto L_0x007b;
    L_0x0078:
        switch(r3) {
            case 3: goto L_0x0121;
            case 4: goto L_0x0112;
            default: goto L_0x007b;
        };	 Catch:{ all -> 0x011e }
    L_0x007b:
        monitor-exit(r5);	 Catch:{ all -> 0x011e }
    L_0x007c:
        r1 = r10.b;
        monitor-enter(r1);
        r0 = f7034d;	 Catch:{ all -> 0x0131 }
        if (r0 == 0) goto L_0x00af;
    L_0x0083:
        r0 = r10.b;	 Catch:{ all -> 0x0131 }
        r2 = f7034d;	 Catch:{ all -> 0x0131 }
        r2 = r2.f6579a;	 Catch:{ all -> 0x0131 }
        r0.f6467n = r2;	 Catch:{ all -> 0x0131 }
        r0 = r10.b;	 Catch:{ all -> 0x0131 }
        r2 = f7034d;	 Catch:{ all -> 0x0131 }
        r2 = r2.f6580b;	 Catch:{ all -> 0x0131 }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0131 }
        r0.f6473t = r2;	 Catch:{ all -> 0x0131 }
        r0 = r10.b;	 Catch:{ all -> 0x0131 }
        r2 = f7034d;	 Catch:{ all -> 0x0131 }
        r2 = r2.f6581c;	 Catch:{ all -> 0x0131 }
        r0.f6472s = r2;	 Catch:{ all -> 0x0131 }
        r0 = r10.b;	 Catch:{ all -> 0x0131 }
        r2 = f7034d;	 Catch:{ all -> 0x0131 }
        r2 = r2.f6582d;	 Catch:{ all -> 0x0131 }
        r0.f6432C = r2;	 Catch:{ all -> 0x0131 }
        r0 = r10.b;	 Catch:{ all -> 0x0131 }
        r2 = f7034d;	 Catch:{ all -> 0x0131 }
        r2 = r2.f6583e;	 Catch:{ all -> 0x0131 }
        r0.f6433D = r2;	 Catch:{ all -> 0x0131 }
    L_0x00af:
        monitor-exit(r1);	 Catch:{ all -> 0x0131 }
        return;
    L_0x00b1:
        r0 = r2;
        goto L_0x002b;
    L_0x00b4:
        r0 = r10.f7036f;	 Catch:{ all -> 0x011e }
        r6 = m6485a(r0);	 Catch:{ all -> 0x011e }
        r6 = com.google.android.gms.internal.pd.m6377b(r6);	 Catch:{ all -> 0x011e }
        if (r6 == 0) goto L_0x010b;
    L_0x00c0:
        if (r0 == 0) goto L_0x010b;
    L_0x00c2:
        r6 = r0.f6422a;	 Catch:{ all -> 0x011e }
        if (r6 == 0) goto L_0x010b;
    L_0x00c6:
        r0 = r0.f6422a;	 Catch:{ all -> 0x011e }
        r0 = r0.f6424a;	 Catch:{ all -> 0x011e }
        r0 = r0.intValue();	 Catch:{ all -> 0x011e }
        if (r0 != r3) goto L_0x010b;
    L_0x00d0:
        r0 = r1;
    L_0x00d1:
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x011e }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x011e }
        if (r0 == 0) goto L_0x0108;
    L_0x00db:
        r0 = r10.a;	 Catch:{ all -> 0x011e }
        r0 = r0.f6737k;	 Catch:{ all -> 0x011e }
        if (r0 == 0) goto L_0x010d;
    L_0x00e1:
        r0 = com.google.android.gms.internal.ado.bA;	 Catch:{ all -> 0x011e }
        r6 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ all -> 0x011e }
        r0 = r6.m4217a(r0);	 Catch:{ all -> 0x011e }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x011e }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x011e }
        if (r0 == 0) goto L_0x010d;
    L_0x00f3:
        r0 = com.google.android.gms.internal.ado.bB;	 Catch:{ all -> 0x011e }
        r6 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ all -> 0x011e }
        r0 = r6.m4217a(r0);	 Catch:{ all -> 0x011e }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x011e }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x011e }
        if (r0 == 0) goto L_0x010d;
    L_0x0105:
        r0 = r1;
    L_0x0106:
        if (r0 != 0) goto L_0x003e;
    L_0x0108:
        r3 = r4;
        goto L_0x003e;
    L_0x010b:
        r0 = r2;
        goto L_0x00d1;
    L_0x010d:
        r0 = r2;
        goto L_0x0106;
    L_0x010f:
        r0 = r2;
        goto L_0x0051;
    L_0x0112:
        r0 = f7034d;	 Catch:{ all -> 0x011e }
        r1 = r10.f7036f;	 Catch:{ all -> 0x011e }
        r1 = r1.f6423b;	 Catch:{ all -> 0x011e }
        r1 = r1.f6425a;	 Catch:{ all -> 0x011e }
        r0.f6579a = r1;	 Catch:{ all -> 0x011e }
        goto L_0x007b;
    L_0x011e:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x011e }
        throw r0;
    L_0x0121:
        r0 = r10.m6486c();	 Catch:{ all -> 0x011e }
        r1 = com.google.android.gms.internal.pd.m6377b(r0);	 Catch:{ all -> 0x011e }
        if (r1 != 0) goto L_0x007b;
    L_0x012b:
        r1 = f7034d;	 Catch:{ all -> 0x011e }
        r1.f6579a = r0;	 Catch:{ all -> 0x011e }
        goto L_0x007b;
    L_0x0131:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0131 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qz.a():void");
    }
}
