package com.google.android.gms.internal;

final class ank implements Runnable {
    private /* synthetic */ anb f5440a;

    ank(anb com_google_android_gms_internal_anb) {
        this.f5440a = com_google_android_gms_internal_anb;
    }

    public final void run() {
        try {
            this.f5440a.f5431a.mo1885e();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLoaded.", e);
        }
    }
}
