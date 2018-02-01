package com.google.android.gms.internal;

public final class ln extends uv<ln> {
    public byte[][] f6574a;
    public byte[] f6575b;
    public Integer f6576c;
    private Integer f6577d;

    public ln() {
        this.f6574a = ve.f7256f;
        this.f6575b = null;
        this.S = -1;
    }

    protected final int mo2194a() {
        int i = 0;
        int a = super.mo2194a();
        if (this.f6574a == null || this.f6574a.length <= 0) {
            i = a;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f6574a.length) {
                byte[] bArr = this.f6574a[i];
                if (bArr != null) {
                    i3++;
                    i2 += ut.m6773a(bArr);
                }
                i++;
            }
            i = (a + i2) + (i3 * 1);
        }
        if (this.f6575b != null) {
            i += ut.m6780b(2, this.f6575b);
        }
        if (this.f6577d != null) {
            i += ut.m6776b(3, this.f6577d.intValue());
        }
        return this.f6576c != null ? i + ut.m6776b(4, this.f6576c.intValue()) : i;
    }

    public final /* synthetic */ vb mo2198a(us usVar) {
        while (true) {
            int a = usVar.m6754a();
            int a2;
            int e;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = ve.m6815a(usVar, 10);
                    a = this.f6574a == null ? 0 : this.f6574a.length;
                    Object obj = new byte[(a2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f6574a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = usVar.m6763d();
                        usVar.m6754a();
                        a++;
                    }
                    obj[a] = usVar.m6763d();
                    this.f6574a = obj;
                    continue;
                case 18:
                    this.f6575b = usVar.m6763d();
                    continue;
                case 24:
                    a2 = usVar.m6768h();
                    e = usVar.m6764e();
                    switch (e) {
                        case 0:
                        case 1:
                            this.f6577d = Integer.valueOf(e);
                            break;
                        default:
                            usVar.m6765e(a2);
                            m5904a(usVar, a);
                            continue;
                    }
                case 32:
                    a2 = usVar.m6768h();
                    e = usVar.m6764e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.f6576c = Integer.valueOf(e);
                            break;
                        default:
                            usVar.m6765e(a2);
                            m5904a(usVar, a);
                            continue;
                    }
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
        if (this.f6574a != null && this.f6574a.length > 0) {
            for (byte[] bArr : this.f6574a) {
                if (bArr != null) {
                    utVar.m6790a(1, bArr);
                }
            }
        }
        if (this.f6575b != null) {
            utVar.m6790a(2, this.f6575b);
        }
        if (this.f6577d != null) {
            utVar.m6785a(3, this.f6577d.intValue());
        }
        if (this.f6576c != null) {
            utVar.m6785a(4, this.f6576c.intValue());
        }
        super.mo2195a(utVar);
    }
}
