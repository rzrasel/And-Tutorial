package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.iw;
import com.google.android.gms.internal.iy;

public final class zzy extends iy<zzai> {
    private final Object f4099a = new Object();
    private final zzac f4100b;
    private boolean f4101c;

    public zzy(zzac com_google_android_gms_ads_internal_js_zzac) {
        this.f4100b = com_google_android_gms_ads_internal_js_zzac;
    }

    public final void release() {
        synchronized (this.f4099a) {
            if (this.f4101c) {
                return;
            }
            this.f4101c = true;
            zza(new C1440z(), new iw());
            zza(new C1415a(this), new C1416b(this));
        }
    }
}
