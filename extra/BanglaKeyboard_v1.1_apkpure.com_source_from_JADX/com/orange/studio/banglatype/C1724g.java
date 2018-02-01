package com.orange.studio.banglatype;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C1724g extends C1704x {
    private int f8308c = R.layout.ad_mob_user;
    private Activity f8309d = null;

    private static Builder m7477a(Builder builder, List<String> list) {
        if (!(builder == null || list.isEmpty())) {
            for (int i = 0; i < list.size(); i++) {
                builder.addTestDevice((String) list.get(i));
            }
        }
        return builder;
    }

    private static AdView m7478d(Activity activity) {
        if (activity != null) {
            View findViewById = activity.findViewById(R.id.adView);
            if (findViewById instanceof AdView) {
                return (AdView) findViewById;
            }
            Log.w("AdMobHelper", "adView is not a AdView: " + findViewById);
        }
        return null;
    }

    protected final void mo2407a(Activity activity) {
        AdView d = C1724g.m7478d(activity);
        if (d != null) {
            d.pause();
        }
    }

    protected final boolean mo2388a() {
        return true;
    }

    protected final boolean mo2389a(Activity activity, View view) {
        this.f8309d = activity;
        AdView adView = (AdView) view.findViewById(R.id.adView);
        if (adView == null) {
            return false;
        }
        boolean z;
        adView.setAdListener(new C1727i(activity, view, view.getId(), this.f8130a));
        if (adView instanceof AdView) {
            AdView adView2 = adView;
            Builder builder = new Builder();
            builder.addTestDevice("B3EEABB8EE11C2BE770B684D95219ECB");
            Builder a = C1724g.m7477a(builder, Arrays.asList(new String[]{"C39203941AC786B976B85F06ACEB89BE", "5444FE11789FF7333B9F56DB9EC0C446", "390628E1FDFD79E35567637E2603A8EB", "EED192D773A9B7436C3A9A743587FA4D", "622AA3C27ADCC76B9ABFE62D22F8D4EF", "2286CDC2A13EC017EDC99FCD411F0C92", "40B1500D2CDD19C0520EF1919AB29C70", "E43A84FAA5F4D1437B4F711DB66BCD5E", "C59B8D0CED3705D8942A7832FB2A3C28"}));
            if ((!"".isEmpty() ? 1 : 0) != 0) {
                List arrayList = new ArrayList();
                if (!"".isEmpty()) {
                    arrayList = Arrays.asList("".split("\\s*,\\s*"));
                }
                builder = C1724g.m7477a(a, arrayList);
            } else {
                builder = a;
            }
            AdRequest build = builder.build();
            if (build != null) {
                adView2.loadAd(build);
                z = true;
                adView.setVisibility(0);
                return z;
            }
        }
        z = false;
        adView.setVisibility(0);
        return z;
    }

    protected final int mo2391b() {
        return this.f8308c;
    }

    protected final void mo2408b(Activity activity) {
        AdView d = C1724g.m7478d(activity);
        if (d != null) {
            d.resume();
        }
    }

    protected final void mo2409c(Activity activity) {
        AdView d = C1724g.m7478d(activity);
        if (d != null) {
            d.destroy();
        }
        if (activity != null && this.f8309d != null && activity == this.f8309d) {
            this.f8309d = null;
        }
    }
}
