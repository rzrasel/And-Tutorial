package com.google.android.gms.internal;

import android.os.Handler;

public final class nw {
    final Handler f2015a;

    public nw(Handler handler) {
        this.f2015a = handler;
    }

    public final void m2747a(Runnable runnable) {
        this.f2015a.removeCallbacks(runnable);
    }
}
