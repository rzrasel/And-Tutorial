package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.C1538g;

@aqv
public final class zzwn implements MediationInterstitialAdapter {
    private Activity f7793a;
    private MediationInterstitialListener f7794b;
    private Uri f7795c;

    public final void onDestroy() {
        id.m5372a(3);
    }

    public final void onPause() {
        id.m5372a(3);
    }

    public final void onResume() {
        id.m5372a(3);
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f7794b = mediationInterstitialListener;
        if (this.f7794b == null) {
            id.m5370a("Listener not set for mediation. Returning.");
        } else if (context instanceof Activity) {
            int i = (C1538g.m3941a() && aem.m4259a(context)) ? 1 : 0;
            if (i == 0) {
                id.m5370a("Default browser does not support custom tabs. Bailing out.");
                this.f7794b.onAdFailedToLoad(this, 0);
                return;
            }
            Object string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                id.m5370a("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f7794b.onAdFailedToLoad(this, 0);
                return;
            }
            this.f7793a = (Activity) context;
            this.f7795c = Uri.parse(string);
            this.f7794b.onAdLoaded(this);
        } else {
            id.m5370a("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f7794b.onAdFailedToLoad(this, 0);
        }
    }

    public final void showInterstitial() {
        CustomTabsIntent build = new Builder().build();
        build.intent.setData(this.f7795c);
        gb.f6131a.post(new anr(this, new AdOverlayInfoParcel(new zzc(build.intent), null, new anq(this), null, new zzajk(0, 0, false))));
        zzbv.zzee().f6023h.m5364a(el.f6046b, el.f6047c);
    }
}
