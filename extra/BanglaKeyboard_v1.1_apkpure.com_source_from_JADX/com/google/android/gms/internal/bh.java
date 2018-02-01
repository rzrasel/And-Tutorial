package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Callable;

final class bh implements Callable<be> {
    private /* synthetic */ Context f5814a;
    private /* synthetic */ bg f5815b;

    bh(bg bgVar, Context context) {
        this.f5815b = bgVar;
        this.f5814a = context;
    }

    public final /* synthetic */ Object call() {
        be a;
        bi biVar = (bi) this.f5815b.f5813a.get(this.f5814a);
        if (biVar != null) {
            if ((biVar.f5816a + ((Long) zzbv.zzen().m4217a(ado.aZ)).longValue() < zzbv.zzeg().mo1669a() ? 1 : null) == null) {
                if (((Boolean) zzbv.zzen().m4217a(ado.aY)).booleanValue()) {
                    a = new bf(this.f5814a, biVar.f5817b).m5124a();
                    this.f5815b.f5813a.put(this.f5814a, new bi(a));
                    return a;
                }
            }
        }
        a = new bf(this.f5814a).m5124a();
        this.f5815b.f5813a.put(this.f5814a, new bi(a));
        return a;
    }
}
