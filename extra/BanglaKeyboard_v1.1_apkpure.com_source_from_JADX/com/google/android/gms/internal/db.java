package com.google.android.gms.internal;

final class db implements Runnable {
    private /* synthetic */ ee f5904a;
    private /* synthetic */ cz f5905b;

    db(cz czVar, ee eeVar) {
        this.f5905b = czVar;
        this.f5904a = eeVar;
    }

    public final void run() {
        this.f5905b.f5892a.zzb(this.f5904a);
    }
}
