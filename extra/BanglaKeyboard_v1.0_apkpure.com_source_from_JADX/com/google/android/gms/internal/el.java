package com.google.android.gms.internal;

public final class el extends my {
    private static volatile el[] f1271o;
    public int f1272a;
    public String f1273b;
    public el[] f1274c;
    public el[] f1275d;
    public el[] f1276e;
    public String f1277f;
    public String f1278g;
    public long f1279h;
    public boolean f1280i;
    public el[] f1281j;
    public int[] f1282k;
    public boolean f1283l;

    public el() {
        this.f1272a = 1;
        this.f1273b = "";
        this.f1274c = m1935d();
        this.f1275d = m1935d();
        this.f1276e = m1935d();
        this.f1277f = "";
        this.f1278g = "";
        this.f1279h = 0;
        this.f1280i = false;
        this.f1281j = m1935d();
        this.f1282k = nd.f1963a;
        this.f1283l = false;
        this.m = null;
        this.n = -1;
    }

    private static el[] m1935d() {
        if (f1271o == null) {
            synchronized (mz.f1959a) {
                if (f1271o == null) {
                    f1271o = new el[0];
                }
            }
        }
        return f1271o;
    }

    public final int mo699a() {
        int i;
        int i2 = 0;
        int a = super.mo699a() + mw.m2631a(this.f1272a);
        if (!this.f1273b.equals("")) {
            a += mw.m2637b(2, this.f1273b);
        }
        if (this.f1274c != null && this.f1274c.length > 0) {
            i = a;
            for (na naVar : this.f1274c) {
                if (naVar != null) {
                    i += mw.m2636b(3, naVar);
                }
            }
            a = i;
        }
        if (this.f1275d != null && this.f1275d.length > 0) {
            i = a;
            for (na naVar2 : this.f1275d) {
                if (naVar2 != null) {
                    i += mw.m2636b(4, naVar2);
                }
            }
            a = i;
        }
        if (this.f1276e != null && this.f1276e.length > 0) {
            i = a;
            for (na naVar22 : this.f1276e) {
                if (naVar22 != null) {
                    i += mw.m2636b(5, naVar22);
                }
            }
            a = i;
        }
        if (!this.f1277f.equals("")) {
            a += mw.m2637b(6, this.f1277f);
        }
        if (!this.f1278g.equals("")) {
            a += mw.m2637b(7, this.f1278g);
        }
        if (this.f1279h != 0) {
            a += mw.m2632a(this.f1279h) + mw.m2640c(8);
        }
        if (this.f1283l) {
            boolean z = this.f1283l;
            a += mw.m2640c(9) + 1;
        }
        if (this.f1282k != null && this.f1282k.length > 0) {
            int i3 = 0;
            for (int b : this.f1282k) {
                i3 += mw.m2635b(b);
            }
            a = (a + i3) + (this.f1282k.length * 1);
        }
        if (this.f1281j != null && this.f1281j.length > 0) {
            while (i2 < this.f1281j.length) {
                na naVar3 = this.f1281j[i2];
                if (naVar3 != null) {
                    a += mw.m2636b(11, naVar3);
                }
                i2++;
            }
        }
        if (this.f1280i) {
            boolean z2 = this.f1280i;
            a += mw.m2640c(12) + 1;
        }
        this.n = a;
        return a;
    }

    public final void mo697a(mw mwVar) {
        int i = 0;
        mwVar.m2646a(1, this.f1272a);
        if (!this.f1273b.equals("")) {
            mwVar.m2649a(2, this.f1273b);
        }
        if (this.f1274c != null && this.f1274c.length > 0) {
            for (na naVar : this.f1274c) {
                if (naVar != null) {
                    mwVar.m2648a(3, naVar);
                }
            }
        }
        if (this.f1275d != null && this.f1275d.length > 0) {
            for (na naVar2 : this.f1275d) {
                if (naVar2 != null) {
                    mwVar.m2648a(4, naVar2);
                }
            }
        }
        if (this.f1276e != null && this.f1276e.length > 0) {
            for (na naVar22 : this.f1276e) {
                if (naVar22 != null) {
                    mwVar.m2648a(5, naVar22);
                }
            }
        }
        if (!this.f1277f.equals("")) {
            mwVar.m2649a(6, this.f1277f);
        }
        if (!this.f1278g.equals("")) {
            mwVar.m2649a(7, this.f1278g);
        }
        if (this.f1279h != 0) {
            mwVar.m2647a(8, this.f1279h);
        }
        if (this.f1283l) {
            mwVar.m2650a(9, this.f1283l);
        }
        if (this.f1282k != null && this.f1282k.length > 0) {
            for (int a : this.f1282k) {
                mwVar.m2646a(10, a);
            }
        }
        if (this.f1281j != null && this.f1281j.length > 0) {
            while (i < this.f1281j.length) {
                na naVar3 = this.f1281j[i];
                if (naVar3 != null) {
                    mwVar.m2648a(11, naVar3);
                }
                i++;
            }
        }
        if (this.f1280i) {
            mwVar.m2650a(12, this.f1280i);
        }
        super.mo697a(mwVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof el)) {
            return false;
        }
        el elVar = (el) obj;
        if (this.f1272a != elVar.f1272a) {
            return false;
        }
        if (this.f1273b == null) {
            if (elVar.f1273b != null) {
                return false;
            }
        } else if (!this.f1273b.equals(elVar.f1273b)) {
            return false;
        }
        if (!mz.m2657a(this.f1274c, elVar.f1274c)) {
            return false;
        }
        if (!mz.m2657a(this.f1275d, elVar.f1275d)) {
            return false;
        }
        if (!mz.m2657a(this.f1276e, elVar.f1276e)) {
            return false;
        }
        if (this.f1277f == null) {
            if (elVar.f1277f != null) {
                return false;
            }
        } else if (!this.f1277f.equals(elVar.f1277f)) {
            return false;
        }
        if (this.f1278g == null) {
            if (elVar.f1278g != null) {
                return false;
            }
        } else if (!this.f1278g.equals(elVar.f1278g)) {
            return false;
        }
        return this.f1279h != elVar.f1279h ? false : this.f1280i != elVar.f1280i ? false : !mz.m2657a(this.f1281j, elVar.f1281j) ? false : !mz.m2656a(this.f1282k, elVar.f1282k) ? false : this.f1283l != elVar.f1283l ? false : (this.m == null || this.m.isEmpty()) ? elVar.m == null || elVar.m.isEmpty() : this.m.equals(elVar.m);
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = ((((((this.f1280i ? 1231 : 1237) + (((((this.f1278g == null ? 0 : this.f1278g.hashCode()) + (((this.f1277f == null ? 0 : this.f1277f.hashCode()) + (((((((((this.f1273b == null ? 0 : this.f1273b.hashCode()) + ((this.f1272a + 527) * 31)) * 31) + mz.m2655a(this.f1274c)) * 31) + mz.m2655a(this.f1275d)) * 31) + mz.m2655a(this.f1276e)) * 31)) * 31)) * 31) + ((int) (this.f1279h ^ (this.f1279h >>> 32)))) * 31)) * 31) + mz.m2655a(this.f1281j)) * 31) + mz.m2654a(this.f1282k)) * 31;
        if (!this.f1283l) {
            i = 1237;
        }
        hashCode = (hashCode + i) * 31;
        if (!(this.m == null || this.m.isEmpty())) {
            i2 = this.m.hashCode();
        }
        return hashCode + i2;
    }
}
