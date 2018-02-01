package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import com.google.android.gms.internal.ado;
import java.util.concurrent.Callable;

final class ag implements Callable<String> {
    private /* synthetic */ zzd f3972a;

    ag(zzd com_google_android_gms_ads_internal_zzd) {
        this.f3972a = com_google_android_gms_ads_internal_zzd;
    }

    public final /* synthetic */ Object call() {
        String str = "";
        if (((Boolean) zzbv.zzen().m4217a(ado.cl)).booleanValue()) {
            CookieManager c = zzbv.zzec().mo2116c(this.f3972a.zzams.zzaie);
            if (c != null) {
                return c.getCookie("googleads.g.doubleclick.net");
            }
        }
        return str;
    }
}
