package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jm;
import com.google.android.gms.internal.xh;

final class C1411g implements jm {
    private /* synthetic */ ee f4012a;
    private /* synthetic */ zzam f4013b;

    C1411g(zzam com_google_android_gms_ads_internal_zzam, ee eeVar) {
        this.f4013b = com_google_android_gms_ads_internal_zzam;
        this.f4012a = eeVar;
    }

    public final void mo1468a() {
        Context context = this.f4013b.zzams.zzaie;
        jf jfVar = this.f4012a.f5953b;
        if (jfVar == null) {
            throw null;
        }
        new xh(context, (View) jfVar).m6989a(this.f4012a.f5953b);
    }
}
