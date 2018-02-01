package com.google.android.gms.internal;

final class fk implements Runnable {
    final /* synthetic */ fj f1402a;

    fk(fj fjVar) {
        this.f1402a = fjVar;
    }

    public final void run() {
        this.f1402a.f1200f = Thread.currentThread();
        this.f1402a.mo874a();
    }
}
