package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C1536e;

final class C1576c implements C1575e {
    private /* synthetic */ Context f5850a;

    C1576c(Context context) {
        this.f5850a = context;
    }

    public final boolean mo2032a(zzajk com_google_android_gms_internal_zzajk) {
        boolean z;
        aak.m4022a();
        boolean c = hz.m5627c(this.f5850a);
        boolean z2 = ((Boolean) zzbv.zzen().m4217a(ado.cG)).booleanValue() && com_google_android_gms_internal_zzajk.f7709d;
        Context context = this.f5850a;
        if (com_google_android_gms_internal_zzajk.f7709d) {
            zzbv.zzea();
            int k = gb.m5498k(context);
            if (k != 0) {
                zzbv.zzea();
                if (k <= gb.m5499l(context)) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (z && c && !z2) {
            if (!C1536e.m3938a(this.f5850a)) {
                return false;
            }
            if (((Boolean) zzbv.zzen().m4217a(ado.f4864C)).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
