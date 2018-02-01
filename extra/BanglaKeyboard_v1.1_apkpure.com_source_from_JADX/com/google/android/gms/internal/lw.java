package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.C1519x;
import com.google.android.gms.common.internal.C1520y;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class lw implements C1519x, C1520y {
    private lx f6589a;
    private final String f6590b;
    private final String f6591c;
    private final LinkedBlockingQueue<kz> f6592d;
    private final HandlerThread f6593e = new HandlerThread("GassClient");

    public lw(Context context, String str, String str2) {
        this.f6590b = str;
        this.f6591c = str2;
        this.f6593e.start();
        this.f6589a = new lx(context, this.f6593e.getLooper(), this, this);
        this.f6592d = new LinkedBlockingQueue();
        this.f6589a.m3897c();
    }

    private final ma m6000e() {
        try {
            return this.f6589a.mo2192j();
        } catch (IllegalStateException e) {
            return null;
        } catch (DeadObjectException e2) {
            return null;
        }
    }

    private final void m6001f() {
        if (this.f6589a == null) {
            return;
        }
        if (this.f6589a.m3898d() || this.f6589a.m3899e()) {
            this.f6589a.m3900f();
        }
    }

    private static kz m6002g() {
        kz kzVar = new kz();
        kzVar.f6464k = Long.valueOf(32768);
        return kzVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2126a() {
        /*
        r4 = this;
        r0 = r4.m6000e();
        if (r0 == 0) goto L_0x0024;
    L_0x0006:
        r1 = new com.google.android.gms.internal.zzbvy;	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r2 = r4.f6590b;	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r3 = r4.f6591c;	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r1.<init>(r2, r3);	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r0 = r0.mo2201a(r1);	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r0 = r0.m7094a();	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r1 = r4.f6592d;	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r1.put(r0);	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r4.m6001f();
        r0 = r4.f6593e;
        r0.quit();
    L_0x0024:
        return;
    L_0x0025:
        r0 = move-exception;
        r0 = r4.f6592d;	 Catch:{ InterruptedException -> 0x0042, all -> 0x0038 }
        r1 = m6002g();	 Catch:{ InterruptedException -> 0x0042, all -> 0x0038 }
        r0.put(r1);	 Catch:{ InterruptedException -> 0x0042, all -> 0x0038 }
    L_0x002f:
        r4.m6001f();
        r0 = r4.f6593e;
        r0.quit();
        goto L_0x0024;
    L_0x0038:
        r0 = move-exception;
        r4.m6001f();
        r1 = r4.f6593e;
        r1.quit();
        throw r0;
    L_0x0042:
        r0 = move-exception;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.lw.a():void");
    }

    public final void mo2127b() {
        try {
            this.f6592d.put(m6002g());
        } catch (InterruptedException e) {
        }
    }

    public final void mo2128c() {
        try {
            this.f6592d.put(m6002g());
        } catch (InterruptedException e) {
        }
    }

    public final kz m6006d() {
        kz kzVar;
        try {
            kzVar = (kz) this.f6592d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            kzVar = null;
        }
        return kzVar == null ? m6002g() : kzVar;
    }
}
