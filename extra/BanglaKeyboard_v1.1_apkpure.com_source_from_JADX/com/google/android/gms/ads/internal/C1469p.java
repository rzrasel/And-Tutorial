package com.google.android.gms.ads.internal;

import android.os.Debug;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.id;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

final class C1469p extends TimerTask {
    private /* synthetic */ CountDownLatch f4265a;
    private /* synthetic */ Timer f4266b;
    private /* synthetic */ zza f4267c;

    C1469p(zza com_google_android_gms_ads_internal_zza, CountDownLatch countDownLatch, Timer timer) {
        this.f4267c = com_google_android_gms_ads_internal_zza;
        this.f4265a = countDownLatch;
        this.f4266b = timer;
    }

    public final void run() {
        if (((long) ((Integer) zzbv.zzen().m4217a(ado.bY)).intValue()) != this.f4265a.getCount()) {
            id.m5372a(3);
            Debug.stopMethodTracing();
            if (this.f4265a.getCount() == 0) {
                this.f4266b.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.f4267c.zzams.zzaie.getPackageName()).concat("_adsTrace_");
        try {
            id.m5372a(3);
            this.f4265a.countDown();
            Debug.startMethodTracing(new StringBuilder(String.valueOf(concat).length() + 20).append(concat).append(zzbv.zzeg().mo1669a()).toString(), ((Integer) zzbv.zzen().m4217a(ado.bZ)).intValue());
        } catch (Throwable e) {
            id.m5371a("Exception occurred while starting method tracing.", e);
        }
    }
}
