package com.google.android.gms.internal;

public final class vo extends uv<vo> {
    public String f7313a;
    public Long f7314b;
    public Boolean f7315c;

    public vo() {
        this.f7313a = null;
        this.f7314b = null;
        this.f7315c = null;
        this.R = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f7313a != null) {
            a += ut.m6779b(1, this.f7313a);
        }
        if (this.f7314b != null) {
            a += ut.m6777b(2, this.f7314b.longValue());
        }
        if (this.f7315c == null) {
            return a;
        }
        this.f7315c.booleanValue();
        return a + (ut.m6783c(24) + 1);
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f7313a = usVar.m6761c();
                    continue;
                case 16:
                    this.f7314b = Long.valueOf(usVar.m6766f());
                    continue;
                case 24:
                    this.f7315c = Boolean.valueOf(usVar.m6758b());
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
        if (this.f7313a != null) {
            utVar.m6788a(1, this.f7313a);
        }
        if (this.f7314b != null) {
            utVar.m6786a(2, this.f7314b.longValue());
        }
        if (this.f7315c != null) {
            utVar.m6789a(3, this.f7315c.booleanValue());
        }
        super.mo2195a(utVar);
    }
}
