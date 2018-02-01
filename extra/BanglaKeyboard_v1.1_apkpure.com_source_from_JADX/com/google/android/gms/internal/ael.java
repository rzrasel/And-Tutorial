package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@aqv
public final class ael extends aej {
    private final OnCustomRenderedAdLoadedListener f4958a;

    public ael(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f4958a = onCustomRenderedAdLoadedListener;
    }

    public final void mo1747a(aef com_google_android_gms_internal_aef) {
        this.f4958a.onCustomRenderedAdLoaded(new aee(com_google_android_gms_internal_aef));
    }
}
