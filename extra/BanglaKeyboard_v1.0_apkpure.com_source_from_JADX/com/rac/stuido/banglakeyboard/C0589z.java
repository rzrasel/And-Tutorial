package com.rac.stuido.banglakeyboard;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import com.actionbarsherlock.C0126R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0217b;
import com.google.android.gms.ads.C0219c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C0589z extends ay {
    private int f2848c = C0126R.layout.ad_mob_user;

    private static C0219c m4068a(C0219c c0219c, List list) {
        if (!(c0219c == null || list.isEmpty())) {
            for (int i = 0; i < list.size(); i++) {
                c0219c.m918a((String) list.get(i));
            }
        }
        return c0219c;
    }

    private static AdView m4069d(Activity activity) {
        if (activity != null) {
            View findViewById = activity.findViewById(C0126R.id.adView);
            if (findViewById instanceof AdView) {
                return (AdView) findViewById;
            }
            Log.w("AdMobHelper", "adView is not a AdView: " + findViewById);
        }
        return null;
    }

    protected final void mo1374a(Activity activity) {
        AdView d = C0589z.m4069d(activity);
        if (d != null) {
            d.m897b();
        }
    }

    protected final boolean mo1360a() {
        return true;
    }

    protected final boolean mo1362a(View view) {
        AdView adView = (AdView) view.findViewById(C0126R.id.adView);
        if (adView == null) {
            return false;
        }
        boolean z;
        int id = view.getId();
        C0565t c0565t = this.f2574a;
        adView.setAdListener(new ac(view, id, this.f2574a));
        if (adView instanceof AdView) {
            AdView adView2 = adView;
            C0219c c0219c = new C0219c();
            c0219c.m918a(C0217b.f417a);
            C0219c a = C0589z.m4068a(c0219c, Arrays.asList(new String[]{"C39203941AC786B976B85F06ACEB89BE", "5444FE11789FF7333B9F56DB9EC0C446", "390628E1FDFD79E35567637E2603A8EB", "EED192D773A9B7436C3A9A743587FA4D", "622AA3C27ADCC76B9ABFE62D22F8D4EF", "2286CDC2A13EC017EDC99FCD411F0C92", "40B1500D2CDD19C0520EF1919AB29C70"}));
            if ((!"".isEmpty() ? 1 : 0) != 0) {
                List arrayList = new ArrayList();
                if (!"".isEmpty()) {
                    arrayList = Arrays.asList("".split("\\s*,\\s*"));
                }
                c0219c = C0589z.m4068a(a, arrayList);
            } else {
                c0219c = a;
            }
            C0217b a2 = c0219c.m917a();
            if (a2 != null) {
                adView2.m896a(a2);
                z = true;
                adView.setVisibility(0);
                return z;
            }
        }
        z = false;
        adView.setVisibility(0);
        return z;
    }

    protected final int mo1363b() {
        return this.f2848c;
    }

    protected final void mo1375b(Activity activity) {
        AdView d = C0589z.m4069d(activity);
        if (d != null) {
            d.m898c();
        }
    }

    protected final void mo1376c(Activity activity) {
        AdView d = C0589z.m4069d(activity);
        if (d != null) {
            d.m895a();
        }
    }
}
