package com.google.android.gms.internal;

final class aco implements Runnable {
    private /* synthetic */ acn f4840a;

    aco(acn com_google_android_gms_internal_acn) {
        this.f4840a = com_google_android_gms_internal_acn;
    }

    public final void run() {
        if (this.f4840a.f4839a.f4838a != null) {
            try {
                this.f4840a.f4839a.f4838a.mo1689a(1);
            } catch (Throwable e) {
                id.m5371a("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
