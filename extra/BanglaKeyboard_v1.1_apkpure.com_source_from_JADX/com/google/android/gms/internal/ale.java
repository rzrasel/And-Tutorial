package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

@aqv
public final class ale {
    private final Object f5275a = new Object();
    private alf f5276b;

    public final alf m4677a(Context context, zzajk com_google_android_gms_internal_zzajk) {
        alf com_google_android_gms_internal_alf;
        synchronized (this.f5275a) {
            if (this.f5276b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f5276b = new alf(context, com_google_android_gms_internal_zzajk, (String) zzbv.zzen().m4217a(ado.f4888a));
            }
            com_google_android_gms_internal_alf = this.f5276b;
        }
        return com_google_android_gms_internal_alf;
    }
}
