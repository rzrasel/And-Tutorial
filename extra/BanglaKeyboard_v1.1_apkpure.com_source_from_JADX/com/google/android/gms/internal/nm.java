package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class nm extends Thread {
    private static final boolean f6713b = C1658y.f7464a;
    volatile boolean f6714a = false;
    private final BlockingQueue<afv<?>> f6715c;
    private final BlockingQueue<afv<?>> f6716d;
    private final lc f6717e;
    private final anc f6718f;

    public nm(BlockingQueue<afv<?>> blockingQueue, BlockingQueue<afv<?>> blockingQueue2, lc lcVar, anc com_google_android_gms_internal_anc) {
        this.f6715c = blockingQueue;
        this.f6716d = blockingQueue2;
        this.f6717e = lcVar;
        this.f6718f = com_google_android_gms_internal_anc;
    }

    public final void run() {
        if (f6713b) {
            C1658y.m7016a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f6717e.mo2092a();
        while (true) {
            try {
                afv com_google_android_gms_internal_afv = (afv) this.f6715c.take();
                com_google_android_gms_internal_afv.m4467a("cache-queue-take");
                mf a = this.f6717e.mo2091a(com_google_android_gms_internal_afv.f5069b);
                if (a == null) {
                    com_google_android_gms_internal_afv.m4467a("cache-miss");
                    this.f6716d.put(com_google_android_gms_internal_afv);
                } else {
                    if ((a.f6651e < System.currentTimeMillis() ? 1 : 0) != 0) {
                        com_google_android_gms_internal_afv.m4467a("cache-hit-expired");
                        com_google_android_gms_internal_afv.f5077j = a;
                        this.f6716d.put(com_google_android_gms_internal_afv);
                    } else {
                        com_google_android_gms_internal_afv.m4467a("cache-hit");
                        ajz a2 = com_google_android_gms_internal_afv.mo2118a(new adu(a.f6647a, a.f6653g));
                        com_google_android_gms_internal_afv.m4467a("cache-hit-parsed");
                        if ((a.f6652f < System.currentTimeMillis() ? 1 : 0) == 0) {
                            this.f6718f.mo2328a(com_google_android_gms_internal_afv, a2);
                        } else {
                            com_google_android_gms_internal_afv.m4467a("cache-hit-refresh-needed");
                            com_google_android_gms_internal_afv.f5077j = a;
                            a2.f5221d = true;
                            this.f6718f.mo2329a(com_google_android_gms_internal_afv, a2, new rn(this, com_google_android_gms_internal_afv));
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f6714a) {
                    return;
                }
            }
        }
    }
}
