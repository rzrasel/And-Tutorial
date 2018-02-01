package com.google.android.gms.internal;

public final class lb extends uv<lb> {
    public Long f6550a;
    public Long f6551b;
    public Long f6552c;
    private Long f6553d;
    private Long f6554e;

    public lb() {
        this.f6553d = null;
        this.f6554e = null;
        this.f6550a = null;
        this.f6551b = null;
        this.f6552c = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f6553d != null) {
            a += ut.m6777b(1, this.f6553d.longValue());
        }
        if (this.f6554e != null) {
            a += ut.m6777b(2, this.f6554e.longValue());
        }
        if (this.f6550a != null) {
            a += ut.m6777b(3, this.f6550a.longValue());
        }
        if (this.f6551b != null) {
            a += ut.m6777b(4, this.f6551b.longValue());
        }
        return this.f6552c != null ? a + ut.m6777b(5, this.f6552c.longValue()) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f6553d = Long.valueOf(usVar.m6766f());
                    continue;
                case 16:
                    this.f6554e = Long.valueOf(usVar.m6766f());
                    continue;
                case 24:
                    this.f6550a = Long.valueOf(usVar.m6766f());
                    continue;
                case 32:
                    this.f6551b = Long.valueOf(usVar.m6766f());
                    continue;
                case 40:
                    this.f6552c = Long.valueOf(usVar.m6766f());
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
        if (this.f6553d != null) {
            utVar.m6786a(1, this.f6553d.longValue());
        }
        if (this.f6554e != null) {
            utVar.m6786a(2, this.f6554e.longValue());
        }
        if (this.f6550a != null) {
            utVar.m6786a(3, this.f6550a.longValue());
        }
        if (this.f6551b != null) {
            utVar.m6786a(4, this.f6551b.longValue());
        }
        if (this.f6552c != null) {
            utVar.m6786a(5, this.f6552c.longValue());
        }
        super.mo2195a(utVar);
    }
}
