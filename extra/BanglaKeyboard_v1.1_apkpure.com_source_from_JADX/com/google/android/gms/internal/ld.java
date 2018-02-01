package com.google.android.gms.internal;

public final class ld extends uv<ld> {
    private Long f6555a;
    private Integer f6556b;
    private Boolean f6557c;
    private int[] f6558d;
    private Long f6559e;

    public ld() {
        this.f6555a = null;
        this.f6556b = null;
        this.f6557c = null;
        this.f6558d = ve.f7251a;
        this.f6559e = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int i = 0;
        int a = super.mo2194a();
        if (this.f6555a != null) {
            a += ut.m6777b(1, this.f6555a.longValue());
        }
        if (this.f6556b != null) {
            a += ut.m6776b(2, this.f6556b.intValue());
        }
        if (this.f6557c != null) {
            this.f6557c.booleanValue();
            a += ut.m6783c(24) + 1;
        }
        if (this.f6558d != null && this.f6558d.length > 0) {
            int i2 = 0;
            while (i < this.f6558d.length) {
                i2 += ut.m6769a(this.f6558d[i]);
                i++;
            }
            a = (a + i2) + (this.f6558d.length * 1);
        }
        if (this.f6559e == null) {
            return a;
        }
        return a + (ut.m6783c(40) + ut.m6781b(this.f6559e.longValue()));
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f6555a = Long.valueOf(usVar.m6766f());
                    continue;
                case 16:
                    this.f6556b = Integer.valueOf(usVar.m6764e());
                    continue;
                case 24:
                    this.f6557c = Boolean.valueOf(usVar.m6758b());
                    continue;
                case 32:
                    a2 = ve.m6815a(usVar, 32);
                    a = this.f6558d == null ? 0 : this.f6558d.length;
                    Object obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f6558d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = usVar.m6764e();
                        usVar.m6754a();
                        a++;
                    }
                    obj[a] = usVar.m6764e();
                    this.f6558d = obj;
                    continue;
                case 34:
                    int c = usVar.m6760c(usVar.m6764e());
                    a2 = usVar.m6768h();
                    a = 0;
                    while (usVar.m6767g() > 0) {
                        usVar.m6764e();
                        a++;
                    }
                    usVar.m6765e(a2);
                    a2 = this.f6558d == null ? 0 : this.f6558d.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f6558d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = usVar.m6764e();
                        a2++;
                    }
                    this.f6558d = obj2;
                    usVar.m6762d(c);
                    continue;
                case 40:
                    this.f6559e = Long.valueOf(usVar.m6766f());
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
        if (this.f6555a != null) {
            utVar.m6786a(1, this.f6555a.longValue());
        }
        if (this.f6556b != null) {
            utVar.m6785a(2, this.f6556b.intValue());
        }
        if (this.f6557c != null) {
            utVar.m6789a(3, this.f6557c.booleanValue());
        }
        if (this.f6558d != null && this.f6558d.length > 0) {
            for (int a : this.f6558d) {
                utVar.m6785a(4, a);
            }
        }
        if (this.f6559e != null) {
            long longValue = this.f6559e.longValue();
            utVar.m6795c(5, 0);
            utVar.m6791a(longValue);
        }
        super.mo2195a(utVar);
    }
}
