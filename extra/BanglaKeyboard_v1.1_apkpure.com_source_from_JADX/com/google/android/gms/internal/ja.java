package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;

@aqv
public final class ja {
    public static void m5655a(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        new jb(view, onGlobalLayoutListener).m5658a();
    }

    public static void m5656a(View view, OnScrollChangedListener onScrollChangedListener) {
        new jc(view, onScrollChangedListener).m5658a();
    }
}
