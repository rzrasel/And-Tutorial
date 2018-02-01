package com.google.android.gms.internal;

final class ane implements Runnable {
    private /* synthetic */ anb f5433a;

    ane(anb com_google_android_gms_internal_anb) {
        this.f5433a = com_google_android_gms_internal_anb;
    }

    public final void run() {
        try {
            this.f5433a.f5431a.mo1884d();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdOpened.", e);
        }
    }
}
