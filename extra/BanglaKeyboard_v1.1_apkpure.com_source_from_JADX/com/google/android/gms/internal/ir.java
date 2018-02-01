package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@aqv
public class ir<T> implements il<T> {
    private final Object f4024a = new Object();
    private T f4025b;
    private Throwable f4026c;
    private boolean f4027d;
    private boolean f4028e;
    private final im f4029f = new im();

    private final boolean m3630a() {
        return this.f4026c != null || this.f4027d;
    }

    public final void mo1478a(Runnable runnable, Executor executor) {
        this.f4029f.m5643a(runnable, executor);
    }

    public final void m3632a(Throwable th) {
        synchronized (this.f4024a) {
            if (this.f4028e) {
            } else if (m3630a()) {
                zzbv.zzee().m5336a(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
            } else {
                this.f4026c = th;
                this.f4024a.notifyAll();
                this.f4029f.m5642a();
            }
        }
    }

    public final void m3633b(T t) {
        synchronized (this.f4024a) {
            if (this.f4028e) {
            } else if (m3630a()) {
                zzbv.zzee().m5336a(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
            } else {
                this.f4027d = true;
                this.f4025b = t;
                this.f4024a.notifyAll();
                this.f4029f.m5642a();
            }
        }
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f4024a) {
            if (m3630a()) {
                return false;
            }
            this.f4028e = true;
            this.f4027d = true;
            this.f4024a.notifyAll();
            this.f4029f.m5642a();
            return true;
        }
    }

    public T get() {
        T t;
        synchronized (this.f4024a) {
            if (!m3630a()) {
                try {
                    this.f4024a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f4026c != null) {
                throw new ExecutionException(this.f4026c);
            } else if (this.f4028e) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else {
                t = this.f4025b;
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.f4024a) {
            if (!m3630a()) {
                try {
                    long toMillis = timeUnit.toMillis(j);
                    if (toMillis != 0) {
                        this.f4024a.wait(toMillis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f4026c != null) {
                throw new ExecutionException(this.f4026c);
            } else if (!this.f4027d) {
                throw new TimeoutException("SettableFuture timed out.");
            } else if (this.f4028e) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else {
                t = this.f4025b;
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f4024a) {
            z = this.f4028e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f4024a) {
            a = m3630a();
        }
        return a;
    }
}
