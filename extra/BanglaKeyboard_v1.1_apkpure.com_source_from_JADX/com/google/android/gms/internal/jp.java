package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzv;

@aqv
public final class jp {
    public static jf m5744a(Context context, zzjb com_google_android_gms_internal_zzjb, boolean z, boolean z2, nh nhVar, zzajk com_google_android_gms_internal_zzajk, aec com_google_android_gms_internal_aec, zzbo com_google_android_gms_ads_internal_zzbo, zzv com_google_android_gms_ads_internal_zzv, zk zkVar) {
        try {
            return (jf) ht.m5601b(new jq(context, com_google_android_gms_internal_zzjb, z, z2, nhVar, com_google_android_gms_internal_zzajk, com_google_android_gms_internal_aec, com_google_android_gms_ads_internal_zzbo, com_google_android_gms_ads_internal_zzv, zkVar));
        } catch (Throwable th) {
            jr jrVar = new jr("Webview initialization failed.", th);
        }
    }
}
