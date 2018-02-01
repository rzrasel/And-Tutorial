package android.support.v4.p018f;

public final class C0484f<E> implements Cloneable {
    public static final Object f1540a = new Object();
    public boolean f1541b;
    public long[] f1542c;
    public Object[] f1543d;
    public int f1544e;

    public C0484f() {
        this((byte) 0);
    }

    private C0484f(byte b) {
        this.f1541b = false;
        int b2 = C0481c.m1272b(10);
        this.f1542c = new long[b2];
        this.f1543d = new Object[b2];
        this.f1544e = 0;
    }

    private C0484f<E> m1276d() {
        try {
            C0484f<E> c0484f = (C0484f) super.clone();
            try {
                c0484f.f1542c = (long[]) this.f1542c.clone();
                c0484f.f1543d = (Object[]) this.f1543d.clone();
                return c0484f;
            } catch (CloneNotSupportedException e) {
                return c0484f;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public final long m1277a(int i) {
        if (this.f1541b) {
            m1279a();
        }
        return this.f1542c[i];
    }

    public final E m1278a(long j) {
        int a = C0481c.m1270a(this.f1542c, this.f1544e, j);
        return (a < 0 || this.f1543d[a] == f1540a) ? null : this.f1543d[a];
    }

    public final void m1279a() {
        int i = this.f1544e;
        long[] jArr = this.f1542c;
        Object[] objArr = this.f1543d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1540a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1541b = false;
        this.f1544e = i2;
    }

    public final void m1280a(long j, E e) {
        int a = C0481c.m1270a(this.f1542c, this.f1544e, j);
        if (a >= 0) {
            this.f1543d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.f1544e || this.f1543d[a] != f1540a) {
            if (this.f1541b && this.f1544e >= this.f1542c.length) {
                m1279a();
                a = C0481c.m1270a(this.f1542c, this.f1544e, j) ^ -1;
            }
            if (this.f1544e >= this.f1542c.length) {
                int b = C0481c.m1272b(this.f1544e + 1);
                Object obj = new long[b];
                Object obj2 = new Object[b];
                System.arraycopy(this.f1542c, 0, obj, 0, this.f1542c.length);
                System.arraycopy(this.f1543d, 0, obj2, 0, this.f1543d.length);
                this.f1542c = obj;
                this.f1543d = obj2;
            }
            if (this.f1544e - a != 0) {
                System.arraycopy(this.f1542c, a, this.f1542c, a + 1, this.f1544e - a);
                System.arraycopy(this.f1543d, a, this.f1543d, a + 1, this.f1544e - a);
            }
            this.f1542c[a] = j;
            this.f1543d[a] = e;
            this.f1544e++;
            return;
        }
        this.f1542c[a] = j;
        this.f1543d[a] = e;
    }

    public final int m1281b() {
        if (this.f1541b) {
            m1279a();
        }
        return this.f1544e;
    }

    public final E m1282b(int i) {
        if (this.f1541b) {
            m1279a();
        }
        return this.f1543d[i];
    }

    public final void m1283c() {
        int i = this.f1544e;
        Object[] objArr = this.f1543d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1544e = 0;
        this.f1541b = false;
    }

    public final /* synthetic */ Object clone() {
        return m1276d();
    }

    public final String toString() {
        if (m1281b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1544e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1544e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m1277a(i));
            stringBuilder.append('=');
            C0484f b = m1282b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
