package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

@aqv
public final class anb<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    private final ami f5431a;

    public anb(ami com_google_android_gms_internal_ami) {
        this.f5431a = com_google_android_gms_internal_ami;
    }

    public final void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        id.m5372a(3);
        aak.m4022a();
        if (hz.m5626b()) {
            try {
                this.f5431a.mo1877a();
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onAdClicked.", e);
                return;
            }
        }
        id.m5370a("onClick must be called on the main UI thread.");
        hz.f6240a.post(new and(this));
    }

    public final void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        id.m5372a(3);
        aak.m4022a();
        if (hz.m5626b()) {
            try {
                this.f5431a.mo1882b();
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onAdClosed.", e);
                return;
            }
        }
        id.m5370a("onDismissScreen must be called on the main UI thread.");
        hz.f6240a.post(new ang(this));
    }

    public final void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        id.m5372a(3);
        aak.m4022a();
        if (hz.m5626b()) {
            try {
                this.f5431a.mo1882b();
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onAdClosed.", e);
                return;
            }
        }
        id.m5370a("onDismissScreen must be called on the main UI thread.");
        hz.f6240a.post(new anl(this));
    }

    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error. ").append(valueOf);
        id.m5372a(3);
        aak.m4022a();
        if (hz.m5626b()) {
            try {
                this.f5431a.mo1878a(ano.m4978a(errorCode));
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        id.m5370a("onFailedToReceiveAd must be called on the main UI thread.");
        hz.f6240a.post(new anh(this, errorCode));
    }

    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error ").append(valueOf).append(".");
        id.m5372a(3);
        aak.m4022a();
        if (hz.m5626b()) {
            try {
                this.f5431a.mo1878a(ano.m4978a(errorCode));
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        id.m5370a("onFailedToReceiveAd must be called on the main UI thread.");
        hz.f6240a.post(new anm(this, errorCode));
    }

    public final void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        id.m5372a(3);
        aak.m4022a();
        if (hz.m5626b()) {
            try {
                this.f5431a.mo1883c();
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        id.m5370a("onLeaveApplication must be called on the main UI thread.");
        hz.f6240a.post(new ani(this));
    }

    public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        id.m5372a(3);
        aak.m4022a();
        if (hz.m5626b()) {
            try {
                this.f5431a.mo1883c();
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        id.m5370a("onLeaveApplication must be called on the main UI thread.");
        hz.f6240a.post(new ann(this));
    }

    public final void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        id.m5372a(3);
        aak.m4022a();
        if (hz.m5626b()) {
            try {
                this.f5431a.mo1884d();
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onAdOpened.", e);
                return;
            }
        }
        id.m5370a("onPresentScreen must be called on the main UI thread.");
        hz.f6240a.post(new anj(this));
    }

    public final void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        id.m5372a(3);
        aak.m4022a();
        if (hz.m5626b()) {
            try {
                this.f5431a.mo1884d();
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onAdOpened.", e);
                return;
            }
        }
        id.m5370a("onPresentScreen must be called on the main UI thread.");
        hz.f6240a.post(new ane(this));
    }

    public final void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        id.m5372a(3);
        aak.m4022a();
        if (hz.m5626b()) {
            try {
                this.f5431a.mo1885e();
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onAdLoaded.", e);
                return;
            }
        }
        id.m5370a("onReceivedAd must be called on the main UI thread.");
        hz.f6240a.post(new ank(this));
    }

    public final void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        id.m5372a(3);
        aak.m4022a();
        if (hz.m5626b()) {
            try {
                this.f5431a.mo1885e();
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onAdLoaded.", e);
                return;
            }
        }
        id.m5370a("onReceivedAd must be called on the main UI thread.");
        hz.f6240a.post(new anf(this));
    }
}
