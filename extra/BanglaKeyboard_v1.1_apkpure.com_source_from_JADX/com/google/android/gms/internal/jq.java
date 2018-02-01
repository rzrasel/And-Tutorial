package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

final class jq implements Callable<jf> {
    private /* synthetic */ Context f6320a;
    private /* synthetic */ zzjb f6321b;
    private /* synthetic */ boolean f6322c;
    private /* synthetic */ boolean f6323d;
    private /* synthetic */ nh f6324e;
    private /* synthetic */ zzajk f6325f;
    private /* synthetic */ aec f6326g;
    private /* synthetic */ zzbo f6327h;
    private /* synthetic */ zzv f6328i;
    private /* synthetic */ zk f6329j;

    jq(Context context, zzjb com_google_android_gms_internal_zzjb, boolean z, boolean z2, nh nhVar, zzajk com_google_android_gms_internal_zzajk, aec com_google_android_gms_internal_aec, zzbo com_google_android_gms_ads_internal_zzbo, zzv com_google_android_gms_ads_internal_zzv, zk zkVar) {
        this.f6320a = context;
        this.f6321b = com_google_android_gms_internal_zzjb;
        this.f6322c = z;
        this.f6323d = z2;
        this.f6324e = nhVar;
        this.f6325f = com_google_android_gms_internal_zzajk;
        this.f6326g = com_google_android_gms_internal_aec;
        this.f6327h = com_google_android_gms_ads_internal_zzbo;
        this.f6328i = com_google_android_gms_ads_internal_zzv;
        this.f6329j = zkVar;
    }

    public final /* synthetic */ Object call() {
        jf jsVar = new js(jt.m5802a(this.f6320a, this.f6321b, this.f6322c, this.f6324e, this.f6325f, this.f6326g, this.f6327h, this.f6328i, this.f6329j));
        jsVar.setWebViewClient(zzbv.zzec().mo2098a(jsVar, this.f6323d));
        jsVar.setWebChromeClient(zzbv.zzec().mo2103c(jsVar));
        return jsVar;
    }
}
