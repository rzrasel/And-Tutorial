package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.id;
import com.google.android.gms.internal.zzix;
import java.lang.ref.WeakReference;

final class C1479z implements Runnable {
    private /* synthetic */ WeakReference f4290a;
    private /* synthetic */ zzbl f4291b;

    C1479z(zzbl com_google_android_gms_ads_internal_zzbl, WeakReference weakReference) {
        this.f4291b = com_google_android_gms_ads_internal_zzbl;
        this.f4290a = weakReference;
    }

    public final void run() {
        this.f4291b.f4371d = false;
        zza com_google_android_gms_ads_internal_zza = (zza) this.f4290a.get();
        if (com_google_android_gms_ads_internal_zza != null) {
            zzix b = this.f4291b.f4370c;
            if (com_google_android_gms_ads_internal_zza.mo1589b(b)) {
                com_google_android_gms_ads_internal_zza.zzb(b);
                return;
            }
            id.m5372a(4);
            com_google_android_gms_ads_internal_zza.f4295d.zzg(b);
        }
    }
}
