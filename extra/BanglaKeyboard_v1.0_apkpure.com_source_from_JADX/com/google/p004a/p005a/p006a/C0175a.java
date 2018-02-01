package com.google.p004a.p005a.p006a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0217b;
import com.google.android.gms.ads.C0219c;
import com.google.android.gms.ads.C0220d;
import com.google.android.gms.ads.C0222e;
import com.google.android.gms.ads.p003b.C0173c;
import com.google.android.gms.ads.p003b.C0174e;
import com.google.android.gms.ads.p003b.C0214a;
import com.google.android.gms.ads.p003b.C0215d;
import com.google.android.gms.ads.p003b.C0216f;
import com.google.android.gms.internal.af;
import com.google.android.gms.internal.fz;
import java.util.Date;
import java.util.Set;

public final class C0175a implements C0173c, C0174e {
    private AdView f364a;
    private C0222e f365b;

    private static C0217b m735a(Context context, C0214a c0214a, Bundle bundle, Bundle bundle2) {
        int i = 0;
        C0219c c0219c = new C0219c();
        Date a = c0214a.mo843a();
        if (a != null) {
            c0219c.f419a.f898e = a;
        }
        int b = c0214a.mo844b();
        if (b != 0) {
            c0219c.f419a.f900g = b;
        }
        Set<String> c = c0214a.mo845c();
        if (c != null) {
            for (String add : c) {
                c0219c.f419a.f894a.add(add);
            }
        }
        if (c0214a.mo846d()) {
            c0219c.m918a(fz.m2030a(context));
        }
        if (bundle2.getInt("tagForChildDirectedTreatment") != -1) {
            boolean z = bundle2.getInt("tagForChildDirectedTreatment") == 1;
            af afVar = c0219c.f419a;
            if (z) {
                i = 1;
            }
            afVar.f904k = i;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", bundle2.getString("mad_hac"));
        if (!TextUtils.isEmpty(bundle2.getString("adJson"))) {
            bundle.putString("_ad", bundle2.getString("adJson"));
        }
        bundle.putBoolean("_noRefresh", true);
        c0219c.f419a.f895b.put(C0175a.class, bundle);
        return c0219c.m917a();
    }

    public final void mo651a() {
        if (this.f364a != null) {
            this.f364a.m895a();
            this.f364a = null;
        }
        if (this.f365b != null) {
            this.f365b = null;
        }
    }

    public final void mo652a(Context context, C0215d c0215d, Bundle bundle, C0220d c0220d, C0214a c0214a, Bundle bundle2) {
        this.f364a = new AdView(context);
        this.f364a.setAdSize(new C0220d(c0220d.m921b(), c0220d.m919a()));
        this.f364a.setAdUnitId(bundle.getString("pubid"));
        this.f364a.setAdListener(new C0177b(this, c0215d));
        this.f364a.m896a(C0175a.m735a(context, c0214a, bundle2, bundle));
    }

    public final void mo653a(Context context, C0216f c0216f, Bundle bundle, C0214a c0214a, Bundle bundle2) {
        this.f365b = new C0222e(context);
        this.f365b.m925a(bundle.getString("pubid"));
        this.f365b.m923a(new C0178c(this, c0216f));
        this.f365b.m924a(C0175a.m735a(context, c0214a, bundle2, bundle));
    }

    public final void mo654b() {
        if (this.f364a != null) {
            this.f364a.m897b();
        }
    }

    public final void mo655c() {
        if (this.f364a != null) {
            this.f364a.m898c();
        }
    }

    public final View mo656d() {
        return this.f364a;
    }

    public final void mo657e() {
        this.f365b.m927b();
    }
}
