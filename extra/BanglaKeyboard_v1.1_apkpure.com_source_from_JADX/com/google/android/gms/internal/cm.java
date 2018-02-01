package com.google.android.gms.internal;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@aqv
public final class cm extends ci {
    private final RewardedVideoAdListener f5852a;

    public cm(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f5852a = rewardedVideoAdListener;
    }

    public final void mo1869a() {
        if (this.f5852a != null) {
            this.f5852a.onRewardedVideoAdLoaded();
        }
    }

    public final void mo1870a(int i) {
        if (this.f5852a != null) {
            this.f5852a.onRewardedVideoAdFailedToLoad(i);
        }
    }

    public final void mo1871a(bz bzVar) {
        if (this.f5852a != null) {
            this.f5852a.onRewarded(new ck(bzVar));
        }
    }

    public final void mo1872b() {
        if (this.f5852a != null) {
            this.f5852a.onRewardedVideoAdOpened();
        }
    }

    public final void mo1873c() {
        if (this.f5852a != null) {
            this.f5852a.onRewardedVideoStarted();
        }
    }

    public final void mo1874d() {
        if (this.f5852a != null) {
            this.f5852a.onRewardedVideoAdClosed();
        }
    }

    public final void mo1875e() {
        if (this.f5852a != null) {
            this.f5852a.onRewardedVideoAdLeftApplication();
        }
    }
}
