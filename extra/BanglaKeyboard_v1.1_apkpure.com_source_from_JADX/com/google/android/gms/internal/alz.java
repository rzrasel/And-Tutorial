package com.google.android.gms.internal;

final class alz implements Runnable {
    private /* synthetic */ als f5380a;

    alz(als com_google_android_gms_internal_als) {
        this.f5380a = com_google_android_gms_internal_als;
    }

    public final void run() {
        try {
            this.f5380a.f5343c.mo1908c();
        } catch (Throwable e) {
            id.m5371a("Could not destroy mediation adapter.", e);
        }
    }
}
