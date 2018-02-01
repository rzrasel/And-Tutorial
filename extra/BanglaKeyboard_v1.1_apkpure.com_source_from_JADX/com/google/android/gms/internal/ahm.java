package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;

@aqv
public final class ahm extends ahb {
    private final OnCustomClickListener f5108a;

    public ahm(OnCustomClickListener onCustomClickListener) {
        this.f5108a = onCustomClickListener;
    }

    public final void mo1862a(agp com_google_android_gms_internal_agp, String str) {
        this.f5108a.onCustomClick(new ags(com_google_android_gms_internal_agp), str);
    }
}
