package com.google.android.gms.internal;

final class anl implements Runnable {
    private /* synthetic */ anb f5441a;

    anl(anb com_google_android_gms_internal_anb) {
        this.f5441a = com_google_android_gms_internal_anb;
    }

    public final void run() {
        try {
            this.f5441a.f5431a.mo1882b();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdClosed.", e);
        }
    }
}
