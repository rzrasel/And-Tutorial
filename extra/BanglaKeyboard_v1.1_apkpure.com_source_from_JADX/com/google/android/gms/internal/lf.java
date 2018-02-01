package com.google.android.gms.internal;

public final class lf extends uv<lf> {
    public byte[] f6562a;
    public byte[] f6563b;
    public byte[] f6564c;
    public byte[] f6565d;

    public lf() {
        this.f6562a = null;
        this.f6563b = null;
        this.f6564c = null;
        this.f6565d = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f6562a != null) {
            a += ut.m6780b(1, this.f6562a);
        }
        if (this.f6563b != null) {
            a += ut.m6780b(2, this.f6563b);
        }
        if (this.f6564c != null) {
            a += ut.m6780b(3, this.f6564c);
        }
        return this.f6565d != null ? a + ut.m6780b(4, this.f6565d) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f6562a = usVar.m6763d();
                    continue;
                case 18:
                    this.f6563b = usVar.m6763d();
                    continue;
                case 26:
                    this.f6564c = usVar.m6763d();
                    continue;
                case 34:
                    this.f6565d = usVar.m6763d();
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
        if (this.f6562a != null) {
            utVar.m6790a(1, this.f6562a);
        }
        if (this.f6563b != null) {
            utVar.m6790a(2, this.f6563b);
        }
        if (this.f6564c != null) {
            utVar.m6790a(3, this.f6564c);
        }
        if (this.f6565d != null) {
            utVar.m6790a(4, this.f6565d);
        }
        super.mo2195a(utVar);
    }
}
