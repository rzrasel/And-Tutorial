package com.google.android.gms.ads.internal.js;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.il;
import com.google.android.gms.internal.ir;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.zzajk;

@aqv
public final class JavascriptEngineFactory {

    static class JSEngineSettableFuture extends ir<zza> {
        @Keep
        zza mEngineReference;

        private JSEngineSettableFuture() {
        }
    }

    public final il<zza> zza(Context context, zzajk com_google_android_gms_internal_zzajk, String str, nh nhVar, zzv com_google_android_gms_ads_internal_zzv) {
        il jSEngineSettableFuture = new JSEngineSettableFuture();
        gb.f6131a.post(new C1421g(context, com_google_android_gms_internal_zzajk, nhVar, com_google_android_gms_ads_internal_zzv, jSEngineSettableFuture, str));
        return jSEngineSettableFuture;
    }
}
