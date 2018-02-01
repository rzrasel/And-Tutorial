package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import java.util.Map;

final class C1406b implements ail {
    private /* synthetic */ Runnable f3998a;
    private /* synthetic */ zzac f3999b;

    C1406b(zzac com_google_android_gms_ads_internal_zzac, Runnable runnable) {
        this.f3999b = com_google_android_gms_ads_internal_zzac;
        this.f3998a = runnable;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        jfVar.zzb("/appSettingsFetched", (ail) this);
        synchronized (this.f3999b.f4301a) {
            if (map != null) {
                if ("true".equalsIgnoreCase((String) map.get("isSuccessful"))) {
                    zzbv.zzee().m5329a(this.f3999b.f4302b, (String) map.get("appSettingsJson"));
                    try {
                        if (this.f3998a != null) {
                            this.f3998a.run();
                        }
                    } catch (Throwable e) {
                        zzbv.zzee().m5336a(e, "ConfigLoader.maybeFetchNewAppSettings");
                        id.m5371a("ConfigLoader post task failed.", e);
                    }
                }
            }
        }
    }
}
