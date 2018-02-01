package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzu;

final class C1413i implements Runnable {
    private /* synthetic */ AdOverlayInfoParcel f4019a;
    private /* synthetic */ C1412h f4020b;

    C1413i(C1412h c1412h, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f4020b = c1412h;
        this.f4019a = adOverlayInfoParcel;
    }

    public final void run() {
        zzbv.zzdy();
        zzu.zza(this.f4020b.f4017a.zzams.zzaie, this.f4019a, true);
    }
}
