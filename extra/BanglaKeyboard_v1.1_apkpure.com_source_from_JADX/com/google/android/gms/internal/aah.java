package com.google.android.gms.internal;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.internal.aab.C1571a;
import com.google.android.gms.p056a.C1401c;

public final class aah extends C1571a<agc> {
    private /* synthetic */ FrameLayout f4733a;
    private /* synthetic */ FrameLayout f4734b;
    private /* synthetic */ Context f4735c;
    private /* synthetic */ aab f4736d;

    public aah(aab com_google_android_gms_internal_aab, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f4736d = com_google_android_gms_internal_aab;
        this.f4733a = frameLayout;
        this.f4734b = frameLayout2;
        this.f4735c = context;
        super(com_google_android_gms_internal_aab);
    }

    public final /* synthetic */ Object mo1684a() {
        agc a = this.f4736d.f4710f.m4538a(this.f4735c, this.f4733a, this.f4734b);
        if (a != null) {
            return a;
        }
        aab.m3998a(this.f4735c, "native_ad_view_delegate");
        return new acs();
    }

    public final /* synthetic */ Object mo1685a(abk com_google_android_gms_internal_abk) {
        return com_google_android_gms_internal_abk.createNativeAdViewDelegate(C1401c.m3584a(this.f4733a), C1401c.m3584a(this.f4734b));
    }
}
