package com.rac.stuido.banglakeyboard;

import android.view.View;
import com.google.android.gms.ads.C0176a;
import java.lang.ref.WeakReference;

public final class ac extends C0176a {
    final WeakReference f2571a;
    final WeakReference f2572b;
    final int f2573c;

    public ac(View view, int i, C0565t c0565t) {
        this.f2571a = new WeakReference(view);
        this.f2573c = i;
        "adFallbackHandler " + (c0565t == null ? "" : "!") + "= null";
        this.f2572b = new WeakReference(c0565t);
    }

    public final void mo658a() {
        View view = (View) this.f2571a.get();
        if (view != null) {
            view.setVisibility(0);
        }
        C0565t c0565t = (C0565t) this.f2572b.get();
        if (c0565t != null) {
            c0565t.mo1364a();
        }
    }

    public final void mo659a(int i) {
        "onAdFailedToLoad error" + i;
        if (this.f2571a != null) {
            View view = (View) this.f2571a.get();
            if (view != null) {
                View findViewById = view.findViewById(this.f2573c);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                C0565t c0565t = (C0565t) this.f2572b.get();
                if (c0565t != null) {
                    c0565t.mo1365a(view);
                }
            }
        }
    }

    public final void mo662d() {
    }
}
