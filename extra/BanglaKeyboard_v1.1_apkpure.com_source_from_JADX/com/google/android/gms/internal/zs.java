package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

@aqv
public final class zs extends aar {
    final AdListener f7563a;

    public zs(AdListener adListener) {
        this.f7563a = adListener;
    }

    public final void mo1688a() {
        this.f7563a.onAdClosed();
    }

    public final void mo1689a(int i) {
        this.f7563a.onAdFailedToLoad(i);
    }

    public final void mo1690b() {
        this.f7563a.onAdLeftApplication();
    }

    public final void mo1691c() {
        this.f7563a.onAdLoaded();
    }

    public final void mo1692d() {
        this.f7563a.onAdOpened();
    }

    public final void mo1693e() {
        this.f7563a.onAdClicked();
    }

    public final void mo1694f() {
        this.f7563a.onAdImpression();
    }
}
