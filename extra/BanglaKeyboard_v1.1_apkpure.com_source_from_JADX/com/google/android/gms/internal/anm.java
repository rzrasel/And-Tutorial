package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;

final class anm implements Runnable {
    private /* synthetic */ ErrorCode f5442a;
    private /* synthetic */ anb f5443b;

    anm(anb com_google_android_gms_internal_anb, ErrorCode errorCode) {
        this.f5443b = com_google_android_gms_internal_anb;
        this.f5442a = errorCode;
    }

    public final void run() {
        try {
            this.f5443b.f5431a.mo1878a(ano.m4978a(this.f5442a));
        } catch (Throwable e) {
            id.m5371a("Could not call onAdFailedToLoad.", e);
        }
    }
}
