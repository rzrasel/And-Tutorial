package com.google.android.gms.internal;

public final class vn extends uv<vn> {
    private static volatile vn[] f7303f;
    public Integer f7304a;
    public String f7305b;
    public vi f7306c;
    public Integer f7307d;
    public String[] f7308e;
    private vk f7309g;
    private Integer f7310h;
    private int[] f7311i;
    private String f7312j;

    public vn() {
        this.f7304a = null;
        this.f7305b = null;
        this.f7306c = null;
        this.f7309g = null;
        this.f7310h = null;
        this.f7311i = ve.f7251a;
        this.f7312j = null;
        this.f7307d = null;
        this.f7308e = ve.f7255e;
        this.R = null;
        this.S = -1;
    }

    public static vn[] m6841b() {
        if (f7303f == null) {
            synchronized (uz.f7247b) {
                if (f7303f == null) {
                    f7303f = new vn[0];
                }
            }
        }
        return f7303f;
    }

    protected final int mo2194a() {
        int i;
        int i2;
        int i3 = 0;
        int a = super.mo2194a() + ut.m6776b(1, this.f7304a.intValue());
        if (this.f7305b != null) {
            a += ut.m6779b(2, this.f7305b);
        }
        if (this.f7306c != null) {
            a += ut.m6778b(3, this.f7306c);
        }
        if (this.f7309g != null) {
            a += ut.m6778b(4, this.f7309g);
        }
        if (this.f7310h != null) {
            a += ut.m6776b(5, this.f7310h.intValue());
        }
        if (this.f7311i != null && this.f7311i.length > 0) {
            i = 0;
            for (int a2 : this.f7311i) {
                i += ut.m6769a(a2);
            }
            a = (a + i) + (this.f7311i.length * 1);
        }
        if (this.f7312j != null) {
            a += ut.m6779b(7, this.f7312j);
        }
        if (this.f7307d != null) {
            a += ut.m6776b(8, this.f7307d.intValue());
        }
        if (this.f7308e == null || this.f7308e.length <= 0) {
            return a;
        }
        i2 = 0;
        i = 0;
        while (i3 < this.f7308e.length) {
            String str = this.f7308e[i3];
            if (str != null) {
                i++;
                i2 += ut.m6772a(str);
            }
            i3++;
        }
        return (a + i2) + (i * 1);
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            int a2;
            Object obj;
            int c;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f7304a = Integer.valueOf(usVar.m6764e());
                    continue;
                case 18:
                    this.f7305b = usVar.m6761c();
                    continue;
                case 26:
                    if (this.f7306c == null) {
                        this.f7306c = new vi();
                    }
                    usVar.m6757a(this.f7306c);
                    continue;
                case 34:
                    if (this.f7309g == null) {
                        this.f7309g = new vk();
                    }
                    usVar.m6757a(this.f7309g);
                    continue;
                case 40:
                    this.f7310h = Integer.valueOf(usVar.m6764e());
                    continue;
                case 48:
                    a2 = ve.m6815a(usVar, 48);
                    a = this.f7311i == null ? 0 : this.f7311i.length;
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f7311i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = usVar.m6764e();
                        usVar.m6754a();
                        a++;
                    }
                    obj[a] = usVar.m6764e();
                    this.f7311i = obj;
                    continue;
                case 50:
                    c = usVar.m6760c(usVar.m6764e());
                    a2 = usVar.m6768h();
                    a = 0;
                    while (usVar.m6767g() > 0) {
                        usVar.m6764e();
                        a++;
                    }
                    usVar.m6765e(a2);
                    a2 = this.f7311i == null ? 0 : this.f7311i.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f7311i, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = usVar.m6764e();
                        a2++;
                    }
                    this.f7311i = obj2;
                    usVar.m6762d(c);
                    continue;
                case 58:
                    this.f7312j = usVar.m6761c();
                    continue;
                case 64:
                    a2 = usVar.m6768h();
                    c = usVar.m6764e();
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f7307d = Integer.valueOf(c);
                            break;
                        default:
                            usVar.m6765e(a2);
                            m5904a(usVar, a);
                            continue;
                    }
                case 74:
                    a2 = ve.m6815a(usVar, 74);
                    a = this.f7308e == null ? 0 : this.f7308e.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f7308e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = usVar.m6761c();
                        usVar.m6754a();
                        a++;
                    }
                    obj[a] = usVar.m6761c();
                    this.f7308e = obj;
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
        utVar.m6785a(1, this.f7304a.intValue());
        if (this.f7305b != null) {
            utVar.m6788a(2, this.f7305b);
        }
        if (this.f7306c != null) {
            utVar.m6787a(3, this.f7306c);
        }
        if (this.f7309g != null) {
            utVar.m6787a(4, this.f7309g);
        }
        if (this.f7310h != null) {
            utVar.m6785a(5, this.f7310h.intValue());
        }
        if (this.f7311i != null && this.f7311i.length > 0) {
            for (int a : this.f7311i) {
                utVar.m6785a(6, a);
            }
        }
        if (this.f7312j != null) {
            utVar.m6788a(7, this.f7312j);
        }
        if (this.f7307d != null) {
            utVar.m6785a(8, this.f7307d.intValue());
        }
        if (this.f7308e != null && this.f7308e.length > 0) {
            while (i < this.f7308e.length) {
                String str = this.f7308e[i];
                if (str != null) {
                    utVar.m6788a(9, str);
                }
                i++;
            }
        }
        super.mo2195a(utVar);
    }
}
