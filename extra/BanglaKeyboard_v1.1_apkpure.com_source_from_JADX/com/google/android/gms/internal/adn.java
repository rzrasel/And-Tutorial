package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class adn implements Callable<T> {
    private /* synthetic */ ade f4860a;
    private /* synthetic */ adm f4861b;

    adn(adm com_google_android_gms_internal_adm, ade com_google_android_gms_internal_ade) {
        this.f4861b = com_google_android_gms_internal_adm;
        this.f4860a = com_google_android_gms_internal_ade;
    }

    public final T call() {
        return this.f4860a.mo1733a(this.f4861b.f4859d);
    }
}
