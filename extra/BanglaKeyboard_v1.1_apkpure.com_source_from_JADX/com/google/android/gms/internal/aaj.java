package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.internal.aab.C1571a;
import com.google.android.gms.p056a.C1401c;

public final class aaj extends C1571a<aoi> {
    private /* synthetic */ Activity f4740a;
    private /* synthetic */ aab f4741b;

    public aaj(aab com_google_android_gms_internal_aab, Activity activity) {
        this.f4741b = com_google_android_gms_internal_aab;
        this.f4740a = activity;
        super(com_google_android_gms_internal_aab);
    }

    public final /* synthetic */ Object mo1684a() {
        aoi a = this.f4741b.f4712h.m5006a(this.f4740a);
        if (a != null) {
            return a;
        }
        aab.m3998a(this.f4740a, "ad_overlay");
        return null;
    }

    public final /* synthetic */ Object mo1685a(abk com_google_android_gms_internal_abk) {
        return com_google_android_gms_internal_abk.createAdOverlay(C1401c.m3584a(this.f4740a));
    }
}
