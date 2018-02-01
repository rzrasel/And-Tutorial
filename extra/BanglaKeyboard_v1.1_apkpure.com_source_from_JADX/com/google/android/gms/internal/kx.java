package com.google.android.gms.internal;

public final class kx extends uv<kx> {
    public Integer f6424a;

    public kx() {
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        return this.f6424a != null ? a + ut.m6776b(27, this.f6424a.intValue()) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 216:
                    int h = usVar.m6768h();
                    int e = usVar.m6764e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f6424a = Integer.valueOf(e);
                            break;
                        default:
                            usVar.m6765e(h);
                            m5904a(usVar, a);
                            continue;
                    }
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
        if (this.f6424a != null) {
            utVar.m6785a(27, this.f6424a.intValue());
        }
        super.mo2195a(utVar);
    }
}
