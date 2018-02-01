package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.aab.C1571a;
import com.google.android.gms.p056a.C1401c;

final class aai extends C1571a<cc> {
    private /* synthetic */ Context f4737a;
    private /* synthetic */ amc f4738b;
    private /* synthetic */ aab f4739c;

    aai(aab com_google_android_gms_internal_aab, Context context, amc com_google_android_gms_internal_amc) {
        this.f4739c = com_google_android_gms_internal_aab;
        this.f4737a = context;
        this.f4738b = com_google_android_gms_internal_amc;
        super(com_google_android_gms_internal_aab);
    }

    public final /* synthetic */ Object mo1684a() {
        cc a = this.f4739c.f4711g.m5198a(this.f4737a, this.f4738b);
        if (a != null) {
            return a;
        }
        aab.m3998a(this.f4737a, "rewarded_video");
        return new act();
    }

    public final /* synthetic */ Object mo1685a(abk com_google_android_gms_internal_abk) {
        return com_google_android_gms_internal_abk.createRewardedVideoAd(C1401c.m3584a(this.f4737a), this.f4738b, 11220000);
    }
}
