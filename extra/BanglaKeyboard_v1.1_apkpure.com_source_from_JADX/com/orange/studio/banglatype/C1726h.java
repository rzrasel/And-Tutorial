package com.orange.studio.banglatype;

import android.app.Activity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C1726h extends InterstitialHelperBase {
    InterstitialAd f8311a;
    private String f8312g;

    class C17251 extends AdListener {
        final /* synthetic */ C1726h f8310a;

        C17251(C1726h c1726h) {
            this.f8310a = c1726h;
        }

        public final void onAdClosed() {
            this.f8310a.f8311a = null;
            InterstitialHelperBase.f7914e = null;
            this.f8310a.m7156d();
        }

        public final void onAdFailedToLoad(int i) {
            "${andromo.ads.interstitial.andromo.admob.pool.id}".equals(this.f8310a.f8312g);
            this.f8310a.f8311a = null;
            this.f8310a.m7157e();
        }

        public final void onAdLoaded() {
            "${andromo.ads.interstitial.andromo.admob.pool.id}".equals(this.f8310a.f8312g);
        }

        public final void onAdOpened() {
            "${andromo.ads.interstitial.andromo.admob.pool.id}".equals(this.f8310a.f8312g);
        }
    }

    public C1726h(String str) {
        this.f8312g = str;
    }

    private static Builder m7485a(Builder builder, List<String> list) {
        if (!(builder == null || list.isEmpty())) {
            for (int i = 0; i < list.size(); i++) {
                builder.addTestDevice((String) list.get(i));
            }
        }
        return builder;
    }

    private static AdRequest m7487f() {
        Builder a;
        int i = 1;
        Builder builder = new Builder();
        builder.addTestDevice("B3EEABB8EE11C2BE770B684D95219ECB");
        builder = C1726h.m7485a(builder, Arrays.asList(new String[]{"C39203941AC786B976B85F06ACEB89BE", "5444FE11789FF7333B9F56DB9EC0C446", "390628E1FDFD79E35567637E2603A8EB", "EED192D773A9B7436C3A9A743587FA4D", "622AA3C27ADCC76B9ABFE62D22F8D4EF", "2286CDC2A13EC017EDC99FCD411F0C92", "40B1500D2CDD19C0520EF1919AB29C70", "E43A84FAA5F4D1437B4F711DB66BCD5E", "C59B8D0CED3705D8942A7832FB2A3C28"}));
        if ("".isEmpty()) {
            i = 0;
        }
        if (i != 0) {
            List arrayList = new ArrayList();
            if (!"".isEmpty()) {
                arrayList = Arrays.asList("".split("\\s*,\\s*"));
            }
            a = C1726h.m7485a(builder, arrayList);
        } else {
            a = builder;
        }
        return a.build();
    }

    protected final int mo2410a() {
        return bm.f8225c;
    }

    protected final boolean mo2411a(Activity activity) {
        if (activity == null) {
            return false;
        }
        new StringBuilder("initializeInterstitial - AdMob unitID").append(this.f8312g);
        this.f8311a = new InterstitialAd(activity.getApplicationContext());
        this.f8311a.setAdUnitId(this.f8312g);
        if (this.f8311a == null) {
            return false;
        }
        if (!this.f8311a.isLoaded()) {
            AdRequest f = C1726h.m7487f();
            this.f8311a.setAdListener(new C17251(this));
            this.f8311a.loadAd(f);
        }
        return true;
    }

    protected final void mo2412b(Activity activity) {
        super.mo2412b(activity);
        if (this.f8311a != null) {
            this.f8311a = null;
        }
    }

    protected final boolean mo2413b() {
        return this.f8311a != null && this.f8311a.isLoaded();
    }

    protected final boolean mo2414c() {
        new StringBuilder("showInterstitial - AdMob unitID").append(this.f8312g);
        if (this.f8311a == null || !this.f8311a.isLoaded()) {
            return false;
        }
        this.f8311a.show();
        return true;
    }
}
