package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gq;

@aqv
final class C1466u extends RelativeLayout {
    boolean f4143a;
    private gq f4144b;

    public C1466u(Context context, String str, String str2) {
        super(context);
        this.f4144b = new gq(context, str);
        this.f4144b.f6151d = str2;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f4143a) {
            this.f4144b.m5564a(motionEvent);
        }
        return false;
    }
}
