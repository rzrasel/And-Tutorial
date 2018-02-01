package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Callable;

final class fy implements Runnable {
    private /* synthetic */ ir f6123a;
    private /* synthetic */ Callable f6124b;

    fy(ir irVar, Callable callable) {
        this.f6123a = irVar;
        this.f6124b = callable;
    }

    public final void run() {
        try {
            Process.setThreadPriority(10);
            this.f6123a.m3633b(this.f6124b.call());
        } catch (Throwable e) {
            zzbv.zzee().m5336a(e, "AdThreadPool.submit");
            this.f6123a.m3632a(e);
        }
    }
}
