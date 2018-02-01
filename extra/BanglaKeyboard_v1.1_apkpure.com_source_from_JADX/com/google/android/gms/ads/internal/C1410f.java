package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzix;

final class C1410f implements Runnable {
    private /* synthetic */ zzix f4009a;
    private /* synthetic */ int f4010b;
    private /* synthetic */ zzai f4011c;

    C1410f(zzai com_google_android_gms_ads_internal_zzai, zzix com_google_android_gms_internal_zzix, int i) {
        this.f4011c = com_google_android_gms_ads_internal_zzai;
        this.f4009a = com_google_android_gms_internal_zzix;
        this.f4010b = i;
    }

    public final void run() {
        synchronized (this.f4011c.f4326r) {
            zzai.m3719a(this.f4011c, this.f4009a, this.f4010b);
        }
    }
}
