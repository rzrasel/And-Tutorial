package android.support.v4.p016d;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class C0457c {
    final Object f1468a = new Object();
    HandlerThread f1469b;
    Handler f1470c;
    final int f1471d;
    private int f1472e;
    private Callback f1473f = new C04531(this);
    private final int f1474g;
    private final String f1475h;

    public interface C0446a<T> {
        void mo470a(T t);
    }

    class C04531 implements Callback {
        final /* synthetic */ C0457c f1455a;

        C04531(C0457c c0457c) {
            this.f1455a = c0457c;
        }

        public final boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0457c c0457c = this.f1455a;
                    synchronized (c0457c.f1468a) {
                        if (!c0457c.f1470c.hasMessages(1)) {
                            c0457c.f1469b.quit();
                            c0457c.f1469b = null;
                            c0457c.f1470c = null;
                            break;
                        }
                        break;
                    }
                case 1:
                    C0457c c0457c2 = this.f1455a;
                    ((Runnable) message.obj).run();
                    synchronized (c0457c2.f1468a) {
                        c0457c2.f1470c.removeMessages(0);
                        c0457c2.f1470c.sendMessageDelayed(c0457c2.f1470c.obtainMessage(0), (long) c0457c2.f1471d);
                    }
                    break;
            }
            return true;
        }
    }

    class C04552 implements Runnable {
        final /* synthetic */ Callable f1458a;
        final /* synthetic */ Handler f1459b;
        final /* synthetic */ C0446a f1460c;
        final /* synthetic */ C0457c f1461d;

        C04552(C0457c c0457c, Callable callable, Handler handler, C0446a c0446a) {
            this.f1461d = c0457c;
            this.f1458a = callable;
            this.f1459b = handler;
            this.f1460c = c0446a;
        }

        public final void run() {
            Object call;
            try {
                call = this.f1458a.call();
            } catch (Exception e) {
                call = null;
            }
            this.f1459b.post(new Runnable(this) {
                final /* synthetic */ C04552 f1457b;

                public final void run() {
                    this.f1457b.f1460c.mo470a(call);
                }
            });
        }
    }

    public C0457c(String str) {
        this.f1475h = str;
        this.f1474g = 10;
        this.f1471d = 10000;
        this.f1472e = 0;
    }

    public final <T> T m1190a(Callable<T> callable, int i) {
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final Callable<T> callable2 = callable;
        m1191a(new Runnable(this) {
            final /* synthetic */ C0457c f1467f;

            public final void run() {
                try {
                    atomicReference.set(callable2.call());
                } catch (Exception e) {
                }
                reentrantLock.lock();
                try {
                    atomicBoolean.set(false);
                    newCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        reentrantLock.lock();
        try {
            T t;
            if (atomicBoolean.get()) {
                long toNanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                while (true) {
                    try {
                        toNanos = newCondition.awaitNanos(toNanos);
                    } catch (InterruptedException e) {
                    }
                    if (!atomicBoolean.get()) {
                        break;
                    } else if (toNanos <= 0) {
                        throw new InterruptedException("timeout");
                    }
                }
                t = atomicReference.get();
                reentrantLock.unlock();
            } else {
                t = atomicReference.get();
            }
            return t;
        } finally {
            reentrantLock.unlock();
        }
    }

    final void m1191a(Runnable runnable) {
        synchronized (this.f1468a) {
            if (this.f1469b == null) {
                this.f1469b = new HandlerThread(this.f1475h, this.f1474g);
                this.f1469b.start();
                this.f1470c = new Handler(this.f1469b.getLooper(), this.f1473f);
                this.f1472e++;
            }
            this.f1470c.removeMessages(0);
            this.f1470c.sendMessage(this.f1470c.obtainMessage(1, runnable));
        }
    }
}
