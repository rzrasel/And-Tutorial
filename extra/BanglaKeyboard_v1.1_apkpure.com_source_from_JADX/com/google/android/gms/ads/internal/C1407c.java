package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.js.zzl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.iw;

final class C1407c implements Runnable {
    final /* synthetic */ ail f4000a;
    final /* synthetic */ String f4001b;
    final /* synthetic */ String f4002c;
    final /* synthetic */ boolean f4003d;
    final /* synthetic */ Context f4004e;
    private /* synthetic */ zzl f4005f;

    C1407c(zzl com_google_android_gms_ads_internal_js_zzl, ail com_google_android_gms_internal_ail, String str, String str2, boolean z, Context context) {
        this.f4005f = com_google_android_gms_ads_internal_js_zzl;
        this.f4000a = com_google_android_gms_internal_ail;
        this.f4001b = str;
        this.f4002c = str2;
        this.f4003d = z;
        this.f4004e = context;
    }

    public final void run() {
        this.f4005f.zzb(null).zza(new C1408d(this), new iw());
    }
}
