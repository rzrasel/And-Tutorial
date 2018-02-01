package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.id;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    private View f4467a;
    private CustomEventBanner f4468b;
    private CustomEventInterstitial f4469c;
    private CustomEventNative f4470d;

    static final class C1480a implements CustomEventBannerListener {
        private final CustomEventAdapter f4460a;
        private final MediationBannerListener f4461b;

        public C1480a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f4460a = customEventAdapter;
            this.f4461b = mediationBannerListener;
        }

        public final void onAdClicked() {
            id.m5372a(3);
            this.f4461b.onAdClicked(this.f4460a);
        }

        public final void onAdClosed() {
            id.m5372a(3);
            this.f4461b.onAdClosed(this.f4460a);
        }

        public final void onAdFailedToLoad(int i) {
            id.m5372a(3);
            this.f4461b.onAdFailedToLoad(this.f4460a, i);
        }

        public final void onAdLeftApplication() {
            id.m5372a(3);
            this.f4461b.onAdLeftApplication(this.f4460a);
        }

        public final void onAdLoaded(View view) {
            id.m5372a(3);
            this.f4460a.f4467a = view;
            this.f4461b.onAdLoaded(this.f4460a);
        }

        public final void onAdOpened() {
            id.m5372a(3);
            this.f4461b.onAdOpened(this.f4460a);
        }
    }

    class C1481b implements CustomEventInterstitialListener {
        private final CustomEventAdapter f4462a;
        private final MediationInterstitialListener f4463b;
        private /* synthetic */ CustomEventAdapter f4464c;

        public C1481b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
            this.f4464c = customEventAdapter;
            this.f4462a = customEventAdapter2;
            this.f4463b = mediationInterstitialListener;
        }

        public final void onAdClicked() {
            id.m5372a(3);
            this.f4463b.onAdClicked(this.f4462a);
        }

        public final void onAdClosed() {
            id.m5372a(3);
            this.f4463b.onAdClosed(this.f4462a);
        }

        public final void onAdFailedToLoad(int i) {
            id.m5372a(3);
            this.f4463b.onAdFailedToLoad(this.f4462a, i);
        }

        public final void onAdLeftApplication() {
            id.m5372a(3);
            this.f4463b.onAdLeftApplication(this.f4462a);
        }

        public final void onAdLoaded() {
            id.m5372a(3);
            this.f4463b.onAdLoaded(this.f4464c);
        }

        public final void onAdOpened() {
            id.m5372a(3);
            this.f4463b.onAdOpened(this.f4462a);
        }
    }

    static class C1482c implements CustomEventNativeListener {
        private final CustomEventAdapter f4465a;
        private final MediationNativeListener f4466b;

        public C1482c(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.f4465a = customEventAdapter;
            this.f4466b = mediationNativeListener;
        }

        public final void onAdClicked() {
            id.m5372a(3);
            this.f4466b.onAdClicked(this.f4465a);
        }

        public final void onAdClosed() {
            id.m5372a(3);
            this.f4466b.onAdClosed(this.f4465a);
        }

        public final void onAdFailedToLoad(int i) {
            id.m5372a(3);
            this.f4466b.onAdFailedToLoad(this.f4465a, i);
        }

        public final void onAdImpression() {
            id.m5372a(3);
            this.f4466b.onAdImpression(this.f4465a);
        }

        public final void onAdLeftApplication() {
            id.m5372a(3);
            this.f4466b.onAdLeftApplication(this.f4465a);
        }

        public final void onAdLoaded(NativeAdMapper nativeAdMapper) {
            id.m5372a(3);
            this.f4466b.onAdLoaded(this.f4465a, nativeAdMapper);
        }

        public final void onAdOpened() {
            id.m5372a(3);
            this.f4466b.onAdOpened(this.f4465a);
        }
    }

    private static <T> T m3786a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            id.m5370a(new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(message).length()).append("Could not instantiate custom event adapter: ").append(str).append(". ").append(message).toString());
            return null;
        }
    }

    public final View getBannerView() {
        return this.f4467a;
    }

    public final void onDestroy() {
        if (this.f4468b != null) {
            this.f4468b.onDestroy();
        }
        if (this.f4469c != null) {
            this.f4469c.onDestroy();
        }
        if (this.f4470d != null) {
            this.f4470d.onDestroy();
        }
    }

    public final void onPause() {
        if (this.f4468b != null) {
            this.f4468b.onPause();
        }
        if (this.f4469c != null) {
            this.f4469c.onPause();
        }
        if (this.f4470d != null) {
            this.f4470d.onPause();
        }
    }

    public final void onResume() {
        if (this.f4468b != null) {
            this.f4468b.onResume();
        }
        if (this.f4469c != null) {
            this.f4469c.onResume();
        }
        if (this.f4470d != null) {
            this.f4470d.onResume();
        }
    }

    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f4468b = (CustomEventBanner) m3786a(bundle.getString("class_name"));
        if (this.f4468b == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.f4468b.requestBannerAd(context, new C1480a(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f4469c = (CustomEventInterstitial) m3786a(bundle.getString("class_name"));
        if (this.f4469c == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.f4469c.requestInterstitialAd(context, new C1481b(this, this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        this.f4470d = (CustomEventNative) m3786a(bundle.getString("class_name"));
        if (this.f4470d == null) {
            mediationNativeListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.f4470d.requestNativeAd(context, new C1482c(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public final void showInterstitial() {
        this.f4469c.showInterstitial();
    }
}
