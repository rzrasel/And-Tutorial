package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.zzag;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;

@aqv
public final class aed extends aeg {
    private final zzag f4954a;
    private final String f4955b;
    private final String f4956c;

    public aed(zzag com_google_android_gms_ads_internal_zzag, String str, String str2) {
        this.f4954a = com_google_android_gms_ads_internal_zzag;
        this.f4955b = str;
        this.f4956c = str2;
    }

    public final String mo1737a() {
        return this.f4955b;
    }

    public final void mo1738a(C1398a c1398a) {
        if (c1398a != null) {
            this.f4954a.zzc((View) C1401c.m3585a(c1398a));
        }
    }

    public final String mo1739b() {
        return this.f4956c;
    }

    public final void mo1740c() {
        this.f4954a.zzck();
    }

    public final void mo1741d() {
        this.f4954a.zzcl();
    }
}
