package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.amo;
import com.google.android.gms.internal.amr;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import com.google.android.gms.p056a.C1401c;
import java.util.Map;

final class C1444n implements ail {
    private /* synthetic */ amo f4107a;
    private /* synthetic */ zzab f4108b;
    private /* synthetic */ amr f4109c;

    C1444n(amo com_google_android_gms_internal_amo, zzab com_google_android_gms_ads_internal_zzab, amr com_google_android_gms_internal_amr) {
        this.f4107a = com_google_android_gms_internal_amo;
        this.f4108b = com_google_android_gms_ads_internal_zzab;
        this.f4109c = com_google_android_gms_internal_amr;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        if (jfVar == null) {
            throw null;
        }
        Object obj = (View) jfVar;
        if (obj != null) {
            try {
                if (this.f4107a != null) {
                    if (this.f4107a.mo1934k()) {
                        zzas.m3745a(jfVar);
                        return;
                    }
                    this.f4107a.mo1922a(C1401c.m3584a(obj));
                    this.f4108b.f4300a.onAdClicked();
                } else if (this.f4109c == null) {
                } else {
                    if (this.f4109c.mo1951i()) {
                        zzas.m3745a(jfVar);
                        return;
                    }
                    this.f4109c.mo1941a(C1401c.m3584a(obj));
                    this.f4108b.f4300a.onAdClicked();
                }
            } catch (Throwable e) {
                id.m5371a("Unable to call handleClick on mapper", e);
            }
        }
    }
}
