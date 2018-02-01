package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.ach;
import com.google.android.gms.internal.ael;
import com.google.android.gms.internal.id;

public final class PublisherInterstitialAd {
    private final ach f3943a;

    public PublisherInterstitialAd(Context context) {
        this.f3943a = new ach(context, this);
        C1516t.m3861a((Object) context, (Object) "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.f3943a.f4818a;
    }

    public final String getAdUnitId() {
        return this.f3943a.f4820c;
    }

    public final AppEventListener getAppEventListener() {
        return this.f3943a.f4821d;
    }

    public final String getMediationAdapterClassName() {
        return this.f3943a.m4133c();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.f3943a.f4822e;
    }

    public final boolean isLoaded() {
        return this.f3943a.m4131a();
    }

    public final boolean isLoading() {
        return this.f3943a.m4132b();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f3943a.m4127a(publisherAdRequest.zzaz());
    }

    public final void setAdListener(AdListener adListener) {
        this.f3943a.m4126a(adListener);
    }

    public final void setAdUnitId(String str) {
        this.f3943a.m4129a(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        ach com_google_android_gms_internal_ach = this.f3943a;
        try {
            com_google_android_gms_internal_ach.f4821d = appEventListener;
            if (com_google_android_gms_internal_ach.f4819b != null) {
                com_google_android_gms_internal_ach.f4819b.zza(appEventListener != null ? new aaa(appEventListener) : null);
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set the AppEventListener.", e);
        }
    }

    public final void setCorrelator(Correlator correlator) {
        ach com_google_android_gms_internal_ach = this.f3943a;
        com_google_android_gms_internal_ach.f4823f = correlator;
        try {
            if (com_google_android_gms_internal_ach.f4819b != null) {
                com_google_android_gms_internal_ach.f4819b.zza(com_google_android_gms_internal_ach.f4823f == null ? null : com_google_android_gms_internal_ach.f4823f.zzba());
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set correlator.", e);
        }
    }

    public final void setImmersiveMode(boolean z) {
        this.f3943a.m4130a(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        ach com_google_android_gms_internal_ach = this.f3943a;
        try {
            com_google_android_gms_internal_ach.f4822e = onCustomRenderedAdLoadedListener;
            if (com_google_android_gms_internal_ach.f4819b != null) {
                com_google_android_gms_internal_ach.f4819b.zza(onCustomRenderedAdLoadedListener != null ? new ael(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set the OnCustomRenderedAdLoadedListener.", e);
        }
    }

    public final void show() {
        this.f3943a.m4134d();
    }
}
