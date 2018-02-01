package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C1538g;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gb;

@aqv
public final class zzu {
    public static void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzchf == 4 && adOverlayInfoParcel.zzcgy == null) {
            if (adOverlayInfoParcel.zzcgx != null) {
                adOverlayInfoParcel.zzcgx.onAdClicked();
            }
            zzbv.zzdx();
            zza.zza(context, adOverlayInfoParcel.zzcgw, adOverlayInfoParcel.zzche);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzatj.f7709d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.zza(intent, adOverlayInfoParcel);
        if (!C1538g.m3945e()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        zzbv.zzea();
        gb.m5446a(context, intent);
    }
}
