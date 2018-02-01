package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1520y;

final class zb implements C1520y {
    private /* synthetic */ yw f7543a;

    zb(yw ywVar) {
        this.f7543a = ywVar;
    }

    public final void mo2128c() {
        synchronized (this.f7543a.f7533b) {
            this.f7543a.f7535d = null;
            if (this.f7543a.f7534c != null) {
                this.f7543a.f7534c = null;
            }
            this.f7543a.f7533b.notifyAll();
        }
    }
}
