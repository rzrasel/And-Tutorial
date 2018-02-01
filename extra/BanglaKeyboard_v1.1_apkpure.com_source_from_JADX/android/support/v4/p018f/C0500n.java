package android.support.v4.p018f;

public final class C0500n<E> implements Cloneable {
    private static final Object f1563a = new Object();
    private boolean f1564b;
    private int[] f1565c;
    private Object[] f1566d;
    private int f1567e;

    public C0500n() {
        this(10);
    }

    public C0500n(int i) {
        this.f1564b = false;
        if (i == 0) {
            this.f1565c = C0481c.f1535a;
            this.f1566d = C0481c.f1537c;
        } else {
            int a = C0481c.m1268a(i);
            this.f1565c = new int[a];
            this.f1566d = new Object[a];
        }
        this.f1567e = 0;
    }

    private C0500n<E> m1296c() {
        try {
            C0500n<E> c0500n = (C0500n) super.clone();
            try {
                c0500n.f1565c = (int[]) this.f1565c.clone();
                c0500n.f1566d = (Object[]) this.f1566d.clone();
                return c0500n;
            } catch (CloneNotSupportedException e) {
                return c0500n;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    private void m1297d() {
        int i = this.f1567e;
        int[] iArr = this.f1565c;
        Object[] objArr = this.f1566d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1563a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1564b = false;
        this.f1567e = i2;
    }

    public final int m1298a() {
        if (this.f1564b) {
            m1297d();
        }
        return this.f1567e;
    }

    public final E m1299a(int i) {
        int a = C0481c.m1269a(this.f1565c, this.f1567e, i);
        return (a < 0 || this.f1566d[a] == f1563a) ? null : this.f1566d[a];
    }

    public final void m1300a(int i, E e) {
        int a = C0481c.m1269a(this.f1565c, this.f1567e, i);
        if (a >= 0) {
            this.f1566d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.f1567e || this.f1566d[a] != f1563a) {
            if (this.f1564b && this.f1567e >= this.f1565c.length) {
                m1297d();
                a = C0481c.m1269a(this.f1565c, this.f1567e, i) ^ -1;
            }
            if (this.f1567e >= this.f1565c.length) {
                int a2 = C0481c.m1268a(this.f1567e + 1);
                Object obj = new int[a2];
                Object obj2 = new Object[a2];
                System.arraycopy(this.f1565c, 0, obj, 0, this.f1565c.length);
                System.arraycopy(this.f1566d, 0, obj2, 0, this.f1566d.length);
                this.f1565c = obj;
                this.f1566d = obj2;
            }
            if (this.f1567e - a != 0) {
                System.arraycopy(this.f1565c, a, this.f1565c, a + 1, this.f1567e - a);
                System.arraycopy(this.f1566d, a, this.f1566d, a + 1, this.f1567e - a);
            }
            this.f1565c[a] = i;
            this.f1566d[a] = e;
            this.f1567e++;
            return;
        }
        this.f1565c[a] = i;
        this.f1566d[a] = e;
    }

    public final void m1301b() {
        int i = this.f1567e;
        Object[] objArr = this.f1566d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1567e = 0;
        this.f1564b = false;
    }

    public final void m1302b(int i) {
        int a = C0481c.m1269a(this.f1565c, this.f1567e, i);
        if (a >= 0 && this.f1566d[a] != f1563a) {
            this.f1566d[a] = f1563a;
            this.f1564b = true;
        }
    }

    public final void m1303b(int i, E e) {
        if (this.f1567e == 0 || i > this.f1565c[this.f1567e - 1]) {
            if (this.f1564b && this.f1567e >= this.f1565c.length) {
                m1297d();
            }
            int i2 = this.f1567e;
            if (i2 >= this.f1565c.length) {
                int a = C0481c.m1268a(i2 + 1);
                Object obj = new int[a];
                Object obj2 = new Object[a];
                System.arraycopy(this.f1565c, 0, obj, 0, this.f1565c.length);
                System.arraycopy(this.f1566d, 0, obj2, 0, this.f1566d.length);
                this.f1565c = obj;
                this.f1566d = obj2;
            }
            this.f1565c[i2] = i;
            this.f1566d[i2] = e;
            this.f1567e = i2 + 1;
            return;
        }
        m1300a(i, e);
    }

    public final void m1304c(int i) {
        if (this.f1566d[i] != f1563a) {
            this.f1566d[i] = f1563a;
            this.f1564b = true;
        }
    }

    public final /* synthetic */ Object clone() {
        return m1296c();
    }

    public final int m1305d(int i) {
        if (this.f1564b) {
            m1297d();
        }
        return this.f1565c[i];
    }

    public final E m1306e(int i) {
        if (this.f1564b) {
            m1297d();
        }
        return this.f1566d[i];
    }

    public final int m1307f(int i) {
        if (this.f1564b) {
            m1297d();
        }
        return C0481c.m1269a(this.f1565c, this.f1567e, i);
    }

    public final String toString() {
        if (m1298a() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1567e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1567e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m1305d(i));
            stringBuilder.append('=');
            C0500n e = m1306e(i);
            if (e != this) {
                stringBuilder.append(e);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
