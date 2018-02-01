package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;

@aqv
final class jb extends jd implements OnGlobalLayoutListener {
    private final WeakReference<OnGlobalLayoutListener> f6275a;

    public jb(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f6275a = new WeakReference(onGlobalLayoutListener);
    }

    protected final void mo2129a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    protected final void mo2130b(ViewTreeObserver viewTreeObserver) {
        zzbv.zzec().mo2109a(viewTreeObserver, (OnGlobalLayoutListener) this);
    }

    public final void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.f6275a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            m5660b();
        }
    }
}
