package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

final class afs implements aey {
    private /* synthetic */ View f5066a;
    private /* synthetic */ afq f5067b;

    afs(afq com_google_android_gms_internal_afq, View view) {
        this.f5067b = com_google_android_gms_internal_afq;
        this.f5066a = view;
    }

    public final void mo1797a() {
        this.f5067b.onClick(this.f5066a);
    }

    public final void mo1798a(MotionEvent motionEvent) {
        this.f5067b.onTouch(null, motionEvent);
    }
}
