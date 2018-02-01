package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class alw implements Callable<als> {
    private /* synthetic */ alp f5362a;
    private /* synthetic */ alv f5363b;

    alw(alv com_google_android_gms_internal_alv, alp com_google_android_gms_internal_alp) {
        this.f5363b = com_google_android_gms_internal_alv;
        this.f5362a = com_google_android_gms_internal_alp;
    }

    private final als m4735a() {
        synchronized (this.f5363b.f5350c) {
            if (this.f5363b.f5351d) {
                return null;
            }
            return this.f5362a.m4716a(this.f5363b.f5348a, this.f5363b.f5349b);
        }
    }

    public final /* synthetic */ Object call() {
        return m4735a();
    }
}
