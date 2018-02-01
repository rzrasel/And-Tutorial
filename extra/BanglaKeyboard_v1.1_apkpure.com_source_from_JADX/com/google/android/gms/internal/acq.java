package com.google.android.gms.internal;

final class acq implements Runnable {
    private /* synthetic */ acp f4842a;

    acq(acp com_google_android_gms_internal_acp) {
        this.f4842a = com_google_android_gms_internal_acp;
    }

    public final void run() {
        if (this.f4842a.f4841a != null) {
            try {
                this.f4842a.f4841a.mo1689a(1);
            } catch (Throwable e) {
                id.m5371a("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
