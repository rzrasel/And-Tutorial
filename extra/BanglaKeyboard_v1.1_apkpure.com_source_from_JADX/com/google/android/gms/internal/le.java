package com.google.android.gms.internal;

public final class le extends uv<le> {
    public byte[] f6560a;
    public byte[] f6561b;

    public le() {
        this.f6560a = null;
        this.f6561b = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f6560a != null) {
            a += ut.m6780b(1, this.f6560a);
        }
        return this.f6561b != null ? a + ut.m6780b(2, this.f6561b) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f6560a = usVar.m6763d();
                    continue;
                case 18:
                    this.f6561b = usVar.m6763d();
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
        if (this.f6560a != null) {
            utVar.m6790a(1, this.f6560a);
        }
        if (this.f6561b != null) {
            utVar.m6790a(2, this.f6561b);
        }
        super.mo2195a(utVar);
    }
}
