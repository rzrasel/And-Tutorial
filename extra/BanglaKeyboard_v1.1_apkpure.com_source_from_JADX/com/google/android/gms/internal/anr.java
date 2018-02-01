package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.zzbv;

final class anr implements Runnable {
    private /* synthetic */ AdOverlayInfoParcel f5448a;
    private /* synthetic */ zzwn f5449b;

    anr(zzwn com_google_android_gms_internal_zzwn, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f5449b = com_google_android_gms_internal_zzwn;
        this.f5448a = adOverlayInfoParcel;
    }

    public final void run() {
        zzbv.zzdy();
        zzu.zza(this.f5449b.f7793a, this.f5448a, true);
    }
}
