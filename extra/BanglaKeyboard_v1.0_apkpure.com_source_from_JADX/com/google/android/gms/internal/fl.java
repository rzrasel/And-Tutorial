package com.google.android.gms.internal;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class fl {
    private static final ThreadFactory f1403a = new fn();
    private static final ThreadPoolExecutor f1404b = new ThreadPoolExecutor(0, 10, 65, TimeUnit.SECONDS, new SynchronousQueue(true), f1403a);

    public static void m1985a(Runnable runnable) {
        try {
            f1404b.execute(new fm(runnable));
        } catch (Throwable e) {
            gb.m2070a("Too many background threads already running. Aborting task.  Current pool size: " + f1404b.getPoolSize(), e);
        }
    }
}
