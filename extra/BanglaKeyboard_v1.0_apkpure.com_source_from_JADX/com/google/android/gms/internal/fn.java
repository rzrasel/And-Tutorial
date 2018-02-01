package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class fn implements ThreadFactory {
    private final AtomicInteger f1406a = new AtomicInteger(1);

    fn() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker #" + this.f1406a.getAndIncrement());
    }
}
