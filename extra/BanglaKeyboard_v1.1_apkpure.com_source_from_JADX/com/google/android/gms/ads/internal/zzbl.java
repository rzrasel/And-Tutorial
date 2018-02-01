package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.zzix;
import java.lang.ref.WeakReference;

@aqv
public final class zzbl {
    private final zzbn f4368a;
    private final Runnable f4369b;
    private zzix f4370c;
    private boolean f4371d;
    private boolean f4372e;
    private long f4373f;

    public zzbl(zza com_google_android_gms_ads_internal_zza) {
        this(com_google_android_gms_ads_internal_zza, new zzbn(gb.f6131a));
    }

    private zzbl(zza com_google_android_gms_ads_internal_zza, zzbn com_google_android_gms_ads_internal_zzbn) {
        this.f4371d = false;
        this.f4372e = false;
        this.f4373f = 0;
        this.f4368a = com_google_android_gms_ads_internal_zzbn;
        this.f4369b = new C1479z(this, new WeakReference(com_google_android_gms_ads_internal_zza));
    }

    public final void cancel() {
        this.f4371d = false;
        this.f4368a.removeCallbacks(this.f4369b);
    }

    public final void pause() {
        this.f4372e = true;
        if (this.f4371d) {
            this.f4368a.removeCallbacks(this.f4369b);
        }
    }

    public final void resume() {
        this.f4372e = false;
        if (this.f4371d) {
            this.f4371d = false;
            zza(this.f4370c, this.f4373f);
        }
    }

    public final void zza(zzix com_google_android_gms_internal_zzix, long j) {
        if (this.f4371d) {
            id.m5370a("An ad refresh is already scheduled.");
            return;
        }
        this.f4370c = com_google_android_gms_internal_zzix;
        this.f4371d = true;
        this.f4373f = j;
        if (!this.f4372e) {
            new StringBuilder(65).append("Scheduling ad refresh ").append(j).append(" milliseconds from now.");
            id.m5372a(4);
            this.f4368a.postDelayed(this.f4369b, j);
        }
    }

    public final boolean zzdp() {
        return this.f4371d;
    }

    public final void zzf(zzix com_google_android_gms_internal_zzix) {
        this.f4370c = com_google_android_gms_internal_zzix;
    }

    public final void zzg(zzix com_google_android_gms_internal_zzix) {
        zza(com_google_android_gms_internal_zzix, 60000);
    }
}
