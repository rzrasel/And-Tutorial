package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;

final class at implements Runnable {
    private /* synthetic */ zzaak f5691a;
    private /* synthetic */ C1587t f5692b;
    private /* synthetic */ ao f5693c;

    at(ao aoVar, zzaak com_google_android_gms_internal_zzaak, C1587t c1587t) {
        this.f5693c = aoVar;
        this.f5691a = com_google_android_gms_internal_zzaak;
        this.f5692b = c1587t;
    }

    public final void run() {
        zzaao a;
        try {
            a = this.f5693c.mo2002a(this.f5691a);
        } catch (Throwable e) {
            zzbv.zzee().m5336a(e, "AdRequestServiceImpl.loadAdAsync");
            id.m5371a("Could not fetch ad response due to an Exception.", e);
            a = null;
        }
        if (a == null) {
            a = new zzaao(0);
        }
        try {
            this.f5692b.mo2203a(a);
        } catch (Throwable e2) {
            id.m5371a("Fail to forward ad response.", e2);
        }
    }
}
