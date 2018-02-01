package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;

final class anh implements Runnable {
    private /* synthetic */ ErrorCode f5436a;
    private /* synthetic */ anb f5437b;

    anh(anb com_google_android_gms_internal_anb, ErrorCode errorCode) {
        this.f5437b = com_google_android_gms_internal_anb;
        this.f5436a = errorCode;
    }

    public final void run() {
        try {
            this.f5437b.f5431a.mo1878a(ano.m4978a(this.f5436a));
        } catch (Throwable e) {
            id.m5371a("Could not call onAdFailedToLoad.", e);
        }
    }
}
