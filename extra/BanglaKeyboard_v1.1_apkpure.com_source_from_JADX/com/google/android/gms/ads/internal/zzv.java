package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.internal.ahs;
import com.google.android.gms.internal.ajp;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.dr;
import com.google.android.gms.internal.zn;

@aqv
public final class zzv {
    public final ajp zzanp;
    public final zzz zzanq;
    public final dr zzanr;
    public final zn zzans;

    private zzv(ajp com_google_android_gms_internal_ajp, zzz com_google_android_gms_ads_internal_overlay_zzz, dr drVar, zn znVar) {
        this.zzanp = com_google_android_gms_internal_ajp;
        this.zzanq = com_google_android_gms_ads_internal_overlay_zzz;
        this.zzanr = drVar;
        this.zzans = znVar;
    }

    public static zzv zzf(Context context) {
        return new zzv(new ahs(), new zzad(), new dm(new dn()), new zn(context));
    }
}
