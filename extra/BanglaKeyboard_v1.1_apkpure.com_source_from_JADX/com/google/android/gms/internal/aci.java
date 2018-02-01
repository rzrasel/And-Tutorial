package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAd;

@aqv
public final class aci {
    public static final Object f4832a = new Object();
    private static aci f4833c;
    public abq f4834b;
    private RewardedVideoAd f4835d;

    private aci() {
    }

    public static aci m4135a() {
        aci com_google_android_gms_internal_aci;
        synchronized (f4832a) {
            if (f4833c == null) {
                f4833c = new aci();
            }
            com_google_android_gms_internal_aci = f4833c;
        }
        return com_google_android_gms_internal_aci;
    }

    public final RewardedVideoAd m4136a(Context context) {
        RewardedVideoAd rewardedVideoAd;
        synchronized (f4832a) {
            if (this.f4835d != null) {
                rewardedVideoAd = this.f4835d;
            } else {
                this.f4835d = new co(context, (cc) aab.m3997a(context, false, new aai(aak.m4023b(), context, new ama())));
                rewardedVideoAd = this.f4835d;
            }
        }
        return rewardedVideoAd;
    }
}
