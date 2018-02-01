package com.google.android.gms.internal;

final class bh implements Runnable {
    final /* synthetic */ bo f1048a;
    final /* synthetic */ bg f1049b;

    bh(bg bgVar, bo boVar) {
        this.f1049b = bgVar;
        this.f1048a = boVar;
    }

    public final void run() {
        try {
            this.f1048a.f1083c.mo839c();
        } catch (Throwable e) {
            gb.m2070a("Could not destroy mediation adapter.", e);
        }
    }
}
