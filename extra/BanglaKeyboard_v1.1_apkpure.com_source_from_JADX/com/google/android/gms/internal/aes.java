package com.google.android.gms.internal;

final class aes implements Runnable {
    private /* synthetic */ aer f4994a;

    aes(aer com_google_android_gms_internal_aer) {
        this.f4994a = com_google_android_gms_internal_aer;
    }

    public final void run() {
        if (this.f4994a.f4993n != null) {
            this.f4994a.f4993n.mo1814g();
            this.f4994a.f4993n.mo1812e();
        }
        this.f4994a.f4993n = null;
    }
}
