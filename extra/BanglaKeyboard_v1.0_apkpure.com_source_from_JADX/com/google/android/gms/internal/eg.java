package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.C0233a;
import com.google.android.gms.common.C0236e;
import com.google.android.gms.common.C0241d;

public final class eg extends ed implements C0241d, C0236e {
    private final ec f1246a;
    private final eh f1247b;
    private final Object f1248c = new Object();

    public eg(Context context, cx cxVar, ec ecVar) {
        super(cxVar, ecVar);
        this.f1246a = ecVar;
        this.f1247b = new eh(context, this, this, cxVar.f1167k.f1224d);
        this.f1247b.m1923d();
    }

    public final void mo879a(C0233a c0233a) {
        this.f1246a.mo875a(new cz(0));
    }

    public final void a_() {
        fl.m1985a(this.f1199e);
    }

    public final void mo881b() {
        gb.m2071a(3);
    }

    public final void mo877c() {
        synchronized (this.f1248c) {
            if (this.f1247b.mo882e() || this.f1247b.m1925f()) {
                this.f1247b.m1926g();
            }
        }
    }

    public final en mo878d() {
        en c;
        synchronized (this.f1248c) {
            try {
                c = this.f1247b.m1932c();
            } catch (IllegalStateException e) {
                c = null;
            }
        }
        return c;
    }
}
