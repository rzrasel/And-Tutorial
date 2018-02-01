package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.id;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {
    private View f3910a;
    private CustomEventBanner f3911b;
    private CustomEventInterstitial f3912c;

    static final class C1394a implements CustomEventBannerListener {
        private final CustomEventAdapter f3905a;
        private final MediationBannerListener f3906b;

        public C1394a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f3905a = customEventAdapter;
            this.f3906b = mediationBannerListener;
        }

        public final void onClick() {
            id.m5372a(3);
            this.f3906b.onClick(this.f3905a);
        }

        public final void onDismissScreen() {
            id.m5372a(3);
            this.f3906b.onDismissScreen(this.f3905a);
        }

        public final void onFailedToReceiveAd() {
            id.m5372a(3);
            this.f3906b.onFailedToReceiveAd(this.f3905a, ErrorCode.NO_FILL);
        }

        public final void onLeaveApplication() {
            id.m5372a(3);
            this.f3906b.onLeaveApplication(this.f3905a);
        }

        public final void onPresentScreen() {
            id.m5372a(3);
            this.f3906b.onPresentScreen(this.f3905a);
        }

        public final void onReceivedAd(View view) {
            id.m5372a(3);
            this.f3905a.f3910a = view;
            this.f3906b.onReceivedAd(this.f3905a);
        }
    }

    class C1395b implements CustomEventInterstitialListener {
        private final CustomEventAdapter f3907a;
        private final MediationInterstitialListener f3908b;
        private /* synthetic */ CustomEventAdapter f3909c;

        public C1395b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
            this.f3909c = customEventAdapter;
            this.f3907a = customEventAdapter2;
            this.f3908b = mediationInterstitialListener;
        }

        public final void onDismissScreen() {
            id.m5372a(3);
            this.f3908b.onDismissScreen(this.f3907a);
        }

        public final void onFailedToReceiveAd() {
            id.m5372a(3);
            this.f3908b.onFailedToReceiveAd(this.f3907a, ErrorCode.NO_FILL);
        }

        public final void onLeaveApplication() {
            id.m5372a(3);
            this.f3908b.onLeaveApplication(this.f3907a);
        }

        public final void onPresentScreen() {
            id.m5372a(3);
            this.f3908b.onPresentScreen(this.f3907a);
        }

        public final void onReceivedAd() {
            id.m5372a(3);
            this.f3908b.onReceivedAd(this.f3909c);
        }
    }

    private static <T> T m3579a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            id.m5370a(new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(message).length()).append("Could not instantiate custom event adapter: ").append(str).append(". ").append(message).toString());
            return null;
        }
    }

    public final void destroy() {
        if (this.f3911b != null) {
            this.f3911b.destroy();
        }
        if (this.f3912c != null) {
            this.f3912c.destroy();
        }
    }

    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public final View getBannerView() {
        return this.f3910a;
    }

    public final Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    public final void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.f3911b = (CustomEventBanner) m3579a(customEventServerParameters.className);
        if (this.f3911b == null) {
            mediationBannerListener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
        } else {
            this.f3911b.requestBannerAd(new C1394a(this, mediationBannerListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, adSize, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    public final void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.f3912c = (CustomEventInterstitial) m3579a(customEventServerParameters.className);
        if (this.f3912c == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, ErrorCode.INTERNAL_ERROR);
        } else {
            this.f3912c.requestInterstitialAd(new C1395b(this, this, mediationInterstitialListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    public final void showInterstitial() {
        this.f3912c.showInterstitial();
    }
}
