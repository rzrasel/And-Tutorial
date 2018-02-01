package com.google.android.gms.internal;

public final class vj extends uv<vj> {
    private byte[] f7288a;
    private byte[] f7289b;
    private byte[] f7290c;

    public vj() {
        this.f7288a = null;
        this.f7289b = null;
        this.f7290c = null;
        this.R = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f7288a != null) {
            a += ut.m6780b(1, this.f7288a);
        }
        if (this.f7289b != null) {
            a += ut.m6780b(2, this.f7289b);
        }
        return this.f7290c != null ? a + ut.m6780b(3, this.f7290c) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f7288a = usVar.m6763d();
                    continue;
                case 18:
                    this.f7289b = usVar.m6763d();
                    continue;
                case 26:
                    this.f7290c = usVar.m6763d();
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
        if (this.f7288a != null) {
            utVar.m6790a(1, this.f7288a);
        }
        if (this.f7289b != null) {
            utVar.m6790a(2, this.f7289b);
        }
        if (this.f7290c != null) {
            utVar.m6790a(3, this.f7290c);
        }
        super.mo2195a(utVar);
    }
}
