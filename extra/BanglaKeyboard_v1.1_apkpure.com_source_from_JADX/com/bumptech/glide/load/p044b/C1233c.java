package com.bumptech.glide.load.p044b;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.load.p044b.C1198a.C1177a;
import com.bumptech.glide.load.p044b.C1242h.C1232a;
import com.bumptech.glide.load.p044b.p045b.C1200a;
import com.bumptech.glide.load.p044b.p045b.C1200a.C1199a;
import com.bumptech.glide.load.p044b.p045b.C1201b;
import com.bumptech.glide.load.p044b.p045b.C1210h;
import com.bumptech.glide.load.p044b.p045b.C1210h.C1212a;
import com.bumptech.glide.p036f.C1128e;
import com.bumptech.glide.p042h.C1158d;
import com.bumptech.glide.p042h.C1163h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class C1233c implements C1212a, C1231e, C1232a {
    public final Map<C1145c, C1238d> f3578a;
    public final C1210h f3579b;
    public final C1218a f3580c;
    public final Map<C1145c, WeakReference<C1242h<?>>> f3581d;
    public final C1219b f3582e;
    private final C1240g f3583f;
    private final C1248m f3584g;
    private ReferenceQueue<C1242h<?>> f3585h;

    static class C1218a {
        public final ExecutorService f3558a;
        public final ExecutorService f3559b;
        public final C1231e f3560c;

        public C1218a(ExecutorService executorService, ExecutorService executorService2, C1231e c1231e) {
            this.f3558a = executorService;
            this.f3559b = executorService2;
            this.f3560c = c1231e;
        }
    }

    private static class C1219b implements C1177a {
        private final C1199a f3561a;
        private volatile C1200a f3562b;

        public C1219b(C1199a c1199a) {
            this.f3561a = c1199a;
        }

        public final C1200a mo1360a() {
            if (this.f3562b == null) {
                synchronized (this) {
                    if (this.f3562b == null) {
                        this.f3562b = this.f3561a.mo1350a();
                    }
                    if (this.f3562b == null) {
                        this.f3562b = new C1201b();
                    }
                }
            }
            return this.f3562b;
        }
    }

    public static class C1220c {
        public final C1238d f3563a;
        public final C1128e f3564b;

        public C1220c(C1128e c1128e, C1238d c1238d) {
            this.f3564b = c1128e;
            this.f3563a = c1238d;
        }
    }

    private static class C1221d implements IdleHandler {
        private final Map<C1145c, WeakReference<C1242h<?>>> f3565a;
        private final ReferenceQueue<C1242h<?>> f3566b;

        public C1221d(Map<C1145c, WeakReference<C1242h<?>>> map, ReferenceQueue<C1242h<?>> referenceQueue) {
            this.f3565a = map;
            this.f3566b = referenceQueue;
        }

        public final boolean queueIdle() {
            C1222e c1222e = (C1222e) this.f3566b.poll();
            if (c1222e != null) {
                this.f3565a.remove(c1222e.f3567a);
            }
            return true;
        }
    }

    private static class C1222e extends WeakReference<C1242h<?>> {
        private final C1145c f3567a;

        public C1222e(C1145c c1145c, C1242h<?> c1242h, ReferenceQueue<? super C1242h<?>> referenceQueue) {
            super(c1242h, referenceQueue);
            this.f3567a = c1145c;
        }
    }

    public C1233c(C1210h c1210h, C1199a c1199a, ExecutorService executorService, ExecutorService executorService2) {
        this(c1210h, c1199a, executorService, executorService2, (byte) 0);
    }

    private C1233c(C1210h c1210h, C1199a c1199a, ExecutorService executorService, ExecutorService executorService2, byte b) {
        this.f3579b = c1210h;
        this.f3582e = new C1219b(c1199a);
        this.f3581d = new HashMap();
        this.f3583f = new C1240g();
        this.f3578a = new HashMap();
        this.f3580c = new C1218a(executorService, executorService2, this);
        this.f3584g = new C1248m();
        c1210h.mo1356a((C1212a) this);
    }

    public static void m3311a(String str, long j, C1145c c1145c) {
        new StringBuilder().append(str).append(" in ").append(C1158d.m3138a(j)).append("ms, key: ").append(c1145c);
    }

    public final ReferenceQueue<C1242h<?>> m3312a() {
        if (this.f3585h == null) {
            this.f3585h = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new C1221d(this.f3581d, this.f3585h));
        }
        return this.f3585h;
    }

    public final void mo1362a(C1238d c1238d, C1145c c1145c) {
        C1163h.m3154a();
        if (c1238d.equals((C1238d) this.f3578a.get(c1145c))) {
            this.f3578a.remove(c1145c);
        }
    }

    public final void mo1363a(C1241l<?> c1241l) {
        C1163h.m3154a();
        this.f3584g.m3339a(c1241l);
    }

    public final void mo1364a(C1145c c1145c, C1242h<?> c1242h) {
        C1163h.m3154a();
        if (c1242h != null) {
            c1242h.f3623c = c1145c;
            c1242h.f3622b = this;
            if (c1242h.f3621a) {
                this.f3581d.put(c1145c, new C1222e(c1145c, c1242h, m3312a()));
            }
        }
        this.f3578a.remove(c1145c);
    }

    public final void mo1365b(C1145c c1145c, C1242h c1242h) {
        C1163h.m3154a();
        this.f3581d.remove(c1145c);
        if (c1242h.f3621a) {
            this.f3579b.mo1354a(c1145c, c1242h);
        } else {
            this.f3584g.m3339a(c1242h);
        }
    }
}
