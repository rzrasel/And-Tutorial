package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzas;
import java.util.concurrent.CountDownLatch;

final class apk implements Runnable {
    private /* synthetic */ CountDownLatch f5558a;
    private /* synthetic */ apj f5559b;

    apk(apj com_google_android_gms_internal_apj, CountDownLatch countDownLatch) {
        this.f5559b = com_google_android_gms_internal_apj;
        this.f5558a = countDownLatch;
    }

    public final void run() {
        synchronized (this.f5559b.d) {
            this.f5559b.f5553j = zzas.zza(this.f5559b.f5552i, this.f5559b.f5551h, this.f5558a);
        }
    }
}
