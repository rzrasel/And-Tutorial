package com.google.android.gms.internal;

import java.util.concurrent.Future;

final /* synthetic */ class ij implements Runnable {
    private final il f6253a;
    private final Future f6254b;

    ij(il ilVar, Future future) {
        this.f6253a = ilVar;
        this.f6254b = future;
    }

    public final void run() {
        il ilVar = this.f6253a;
        Future future = this.f6254b;
        if (ilVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
