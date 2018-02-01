package com.google.android.gms.internal;

final class zx implements Runnable {
    private final afv f7581a;
    private final ajz f7582b;
    private final Runnable f7583c;

    public zx(afv com_google_android_gms_internal_afv, ajz com_google_android_gms_internal_ajz, Runnable runnable) {
        this.f7581a = com_google_android_gms_internal_afv;
        this.f7582b = com_google_android_gms_internal_ajz;
        this.f7583c = runnable;
    }

    public final void run() {
        if ((this.f7582b.f5220c == null ? 1 : null) != null) {
            this.f7581a.mo2119a(this.f7582b.f5218a);
        } else {
            afv com_google_android_gms_internal_afv = this.f7581a;
            C1569b c1569b = this.f7582b.f5220c;
            if (com_google_android_gms_internal_afv.f5071d != null) {
                com_google_android_gms_internal_afv.f5071d.mo2117a(c1569b);
            }
        }
        if (this.f7582b.f5221d) {
            this.f7581a.m4467a("intermediate-response");
        } else {
            this.f7581a.m4470b("done");
        }
        if (this.f7583c != null) {
            this.f7583c.run();
        }
    }
}
