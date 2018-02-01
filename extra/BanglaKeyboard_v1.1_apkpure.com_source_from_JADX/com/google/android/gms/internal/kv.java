package com.google.android.gms.internal;

public final class kv extends uv<kv> {
    public String f6412a;
    public Long f6413b;
    private String f6414c;
    private String f6415d;
    private String f6416e;
    private Long f6417f;
    private Long f6418g;
    private String f6419h;
    private Long f6420i;
    private String f6421j;

    public kv() {
        this.f6412a = null;
        this.f6413b = null;
        this.f6414c = null;
        this.f6415d = null;
        this.f6416e = null;
        this.f6417f = null;
        this.f6418g = null;
        this.f6419h = null;
        this.f6420i = null;
        this.f6421j = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f6412a != null) {
            a += ut.m6779b(1, this.f6412a);
        }
        if (this.f6413b != null) {
            a += ut.m6777b(2, this.f6413b.longValue());
        }
        if (this.f6414c != null) {
            a += ut.m6779b(3, this.f6414c);
        }
        if (this.f6415d != null) {
            a += ut.m6779b(4, this.f6415d);
        }
        if (this.f6416e != null) {
            a += ut.m6779b(5, this.f6416e);
        }
        if (this.f6417f != null) {
            a += ut.m6777b(6, this.f6417f.longValue());
        }
        if (this.f6418g != null) {
            a += ut.m6777b(7, this.f6418g.longValue());
        }
        if (this.f6419h != null) {
            a += ut.m6779b(8, this.f6419h);
        }
        if (this.f6420i != null) {
            a += ut.m6777b(9, this.f6420i.longValue());
        }
        return this.f6421j != null ? a + ut.m6779b(10, this.f6421j) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f6412a = usVar.m6761c();
                    continue;
                case 16:
                    this.f6413b = Long.valueOf(usVar.m6766f());
                    continue;
                case 26:
                    this.f6414c = usVar.m6761c();
                    continue;
                case 34:
                    this.f6415d = usVar.m6761c();
                    continue;
                case 42:
                    this.f6416e = usVar.m6761c();
                    continue;
                case 48:
                    this.f6417f = Long.valueOf(usVar.m6766f());
                    continue;
                case 56:
                    this.f6418g = Long.valueOf(usVar.m6766f());
                    continue;
                case 66:
                    this.f6419h = usVar.m6761c();
                    continue;
                case 72:
                    this.f6420i = Long.valueOf(usVar.m6766f());
                    continue;
                case 82:
                    this.f6421j = usVar.m6761c();
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
        if (this.f6412a != null) {
            utVar.m6788a(1, this.f6412a);
        }
        if (this.f6413b != null) {
            utVar.m6786a(2, this.f6413b.longValue());
        }
        if (this.f6414c != null) {
            utVar.m6788a(3, this.f6414c);
        }
        if (this.f6415d != null) {
            utVar.m6788a(4, this.f6415d);
        }
        if (this.f6416e != null) {
            utVar.m6788a(5, this.f6416e);
        }
        if (this.f6417f != null) {
            utVar.m6786a(6, this.f6417f.longValue());
        }
        if (this.f6418g != null) {
            utVar.m6786a(7, this.f6418g.longValue());
        }
        if (this.f6419h != null) {
            utVar.m6788a(8, this.f6419h);
        }
        if (this.f6420i != null) {
            utVar.m6786a(9, this.f6420i.longValue());
        }
        if (this.f6421j != null) {
            utVar.m6788a(10, this.f6421j);
        }
        super.mo2195a(utVar);
    }
}
