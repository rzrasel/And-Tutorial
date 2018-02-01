package android.support.design.widget;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

final class C0256m {
    private static C0256m f1066d;
    final Object f1067a = new Object();
    C0255b f1068b;
    C0255b f1069c;
    private final Handler f1070e = new Handler(Looper.getMainLooper(), new C02531(this));

    class C02531 implements Callback {
        final /* synthetic */ C0256m f1062a;

        C02531(C0256m c0256m) {
            this.f1062a = c0256m;
        }

        public final boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0256m c0256m = this.f1062a;
                    C0255b c0255b = (C0255b) message.obj;
                    synchronized (c0256m.f1067a) {
                        if (c0256m.f1068b == c0255b || c0256m.f1069c == c0255b) {
                            c0256m.m687a(c0255b);
                        }
                    }
                    return true;
                default:
                    return false;
            }
        }
    }

    interface C0254a {
    }

    private static class C0255b {
        final WeakReference<C0254a> f1063a;
        int f1064b;
        boolean f1065c;

        final boolean m684a(C0254a c0254a) {
            return c0254a != null && this.f1063a.get() == c0254a;
        }
    }

    private C0256m() {
    }

    static C0256m m685a() {
        if (f1066d == null) {
            f1066d = new C0256m();
        }
        return f1066d;
    }

    public final void m686a(C0254a c0254a) {
        synchronized (this.f1067a) {
            if (m691d(c0254a) && !this.f1068b.f1065c) {
                this.f1068b.f1065c = true;
                this.f1070e.removeCallbacksAndMessages(this.f1068b);
            }
        }
    }

    final boolean m687a(C0255b c0255b) {
        if (((C0254a) c0255b.f1063a.get()) == null) {
            return false;
        }
        this.f1070e.removeCallbacksAndMessages(c0255b);
        return true;
    }

    public final void m688b(C0254a c0254a) {
        synchronized (this.f1067a) {
            if (m691d(c0254a) && this.f1068b.f1065c) {
                this.f1068b.f1065c = false;
                m689b(this.f1068b);
            }
        }
    }

    final void m689b(C0255b c0255b) {
        if (c0255b.f1064b != -2) {
            int i = 2750;
            if (c0255b.f1064b > 0) {
                i = c0255b.f1064b;
            } else if (c0255b.f1064b == -1) {
                i = 1500;
            }
            this.f1070e.removeCallbacksAndMessages(c0255b);
            this.f1070e.sendMessageDelayed(Message.obtain(this.f1070e, 0, c0255b), (long) i);
        }
    }

    public final boolean m690c(C0254a c0254a) {
        boolean z;
        synchronized (this.f1067a) {
            z = m691d(c0254a) || m692e(c0254a);
        }
        return z;
    }

    final boolean m691d(C0254a c0254a) {
        return this.f1068b != null && this.f1068b.m684a(c0254a);
    }

    final boolean m692e(C0254a c0254a) {
        return this.f1069c != null && this.f1069c.m684a(c0254a);
    }
}
