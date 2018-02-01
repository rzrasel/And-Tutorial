package com.google.android.gms.internal;

final class agw implements Runnable {
    private /* synthetic */ String f5102a;
    private /* synthetic */ long f5103b;
    private /* synthetic */ afv f5104c;

    agw(afv com_google_android_gms_internal_afv, String str, long j) {
        this.f5104c = com_google_android_gms_internal_afv;
        this.f5102a = str;
        this.f5103b = j;
    }

    public final void run() {
        this.f5104c.f5078k.m7015a(this.f5102a, this.f5103b);
        this.f5104c.f5078k.m7014a(toString());
    }
}
