package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;

@aqv
public final class yw {
    public final Runnable f7532a = new yx(this);
    public final Object f7533b = new Object();
    zd f7534c;
    zg f7535d;
    private Context f7536e;

    static /* synthetic */ void m7048a(yw ywVar) {
        synchronized (ywVar.f7533b) {
            if (ywVar.f7534c == null) {
                return;
            }
            if (ywVar.f7534c.m3898d() || ywVar.f7534c.m3899e()) {
                ywVar.f7534c.m3900f();
            }
            ywVar.f7534c = null;
            ywVar.f7535d = null;
            Binder.flushPendingCommands();
        }
    }

    public final zzib m7049a(zzie com_google_android_gms_internal_zzie) {
        zzib com_google_android_gms_internal_zzib;
        synchronized (this.f7533b) {
            if (this.f7535d == null) {
                com_google_android_gms_internal_zzib = new zzib();
            } else {
                try {
                    com_google_android_gms_internal_zzib = this.f7535d.mo2332a(com_google_android_gms_internal_zzie);
                } catch (RemoteException e) {
                    id.m5372a(6);
                    com_google_android_gms_internal_zzib = new zzib();
                }
            }
        }
        return com_google_android_gms_internal_zzib;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m7050a() {
        /*
        r6 = this;
        r1 = r6.f7533b;
        monitor-enter(r1);
        r0 = r6.f7536e;	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r6.f7534c;	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x002f }
    L_0x000c:
        return;
    L_0x000d:
        r0 = new com.google.android.gms.internal.yz;	 Catch:{ all -> 0x002f }
        r0.<init>(r6);	 Catch:{ all -> 0x002f }
        r2 = new com.google.android.gms.internal.zb;	 Catch:{ all -> 0x002f }
        r2.<init>(r6);	 Catch:{ all -> 0x002f }
        r3 = new com.google.android.gms.internal.zd;	 Catch:{ all -> 0x002f }
        r4 = r6.f7536e;	 Catch:{ all -> 0x002f }
        r5 = com.google.android.gms.ads.internal.zzbv.zzer();	 Catch:{ all -> 0x002f }
        r5 = r5.m5596a();	 Catch:{ all -> 0x002f }
        r3.<init>(r4, r5, r0, r2);	 Catch:{ all -> 0x002f }
        r6.f7534c = r3;	 Catch:{ all -> 0x002f }
        r0 = r6.f7534c;	 Catch:{ all -> 0x002f }
        r0.m3897c();	 Catch:{ all -> 0x002f }
        monitor-exit(r1);	 Catch:{ all -> 0x002f }
        goto L_0x000c;
    L_0x002f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.yw.a():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m7051a(android.content.Context r4) {
        /*
        r3 = this;
        if (r4 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r1 = r3.f7533b;
        monitor-enter(r1);
        r0 = r3.f7536e;	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        goto L_0x0002;
    L_0x000c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        throw r0;
    L_0x000f:
        r0 = r4.getApplicationContext();	 Catch:{ all -> 0x000c }
        r3.f7536e = r0;	 Catch:{ all -> 0x000c }
        r0 = com.google.android.gms.internal.ado.cn;	 Catch:{ all -> 0x000c }
        r2 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ all -> 0x000c }
        r0 = r2.m4217a(r0);	 Catch:{ all -> 0x000c }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x000c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x002c;
    L_0x0027:
        r3.m7050a();	 Catch:{ all -> 0x000c }
    L_0x002a:
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        goto L_0x0002;
    L_0x002c:
        r0 = com.google.android.gms.internal.ado.cm;	 Catch:{ all -> 0x000c }
        r2 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ all -> 0x000c }
        r0 = r2.m4217a(r0);	 Catch:{ all -> 0x000c }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x000c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x002a;
    L_0x003e:
        r0 = new com.google.android.gms.internal.yy;	 Catch:{ all -> 0x000c }
        r0.<init>(r3);	 Catch:{ all -> 0x000c }
        r2 = com.google.android.gms.ads.internal.zzbv.zzed();	 Catch:{ all -> 0x000c }
        r2.m7009a(r0);	 Catch:{ all -> 0x000c }
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.yw.a(android.content.Context):void");
    }
}
