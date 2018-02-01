package com.google.android.gms.internal;

public final class vk extends uv<vk> {
    private vl f7291a;
    private vh[] f7292b;
    private byte[] f7293c;
    private byte[] f7294d;
    private Integer f7295e;
    private byte[] f7296f;

    public vk() {
        this.f7291a = null;
        this.f7292b = vh.m6822b();
        this.f7293c = null;
        this.f7294d = null;
        this.f7295e = null;
        this.f7296f = null;
        this.R = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int a = super.mo2194a();
        if (this.f7291a != null) {
            a += ut.m6778b(1, this.f7291a);
        }
        if (this.f7292b != null && this.f7292b.length > 0) {
            int i = a;
            for (vb vbVar : this.f7292b) {
                if (vbVar != null) {
                    i += ut.m6778b(2, vbVar);
                }
            }
            a = i;
        }
        if (this.f7293c != null) {
            a += ut.m6780b(3, this.f7293c);
        }
        if (this.f7294d != null) {
            a += ut.m6780b(4, this.f7294d);
        }
        if (this.f7295e != null) {
            a += ut.m6776b(5, this.f7295e.intValue());
        }
        return this.f7296f != null ? a + ut.m6780b(6, this.f7296f) : a;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f7291a == null) {
                        this.f7291a = new vl();
                    }
                    usVar.m6757a(this.f7291a);
                    continue;
                case 18:
                    int a2 = ve.m6815a(usVar, 18);
                    a = this.f7292b == null ? 0 : this.f7292b.length;
                    Object obj = new vh[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f7292b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new vh();
                        usVar.m6757a(obj[a]);
                        usVar.m6754a();
                        a++;
                    }
                    obj[a] = new vh();
                    usVar.m6757a(obj[a]);
                    this.f7292b = obj;
                    continue;
                case 26:
                    this.f7293c = usVar.m6763d();
                    continue;
                case 34:
                    this.f7294d = usVar.m6763d();
                    continue;
                case 40:
                    this.f7295e = Integer.valueOf(usVar.m6764e());
                    continue;
                case 50:
                    this.f7296f = usVar.m6763d();
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
        if (this.f7291a != null) {
            utVar.m6787a(1, this.f7291a);
        }
        if (this.f7292b != null && this.f7292b.length > 0) {
            for (vb vbVar : this.f7292b) {
                if (vbVar != null) {
                    utVar.m6787a(2, vbVar);
                }
            }
        }
        if (this.f7293c != null) {
            utVar.m6790a(3, this.f7293c);
        }
        if (this.f7294d != null) {
            utVar.m6790a(4, this.f7294d);
        }
        if (this.f7295e != null) {
            utVar.m6785a(5, this.f7295e.intValue());
        }
        if (this.f7296f != null) {
            utVar.m6790a(6, this.f7296f);
        }
        super.mo2195a(utVar);
    }
}
