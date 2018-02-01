package com.google.android.gms.internal;

final class ann implements Runnable {
    private /* synthetic */ anb f5444a;

    ann(anb com_google_android_gms_internal_anb) {
        this.f5444a = com_google_android_gms_internal_anb;
    }

    public final void run() {
        try {
            this.f5444a.f5431a.mo1883c();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdLeftApplication.", e);
        }
    }
}
