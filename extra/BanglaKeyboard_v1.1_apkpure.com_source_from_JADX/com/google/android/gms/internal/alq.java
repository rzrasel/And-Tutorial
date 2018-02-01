package com.google.android.gms.internal;

final class alq implements Runnable {
    private /* synthetic */ alo f5338a;
    private /* synthetic */ alp f5339b;

    alq(alp com_google_android_gms_internal_alp, alo com_google_android_gms_internal_alo) {
        this.f5339b = com_google_android_gms_internal_alp;
        this.f5338a = com_google_android_gms_internal_alo;
    }

    public final void run() {
        synchronized (this.f5339b.f5320b) {
            if (this.f5339b.f5322d != -2) {
                return;
            }
            this.f5339b.f5321c = this.f5339b.m4720b();
            if (this.f5339b.f5321c == null) {
                this.f5339b.mo1887a(4);
            } else if (!this.f5339b.m4722c() || this.f5339b.m4721b(1)) {
                alo com_google_android_gms_internal_alo = this.f5338a;
                alt com_google_android_gms_internal_alt = this.f5339b;
                synchronized (com_google_android_gms_internal_alo.f5316a) {
                    com_google_android_gms_internal_alo.f5317b = com_google_android_gms_internal_alt;
                }
                alp.m4711a(this.f5339b, this.f5338a);
            } else {
                String str = this.f5339b.f5319a;
                id.m5370a(new StringBuilder(String.valueOf(str).length() + 56).append("Ignoring adapter ").append(str).append(" as delayed impression is not supported").toString());
                this.f5339b.mo1887a(2);
            }
        }
    }
}
