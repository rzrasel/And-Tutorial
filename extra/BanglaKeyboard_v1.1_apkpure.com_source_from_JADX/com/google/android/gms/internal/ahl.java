package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;

@aqv
public final class ahl extends agy {
    private final OnContentAdLoadedListener f5107a;

    public ahl(OnContentAdLoadedListener onContentAdLoadedListener) {
        this.f5107a = onContentAdLoadedListener;
    }

    public final void mo1861a(agl com_google_android_gms_internal_agl) {
        this.f5107a.onContentAdLoaded(new ago(com_google_android_gms_internal_agl));
    }
}
