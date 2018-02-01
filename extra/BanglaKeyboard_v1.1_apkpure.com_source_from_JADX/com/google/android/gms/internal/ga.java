package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ga implements ThreadFactory {
    private final AtomicInteger f6129a = new AtomicInteger(1);
    private /* synthetic */ String f6130b;

    ga(String str) {
        this.f6130b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f6130b;
        return new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 23).append("AdWorker(").append(str).append(") #").append(this.f6129a.getAndIncrement()).toString());
    }
}
