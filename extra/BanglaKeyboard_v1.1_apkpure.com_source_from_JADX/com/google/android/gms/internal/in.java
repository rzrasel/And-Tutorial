package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final /* synthetic */ class in implements Runnable {
    private final Executor f6260a;
    private final Runnable f6261b;

    in(Executor executor, Runnable runnable) {
        this.f6260a = executor;
        this.f6261b = runnable;
    }

    public final void run() {
        this.f6260a.execute(this.f6261b);
    }
}
