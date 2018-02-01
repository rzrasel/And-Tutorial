package com.google.android.gms.internal;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class ji implements OnAttachStateChangeListener {
    private /* synthetic */ dq f6315a;
    private /* synthetic */ jg f6316b;

    ji(jg jgVar, dq dqVar) {
        this.f6316b = jgVar;
        this.f6315a = dqVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f6316b.m5718a(view, this.f6315a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
