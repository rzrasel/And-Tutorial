package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.aab.C1571a;
import com.google.android.gms.p056a.C1401c;

final class aad extends C1571a<abc> {
    private /* synthetic */ Context f4718a;
    private /* synthetic */ zzjb f4719b;
    private /* synthetic */ String f4720c;
    private /* synthetic */ aab f4721d;

    aad(aab com_google_android_gms_internal_aab, Context context, zzjb com_google_android_gms_internal_zzjb, String str) {
        this.f4721d = com_google_android_gms_internal_aab;
        this.f4718a = context;
        this.f4719b = com_google_android_gms_internal_zzjb;
        this.f4720c = str;
        super(com_google_android_gms_internal_aab);
    }

    public final /* synthetic */ Object mo1684a() {
        abc a = this.f4721d.f4707c.m7084a(this.f4718a, this.f4719b, this.f4720c, null, 3);
        if (a != null) {
            return a;
        }
        aab.m3998a(this.f4718a, "search");
        return new acp();
    }

    public final /* synthetic */ Object mo1685a(abk com_google_android_gms_internal_abk) {
        return com_google_android_gms_internal_abk.createSearchAdManager(C1401c.m3584a(this.f4718a), this.f4719b, this.f4720c, 11220000);
    }
}
