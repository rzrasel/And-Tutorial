package com.google.android.gms.internal;

final class aqz implements Runnable {
    private /* synthetic */ aqy f5682a;

    aqz(aqy com_google_android_gms_internal_aqy) {
        this.f5682a = com_google_android_gms_internal_aqy;
    }

    public final void run() {
        synchronized (this.f5682a.f5673b) {
            if (this.f5682a.f5676f == null) {
                return;
            }
            this.f5682a.mo1476b();
            this.f5682a.m5097a(2, "Timed out waiting for ad response.");
        }
    }
}
