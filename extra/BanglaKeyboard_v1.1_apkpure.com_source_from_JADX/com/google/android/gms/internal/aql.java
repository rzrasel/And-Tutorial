package com.google.android.gms.internal;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

final class aql implements OnGlobalLayoutListener {
    private /* synthetic */ WeakReference f5652a;
    private /* synthetic */ aqf f5653b;

    aql(aqf com_google_android_gms_internal_aqf, WeakReference weakReference) {
        this.f5653b = com_google_android_gms_internal_aqf;
        this.f5652a = weakReference;
    }

    public final void onGlobalLayout() {
        aqf.m5077a(this.f5653b, this.f5652a, false);
    }
}
