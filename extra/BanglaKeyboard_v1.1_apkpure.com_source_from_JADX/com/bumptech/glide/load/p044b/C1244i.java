package com.bumptech.glide.load.p044b;

import android.util.Log;
import com.bumptech.glide.load.p044b.p047c.C1230b;
import com.bumptech.glide.p036f.C1128e;
import com.bumptech.glide.p042h.C1158d;

public final class C1244i implements C1230b, Runnable {
    public final C1198a<?, ?, ?> f3630a;
    public volatile boolean f3631b;
    private final int f3632c;
    private final C1237a f3633d;
    private int f3634e = C1243b.f3627a;

    interface C1237a extends C1128e {
        void mo1366a(C1244i c1244i);
    }

    private enum C1243b {
        ;

        static {
            f3627a = 1;
            f3628b = 2;
            f3629c = new int[]{f3627a, f3628b};
        }
    }

    public C1244i(C1237a c1237a, C1198a<?, ?, ?> c1198a, int i) {
        this.f3633d = c1237a;
        this.f3630a = c1198a;
        this.f3632c = i;
    }

    private boolean m3335b() {
        return this.f3634e == C1243b.f3627a;
    }

    private C1241l<?> m3336c() {
        C1241l<?> b;
        try {
            C1198a c1198a = this.f3630a;
            if (c1198a.f3520c.f3557f) {
                long a = C1158d.m3139a();
                C1241l a2 = c1198a.m3263a(c1198a.f3518a);
                if (Log.isLoggable("DecodeJob", 2)) {
                    c1198a.m3264a("Decoded transformed from cache", a);
                }
                a = C1158d.m3139a();
                b = c1198a.m3265b(a2);
                if (Log.isLoggable("DecodeJob", 2)) {
                    c1198a.m3264a("Transcoded transformed from cache", a);
                }
            } else {
                b = null;
            }
        } catch (Exception e) {
            if (Log.isLoggable("EngineRunnable", 3)) {
                new StringBuilder("Exception decoding result from cache: ").append(e);
            }
            b = null;
        }
        if (b != null) {
            return b;
        }
        C1198a c1198a2 = this.f3630a;
        if (!c1198a2.f3520c.f3556e) {
            return null;
        }
        long a3 = C1158d.m3139a();
        C1241l a4 = c1198a2.m3263a(c1198a2.f3518a.m3325a());
        if (Log.isLoggable("DecodeJob", 2)) {
            c1198a2.m3264a("Decoded source from cache", a3);
        }
        return c1198a2.m3262a(a4);
    }

    public final int mo1370a() {
        return this.f3632c - 1;
    }

    public final void run() {
        Object obj;
        Exception exception = null;
        if (!this.f3631b) {
            C1241l c;
            try {
                if (m3335b()) {
                    c = m3336c();
                } else {
                    C1198a c1198a = this.f3630a;
                    c = c1198a.m3262a(c1198a.m3261a());
                }
            } catch (Error e) {
                Error error = e;
                Log.isLoggable("EngineRunnable", 2);
                exception = new C1245j(error);
                obj = null;
            } catch (Exception e2) {
                Log.isLoggable("EngineRunnable", 2);
                exception = e2;
                obj = null;
            }
            if (this.f3631b) {
                if (c != null) {
                    c.mo1369c();
                }
            } else if (c != null) {
                this.f3633d.mo1302a(c);
            } else if (m3335b()) {
                this.f3634e = C1243b.f3628b;
                this.f3633d.mo1366a(this);
            } else {
                this.f3633d.mo1303a(exception);
            }
        }
    }
}
