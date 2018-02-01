package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.aab;
import com.google.android.gms.internal.aag;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.aci;
import com.google.android.gms.internal.acj;
import com.google.android.gms.internal.ack;
import com.google.android.gms.internal.id;
import com.google.android.gms.p056a.C1401c;

public class MobileAds {

    public static final class Settings {
        private final ack f3932a = new ack();

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }
    }

    private MobileAds() {
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return aci.m4135a().m4136a(context);
    }

    public static void initialize(Context context) {
        initialize(context, null, null);
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        aci a = aci.m4135a();
        synchronized (aci.f4832a) {
            if (a.f4834b != null) {
            } else if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            } else {
                try {
                    a.f4834b = (abq) aab.m3997a(context, false, new aag(aak.m4023b(), context));
                    a.f4834b.initialize();
                    if (str != null) {
                        a.f4834b.zzc(str, C1401c.m3584a(new acj(a, context)));
                    }
                } catch (Throwable e) {
                    id.m5371a("MobileAdsSettingManager initialization failed", e);
                }
            }
        }
    }

    public static void openDebugMenu(Context context, String str) {
        aci a = aci.m4135a();
        C1516t.m3865a(a.f4834b != null, (Object) "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            a.f4834b.zzc(C1401c.m3584a((Object) context), str);
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    public static void setAppMuted(boolean z) {
        aci a = aci.m4135a();
        C1516t.m3865a(a.f4834b != null, (Object) "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            a.f4834b.setAppMuted(z);
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    public static void setAppVolume(float f) {
        boolean z = true;
        aci a = aci.m4135a();
        boolean z2 = 0.0f <= f && f <= 1.0f;
        C1516t.m3868b(z2, "The app volume must be a value between 0 and 1 inclusive.");
        if (a.f4834b == null) {
            z = false;
        }
        C1516t.m3865a(z, (Object) "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            a.f4834b.setAppVolume(f);
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }
}
