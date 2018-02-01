package android.support.v4.p001b;

public final class C0040m implements Cloneable {
    private static final Object f34a = new Object();
    private boolean f35b;
    private int[] f36c;
    private Object[] f37d;
    private int f38e;

    public C0040m() {
        this((byte) 0);
    }

    private C0040m(byte b) {
        this.f35b = false;
        int a = C0032c.m32a(10);
        this.f36c = new int[a];
        this.f37d = new Object[a];
        this.f38e = 0;
    }

    private C0040m m37c() {
        try {
            C0040m c0040m = (C0040m) super.clone();
            try {
                c0040m.f36c = (int[]) this.f36c.clone();
                c0040m.f37d = (Object[]) this.f37d.clone();
                return c0040m;
            } catch (CloneNotSupportedException e) {
                return c0040m;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    private void m38d() {
        int i = this.f38e;
        int[] iArr = this.f36c;
        Object[] objArr = this.f37d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f34a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f35b = false;
        this.f38e = i2;
    }

    public final int m39a() {
        if (this.f35b) {
            m38d();
        }
        return this.f38e;
    }

    public final Object m40a(int i) {
        int a = C0032c.m33a(this.f36c, this.f38e, i);
        return (a < 0 || this.f37d[a] == f34a) ? null : this.f37d[a];
    }

    public final void m41a(int i, Object obj) {
        int a = C0032c.m33a(this.f36c, this.f38e, i);
        if (a >= 0) {
            this.f37d[a] = obj;
            return;
        }
        a ^= -1;
        if (a >= this.f38e || this.f37d[a] != f34a) {
            if (this.f35b && this.f38e >= this.f36c.length) {
                m38d();
                a = C0032c.m33a(this.f36c, this.f38e, i) ^ -1;
            }
            if (this.f38e >= this.f36c.length) {
                int a2 = C0032c.m32a(this.f38e + 1);
                Object obj2 = new int[a2];
                Object obj3 = new Object[a2];
                System.arraycopy(this.f36c, 0, obj2, 0, this.f36c.length);
                System.arraycopy(this.f37d, 0, obj3, 0, this.f37d.length);
                this.f36c = obj2;
                this.f37d = obj3;
            }
            if (this.f38e - a != 0) {
                System.arraycopy(this.f36c, a, this.f36c, a + 1, this.f38e - a);
                System.arraycopy(this.f37d, a, this.f37d, a + 1, this.f38e - a);
            }
            this.f36c[a] = i;
            this.f37d[a] = obj;
            this.f38e++;
            return;
        }
        this.f36c[a] = i;
        this.f37d[a] = obj;
    }

    public final void m42b() {
        int i = this.f38e;
        Object[] objArr = this.f37d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f38e = 0;
        this.f35b = false;
    }

    public final void m43b(int i) {
        int a = C0032c.m33a(this.f36c, this.f38e, i);
        if (a >= 0 && this.f37d[a] != f34a) {
            this.f37d[a] = f34a;
            this.f35b = true;
        }
    }

    public final void m44c(int i) {
        if (this.f37d[i] != f34a) {
            this.f37d[i] = f34a;
            this.f35b = true;
        }
    }

    public final /* synthetic */ Object clone() {
        return m37c();
    }

    public final int m45d(int i) {
        if (this.f35b) {
            m38d();
        }
        return this.f36c[i];
    }

    public final Object m46e(int i) {
        if (this.f35b) {
            m38d();
        }
        return this.f37d[i];
    }

    public final int m47f(int i) {
        if (this.f35b) {
            m38d();
        }
        return C0032c.m33a(this.f36c, this.f38e, i);
    }

    public final String toString() {
        if (m39a() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f38e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f38e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m45d(i));
            stringBuilder.append('=');
            C0040m e = m46e(i);
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
