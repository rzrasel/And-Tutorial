package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzw;

final class anq implements zzw {
    private /* synthetic */ zzwn f5447a;

    anq(zzwn com_google_android_gms_internal_zzwn) {
        this.f5447a = com_google_android_gms_internal_zzwn;
    }

    public final void onPause() {
        id.m5372a(3);
    }

    public final void onResume() {
        id.m5372a(3);
    }

    public final void zzbz() {
        id.m5372a(3);
        this.f5447a.f7794b.onAdClosed(this.f5447a);
    }

    public final void zzca() {
        id.m5372a(3);
        this.f5447a.f7794b.onAdOpened(this.f5447a);
    }
}
