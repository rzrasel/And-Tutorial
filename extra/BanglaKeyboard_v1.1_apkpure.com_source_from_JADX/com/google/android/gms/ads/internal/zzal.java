package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.p018f.C0477m;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.aaq;
import com.google.android.gms.internal.aat;
import com.google.android.gms.internal.aay;
import com.google.android.gms.internal.abn;
import com.google.android.gms.internal.agt;
import com.google.android.gms.internal.agx;
import com.google.android.gms.internal.aha;
import com.google.android.gms.internal.ahd;
import com.google.android.gms.internal.ahg;
import com.google.android.gms.internal.amc;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.internal.zzot;

@aqv
public final class zzal extends aay {
    private aaq f4327a;
    private agt f4328b;
    private agx f4329c;
    private C0477m<String, aha> f4330d = new C0477m();
    private C0477m<String, ahd> f4331e = new C0477m();
    private ahg f4332f;
    private zzjb f4333g;
    private PublisherAdViewOptions f4334h;
    private zzot f4335i;
    private abn f4336j;
    private final Context f4337k;
    private final amc f4338l;
    private final String f4339m;
    private final zzajk f4340n;
    private final zzv f4341o;

    public zzal(Context context, String str, amc com_google_android_gms_internal_amc, zzajk com_google_android_gms_internal_zzajk, zzv com_google_android_gms_ads_internal_zzv) {
        this.f4337k = context;
        this.f4339m = str;
        this.f4338l = com_google_android_gms_internal_amc;
        this.f4340n = com_google_android_gms_internal_zzajk;
        this.f4341o = com_google_android_gms_ads_internal_zzv;
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.f4334h = publisherAdViewOptions;
    }

    public final void zza(agt com_google_android_gms_internal_agt) {
        this.f4328b = com_google_android_gms_internal_agt;
    }

    public final void zza(agx com_google_android_gms_internal_agx) {
        this.f4329c = com_google_android_gms_internal_agx;
    }

    public final void zza(ahg com_google_android_gms_internal_ahg, zzjb com_google_android_gms_internal_zzjb) {
        this.f4332f = com_google_android_gms_internal_ahg;
        this.f4333g = com_google_android_gms_internal_zzjb;
    }

    public final void zza(zzot com_google_android_gms_internal_zzot) {
        this.f4335i = com_google_android_gms_internal_zzot;
    }

    public final void zza(String str, ahd com_google_android_gms_internal_ahd, aha com_google_android_gms_internal_aha) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.f4331e.put(str, com_google_android_gms_internal_ahd);
        this.f4330d.put(str, com_google_android_gms_internal_aha);
    }

    public final void zzb(aaq com_google_android_gms_internal_aaq) {
        this.f4327a = com_google_android_gms_internal_aaq;
    }

    public final void zzb(abn com_google_android_gms_internal_abn) {
        this.f4336j = com_google_android_gms_internal_abn;
    }

    public final aat zzcy() {
        return new zzai(this.f4337k, this.f4339m, this.f4338l, this.f4340n, this.f4327a, this.f4328b, this.f4329c, this.f4331e, this.f4330d, this.f4335i, this.f4336j, this.f4341o, this.f4332f, this.f4333g, this.f4334h);
    }
}
