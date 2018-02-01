package com.google.android.gms.internal;

import java.util.concurrent.Future;

final class au implements Runnable {
    private /* synthetic */ Future f5694a;

    au(Future future) {
        this.f5694a = future;
    }

    public final void run() {
        if (!this.f5694a.isDone()) {
            this.f5694a.cancel(true);
        }
    }
}
