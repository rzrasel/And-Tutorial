package com.google.android.gms.ads.internal;

import android.view.View;
import android.view.View.OnClickListener;

final class ap implements OnClickListener {
    private /* synthetic */ zzw f3986a;
    private /* synthetic */ am f3987b;

    ap(am amVar, zzw com_google_android_gms_ads_internal_zzw) {
        this.f3987b = amVar;
        this.f3986a = com_google_android_gms_ads_internal_zzw;
    }

    public final void onClick(View view) {
        this.f3986a.recordClick();
        if (this.f3987b.f3980b != null) {
            this.f3987b.f3980b.mo2081c();
        }
    }
}
