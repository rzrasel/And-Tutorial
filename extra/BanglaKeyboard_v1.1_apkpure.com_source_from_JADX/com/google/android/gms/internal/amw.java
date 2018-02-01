package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.common.internal.C1516t;

@aqv
public final class amw implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    NativeAdMapper f5403a;
    NativeCustomTemplateAd f5404b;
    private final ami f5405c;

    public amw(ami com_google_android_gms_internal_ami) {
        this.f5405c = com_google_android_gms_internal_ami;
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        C1516t.m3867b("onAdClicked must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1877a();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdClicked.", e);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1516t.m3867b("onAdClicked must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1877a();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdClicked.", e);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        C1516t.m3867b("onAdClicked must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f5403a;
        if (this.f5404b == null) {
            if (nativeAdMapper == null) {
                id.m5370a("Could not call onAdClicked since NativeAdMapper is null.");
                return;
            } else if (!nativeAdMapper.getOverrideClickHandling()) {
                id.m5372a(3);
                return;
            }
        }
        id.m5372a(3);
        try {
            this.f5405c.mo1877a();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdClicked.", e);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        C1516t.m3867b("onAdClosed must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1882b();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdClosed.", e);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1516t.m3867b("onAdClosed must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1882b();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdClosed.", e);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        C1516t.m3867b("onAdClosed must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1882b();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdClosed.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        C1516t.m3867b("onAdFailedToLoad must be called on the main UI thread.");
        new StringBuilder(55).append("Adapter called onAdFailedToLoad with error. ").append(i);
        id.m5372a(3);
        try {
            this.f5405c.mo1878a(i);
        } catch (Throwable e) {
            id.m5371a("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C1516t.m3867b("onAdFailedToLoad must be called on the main UI thread.");
        new StringBuilder(55).append("Adapter called onAdFailedToLoad with error ").append(i).append(".");
        id.m5372a(3);
        try {
            this.f5405c.mo1878a(i);
        } catch (Throwable e) {
            id.m5371a("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        C1516t.m3867b("onAdFailedToLoad must be called on the main UI thread.");
        new StringBuilder(55).append("Adapter called onAdFailedToLoad with error ").append(i).append(".");
        id.m5372a(3);
        try {
            this.f5405c.mo1878a(i);
        } catch (Throwable e) {
            id.m5371a("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        C1516t.m3867b("onAdImpression must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f5403a;
        if (this.f5404b == null) {
            if (nativeAdMapper == null) {
                id.m5370a("Could not call onAdImpression since NativeAdMapper is null. ");
                return;
            } else if (!nativeAdMapper.getOverrideImpressionRecording()) {
                id.m5372a(3);
                return;
            }
        }
        id.m5372a(3);
        try {
            this.f5405c.mo1886f();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdImpression.", e);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        C1516t.m3867b("onAdLeftApplication must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1883c();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1516t.m3867b("onAdLeftApplication must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1883c();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        C1516t.m3867b("onAdLeftApplication must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1883c();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        C1516t.m3867b("onAdLoaded must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1885e();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1516t.m3867b("onAdLoaded must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1885e();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        C1516t.m3867b("onAdLoaded must be called on the main UI thread.");
        id.m5372a(3);
        this.f5403a = nativeAdMapper;
        try {
            this.f5405c.mo1885e();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        C1516t.m3867b("onAdOpened must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1884d();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdOpened.", e);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1516t.m3867b("onAdOpened must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1884d();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdOpened.", e);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        C1516t.m3867b("onAdOpened must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1884d();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdOpened.", e);
        }
    }

    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C1516t.m3867b("onAppEvent must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5405c.mo1881a(str, str2);
        } catch (Throwable e) {
            id.m5371a("Could not call onAppEvent.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        C1516t.m3867b("onAdLoaded must be called on the main UI thread.");
        String str = "Adapter called onAdLoaded with template id ";
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        id.m5372a(3);
        this.f5404b = nativeCustomTemplateAd;
        try {
            this.f5405c.mo1885e();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLoaded.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof ags) {
            try {
                this.f5405c.mo1879a(((ags) nativeCustomTemplateAd).f5099a, str);
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onCustomClick.", e);
                return;
            }
        }
        id.m5370a("Unexpected native custom template ad type.");
    }
}
