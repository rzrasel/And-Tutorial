package com.bumptech.glide.load.p044b;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.load.p044b.C1244i.C1237a;
import com.bumptech.glide.p036f.C1128e;
import com.bumptech.glide.p042h.C1163h;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class C1238d implements C1237a {
    private static final C1234a f3590k = new C1234a();
    private static final Handler f3591l = new Handler(Looper.getMainLooper(), new C1235b());
    public final List<C1128e> f3592a;
    public final C1231e f3593b;
    public final C1145c f3594c;
    public final ExecutorService f3595d;
    public boolean f3596e;
    public boolean f3597f;
    public boolean f3598g;
    public Set<C1128e> f3599h;
    public C1244i f3600i;
    public volatile Future<?> f3601j;
    private final C1234a f3602m;
    private final ExecutorService f3603n;
    private final boolean f3604o;
    private C1241l<?> f3605p;
    private Exception f3606q;
    private C1242h<?> f3607r;

    static class C1234a {
        C1234a() {
        }
    }

    private static class C1235b implements Callback {
        private C1235b() {
        }

        public final boolean handleMessage(Message message) {
            if (1 != message.what && 2 != message.what) {
                return false;
            }
            C1238d c1238d = (C1238d) message.obj;
            if (1 == message.what) {
                C1238d.m3318a(c1238d);
            } else {
                C1238d.m3319b(c1238d);
            }
            return true;
        }
    }

    public C1238d(C1145c c1145c, ExecutorService executorService, ExecutorService executorService2, boolean z, C1231e c1231e) {
        this(c1145c, executorService, executorService2, z, c1231e, f3590k);
    }

    private C1238d(C1145c c1145c, ExecutorService executorService, ExecutorService executorService2, boolean z, C1231e c1231e, C1234a c1234a) {
        this.f3592a = new ArrayList();
        this.f3594c = c1145c;
        this.f3595d = executorService;
        this.f3603n = executorService2;
        this.f3604o = z;
        this.f3593b = c1231e;
        this.f3602m = c1234a;
    }

    static /* synthetic */ void m3318a(C1238d c1238d) {
        if (c1238d.f3596e) {
            c1238d.f3605p.mo1369c();
        } else if (c1238d.f3592a.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        } else {
            c1238d.f3607r = new C1242h(c1238d.f3605p, c1238d.f3604o);
            c1238d.f3597f = true;
            c1238d.f3607r.m3333d();
            c1238d.f3593b.mo1364a(c1238d.f3594c, c1238d.f3607r);
            for (C1128e c1128e : c1238d.f3592a) {
                if (!c1238d.m3320b(c1128e)) {
                    c1238d.f3607r.m3333d();
                    c1128e.mo1302a(c1238d.f3607r);
                }
            }
            c1238d.f3607r.m3334e();
        }
    }

    static /* synthetic */ void m3319b(C1238d c1238d) {
        if (!c1238d.f3596e) {
            if (c1238d.f3592a.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            c1238d.f3598g = true;
            c1238d.f3593b.mo1364a(c1238d.f3594c, null);
            for (C1128e c1128e : c1238d.f3592a) {
                if (!c1238d.m3320b(c1128e)) {
                    c1128e.mo1303a(c1238d.f3606q);
                }
            }
        }
    }

    private boolean m3320b(C1128e c1128e) {
        return this.f3599h != null && this.f3599h.contains(c1128e);
    }

    public final void m3321a(C1128e c1128e) {
        C1163h.m3154a();
        if (this.f3597f) {
            c1128e.mo1302a(this.f3607r);
        } else if (this.f3598g) {
            c1128e.mo1303a(this.f3606q);
        } else {
            this.f3592a.add(c1128e);
        }
    }

    public final void mo1366a(C1244i c1244i) {
        this.f3601j = this.f3603n.submit(c1244i);
    }

    public final void mo1302a(C1241l<?> c1241l) {
        this.f3605p = c1241l;
        f3591l.obtainMessage(1, this).sendToTarget();
    }

    public final void mo1303a(Exception exception) {
        this.f3606q = exception;
        f3591l.obtainMessage(2, this).sendToTarget();
    }
}
