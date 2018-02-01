package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

final class co extends RelativeLayout {
    private final fr f1140a;

    public co(Context context, String str) {
        super(context);
        this.f1140a = new fr(context, str);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f1140a.m2013a(motionEvent);
        return false;
    }
}
