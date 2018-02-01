package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.gb;

final class C1445o implements Runnable {
    final /* synthetic */ Runnable f4110a;
    final /* synthetic */ zzay f4111b;

    C1445o(zzay com_google_android_gms_ads_internal_zzay, Runnable runnable) {
        this.f4111b = com_google_android_gms_ads_internal_zzay;
        this.f4110a = runnable;
    }

    public final void run() {
        zzbv.zzea();
        gb.m5451a(new C1470q(this));
    }
}
