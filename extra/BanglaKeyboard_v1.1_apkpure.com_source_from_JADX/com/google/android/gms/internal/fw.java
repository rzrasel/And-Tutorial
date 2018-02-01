package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class fw implements Callable<Void> {
    private /* synthetic */ Runnable f6121a;

    fw(Runnable runnable) {
        this.f6121a = runnable;
    }

    public final /* synthetic */ Object call() {
        this.f6121a.run();
        return null;
    }
}
