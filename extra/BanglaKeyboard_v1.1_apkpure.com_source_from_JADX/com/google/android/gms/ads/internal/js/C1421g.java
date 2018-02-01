package com.google.android.gms.ads.internal.js;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.zzajk;

final class C1421g implements Runnable {
    final /* synthetic */ JSEngineSettableFuture f4037a;
    private /* synthetic */ Context f4038b;
    private /* synthetic */ zzajk f4039c;
    private /* synthetic */ nh f4040d;
    private /* synthetic */ zzv f4041e;
    private /* synthetic */ String f4042f;

    C1421g(Context context, zzajk com_google_android_gms_internal_zzajk, nh nhVar, zzv com_google_android_gms_ads_internal_zzv, JSEngineSettableFuture jSEngineSettableFuture, String str) {
        this.f4038b = context;
        this.f4039c = com_google_android_gms_internal_zzajk;
        this.f4040d = nhVar;
        this.f4041e = com_google_android_gms_ads_internal_zzv;
        this.f4037a = jSEngineSettableFuture;
        this.f4042f = str;
    }

    public final void run() {
        try {
            zza com_google_android_gms_ads_internal_js_zze = new zze(this.f4038b, this.f4039c, this.f4040d, this.f4041e);
            this.f4037a.mEngineReference = com_google_android_gms_ads_internal_js_zze;
            com_google_android_gms_ads_internal_js_zze.zza(new C1422h(this));
            com_google_android_gms_ads_internal_js_zze.zzbd(this.f4042f);
        } catch (Throwable e) {
            this.f4037a.m3632a(e);
        }
    }
}
