package android.support.v4.widget;

import android.support.v4.view.an;
import android.view.View;

final class C0125z implements Runnable {
    final View f350a;
    final /* synthetic */ SlidingPaneLayout f351b;

    C0125z(SlidingPaneLayout slidingPaneLayout, View view) {
        this.f351b = slidingPaneLayout;
        this.f350a = view;
    }

    public final void run() {
        if (this.f350a.getParent() == this.f351b) {
            an.m328a(this.f350a, 0, null);
            this.f351b.m551c(this.f350a);
        }
        this.f351b.f252u.remove(this);
    }
}
