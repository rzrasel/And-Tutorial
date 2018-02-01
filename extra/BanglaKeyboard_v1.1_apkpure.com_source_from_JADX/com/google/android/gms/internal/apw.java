package com.google.android.gms.internal;

final class apw implements Runnable {
    private /* synthetic */ ir f5607a;
    private /* synthetic */ String f5608b;
    private /* synthetic */ apt f5609c;

    apw(apt com_google_android_gms_internal_apt, ir irVar, String str) {
        this.f5609c = com_google_android_gms_internal_apt;
        this.f5607a = irVar;
        this.f5608b = str;
    }

    public final void run() {
        this.f5607a.m3633b((ahd) this.f5609c.f5589d.zzdm().get(this.f5608b));
    }
}
