package com.google.android.gms.internal;

public final class vm extends uv<vm> {
    public Integer f7300a;
    public String f7301b;
    public byte[] f7302c;

    public vm() {
        this.f7300a = null;
        this.f7301b = null;
        this.f7302c = null;
        this.R = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f7300a != null) {
            a += ut.m6776b(1, this.f7300a.intValue());
        }
        if (this.f7301b != null) {
            a += ut.m6779b(2, this.f7301b);
        }
        return this.f7302c != null ? a + ut.m6780b(3, this.f7302c) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    int h = usVar.m6768h();
                    int e = usVar.m6764e();
                    switch (e) {
                        case 0:
                        case 1:
                            this.f7300a = Integer.valueOf(e);
                            break;
                        default:
                            usVar.m6765e(h);
                            m5904a(usVar, a);
                            continue;
                    }
                case 18:
                    this.f7301b = usVar.m6761c();
                    continue;
                case 26:
                    this.f7302c = usVar.m6763d();
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
        if (this.f7300a != null) {
            utVar.m6785a(1, this.f7300a.intValue());
        }
        if (this.f7301b != null) {
            utVar.m6788a(2, this.f7301b);
        }
        if (this.f7302c != null) {
            utVar.m6790a(3, this.f7302c);
        }
        super.mo2195a(utVar);
    }
}
