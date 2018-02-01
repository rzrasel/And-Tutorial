package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class dx implements ThreadFactory {
    private final AtomicInteger f5939a = new AtomicInteger(1);

    dx() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.f5939a.getAndIncrement());
    }
}
