package com.google.android.gms.internal;

final class du implements Runnable {
    final /* synthetic */ ez f1216a;
    final /* synthetic */ ds f1217b;

    du(ds dsVar, ez ezVar) {
        this.f1217b = dsVar;
        this.f1216a = ezVar;
    }

    public final void run() {
        synchronized (this.f1217b.f1203c) {
            this.f1217b.f1201a.mo976a(this.f1216a);
        }
    }
}
