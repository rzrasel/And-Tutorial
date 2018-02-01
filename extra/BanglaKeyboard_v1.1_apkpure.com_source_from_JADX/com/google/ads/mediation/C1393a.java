package com.google.ads.mediation;

import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

final class C1393a implements RewardedVideoAdListener {
    private /* synthetic */ AbstractAdViewAdapter f3904a;

    C1393a(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f3904a = abstractAdViewAdapter;
    }

    public final void onRewarded(RewardItem rewardItem) {
        this.f3904a.zzgr.onRewarded(this.f3904a, rewardItem);
    }

    public final void onRewardedVideoAdClosed() {
        this.f3904a.zzgr.onAdClosed(this.f3904a);
        this.f3904a.zzgq = null;
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        this.f3904a.zzgr.onAdFailedToLoad(this.f3904a, i);
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.f3904a.zzgr.onAdLeftApplication(this.f3904a);
    }

    public final void onRewardedVideoAdLoaded() {
        this.f3904a.zzgr.onAdLoaded(this.f3904a);
    }

    public final void onRewardedVideoAdOpened() {
        this.f3904a.zzgr.onAdOpened(this.f3904a);
    }

    public final void onRewardedVideoStarted() {
        this.f3904a.zzgr.onVideoStarted(this.f3904a);
    }
}
