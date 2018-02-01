package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.gms.internal.id;
import com.google.android.gms.p056a.C1401c;

final class ab implements OnTouchListener {
    private /* synthetic */ zzbp f3964a;

    ab(zzbp com_google_android_gms_ads_internal_zzbp) {
        this.f3964a = com_google_android_gms_ads_internal_zzbp;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f3964a.f4382h != null) {
            try {
                this.f3964a.f4382h.f7318a.mo2306d(C1401c.m3584a((Object) motionEvent));
            } catch (Throwable e) {
                id.m5371a("Unable to process ad data", e);
            }
        }
        return false;
    }
}
