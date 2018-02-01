package com.google.android.gms.internal;

final class alx implements Runnable {
    private /* synthetic */ il f5364a;
    private /* synthetic */ alv f5365b;

    alx(alv com_google_android_gms_internal_alv, il ilVar) {
        this.f5365b = com_google_android_gms_internal_alv;
        this.f5364a = ilVar;
    }

    public final void run() {
        for (il ilVar : this.f5365b.f5352e.keySet()) {
            if (ilVar != this.f5364a) {
                ((alp) this.f5365b.f5352e.get(ilVar)).m4717a();
            }
        }
    }
}
