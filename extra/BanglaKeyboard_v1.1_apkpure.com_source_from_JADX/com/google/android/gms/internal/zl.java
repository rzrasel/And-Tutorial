package com.google.android.gms.internal;

@aqv
final class zl implements Runnable {
    private final int f7552a;
    private /* synthetic */ zk f7553b;

    public zl(zk zkVar, int i) {
        this.f7553b = zkVar;
        this.f7552a = i;
    }

    public final void run() {
        synchronized (this.f7553b) {
            if (this.f7553b.f7546c == this.f7552a) {
                this.f7553b.m7066a();
            }
        }
    }
}
