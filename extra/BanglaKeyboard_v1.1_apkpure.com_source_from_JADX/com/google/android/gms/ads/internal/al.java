package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ef;

final class al implements Runnable {
    private /* synthetic */ ef f3977a;
    private /* synthetic */ zzi f3978b;

    al(zzi com_google_android_gms_ads_internal_zzi, ef efVar) {
        this.f3978b = com_google_android_gms_ads_internal_zzi;
        this.f3977a = efVar;
    }

    public final void run() {
        this.f3978b.zzb(new ee(this.f3977a));
    }
}
