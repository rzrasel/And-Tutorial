package com.google.android.gms.internal;

final class aeu implements Runnable {
    private /* synthetic */ aet f5007a;

    aeu(aet com_google_android_gms_internal_aet) {
        this.f5007a = com_google_android_gms_internal_aet;
    }

    public final void run() {
        if (this.f5007a.f5006l != null) {
            this.f5007a.f5006l.mo1814g();
            this.f5007a.f5006l.mo1812e();
        }
        this.f5007a.f5006l = null;
    }
}
