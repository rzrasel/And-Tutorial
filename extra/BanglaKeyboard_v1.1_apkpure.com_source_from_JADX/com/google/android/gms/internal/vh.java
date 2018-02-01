package com.google.android.gms.internal;

public final class vh extends uv<vh> {
    private static volatile vh[] f7280c;
    public byte[] f7281a;
    public byte[] f7282b;

    public vh() {
        this.f7281a = null;
        this.f7282b = null;
        this.R = null;
        this.S = -1;
    }

    public static vh[] m6822b() {
        if (f7280c == null) {
            synchronized (uz.f7247b) {
                if (f7280c == null) {
                    f7280c = new vh[0];
                }
            }
        }
        return f7280c;
    }

    protected final int mo2194a() {
        int a = super.mo2194a() + ut.m6780b(1, this.f7281a);
        return this.f7282b != null ? a + ut.m6780b(2, this.f7282b) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f7281a = usVar.m6763d();
                    continue;
                case 18:
                    this.f7282b = usVar.m6763d();
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
        utVar.m6790a(1, this.f7281a);
        if (this.f7282b != null) {
            utVar.m6790a(2, this.f7282b);
        }
        super.mo2195a(utVar);
    }
}
