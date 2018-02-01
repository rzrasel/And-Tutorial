package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;

@aqv
public final class ahk extends agu {
    private final OnAppInstallAdLoadedListener f5106a;

    public ahk(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.f5106a = onAppInstallAdLoadedListener;
    }

    public final void mo1860a(agh com_google_android_gms_internal_agh) {
        this.f5106a.onAppInstallAdLoaded(new agk(com_google_android_gms_internal_agh));
    }
}
