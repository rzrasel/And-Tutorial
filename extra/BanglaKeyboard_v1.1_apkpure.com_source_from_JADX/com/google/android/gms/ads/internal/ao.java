package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class ao implements OnTouchListener {
    private /* synthetic */ zzw f3984a;
    private /* synthetic */ am f3985b;

    ao(am amVar, zzw com_google_android_gms_ads_internal_zzw) {
        this.f3985b = amVar;
        this.f3984a = com_google_android_gms_ads_internal_zzw;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f3984a.recordClick();
        if (this.f3985b.f3980b != null) {
            this.f3985b.f3980b.mo2081c();
        }
        return false;
    }
}
