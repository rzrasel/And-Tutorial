package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ef;

final class C1471r implements Runnable {
    private /* synthetic */ ef f4269a;
    private /* synthetic */ zzbc f4270b;

    C1471r(zzbc com_google_android_gms_ads_internal_zzbc, ef efVar) {
        this.f4270b = com_google_android_gms_ads_internal_zzbc;
        this.f4269a = efVar;
    }

    public final void run() {
        this.f4270b.zzb(new ee(this.f4269a));
    }
}
