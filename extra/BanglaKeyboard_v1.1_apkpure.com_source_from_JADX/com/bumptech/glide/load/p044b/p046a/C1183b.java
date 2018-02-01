package com.bumptech.glide.load.p044b.p046a;

import com.bumptech.glide.p042h.C1163h;
import java.util.Queue;

abstract class C1183b<T extends C1181h> {
    private final Queue<T> f3486a = C1163h.m3153a(20);

    C1183b() {
    }

    protected abstract T mo1335a();

    public final void m3205a(T t) {
        if (this.f3486a.size() < 20) {
            this.f3486a.offer(t);
        }
    }

    protected final T m3206b() {
        C1181h c1181h = (C1181h) this.f3486a.poll();
        return c1181h == null ? mo1335a() : c1181h;
    }
}
