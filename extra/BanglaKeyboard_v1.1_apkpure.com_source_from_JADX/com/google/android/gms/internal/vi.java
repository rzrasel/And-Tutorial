package com.google.android.gms.internal;

public final class vi extends uv<vi> {
    public vh[] f7283a;
    private vj f7284b;
    private byte[] f7285c;
    private byte[] f7286d;
    private Integer f7287e;

    public vi() {
        this.f7284b = null;
        this.f7283a = vh.m6822b();
        this.f7285c = null;
        this.f7286d = null;
        this.f7287e = null;
        this.R = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f7284b != null) {
            a += ut.m6778b(1, this.f7284b);
        }
        if (this.f7283a != null && this.f7283a.length > 0) {
            int i = a;
            for (vb vbVar : this.f7283a) {
                if (vbVar != null) {
                    i += ut.m6778b(2, vbVar);
                }
            }
            a = i;
        }
        if (this.f7285c != null) {
            a += ut.m6780b(3, this.f7285c);
        }
        if (this.f7286d != null) {
            a += ut.m6780b(4, this.f7286d);
        }
        return this.f7287e != null ? a + ut.m6776b(5, this.f7287e.intValue()) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f7284b == null) {
                        this.f7284b = new vj();
                    }
                    usVar.m6757a(this.f7284b);
                    continue;
                case 18:
                    int a2 = ve.m6815a(usVar, 18);
                    a = this.f7283a == null ? 0 : this.f7283a.length;
                    Object obj = new vh[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f7283a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new vh();
                        usVar.m6757a(obj[a]);
                        usVar.m6754a();
                        a++;
                    }
                    obj[a] = new vh();
                    usVar.m6757a(obj[a]);
                    this.f7283a = obj;
                    continue;
                case 26:
                    this.f7285c = usVar.m6763d();
                    continue;
                case 34:
                    this.f7286d = usVar.m6763d();
                    continue;
                case 40:
                    this.f7287e = Integer.valueOf(usVar.m6764e());
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
        if (this.f7284b != null) {
            utVar.m6787a(1, this.f7284b);
        }
        if (this.f7283a != null && this.f7283a.length > 0) {
            for (vb vbVar : this.f7283a) {
                if (vbVar != null) {
                    utVar.m6787a(2, vbVar);
                }
            }
        }
        if (this.f7285c != null) {
            utVar.m6790a(3, this.f7285c);
        }
        if (this.f7286d != null) {
            utVar.m6790a(4, this.f7286d);
        }
        if (this.f7287e != null) {
            utVar.m6785a(5, this.f7287e.intValue());
        }
        super.mo2195a(utVar);
    }
}
