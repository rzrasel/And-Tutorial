package com.google.android.gms.internal;

final class cq implements Runnable {
    private /* synthetic */ zzix f5869a;
    private /* synthetic */ amf f5870b;
    private /* synthetic */ cp f5871c;

    cq(cp cpVar, zzix com_google_android_gms_internal_zzix, amf com_google_android_gms_internal_amf) {
        this.f5871c = cpVar;
        this.f5869a = com_google_android_gms_internal_zzix;
        this.f5870b = com_google_android_gms_internal_amf;
    }

    public final void run() {
        this.f5871c.m5215a(this.f5869a, this.f5870b);
    }
}
