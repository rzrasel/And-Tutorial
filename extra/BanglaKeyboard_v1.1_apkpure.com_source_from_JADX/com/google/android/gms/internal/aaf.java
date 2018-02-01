package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.aab.C1571a;
import com.google.android.gms.p056a.C1401c;

public final class aaf extends C1571a<aax> {
    private /* synthetic */ Context f4727a;
    private /* synthetic */ String f4728b;
    private /* synthetic */ amc f4729c;
    private /* synthetic */ aab f4730d;

    public aaf(aab com_google_android_gms_internal_aab, Context context, String str, amc com_google_android_gms_internal_amc) {
        this.f4730d = com_google_android_gms_internal_aab;
        this.f4727a = context;
        this.f4728b = str;
        this.f4729c = com_google_android_gms_internal_amc;
        super(com_google_android_gms_internal_aab);
    }

    public final /* synthetic */ Object mo1684a() {
        aax a = this.f4730d.f4708d.m7082a(this.f4727a, this.f4728b, this.f4729c);
        if (a != null) {
            return a;
        }
        aab.m3998a(this.f4727a, "native_ad");
        return new acm();
    }

    public final /* synthetic */ Object mo1685a(abk com_google_android_gms_internal_abk) {
        return com_google_android_gms_internal_abk.createAdLoaderBuilder(C1401c.m3584a(this.f4727a), this.f4728b, this.f4729c, 11220000);
    }
}
