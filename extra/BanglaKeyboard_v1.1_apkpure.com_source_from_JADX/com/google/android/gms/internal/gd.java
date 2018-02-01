package com.google.android.gms.internal;

import android.content.Context;

final class gd implements Runnable {
    private /* synthetic */ Context f6142a;
    private /* synthetic */ gb f6143b;

    gd(gb gbVar, Context context) {
        this.f6143b = gbVar;
        this.f6142a = context;
    }

    public final void run() {
        synchronized (this.f6143b.f6135e) {
            this.f6143b.f6137g = gb.m5467b(this.f6142a);
            this.f6143b.f6135e.notifyAll();
        }
    }
}
