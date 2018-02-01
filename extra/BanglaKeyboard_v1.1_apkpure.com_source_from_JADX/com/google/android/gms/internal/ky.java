package com.google.android.gms.internal;

public final class ky extends uv<ky> {
    public String f6425a;
    private String f6426b;
    private String f6427c;
    private String f6428d;
    private String f6429e;

    public ky() {
        this.f6425a = null;
        this.f6426b = null;
        this.f6427c = null;
        this.f6428d = null;
        this.f6429e = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f6425a != null) {
            a += ut.m6779b(1, this.f6425a);
        }
        if (this.f6426b != null) {
            a += ut.m6779b(2, this.f6426b);
        }
        if (this.f6427c != null) {
            a += ut.m6779b(3, this.f6427c);
        }
        if (this.f6428d != null) {
            a += ut.m6779b(4, this.f6428d);
        }
        return this.f6429e != null ? a + ut.m6779b(5, this.f6429e) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f6425a = usVar.m6761c();
                    continue;
                case 18:
                    this.f6426b = usVar.m6761c();
                    continue;
                case 26:
                    this.f6427c = usVar.m6761c();
                    continue;
                case 34:
                    this.f6428d = usVar.m6761c();
                    continue;
                case 42:
                    this.f6429e = usVar.m6761c();
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
        if (this.f6425a != null) {
            utVar.m6788a(1, this.f6425a);
        }
        if (this.f6426b != null) {
            utVar.m6788a(2, this.f6426b);
        }
        if (this.f6427c != null) {
            utVar.m6788a(3, this.f6427c);
        }
        if (this.f6428d != null) {
            utVar.m6788a(4, this.f6428d);
        }
        if (this.f6429e != null) {
            utVar.m6788a(5, this.f6429e);
        }
        super.mo2195a(utVar);
    }
}
