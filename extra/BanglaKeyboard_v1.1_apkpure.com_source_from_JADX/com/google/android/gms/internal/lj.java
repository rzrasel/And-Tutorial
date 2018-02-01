package com.google.android.gms.internal;

public final class lj extends uv<lj> {
    public Long f6566a;
    private String f6567b;
    private byte[] f6568c;

    public lj() {
        this.f6566a = null;
        this.f6567b = null;
        this.f6568c = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f6566a != null) {
            a += ut.m6777b(1, this.f6566a.longValue());
        }
        if (this.f6567b != null) {
            a += ut.m6779b(3, this.f6567b);
        }
        return this.f6568c != null ? a + ut.m6780b(4, this.f6568c) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f6566a = Long.valueOf(usVar.m6766f());
                    continue;
                case 26:
                    this.f6567b = usVar.m6761c();
                    continue;
                case 34:
                    this.f6568c = usVar.m6763d();
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
        if (this.f6566a != null) {
            utVar.m6786a(1, this.f6566a.longValue());
        }
        if (this.f6567b != null) {
            utVar.m6788a(3, this.f6567b);
        }
        if (this.f6568c != null) {
            utVar.m6790a(4, this.f6568c);
        }
        super.mo2195a(utVar);
    }
}
