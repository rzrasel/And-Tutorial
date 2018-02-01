package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;

@aqv
public final class hr {
    private long f6221a;
    private long f6222b = Long.MIN_VALUE;
    private Object f6223c = new Object();

    public hr(long j) {
        this.f6221a = j;
    }

    public final boolean m5599a() {
        boolean z;
        synchronized (this.f6223c) {
            long b = zzbv.zzeg().mo1670b();
            if (this.f6222b + this.f6221a > b) {
                z = false;
            } else {
                this.f6222b = b;
                z = true;
            }
        }
        return z;
    }
}
