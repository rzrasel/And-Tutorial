package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class fx implements Callable<Void> {
    private /* synthetic */ Runnable f6122a;

    fx(Runnable runnable) {
        this.f6122a = runnable;
    }

    public final /* synthetic */ Object call() {
        this.f6122a.run();
        return null;
    }
}
