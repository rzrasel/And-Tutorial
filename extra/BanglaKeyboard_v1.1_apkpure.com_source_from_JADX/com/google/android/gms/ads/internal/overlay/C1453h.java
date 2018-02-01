package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gb;

@aqv
final class C1453h implements Runnable {
    boolean f4128a = false;
    private zzaa f4129b;

    C1453h(zzaa com_google_android_gms_ads_internal_overlay_zzaa) {
        this.f4129b = com_google_android_gms_ads_internal_overlay_zzaa;
    }

    final void m3669a() {
        gb.f6131a.removeCallbacks(this);
        gb.f6131a.postDelayed(this, 250);
    }

    public final void run() {
        if (!this.f4128a) {
            zzaa com_google_android_gms_ads_internal_overlay_zzaa = this.f4129b;
            if (com_google_android_gms_ads_internal_overlay_zzaa.f4148a != null) {
                long currentPosition = (long) com_google_android_gms_ads_internal_overlay_zzaa.f4148a.getCurrentPosition();
                if (com_google_android_gms_ads_internal_overlay_zzaa.f4149b != currentPosition && currentPosition > 0) {
                    float f = ((float) currentPosition) / 1000.0f;
                    com_google_android_gms_ads_internal_overlay_zzaa.m3677a("timeupdate", "time", String.valueOf(f));
                    com_google_android_gms_ads_internal_overlay_zzaa.f4149b = currentPosition;
                }
            }
            m3669a();
        }
    }
}
