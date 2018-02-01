package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.eq;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.hp;

@aqv
final class C1467v extends eq {
    final /* synthetic */ zzm f4145a;

    private C1467v(zzm com_google_android_gms_ads_internal_overlay_zzm) {
        this.f4145a = com_google_android_gms_ads_internal_overlay_zzm;
    }

    public final void mo1475a() {
        hp zzew = zzbv.zzew();
        Bitmap bitmap = (Bitmap) zzew.f6217a.get(Integer.valueOf(this.f4145a.f4245a.zzchh.zzaqd));
        if (bitmap != null) {
            gb.f6131a.post(new C1468w(this, zzbv.zzec().mo2110a(this.f4145a.f4246c, bitmap, this.f4145a.f4245a.zzchh.zzaqb, this.f4145a.f4245a.zzchh.zzaqc)));
        }
    }

    public final void mo1476b() {
    }
}
