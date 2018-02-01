package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.jo;

final class av implements jo {
    private /* synthetic */ ee f3996a;
    private /* synthetic */ Runnable f3997b;

    av(ee eeVar, Runnable runnable) {
        this.f3996a = eeVar;
        this.f3997b = runnable;
    }

    public final void mo1471a() {
        if (!this.f3996a.f5963l) {
            zzbv.zzea();
            gb.m5474b(this.f3997b);
        }
    }
}
