package com.google.android.gms.internal;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class abx extends Thread {
    volatile boolean f4751a = false;
    private final BlockingQueue<afv<?>> f4752b;
    private final aaw f4753c;
    private final lc f4754d;
    private final anc f4755e;

    public abx(BlockingQueue<afv<?>> blockingQueue, aaw com_google_android_gms_internal_aaw, lc lcVar, anc com_google_android_gms_internal_anc) {
        this.f4752b = blockingQueue;
        this.f4753c = com_google_android_gms_internal_aaw;
        this.f4754d = lcVar;
        this.f4755e = com_google_android_gms_internal_anc;
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                afv com_google_android_gms_internal_afv = (afv) this.f4752b.take();
                try {
                    com_google_android_gms_internal_afv.m4467a("network-queue-take");
                    TrafficStats.setThreadStatsTag(com_google_android_gms_internal_afv.f5070c);
                    adu a = this.f4753c.mo2031a(com_google_android_gms_internal_afv);
                    com_google_android_gms_internal_afv.m4467a("network-http-complete");
                    if (a.f4933c && com_google_android_gms_internal_afv.f5075h) {
                        com_google_android_gms_internal_afv.m4470b("not-modified");
                    } else {
                        ajz a2 = com_google_android_gms_internal_afv.mo2118a(a);
                        com_google_android_gms_internal_afv.m4467a("network-parse-complete");
                        if (com_google_android_gms_internal_afv.f5074g && a2.f5219b != null) {
                            this.f4754d.mo2093a(com_google_android_gms_internal_afv.f5069b, a2.f5219b);
                            com_google_android_gms_internal_afv.m4467a("network-cache-written");
                        }
                        com_google_android_gms_internal_afv.f5075h = true;
                        this.f4755e.mo2328a(com_google_android_gms_internal_afv, a2);
                    }
                } catch (C1569b e) {
                    e.f4701a = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.f4755e.mo2330a(com_google_android_gms_internal_afv, e);
                } catch (Throwable e2) {
                    C1658y.m7019d("Unhandled exception %s", e2.toString());
                    C1569b c1569b = new C1569b(e2);
                    c1569b.f4701a = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.f4755e.mo2330a(com_google_android_gms_internal_afv, c1569b);
                }
            } catch (InterruptedException e3) {
                if (this.f4751a) {
                    return;
                }
            }
        }
    }
}
