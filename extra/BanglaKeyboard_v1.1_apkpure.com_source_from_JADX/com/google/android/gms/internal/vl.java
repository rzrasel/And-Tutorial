package com.google.android.gms.internal;

public final class vl extends uv<vl> {
    private Integer f7297a;
    private byte[] f7298b;
    private byte[] f7299c;

    public vl() {
        this.f7297a = null;
        this.f7298b = null;
        this.f7299c = null;
        this.R = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f7297a != null) {
            a += ut.m6776b(1, this.f7297a.intValue());
        }
        if (this.f7298b != null) {
            a += ut.m6780b(2, this.f7298b);
        }
        return this.f7299c != null ? a + ut.m6780b(3, this.f7299c) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f7297a = Integer.valueOf(usVar.m6764e());
                    continue;
                case 18:
                    this.f7298b = usVar.m6763d();
                    continue;
                case 26:
                    this.f7299c = usVar.m6763d();
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
        if (this.f7297a != null) {
            utVar.m6785a(1, this.f7297a.intValue());
        }
        if (this.f7298b != null) {
            utVar.m6790a(2, this.f7298b);
        }
        if (this.f7299c != null) {
            utVar.m6790a(3, this.f7299c);
        }
        super.mo2195a(utVar);
    }
}
