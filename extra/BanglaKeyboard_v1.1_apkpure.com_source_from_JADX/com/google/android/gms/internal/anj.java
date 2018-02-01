package com.google.android.gms.internal;

final class anj implements Runnable {
    private /* synthetic */ anb f5439a;

    anj(anb com_google_android_gms_internal_anb) {
        this.f5439a = com_google_android_gms_internal_anb;
    }

    public final void run() {
        try {
            this.f5439a.f5431a.mo1884d();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdOpened.", e);
        }
    }
}
