package com.google.android.gms.internal;

public final class la extends uv<la> {
    private static volatile la[] f6528v;
    public Long f6529a;
    public Long f6530b;
    public Long f6531c;
    public Long f6532d;
    public Long f6533e;
    public Long f6534f;
    public Integer f6535g;
    public Long f6536h;
    public Long f6537i;
    public Long f6538j;
    public Integer f6539k;
    public Long f6540l;
    public Long f6541m;
    public Long f6542n;
    public Long f6543o;
    public Long f6544p;
    public Long f6545q;
    public Long f6546r;
    public Long f6547s;
    public Long f6548t;
    public Long f6549u;

    public la() {
        this.f6529a = null;
        this.f6530b = null;
        this.f6531c = null;
        this.f6532d = null;
        this.f6533e = null;
        this.f6534f = null;
        this.f6536h = null;
        this.f6537i = null;
        this.f6538j = null;
        this.f6540l = null;
        this.f6541m = null;
        this.f6542n = null;
        this.f6543o = null;
        this.f6544p = null;
        this.f6545q = null;
        this.f6546r = null;
        this.f6547s = null;
        this.f6548t = null;
        this.f6549u = null;
        this.S = -1;
    }

    public static la[] m5921b() {
        if (f6528v == null) {
            synchronized (uz.f7247b) {
                if (f6528v == null) {
                    f6528v = new la[0];
                }
            }
        }
        return f6528v;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f6529a != null) {
            a += ut.m6777b(1, this.f6529a.longValue());
        }
        if (this.f6530b != null) {
            a += ut.m6777b(2, this.f6530b.longValue());
        }
        if (this.f6531c != null) {
            a += ut.m6777b(3, this.f6531c.longValue());
        }
        if (this.f6532d != null) {
            a += ut.m6777b(4, this.f6532d.longValue());
        }
        if (this.f6533e != null) {
            a += ut.m6777b(5, this.f6533e.longValue());
        }
        if (this.f6534f != null) {
            a += ut.m6777b(6, this.f6534f.longValue());
        }
        if (this.f6535g != null) {
            a += ut.m6776b(7, this.f6535g.intValue());
        }
        if (this.f6536h != null) {
            a += ut.m6777b(8, this.f6536h.longValue());
        }
        if (this.f6537i != null) {
            a += ut.m6777b(9, this.f6537i.longValue());
        }
        if (this.f6538j != null) {
            a += ut.m6777b(10, this.f6538j.longValue());
        }
        if (this.f6539k != null) {
            a += ut.m6776b(11, this.f6539k.intValue());
        }
        if (this.f6540l != null) {
            a += ut.m6777b(12, this.f6540l.longValue());
        }
        if (this.f6541m != null) {
            a += ut.m6777b(13, this.f6541m.longValue());
        }
        if (this.f6542n != null) {
            a += ut.m6777b(14, this.f6542n.longValue());
        }
        if (this.f6543o != null) {
            a += ut.m6777b(15, this.f6543o.longValue());
        }
        if (this.f6544p != null) {
            a += ut.m6777b(16, this.f6544p.longValue());
        }
        if (this.f6545q != null) {
            a += ut.m6777b(17, this.f6545q.longValue());
        }
        if (this.f6546r != null) {
            a += ut.m6777b(18, this.f6546r.longValue());
        }
        if (this.f6547s != null) {
            a += ut.m6777b(19, this.f6547s.longValue());
        }
        if (this.f6548t != null) {
            a += ut.m6777b(20, this.f6548t.longValue());
        }
        return this.f6549u != null ? a + ut.m6777b(21, this.f6549u.longValue()) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            int h;
            int e;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f6529a = Long.valueOf(usVar.m6766f());
                    continue;
                case 16:
                    this.f6530b = Long.valueOf(usVar.m6766f());
                    continue;
                case 24:
                    this.f6531c = Long.valueOf(usVar.m6766f());
                    continue;
                case 32:
                    this.f6532d = Long.valueOf(usVar.m6766f());
                    continue;
                case 40:
                    this.f6533e = Long.valueOf(usVar.m6766f());
                    continue;
                case 48:
                    this.f6534f = Long.valueOf(usVar.m6766f());
                    continue;
                case 56:
                    h = usVar.m6768h();
                    e = usVar.m6764e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 1000:
                            this.f6535g = Integer.valueOf(e);
                            break;
                        default:
                            usVar.m6765e(h);
                            m5904a(usVar, a);
                            continue;
                    }
                case 64:
                    this.f6536h = Long.valueOf(usVar.m6766f());
                    continue;
                case 72:
                    this.f6537i = Long.valueOf(usVar.m6766f());
                    continue;
                case 80:
                    this.f6538j = Long.valueOf(usVar.m6766f());
                    continue;
                case 88:
                    h = usVar.m6768h();
                    e = usVar.m6764e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 1000:
                            this.f6539k = Integer.valueOf(e);
                            break;
                        default:
                            usVar.m6765e(h);
                            m5904a(usVar, a);
                            continue;
                    }
                case 96:
                    this.f6540l = Long.valueOf(usVar.m6766f());
                    continue;
                case 104:
                    this.f6541m = Long.valueOf(usVar.m6766f());
                    continue;
                case 112:
                    this.f6542n = Long.valueOf(usVar.m6766f());
                    continue;
                case 120:
                    this.f6543o = Long.valueOf(usVar.m6766f());
                    continue;
                case 128:
                    this.f6544p = Long.valueOf(usVar.m6766f());
                    continue;
                case 136:
                    this.f6545q = Long.valueOf(usVar.m6766f());
                    continue;
                case 144:
                    this.f6546r = Long.valueOf(usVar.m6766f());
                    continue;
                case 152:
                    this.f6547s = Long.valueOf(usVar.m6766f());
                    continue;
                case 160:
                    this.f6548t = Long.valueOf(usVar.m6766f());
                    continue;
                case 168:
                    this.f6549u = Long.valueOf(usVar.m6766f());
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
        if (this.f6529a != null) {
            utVar.m6786a(1, this.f6529a.longValue());
        }
        if (this.f6530b != null) {
            utVar.m6786a(2, this.f6530b.longValue());
        }
        if (this.f6531c != null) {
            utVar.m6786a(3, this.f6531c.longValue());
        }
        if (this.f6532d != null) {
            utVar.m6786a(4, this.f6532d.longValue());
        }
        if (this.f6533e != null) {
            utVar.m6786a(5, this.f6533e.longValue());
        }
        if (this.f6534f != null) {
            utVar.m6786a(6, this.f6534f.longValue());
        }
        if (this.f6535g != null) {
            utVar.m6785a(7, this.f6535g.intValue());
        }
        if (this.f6536h != null) {
            utVar.m6786a(8, this.f6536h.longValue());
        }
        if (this.f6537i != null) {
            utVar.m6786a(9, this.f6537i.longValue());
        }
        if (this.f6538j != null) {
            utVar.m6786a(10, this.f6538j.longValue());
        }
        if (this.f6539k != null) {
            utVar.m6785a(11, this.f6539k.intValue());
        }
        if (this.f6540l != null) {
            utVar.m6786a(12, this.f6540l.longValue());
        }
        if (this.f6541m != null) {
            utVar.m6786a(13, this.f6541m.longValue());
        }
        if (this.f6542n != null) {
            utVar.m6786a(14, this.f6542n.longValue());
        }
        if (this.f6543o != null) {
            utVar.m6786a(15, this.f6543o.longValue());
        }
        if (this.f6544p != null) {
            utVar.m6786a(16, this.f6544p.longValue());
        }
        if (this.f6545q != null) {
            utVar.m6786a(17, this.f6545q.longValue());
        }
        if (this.f6546r != null) {
            utVar.m6786a(18, this.f6546r.longValue());
        }
        if (this.f6547s != null) {
            utVar.m6786a(19, this.f6547s.longValue());
        }
        if (this.f6548t != null) {
            utVar.m6786a(20, this.f6548t.longValue());
        }
        if (this.f6549u != null) {
            utVar.m6786a(21, this.f6549u.longValue());
        }
        super.mo2195a(utVar);
    }
}
