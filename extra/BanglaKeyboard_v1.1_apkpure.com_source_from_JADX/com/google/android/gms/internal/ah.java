package com.google.android.gms.internal;

final class ah implements Runnable {
    private /* synthetic */ ac f5105a;

    ah(ac acVar) {
        this.f5105a = acVar;
    }

    public final void run() {
        if (this.f5105a.f4767m != null) {
            this.f5105a.f4767m.release();
            this.f5105a.f4767m = null;
        }
    }
}
