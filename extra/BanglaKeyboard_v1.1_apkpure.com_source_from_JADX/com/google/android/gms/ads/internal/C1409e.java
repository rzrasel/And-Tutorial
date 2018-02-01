package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzix;

final class C1409e implements Runnable {
    private /* synthetic */ zzix f4007a;
    private /* synthetic */ zzai f4008b;

    C1409e(zzai com_google_android_gms_ads_internal_zzai, zzix com_google_android_gms_internal_zzix) {
        this.f4008b = com_google_android_gms_ads_internal_zzai;
        this.f4007a = com_google_android_gms_internal_zzix;
    }

    public final void run() {
        synchronized (this.f4008b.f4326r) {
            if (zzai.m3723b(this.f4008b)) {
                zzai.m3718a(this.f4008b, this.f4007a);
            } else {
                zzai.m3719a(this.f4008b, this.f4007a, 1);
            }
        }
    }
}
