package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@aqv
abstract class jd {
    private final WeakReference<View> f6274a;

    public jd(View view) {
        this.f6274a = new WeakReference(view);
    }

    private final ViewTreeObserver m5657c() {
        View view = (View) this.f6274a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        return (viewTreeObserver == null || !viewTreeObserver.isAlive()) ? null : viewTreeObserver;
    }

    public final void m5658a() {
        ViewTreeObserver c = m5657c();
        if (c != null) {
            mo2129a(c);
        }
    }

    protected abstract void mo2129a(ViewTreeObserver viewTreeObserver);

    public final void m5660b() {
        ViewTreeObserver c = m5657c();
        if (c != null) {
            mo2130b(c);
        }
    }

    protected abstract void mo2130b(ViewTreeObserver viewTreeObserver);
}
