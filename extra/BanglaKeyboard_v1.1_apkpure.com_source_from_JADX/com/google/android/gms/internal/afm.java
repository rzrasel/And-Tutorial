package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.js.zzai;
import java.util.Map;

final class afm implements ail {
    private /* synthetic */ zzai f5048a;
    private /* synthetic */ afi f5049b;

    afm(afi com_google_android_gms_internal_afi, zzai com_google_android_gms_ads_internal_js_zzai) {
        this.f5049b = com_google_android_gms_internal_afi;
        this.f5048a = com_google_android_gms_ads_internal_js_zzai;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        jf jfVar2 = (jf) this.f5049b.f5040a.get();
        if (jfVar2 == null) {
            this.f5048a.zzb("/hideOverlay", (ail) this);
        } else if (jfVar2 == null) {
            throw null;
        } else {
            ((View) jfVar2).setVisibility(8);
        }
    }
}
