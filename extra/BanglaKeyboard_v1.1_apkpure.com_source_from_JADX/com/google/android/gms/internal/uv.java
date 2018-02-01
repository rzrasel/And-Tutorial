package com.google.android.gms.internal;

public abstract class uv<M extends uv<M>> extends vb {
    protected ux f6411R;

    protected int mo2194a() {
        int i = 0;
        if (this.f6411R == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.f6411R.f7241d) {
            i2 += this.f6411R.f7240c[i].m6802a();
            i++;
        }
        return i2;
    }

    public void mo2195a(ut utVar) {
        if (this.f6411R != null) {
            for (int i = 0; i < this.f6411R.f7241d; i++) {
                this.f6411R.f7240c[i].m6803a(utVar);
            }
        }
    }

    protected final boolean m5904a(us usVar, int i) {
        int h = usVar.m6768h();
        if (!usVar.m6759b(i)) {
            return false;
        }
        byte[] bArr;
        uy uyVar;
        int i2 = i >>> 3;
        int h2 = usVar.m6768h() - h;
        if (h2 == 0) {
            bArr = ve.f7257g;
        } else {
            bArr = new byte[h2];
            System.arraycopy(usVar.f7223a, h + usVar.f7224b, bArr, 0, h2);
        }
        vd vdVar = new vd(i, bArr);
        if (this.f6411R == null) {
            this.f6411R = new ux();
            uyVar = null;
        } else {
            ux uxVar = this.f6411R;
            h2 = uxVar.m6799b(i2);
            uyVar = (h2 < 0 || uxVar.f7240c[h2] == ux.f7238a) ? null : uxVar.f7240c[h2];
        }
        if (uyVar == null) {
            uyVar = new uy();
            ux uxVar2 = this.f6411R;
            h2 = uxVar2.m6799b(i2);
            if (h2 >= 0) {
                uxVar2.f7240c[h2] = uyVar;
            } else {
                h2 ^= -1;
                if (h2 >= uxVar2.f7241d || uxVar2.f7240c[h2] != ux.f7238a) {
                    if (uxVar2.f7241d >= uxVar2.f7239b.length) {
                        int a = ux.m6798a(uxVar2.f7241d + 1);
                        Object obj = new int[a];
                        Object obj2 = new uy[a];
                        System.arraycopy(uxVar2.f7239b, 0, obj, 0, uxVar2.f7239b.length);
                        System.arraycopy(uxVar2.f7240c, 0, obj2, 0, uxVar2.f7240c.length);
                        uxVar2.f7239b = obj;
                        uxVar2.f7240c = obj2;
                    }
                    if (uxVar2.f7241d - h2 != 0) {
                        System.arraycopy(uxVar2.f7239b, h2, uxVar2.f7239b, h2 + 1, uxVar2.f7241d - h2);
                        System.arraycopy(uxVar2.f7240c, h2, uxVar2.f7240c, h2 + 1, uxVar2.f7241d - h2);
                    }
                    uxVar2.f7239b[h2] = i2;
                    uxVar2.f7240c[h2] = uyVar;
                    uxVar2.f7241d++;
                } else {
                    uxVar2.f7239b[h2] = i2;
                    uxVar2.f7240c[h2] = uyVar;
                }
            }
        }
        uyVar.f7243a.add(vdVar);
        return true;
    }

    public final /* synthetic */ vb mo2196c() {
        return (uv) clone();
    }

    public /* synthetic */ Object clone() {
        uv uvVar = (uv) super.mo2196c();
        uz.m6804a(this, uvVar);
        return uvVar;
    }
}
