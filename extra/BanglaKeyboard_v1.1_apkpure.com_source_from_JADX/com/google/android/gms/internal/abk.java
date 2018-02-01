package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.p056a.C1398a;

public interface abk extends IInterface {
    aax createAdLoaderBuilder(C1398a c1398a, String str, amc com_google_android_gms_internal_amc, int i);

    aoi createAdOverlay(C1398a c1398a);

    abc createBannerAdManager(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, int i);

    aor createInAppPurchaseManager(C1398a c1398a);

    abc createInterstitialAdManager(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, int i);

    agc createNativeAdViewDelegate(C1398a c1398a, C1398a c1398a2);

    cc createRewardedVideoAd(C1398a c1398a, amc com_google_android_gms_internal_amc, int i);

    abc createSearchAdManager(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, String str, int i);

    abq getMobileAdsSettingsManager(C1398a c1398a);

    abq getMobileAdsSettingsManagerWithClientJarVersion(C1398a c1398a, int i);
}
