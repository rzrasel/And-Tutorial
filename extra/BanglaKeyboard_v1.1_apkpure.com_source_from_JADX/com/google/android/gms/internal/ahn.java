package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;

@aqv
public final class ahn extends ahe {
    private final OnCustomTemplateAdLoadedListener f5109a;

    public ahn(OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.f5109a = onCustomTemplateAdLoadedListener;
    }

    public final void mo1863a(agp com_google_android_gms_internal_agp) {
        this.f5109a.onCustomTemplateAdLoaded(new ags(com_google_android_gms_internal_agp));
    }
}
