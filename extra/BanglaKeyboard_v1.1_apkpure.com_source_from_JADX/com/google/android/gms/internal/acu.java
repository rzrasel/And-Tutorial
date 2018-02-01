package com.google.android.gms.internal;

final class acu implements Runnable {
    private /* synthetic */ act f4844a;

    acu(act com_google_android_gms_internal_act) {
        this.f4844a = com_google_android_gms_internal_act;
    }

    public final void run() {
        if (this.f4844a.f4843a != null) {
            try {
                this.f4844a.f4843a.mo1870a(1);
            } catch (Throwable e) {
                id.m5371a("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
