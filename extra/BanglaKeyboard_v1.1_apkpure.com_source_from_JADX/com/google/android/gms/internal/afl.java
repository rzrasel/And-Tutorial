package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.js.zzai;
import java.util.Map;

final class afl implements ail {
    private /* synthetic */ zzai f5046a;
    private /* synthetic */ afi f5047b;

    afl(afi com_google_android_gms_internal_afi, zzai com_google_android_gms_ads_internal_js_zzai) {
        this.f5047b = com_google_android_gms_internal_afi;
        this.f5046a = com_google_android_gms_ads_internal_js_zzai;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        jf jfVar2 = (jf) this.f5047b.f5040a.get();
        if (jfVar2 == null) {
            this.f5046a.zzb("/showOverlay", (ail) this);
        } else if (jfVar2 == null) {
            throw null;
        } else {
            ((View) jfVar2).setVisibility(0);
        }
    }
}
