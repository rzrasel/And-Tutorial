package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.ei;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.zzajk;

@aqv
public final class zzac {
    private final Object f4301a = new Object();
    private Context f4302b;
    private long f4303c = 0;

    final void m3713a(Context context, zzajk com_google_android_gms_internal_zzajk, boolean z, ei eiVar, String str, String str2, Runnable runnable) {
        if (zzbv.zzeg().mo1670b() - this.f4303c < 5000) {
            id.m5370a("Not retrying to fetch app settings");
            return;
        }
        Object obj;
        this.f4303c = zzbv.zzeg().mo1670b();
        if (eiVar == null) {
            obj = 1;
        } else {
            if ((zzbv.zzeg().mo1669a() - eiVar.f6001a > ((Long) zzbv.zzen().m4217a(ado.cc)).longValue() ? 1 : null) == null && eiVar.f6005e) {
                obj = null;
            } else {
                int i = 1;
            }
        }
        if (obj == null) {
            return;
        }
        if (context == null) {
            id.m5370a("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            id.m5370a("App settings could not be fetched. Required parameters missing");
        } else {
            this.f4302b = context;
            gb.f6131a.post(new C1407c(zzbv.zzea().m5501a(context, com_google_android_gms_internal_zzajk), new C1406b(this, runnable), str, str2, z, context));
        }
    }

    public final void zza(Context context, zzajk com_google_android_gms_internal_zzajk, String str, Runnable runnable) {
        m3713a(context, com_google_android_gms_internal_zzajk, true, null, str, null, runnable);
    }
}
