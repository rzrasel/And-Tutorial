package com.google.android.gms.internal;

final class rn implements Runnable {
    private /* synthetic */ afv f7051a;
    private /* synthetic */ nm f7052b;

    rn(nm nmVar, afv com_google_android_gms_internal_afv) {
        this.f7052b = nmVar;
        this.f7051a = com_google_android_gms_internal_afv;
    }

    public final void run() {
        try {
            this.f7052b.f6716d.put(this.f7051a);
        } catch (InterruptedException e) {
        }
    }
}
