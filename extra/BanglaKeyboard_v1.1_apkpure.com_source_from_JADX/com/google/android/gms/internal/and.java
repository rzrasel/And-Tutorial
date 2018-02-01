package com.google.android.gms.internal;

final class and implements Runnable {
    private /* synthetic */ anb f5432a;

    and(anb com_google_android_gms_internal_anb) {
        this.f5432a = com_google_android_gms_internal_anb;
    }

    public final void run() {
        try {
            this.f5432a.f5431a.mo1877a();
        } catch (Throwable e) {
            id.m5371a("Could not call onAdClicked.", e);
        }
    }
}
