package com.google.android.gms.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C1519x;

final class yz implements C1519x {
    private /* synthetic */ yw f7539a;

    yz(yw ywVar) {
        this.f7539a = ywVar;
    }

    public final void mo2126a() {
        synchronized (this.f7539a.f7533b) {
            try {
                if (this.f7539a.f7534c != null) {
                    this.f7539a.f7535d = this.f7539a.f7534c.mo2192j();
                }
            } catch (DeadObjectException e) {
                id.m5372a(6);
                yw.m7048a(this.f7539a);
            }
            this.f7539a.f7533b.notifyAll();
        }
    }

    public final void mo2127b() {
        synchronized (this.f7539a.f7533b) {
            this.f7539a.f7535d = null;
            this.f7539a.f7533b.notifyAll();
        }
    }
}
