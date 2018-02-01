package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.aab.C1571a;
import com.google.android.gms.p056a.C1401c;

final class aae extends C1571a<abc> {
    private /* synthetic */ Context f4722a;
    private /* synthetic */ zzjb f4723b;
    private /* synthetic */ String f4724c;
    private /* synthetic */ amc f4725d;
    private /* synthetic */ aab f4726e;

    aae(aab com_google_android_gms_internal_aab, Context context, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc) {
        this.f4726e = com_google_android_gms_internal_aab;
        this.f4722a = context;
        this.f4723b = com_google_android_gms_internal_zzjb;
        this.f4724c = str;
        this.f4725d = com_google_android_gms_internal_amc;
        super(com_google_android_gms_internal_aab);
    }

    public final /* synthetic */ Object mo1684a() {
        abc a = this.f4726e.f4707c.m7084a(this.f4722a, this.f4723b, this.f4724c, this.f4725d, 2);
        if (a != null) {
            return a;
        }
        aab.m3998a(this.f4722a, "interstitial");
        return new acp();
    }

    public final /* synthetic */ Object mo1685a(abk com_google_android_gms_internal_abk) {
        return com_google_android_gms_internal_abk.createInterstitialAdManager(C1401c.m3584a(this.f4722a), this.f4723b, this.f4724c, this.f4725d, 11220000);
    }
}
