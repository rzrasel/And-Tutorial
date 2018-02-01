package com.orange.studio.banglatype;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.AdListener;
import java.lang.ref.WeakReference;

public final class C1727i extends AdListener {
    final WeakReference<View> f8313a;
    final WeakReference<C1716d> f8314b;
    final int f8315c;
    final Activity f8316d;

    public C1727i(Activity activity, View view, int i, C1716d c1716d) {
        this.f8316d = activity;
        this.f8313a = new WeakReference(view);
        this.f8315c = i;
        new StringBuilder("adFallbackHandler ").append(c1716d == null ? "" : "!").append("= null");
        this.f8314b = new WeakReference(c1716d);
    }

    public final void onAdFailedToLoad(int i) {
        if (this.f8313a != null) {
            View view = (View) this.f8313a.get();
            if (view != null) {
                View findViewById = view.findViewById(this.f8315c);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                C1716d c1716d = (C1716d) this.f8314b.get();
                if (c1716d != null) {
                    c1716d.mo2405a(this.f8316d, view);
                }
            }
        }
    }

    public final void onAdLeftApplication() {
    }

    public final void onAdLoaded() {
        View view = (View) this.f8313a.get();
        if (view != null) {
            view.setVisibility(0);
        }
        C1716d c1716d = (C1716d) this.f8314b.get();
        if (c1716d != null) {
            c1716d.mo2404a();
        }
    }
}
