package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

final class aqc implements Runnable {
    private /* synthetic */ AtomicInteger f5628a;
    private /* synthetic */ int f5629b;
    private /* synthetic */ ir f5630c;
    private /* synthetic */ List f5631d;

    aqc(AtomicInteger atomicInteger, int i, ir irVar, List list) {
        this.f5628a = atomicInteger;
        this.f5629b = i;
        this.f5630c = irVar;
        this.f5631d = list;
    }

    public final void run() {
        Throwable e;
        if (this.f5628a.incrementAndGet() >= this.f5629b) {
            try {
                this.f5630c.m3633b(apt.m5048a(this.f5631d));
                return;
            } catch (ExecutionException e2) {
                e = e2;
            } catch (InterruptedException e3) {
                e = e3;
            }
        } else {
            return;
        }
        id.m5371a("Unable to convert list of futures to a future of list", e);
    }
}
