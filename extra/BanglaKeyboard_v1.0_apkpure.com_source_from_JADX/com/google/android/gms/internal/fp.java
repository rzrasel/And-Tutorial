package com.google.android.gms.internal;

import android.content.Context;

final class fp implements Runnable {
    final /* synthetic */ Context f1411a;

    fp(Context context) {
        this.f1411a = context;
    }

    public final void run() {
        synchronized (fo.f1407a) {
            fo.f1409c = fo.m2011d(this.f1411a);
            fo.f1407a.notifyAll();
        }
    }
}
