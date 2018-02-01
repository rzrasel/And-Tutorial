package com.google.android.gms.internal;

final class by implements Runnable {
    private /* synthetic */ ef f5848a;
    private /* synthetic */ bv f5849b;

    by(bv bvVar, ef efVar) {
        this.f5849b = bvVar;
        this.f5848a = efVar;
    }

    public final void run() {
        this.f5849b.zzb(new ee(this.f5848a));
    }
}
