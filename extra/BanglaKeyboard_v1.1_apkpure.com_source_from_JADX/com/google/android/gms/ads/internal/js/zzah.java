package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.iv;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.iy;

public final class zzah extends iy<zzai> {
    private zzy f4086a;

    public zzah(zzy com_google_android_gms_ads_internal_js_zzy) {
        this.f4086a = com_google_android_gms_ads_internal_js_zzy;
    }

    public final void finalize() {
        this.f4086a.release();
        this.f4086a = null;
    }

    public final int getStatus() {
        return this.f4086a.getStatus();
    }

    public final void reject() {
        this.f4086a.reject();
    }

    public final void zza(ix<zzai> ixVar, iv ivVar) {
        this.f4086a.zza(ixVar, ivVar);
    }

    public final /* synthetic */ void zzf(Object obj) {
        this.f4086a.zzf((zzai) obj);
    }
}
