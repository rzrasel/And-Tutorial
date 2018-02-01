package com.google.android.gms.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@aqv
final class ik<T> implements il<T> {
    private final T f6255a;
    private final im f6256b = new im();

    ik(T t) {
        this.f6255a = t;
        this.f6256b.m5642a();
    }

    public final void mo1478a(Runnable runnable, Executor executor) {
        this.f6256b.m5643a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        return this.f6255a;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f6255a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
