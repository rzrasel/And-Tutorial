package com.bumptech.glide.load.p044b.p047c;

import android.os.Process;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class C1229a extends ThreadPoolExecutor {
    private final AtomicInteger f3576a;
    private final C1226c f3577b;

    public static class C1224a implements ThreadFactory {
        int f3569a = 0;

        public final Thread newThread(Runnable runnable) {
            Thread c12231 = new Thread(this, runnable, "fifo-pool-thread-" + this.f3569a) {
                final /* synthetic */ C1224a f3568a;

                public final void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            };
            this.f3569a++;
            return c12231;
        }
    }

    static class C1225b<T> extends FutureTask<T> implements Comparable<C1225b<?>> {
        private final int f3570a;
        private final int f3571b;

        public C1225b(Runnable runnable, T t, int i) {
            super(runnable, t);
            if (runnable instanceof C1230b) {
                this.f3570a = ((C1230b) runnable).mo1370a();
                this.f3571b = i;
                return;
            }
            throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            C1225b c1225b = (C1225b) obj;
            int i = this.f3570a - c1225b.f3570a;
            return i == 0 ? this.f3571b - c1225b.f3571b : i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1225b)) {
                return false;
            }
            C1225b c1225b = (C1225b) obj;
            return this.f3571b == c1225b.f3571b && this.f3570a == c1225b.f3570a;
        }

        public final int hashCode() {
            return (this.f3570a * 31) + this.f3571b;
        }
    }

    public enum C1226c {
        IGNORE;

        protected void mo1361a(Throwable th) {
        }
    }

    public C1229a(int i) {
        this(i, C1226c.f3573b);
    }

    private C1229a(int i, int i2, TimeUnit timeUnit, ThreadFactory threadFactory, C1226c c1226c) {
        super(i, i2, 0, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.f3576a = new AtomicInteger();
        this.f3577b = c1226c;
    }

    private C1229a(int i, C1226c c1226c) {
        this(i, i, TimeUnit.MILLISECONDS, new C1224a(), c1226c);
    }

    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (future.isDone() && !future.isCancelled()) {
                try {
                    future.get();
                } catch (Throwable e) {
                    this.f3577b.mo1361a(e);
                } catch (Throwable e2) {
                    this.f3577b.mo1361a(e2);
                }
            }
        }
    }

    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C1225b(runnable, t, this.f3576a.getAndIncrement());
    }
}
