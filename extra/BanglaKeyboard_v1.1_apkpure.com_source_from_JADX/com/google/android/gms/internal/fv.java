package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@aqv
public final class fv {
    public static final ThreadPoolExecutor f6119a = new ThreadPoolExecutor(20, 20, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), m5427a("Default"));
    private static final ThreadPoolExecutor f6120b = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), m5427a("Loader"));

    static {
        f6119a.allowCoreThreadTimeOut(true);
        f6120b.allowCoreThreadTimeOut(true);
    }

    public static il<Void> m5424a(int i, Runnable runnable) {
        return i == 1 ? m5426a(f6120b, new fw(runnable)) : m5426a(f6119a, new fx(runnable));
    }

    public static il<Void> m5425a(Runnable runnable) {
        return m5424a(0, runnable);
    }

    public static <T> il<T> m5426a(ExecutorService executorService, Callable<T> callable) {
        Object irVar = new ir();
        try {
            irVar.mo1478a(new fz(irVar, executorService.submit(new fy(irVar, callable))), io.f6262a);
        } catch (Throwable e) {
            id.m5371a("Thread execution is rejected.", e);
            irVar.m3632a(e);
        }
        return irVar;
    }

    private static ThreadFactory m5427a(String str) {
        return new ga(str);
    }
}
