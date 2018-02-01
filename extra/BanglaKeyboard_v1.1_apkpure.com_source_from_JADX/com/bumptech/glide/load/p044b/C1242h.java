package com.bumptech.glide.load.p044b;

import android.os.Looper;
import com.bumptech.glide.load.C1145c;

public final class C1242h<Z> implements C1241l<Z> {
    final boolean f3621a;
    C1232a f3622b;
    C1145c f3623c;
    private final C1241l<Z> f3624d;
    private int f3625e;
    private boolean f3626f;

    interface C1232a {
        void mo1365b(C1145c c1145c, C1242h<?> c1242h);
    }

    public C1242h(C1241l<Z> c1241l, boolean z) {
        if (c1241l == null) {
            throw new NullPointerException("Wrapped resource must not be null");
        }
        this.f3624d = c1241l;
        this.f3621a = z;
    }

    public final Z mo1367a() {
        return this.f3624d.mo1367a();
    }

    public final int mo1368b() {
        return this.f3624d.mo1368b();
    }

    public final void mo1369c() {
        if (this.f3625e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.f3626f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.f3626f = true;
            this.f3624d.mo1369c();
        }
    }

    public final void m3333d() {
        if (this.f3626f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f3625e++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    public final void m3334e() {
        if (this.f3625e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.f3625e - 1;
            this.f3625e = i;
            if (i == 0) {
                this.f3622b.mo1365b(this.f3623c, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }
}
