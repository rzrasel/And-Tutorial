package com.google.android.gms.internal;

final class dw implements Runnable {
    final /* synthetic */ dz f1219a;
    final /* synthetic */ ds f1220b;

    dw(ds dsVar, dz dzVar) {
        this.f1220b = dsVar;
        this.f1219a = dzVar;
    }

    public final void run() {
        synchronized (this.f1220b.f1203c) {
            if (this.f1220b.f1204d.f1174e != -2) {
                return;
            }
            this.f1220b.f1202b.m2097f().m2119a(this.f1220b);
            this.f1219a.m1890a(this.f1220b.f1204d);
        }
    }
}
