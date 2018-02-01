package com.google.android.gms.internal;

final class ani implements Runnable {
    private /* synthetic */ anb f5438a;

    ani(anb com_google_android_gms_internal_anb) {
        this.f5438a = com_google_android_gms_internal_anb;
    }

    public final void run() {
        try {
            this.f5438a.f5431a.mo1883c();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLeftApplication.", e);
        }
    }
}
