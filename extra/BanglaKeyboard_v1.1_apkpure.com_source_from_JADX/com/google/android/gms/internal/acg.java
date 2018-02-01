package com.google.android.gms.internal;

final class acg extends aam {
    private /* synthetic */ acf f4817c;

    acg(acf com_google_android_gms_internal_acf) {
        this.f4817c = com_google_android_gms_internal_acf;
    }

    public final void onAdFailedToLoad(int i) {
        this.f4817c.f4801b.zza(this.f4817c.m4124h());
        super.onAdFailedToLoad(i);
    }

    public final void onAdLoaded() {
        this.f4817c.f4801b.zza(this.f4817c.m4124h());
        super.onAdLoaded();
    }
}
