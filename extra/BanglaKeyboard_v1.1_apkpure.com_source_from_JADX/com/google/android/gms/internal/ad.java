package com.google.android.gms.internal;

final class ad implements Runnable {
    private /* synthetic */ ef f4847a;
    private /* synthetic */ ac f4848b;

    ad(ac acVar, ef efVar) {
        this.f4848b = acVar;
        this.f4847a = efVar;
    }

    public final void run() {
        this.f4848b.f4763i.zza(this.f4847a);
        if (this.f4848b.f4767m != null) {
            this.f4848b.f4767m.release();
            this.f4848b.f4767m = null;
        }
    }
}
