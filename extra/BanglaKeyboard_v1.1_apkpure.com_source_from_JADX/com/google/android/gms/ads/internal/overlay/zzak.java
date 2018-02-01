package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gb;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
@aqv
public final class zzak {
    private final long f4166a = TimeUnit.MILLISECONDS.toNanos(((Long) zzbv.zzen().m4217a(ado.f4907s)).longValue());
    private long f4167b;
    private boolean f4168c = true;

    zzak() {
    }

    public final void zza(SurfaceTexture surfaceTexture, zzx com_google_android_gms_ads_internal_overlay_zzx) {
        if (com_google_android_gms_ads_internal_overlay_zzx != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f4168c || Math.abs(timestamp - this.f4167b) >= this.f4166a) {
                this.f4168c = false;
                this.f4167b = timestamp;
                gb.f6131a.post(new C1449d(com_google_android_gms_ads_internal_overlay_zzx));
            }
        }
    }

    public final void zzmx() {
        this.f4168c = true;
    }
}
