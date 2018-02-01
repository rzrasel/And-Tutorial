package com.google.android.gms.internal;

import android.view.View;
import android.widget.FrameLayout;

final class afr implements Runnable {
    private /* synthetic */ afe f5064a;
    private /* synthetic */ afq f5065b;

    afr(afq com_google_android_gms_internal_afq, afe com_google_android_gms_internal_afe) {
        this.f5065b = com_google_android_gms_internal_afq;
        this.f5064a = com_google_android_gms_internal_afe;
    }

    public final void run() {
        jf d;
        try {
            d = this.f5064a.mo1817d();
        } catch (Exception e) {
            id.m5372a(6);
            d = null;
        }
        if (!(d == null || this.f5065b.f5054a == null)) {
            FrameLayout frameLayout = this.f5065b.f5054a;
            if (d == null) {
                throw null;
            }
            frameLayout.addView((View) d);
        }
        if (!(this.f5064a instanceof aez)) {
            afq.m4455a(this.f5065b, this.f5064a);
        }
    }
}
