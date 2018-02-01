package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.hz;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.zq;
import com.google.android.gms.internal.zzalt;
import java.util.Date;
import java.util.Set;

@aqv
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza, MediationRewardedVideoAdAdapter, zzalt {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzgm;
    private InterstitialAd zzgn;
    private AdLoader zzgo;
    private Context zzgp;
    private InterstitialAd zzgq;
    private MediationRewardedVideoAdListener zzgr;
    private RewardedVideoAdListener zzgs = new C1393a(this);

    static class C1388a extends NativeAppInstallAdMapper {
        private final NativeAppInstallAd f3884e;

        public C1388a(NativeAppInstallAd nativeAppInstallAd) {
            this.f3884e = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f3884e);
            }
        }
    }

    static class C1389b extends NativeContentAdMapper {
        private final NativeContentAd f3892e;

        public C1389b(NativeContentAd nativeContentAd) {
            this.f3892e = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f3892e);
            }
        }
    }

    static final class C1390c extends AdListener implements AppEventListener, zq {
        private AbstractAdViewAdapter f3893a;
        private MediationBannerListener f3894b;

        public C1390c(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.f3893a = abstractAdViewAdapter;
            this.f3894b = mediationBannerListener;
        }

        public final void onAdClicked() {
            this.f3894b.onAdClicked(this.f3893a);
        }

        public final void onAdClosed() {
            this.f3894b.onAdClosed(this.f3893a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f3894b.onAdFailedToLoad(this.f3893a, i);
        }

        public final void onAdLeftApplication() {
            this.f3894b.onAdLeftApplication(this.f3893a);
        }

        public final void onAdLoaded() {
            this.f3894b.onAdLoaded(this.f3893a);
        }

        public final void onAdOpened() {
            this.f3894b.onAdOpened(this.f3893a);
        }

        public final void onAppEvent(String str, String str2) {
            this.f3894b.zza(this.f3893a, str, str2);
        }
    }

    static final class C1391d extends AdListener implements zq {
        private AbstractAdViewAdapter f3895a;
        private MediationInterstitialListener f3896b;

        public C1391d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f3895a = abstractAdViewAdapter;
            this.f3896b = mediationInterstitialListener;
        }

        public final void onAdClicked() {
            this.f3896b.onAdClicked(this.f3895a);
        }

        public final void onAdClosed() {
            this.f3896b.onAdClosed(this.f3895a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f3896b.onAdFailedToLoad(this.f3895a, i);
        }

        public final void onAdLeftApplication() {
            this.f3896b.onAdLeftApplication(this.f3895a);
        }

        public final void onAdLoaded() {
            this.f3896b.onAdLoaded(this.f3895a);
        }

        public final void onAdOpened() {
            this.f3896b.onAdOpened(this.f3895a);
        }
    }

    static final class C1392e extends AdListener implements OnAppInstallAdLoadedListener, OnContentAdLoadedListener, OnCustomClickListener, OnCustomTemplateAdLoadedListener {
        private AbstractAdViewAdapter f3897a;
        private MediationNativeListener f3898b;

        public C1392e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.f3897a = abstractAdViewAdapter;
            this.f3898b = mediationNativeListener;
        }

        public final void onAdClicked() {
            this.f3898b.onAdClicked(this.f3897a);
        }

        public final void onAdClosed() {
            this.f3898b.onAdClosed(this.f3897a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f3898b.onAdFailedToLoad(this.f3897a, i);
        }

        public final void onAdImpression() {
            this.f3898b.onAdImpression(this.f3897a);
        }

        public final void onAdLeftApplication() {
            this.f3898b.onAdLeftApplication(this.f3897a);
        }

        public final void onAdLoaded() {
        }

        public final void onAdOpened() {
            this.f3898b.onAdOpened(this.f3897a);
        }

        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.f3898b.onAdLoaded(this.f3897a, new C1388a(nativeAppInstallAd));
        }

        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.f3898b.onAdLoaded(this.f3897a, new C1389b(nativeContentAd));
        }

        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.f3898b.zza(this.f3897a, nativeCustomTemplateAd, str);
        }

        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.f3898b.zza(this.f3897a, nativeCustomTemplateAd);
        }
    }

    private final AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Builder builder = new Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            aak.m4022a();
            builder.addTestDevice(hz.m5614a(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            builder.tagForChildDirectedTreatment(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzgm;
    }

    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzaf(1).zztm();
    }

    public abv getVideoController() {
        if (this.zzgm != null) {
            VideoController videoController = this.zzgm.getVideoController();
            if (videoController != null) {
                return videoController.zzbc();
            }
        }
        return null;
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzgp = context.getApplicationContext();
        this.zzgr = mediationRewardedVideoAdListener;
        this.zzgr.onInitializationSucceeded(this);
    }

    public boolean isInitialized() {
        return this.zzgr != null;
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        if (this.zzgp == null || this.zzgr == null) {
            id.m5372a(6);
            return;
        }
        this.zzgq = new InterstitialAd(this.zzgp);
        this.zzgq.zza(true);
        this.zzgq.setAdUnitId(getAdUnitId(bundle));
        this.zzgq.setRewardedVideoAdListener(this.zzgs);
        this.zzgq.loadAd(zza(this.zzgp, mediationAdRequest, bundle2, bundle));
    }

    public void onDestroy() {
        if (this.zzgm != null) {
            this.zzgm.destroy();
            this.zzgm = null;
        }
        if (this.zzgn != null) {
            this.zzgn = null;
        }
        if (this.zzgo != null) {
            this.zzgo = null;
        }
        if (this.zzgq != null) {
            this.zzgq = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        if (this.zzgn != null) {
            this.zzgn.setImmersiveMode(z);
        }
        if (this.zzgq != null) {
            this.zzgq.setImmersiveMode(z);
        }
    }

    public void onPause() {
        if (this.zzgm != null) {
            this.zzgm.pause();
        }
    }

    public void onResume() {
        if (this.zzgm != null) {
            this.zzgm.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzgm = new AdView(context);
        this.zzgm.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzgm.setAdUnitId(getAdUnitId(bundle));
        this.zzgm.setAdListener(new C1390c(this, mediationBannerListener));
        this.zzgm.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzgn = new InterstitialAd(context);
        this.zzgn.setAdUnitId(getAdUnitId(bundle));
        this.zzgn.setAdListener(new C1391d(this, mediationInterstitialListener));
        this.zzgn.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        OnCustomClickListener c1392e = new C1392e(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(c1392e);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(c1392e);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(c1392e);
        }
        if (nativeMediationAdRequest.zzmc()) {
            for (String str : nativeMediationAdRequest.zzmd().keySet()) {
                withAdListener.forCustomTemplateAd(str, c1392e, ((Boolean) nativeMediationAdRequest.zzmd().get(str)).booleanValue() ? c1392e : null);
            }
        }
        this.zzgo = withAdListener.build();
        this.zzgo.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzgn.show();
    }

    public void showVideo() {
        this.zzgq.show();
    }

    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
