package com.google.android.gms.internal;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

final class aqm implements OnScrollChangedListener {
    private /* synthetic */ WeakReference f5654a;
    private /* synthetic */ aqf f5655b;

    aqm(aqf com_google_android_gms_internal_aqf, WeakReference weakReference) {
        this.f5655b = com_google_android_gms_internal_aqf;
        this.f5654a = weakReference;
    }

    public final void onScrollChanged() {
        aqf.m5077a(this.f5655b, this.f5654a, true);
    }
}
