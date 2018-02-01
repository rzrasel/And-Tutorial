package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.aab.C1571a;
import com.google.android.gms.p056a.C1401c;

public final class aag extends C1571a<abq> {
    private /* synthetic */ Context f4731a;
    private /* synthetic */ aab f4732b;

    public aag(aab com_google_android_gms_internal_aab, Context context) {
        this.f4732b = com_google_android_gms_internal_aab;
        this.f4731a = context;
        super(com_google_android_gms_internal_aab);
    }

    public final /* synthetic */ Object mo1684a() {
        abq b = this.f4732b.f4709e.m4138b(this.f4731a);
        if (b != null) {
            return b;
        }
        aab.m3998a(this.f4731a, "mobile_ads_settings");
        return new acr();
    }

    public final /* synthetic */ Object mo1685a(abk com_google_android_gms_internal_abk) {
        return com_google_android_gms_internal_abk.getMobileAdsSettingsManagerWithClientJarVersion(C1401c.m3584a(this.f4731a), 11220000);
    }
}
