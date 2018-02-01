package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.eq;
import com.google.android.gms.internal.gb;

@aqv
final class C1412h extends eq {
    final /* synthetic */ zzam f4017a;
    private final int f4018b;

    public C1412h(zzam com_google_android_gms_ads_internal_zzam, int i) {
        this.f4017a = com_google_android_gms_ads_internal_zzam;
        this.f4018b = i;
    }

    public final void mo1475a() {
        zzaq com_google_android_gms_ads_internal_zzaq = new zzaq(this.f4017a.zzams.f4440u, this.f4017a.m3739b(), this.f4017a.f4346j, this.f4017a.f4347k, this.f4017a.zzams.f4440u ? this.f4018b : -1, this.f4017a.f4348l);
        int p = this.f4017a.zzams.zzato.f5953b.mo2173p();
        if (p == -1) {
            p = this.f4017a.zzams.zzato.f5958g;
        }
        gb.f6131a.post(new C1413i(this, new AdOverlayInfoParcel(this.f4017a, this.f4017a, this.f4017a, this.f4017a.zzams.zzato.f5953b, p, this.f4017a.zzams.zzatj, this.f4017a.zzams.zzato.f5977z, com_google_android_gms_ads_internal_zzaq)));
    }

    public final void mo1476b() {
    }
}
