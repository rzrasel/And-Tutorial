package com.google.android.gms.internal;

public final class vf extends uv<vf> {
    public Integer f7263a;
    public String f7264b;
    public String f7265c;
    public vg f7266d;
    public vn[] f7267e;
    public String f7268f;
    public vm f7269g;
    public vo f7270h;
    private Integer f7271i;
    private String f7272j;
    private Boolean f7273k;
    private String[] f7274l;
    private String f7275m;
    private Boolean f7276n;
    private Boolean f7277o;
    private byte[] f7278p;

    public vf() {
        this.f7263a = null;
        this.f7271i = null;
        this.f7264b = null;
        this.f7265c = null;
        this.f7272j = null;
        this.f7266d = null;
        this.f7267e = vn.m6841b();
        this.f7268f = null;
        this.f7269g = null;
        this.f7273k = null;
        this.f7274l = ve.f7255e;
        this.f7275m = null;
        this.f7276n = null;
        this.f7277o = null;
        this.f7278p = null;
        this.f7270h = null;
        this.R = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int i;
        int i2 = 0;
        int a = super.mo2194a();
        if (this.f7264b != null) {
            a += ut.m6779b(1, this.f7264b);
        }
        if (this.f7265c != null) {
            a += ut.m6779b(2, this.f7265c);
        }
        if (this.f7272j != null) {
            a += ut.m6779b(3, this.f7272j);
        }
        if (this.f7267e != null && this.f7267e.length > 0) {
            i = a;
            for (vb vbVar : this.f7267e) {
                if (vbVar != null) {
                    i += ut.m6778b(4, vbVar);
                }
            }
            a = i;
        }
        if (this.f7273k != null) {
            this.f7273k.booleanValue();
            a += ut.m6783c(40) + 1;
        }
        if (this.f7274l != null && this.f7274l.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f7274l.length) {
                String str = this.f7274l[i2];
                if (str != null) {
                    i3++;
                    i += ut.m6772a(str);
                }
                i2++;
            }
            a = (a + i) + (i3 * 1);
        }
        if (this.f7275m != null) {
            a += ut.m6779b(7, this.f7275m);
        }
        if (this.f7276n != null) {
            this.f7276n.booleanValue();
            a += ut.m6783c(64) + 1;
        }
        if (this.f7277o != null) {
            this.f7277o.booleanValue();
            a += ut.m6783c(72) + 1;
        }
        if (this.f7263a != null) {
            a += ut.m6776b(10, this.f7263a.intValue());
        }
        if (this.f7271i != null) {
            a += ut.m6776b(11, this.f7271i.intValue());
        }
        if (this.f7266d != null) {
            a += ut.m6778b(12, this.f7266d);
        }
        if (this.f7268f != null) {
            a += ut.m6779b(13, this.f7268f);
        }
        if (this.f7269g != null) {
            a += ut.m6778b(14, this.f7269g);
        }
        if (this.f7278p != null) {
            a += ut.m6780b(15, this.f7278p);
        }
        return this.f7270h != null ? a + ut.m6778b(17, this.f7270h) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            int a2;
            Object obj;
            int e;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f7264b = usVar.m6761c();
                    continue;
                case 18:
                    this.f7265c = usVar.m6761c();
                    continue;
                case 26:
                    this.f7272j = usVar.m6761c();
                    continue;
                case 34:
                    a2 = ve.m6815a(usVar, 34);
                    a = this.f7267e == null ? 0 : this.f7267e.length;
                    obj = new vn[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f7267e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new vn();
                        usVar.m6757a(obj[a]);
                        usVar.m6754a();
                        a++;
                    }
                    obj[a] = new vn();
                    usVar.m6757a(obj[a]);
                    this.f7267e = obj;
                    continue;
                case 40:
                    this.f7273k = Boolean.valueOf(usVar.m6758b());
                    continue;
                case 50:
                    a2 = ve.m6815a(usVar, 50);
                    a = this.f7274l == null ? 0 : this.f7274l.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f7274l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = usVar.m6761c();
                        usVar.m6754a();
                        a++;
                    }
                    obj[a] = usVar.m6761c();
                    this.f7274l = obj;
                    continue;
                case 58:
                    this.f7275m = usVar.m6761c();
                    continue;
                case 64:
                    this.f7276n = Boolean.valueOf(usVar.m6758b());
                    continue;
                case 72:
                    this.f7277o = Boolean.valueOf(usVar.m6758b());
                    continue;
                case 80:
                    a2 = usVar.m6768h();
                    e = usVar.m6764e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f7263a = Integer.valueOf(e);
                            break;
                        default:
                            usVar.m6765e(a2);
                            m5904a(usVar, a);
                            continue;
                    }
                case 88:
                    a2 = usVar.m6768h();
                    e = usVar.m6764e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f7271i = Integer.valueOf(e);
                            break;
                        default:
                            usVar.m6765e(a2);
                            m5904a(usVar, a);
                            continue;
                    }
                case 98:
                    if (this.f7266d == null) {
                        this.f7266d = new vg();
                    }
                    usVar.m6757a(this.f7266d);
                    continue;
                case 106:
                    this.f7268f = usVar.m6761c();
                    continue;
                case 114:
                    if (this.f7269g == null) {
                        this.f7269g = new vm();
                    }
                    usVar.m6757a(this.f7269g);
                    continue;
                case 122:
                    this.f7278p = usVar.m6763d();
                    continue;
                case 138:
                    if (this.f7270h == null) {
                        this.f7270h = new vo();
                    }
                    usVar.m6757a(this.f7270h);
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
        int i = 0;
        if (this.f7264b != null) {
            utVar.m6788a(1, this.f7264b);
        }
        if (this.f7265c != null) {
            utVar.m6788a(2, this.f7265c);
        }
        if (this.f7272j != null) {
            utVar.m6788a(3, this.f7272j);
        }
        if (this.f7267e != null && this.f7267e.length > 0) {
            for (vb vbVar : this.f7267e) {
                if (vbVar != null) {
                    utVar.m6787a(4, vbVar);
                }
            }
        }
        if (this.f7273k != null) {
            utVar.m6789a(5, this.f7273k.booleanValue());
        }
        if (this.f7274l != null && this.f7274l.length > 0) {
            while (i < this.f7274l.length) {
                String str = this.f7274l[i];
                if (str != null) {
                    utVar.m6788a(6, str);
                }
                i++;
            }
        }
        if (this.f7275m != null) {
            utVar.m6788a(7, this.f7275m);
        }
        if (this.f7276n != null) {
            utVar.m6789a(8, this.f7276n.booleanValue());
        }
        if (this.f7277o != null) {
            utVar.m6789a(9, this.f7277o.booleanValue());
        }
        if (this.f7263a != null) {
            utVar.m6785a(10, this.f7263a.intValue());
        }
        if (this.f7271i != null) {
            utVar.m6785a(11, this.f7271i.intValue());
        }
        if (this.f7266d != null) {
            utVar.m6787a(12, this.f7266d);
        }
        if (this.f7268f != null) {
            utVar.m6788a(13, this.f7268f);
        }
        if (this.f7269g != null) {
            utVar.m6787a(14, this.f7269g);
        }
        if (this.f7278p != null) {
            utVar.m6790a(15, this.f7278p);
        }
        if (this.f7270h != null) {
            utVar.m6787a(17, this.f7270h);
        }
        super.mo2195a(utVar);
    }
}
