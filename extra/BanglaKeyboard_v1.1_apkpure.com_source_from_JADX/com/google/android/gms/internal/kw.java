package com.google.android.gms.internal;

public final class kw extends uv<kw> {
    public kx f6422a;
    public ky f6423b;

    public kw() {
        this.f6422a = null;
        this.f6423b = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f6422a != null) {
            a += ut.m6778b(1, this.f6422a);
        }
        return this.f6423b != null ? a + ut.m6778b(2, this.f6423b) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f6422a == null) {
                        this.f6422a = new kx();
                    }
                    usVar.m6757a(this.f6422a);
                    continue;
                case 18:
                    if (this.f6423b == null) {
                        this.f6423b = new ky();
                    }
                    usVar.m6757a(this.f6423b);
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
        if (this.f6422a != null) {
            utVar.m6787a(1, this.f6422a);
        }
        if (this.f6423b != null) {
            utVar.m6787a(2, this.f6423b);
        }
        super.mo2195a(utVar);
    }
}
