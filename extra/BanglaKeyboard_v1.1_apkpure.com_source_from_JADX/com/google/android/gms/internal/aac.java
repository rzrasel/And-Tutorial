package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.aab.C1571a;
import com.google.android.gms.p056a.C1401c;

final class aac extends C1571a<abc> {
    private /* synthetic */ Context f4713a;
    private /* synthetic */ zzjb f4714b;
    private /* synthetic */ String f4715c;
    private /* synthetic */ amc f4716d;
    private /* synthetic */ aab f4717e;

    aac(aab com_google_android_gms_internal_aab, Context context, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc) {
        this.f4717e = com_google_android_gms_internal_aab;
        this.f4713a = context;
        this.f4714b = com_google_android_gms_internal_zzjb;
        this.f4715c = str;
        this.f4716d = com_google_android_gms_internal_amc;
        super(com_google_android_gms_internal_aab);
    }

    public final /* synthetic */ Object mo1684a() {
        abc a = this.f4717e.f4707c.m7084a(this.f4713a, this.f4714b, this.f4715c, this.f4716d, 1);
        if (a != null) {
            return a;
        }
        aab.m3998a(this.f4713a, "banner");
        return new acp();
    }

    public final /* synthetic */ Object mo1685a(abk com_google_android_gms_internal_abk) {
        return com_google_android_gms_internal_abk.createBannerAdManager(C1401c.m3584a(this.f4713a), this.f4714b, this.f4715c, this.f4716d, 11220000);
    }
}
