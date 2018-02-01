package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;

final class nr extends ViewSwitcher {
    private final fr f1990a;

    public nr(Context context) {
        super(context);
        this.f1990a = new fr(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f1990a.m2013a(motionEvent);
        return false;
    }
}
