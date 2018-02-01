package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;

@aqv
public final class ajh extends eq {
    final jf f5184a;
    final ajk f5185b;
    private final String f5186c;

    ajh(jf jfVar, ajk com_google_android_gms_internal_ajk, String str) {
        this.f5184a = jfVar;
        this.f5185b = com_google_android_gms_internal_ajk;
        this.f5186c = str;
        zzbv.zzex().f5188a.add(this);
    }

    public final void mo1475a() {
        try {
            this.f5185b.mo1867a(this.f5186c);
        } finally {
            gb.f6131a.post(new aji(this));
        }
    }

    public final void mo1476b() {
        this.f5185b.mo1866a();
    }
}
