package com.google.android.gms.internal;

import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.p056a.C1401c;

@aqv
public final class dg implements MediationRewardedVideoAdListener {
    private final dd f5908a;

    public dg(dd ddVar) {
        this.f5908a = ddVar;
    }

    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1516t.m3867b("onAdClicked must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5908a.mo2064f(C1401c.m3584a((Object) mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            id.m5371a("Could not call onAdClicked.", e);
        }
    }

    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1516t.m3867b("onAdClosed must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5908a.mo2063e(C1401c.m3584a((Object) mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            id.m5371a("Could not call onAdClosed.", e);
        }
    }

    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C1516t.m3867b("onAdFailedToLoad must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5908a.mo2060b(C1401c.m3584a((Object) mediationRewardedVideoAdAdapter), i);
        } catch (Throwable e) {
            id.m5371a("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1516t.m3867b("onAdLeftApplication must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5908a.mo2065g(C1401c.m3584a((Object) mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1516t.m3867b("onAdLoaded must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5908a.mo2059b(C1401c.m3584a((Object) mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1516t.m3867b("onAdOpened must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5908a.mo2061c(C1401c.m3584a((Object) mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            id.m5371a("Could not call onAdOpened.", e);
        }
    }

    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C1516t.m3867b("onInitializationFailed must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5908a.mo2057a(C1401c.m3584a((Object) mediationRewardedVideoAdAdapter), i);
        } catch (Throwable e) {
            id.m5371a("Could not call onInitializationFailed.", e);
        }
    }

    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1516t.m3867b("onInitializationSucceeded must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5908a.mo2056a(C1401c.m3584a((Object) mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            id.m5371a("Could not call onInitializationSucceeded.", e);
        }
    }

    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        C1516t.m3867b("onRewarded must be called on the main UI thread.");
        id.m5372a(3);
        if (rewardItem != null) {
            try {
                this.f5908a.mo2058a(C1401c.m3584a((Object) mediationRewardedVideoAdAdapter), new zzaek(rewardItem));
                return;
            } catch (Throwable e) {
                id.m5371a("Could not call onRewarded.", e);
                return;
            }
        }
        this.f5908a.mo2058a(C1401c.m3584a((Object) mediationRewardedVideoAdAdapter), new zzaek("", 1));
    }

    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C1516t.m3867b("onVideoStarted must be called on the main UI thread.");
        id.m5372a(3);
        try {
            this.f5908a.mo2062d(C1401c.m3584a((Object) mediationRewardedVideoAdAdapter));
        } catch (Throwable e) {
            id.m5371a("Could not call onVideoStarted.", e);
        }
    }
}
