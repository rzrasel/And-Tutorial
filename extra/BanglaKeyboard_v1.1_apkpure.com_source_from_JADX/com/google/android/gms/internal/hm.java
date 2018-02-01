package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;

final class hm implements Runnable {
    private /* synthetic */ il f6211a;
    private /* synthetic */ hj f6212b;

    hm(hj hjVar, il ilVar) {
        this.f6212b = hjVar;
        this.f6211a = ilVar;
    }

    public final void run() {
        try {
            this.f6212b.f6206l.mo2122a(this.f6211a.get());
        } catch (Throwable e) {
            id.m5372a(6);
            zzbv.zzee().m5336a(e, "HttpGetter.deliverResponse.1");
        }
    }
}
