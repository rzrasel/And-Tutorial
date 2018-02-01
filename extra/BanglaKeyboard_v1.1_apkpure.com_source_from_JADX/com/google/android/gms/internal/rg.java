package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;

public final class rg extends rs {
    private long f7044d = -1;

    public rg(np npVar, String str, String str2, kz kzVar, int i) {
        super(npVar, str, str2, kzVar, i, 12);
    }

    protected final void mo2232a() {
        if (((Boolean) zzbv.zzen().m4217a(ado.bo)).booleanValue()) {
            this.b.f6459f = Long.valueOf(-1);
            if (this.f7044d == -1) {
                this.f7044d = ((Long) this.c.invoke(null, new Object[]{this.a.m6083a()})).longValue();
            }
            synchronized (this.b) {
                this.b.f6459f = Long.valueOf(this.f7044d);
            }
            return;
        }
        this.b.f6459f = Long.valueOf(-1);
        this.b.f6459f = (Long) this.c.invoke(null, new Object[]{this.a.m6083a()});
    }
}
