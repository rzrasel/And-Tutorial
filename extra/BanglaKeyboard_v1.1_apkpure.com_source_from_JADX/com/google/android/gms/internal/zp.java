package com.google.android.gms.internal;

public final class zp extends uv<zp> {
    public String f7561a;

    public zp() {
        this.f7561a = null;
        this.R = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        return this.f7561a != null ? a + ut.m6779b(10, this.f7561a) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 82:
                    this.f7561a = usVar.m6761c();
                    continue;
                default:
                    if (!super.m5904a(usVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final void mo2195a(ut utVar) {
        if (this.f7561a != null) {
            utVar.m6788a(10, this.f7561a);
        }
        super.mo2195a(utVar);
    }
}
