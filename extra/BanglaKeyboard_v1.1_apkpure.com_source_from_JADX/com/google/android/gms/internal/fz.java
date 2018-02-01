package com.google.android.gms.internal;

import java.util.concurrent.Future;

final class fz implements Runnable {
    private /* synthetic */ ir f6125a;
    private /* synthetic */ Future f6126b;

    fz(ir irVar, Future future) {
        this.f6125a = irVar;
        this.f6126b = future;
    }

    public final void run() {
        if (this.f6125a.isCancelled()) {
            this.f6126b.cancel(true);
        }
    }
}
