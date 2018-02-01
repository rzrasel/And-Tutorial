package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

@aqv
final class jc extends jd implements OnScrollChangedListener {
    private final WeakReference<OnScrollChangedListener> f6276a;

    public jc(View view, OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f6276a = new WeakReference(onScrollChangedListener);
    }

    protected final void mo2129a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    protected final void mo2130b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public final void onScrollChanged() {
        OnScrollChangedListener onScrollChangedListener = (OnScrollChangedListener) this.f6276a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            m5660b();
        }
    }
}
