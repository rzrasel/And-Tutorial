package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.ach;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.zq;

public final class InterstitialAd {
    private final ach f3931a;

    public InterstitialAd(Context context) {
        this.f3931a = new ach(context);
        C1516t.m3861a((Object) context, (Object) "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.f3931a.f4818a;
    }

    public final String getAdUnitId() {
        return this.f3931a.f4820c;
    }

    public final String getMediationAdapterClassName() {
        return this.f3931a.m4133c();
    }

    public final boolean isLoaded() {
        return this.f3931a.m4131a();
    }

    public final boolean isLoading() {
        return this.f3931a.m4132b();
    }

    public final void loadAd(AdRequest adRequest) {
        this.f3931a.m4127a(adRequest.zzaz());
    }

    public final void setAdListener(AdListener adListener) {
        this.f3931a.m4126a(adListener);
        if (adListener != null && (adListener instanceof zq)) {
            this.f3931a.m4128a((zq) adListener);
        } else if (adListener == null) {
            this.f3931a.m4128a(null);
        }
    }

    public final void setAdUnitId(String str) {
        this.f3931a.m4129a(str);
    }

    public final void setImmersiveMode(boolean z) {
        this.f3931a.m4130a(z);
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        ach com_google_android_gms_internal_ach = this.f3931a;
        try {
            com_google_android_gms_internal_ach.f4824g = rewardedVideoAdListener;
            if (com_google_android_gms_internal_ach.f4819b != null) {
                com_google_android_gms_internal_ach.f4819b.zza(rewardedVideoAdListener != null ? new cm(rewardedVideoAdListener) : null);
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set the AdListener.", e);
        }
    }

    public final void show() {
        this.f3931a.m4134d();
    }

    public final void zza(boolean z) {
        this.f3931a.f4825h = true;
    }
}
