package android.support.v4.p001b;

import java.util.Map;

public class C0028l {
    static Object[] f5b;
    static int f6c;
    static Object[] f7d;
    static int f8e;
    int[] f9f = C0032c.f17a;
    Object[] f10g = C0032c.f19c;
    int f11h = 0;

    static void m2a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (C0029a.class) {
                if (f8e < 10) {
                    objArr[0] = f7d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f7d = objArr;
                    f8e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0029a.class) {
                if (f6c < 10) {
                    objArr[0] = f5b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f5b = objArr;
                    f6c++;
                }
            }
        }
    }

    private Object m3d(int i) {
        return this.f10g[i << 1];
    }

    final int m4a() {
        int i = this.f11h;
        if (i == 0) {
            return -1;
        }
        int a = C0032c.m33a(this.f9f, i, 0);
        if (a < 0 || this.f10g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f9f[i2] == 0) {
            if (this.f10g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f9f[a] == 0) {
            if (this.f10g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    final int m5a(Object obj) {
        int i = 1;
        int i2 = this.f11h * 2;
        Object[] objArr = this.f10g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    final int m6a(Object obj, int i) {
        int i2 = this.f11h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0032c.m33a(this.f9f, i2, i);
        if (a < 0 || obj.equals(this.f10g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f9f[i3] == i) {
            if (obj.equals(this.f10g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f9f[a] == i) {
            if (obj.equals(this.f10g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    final void m7a(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0029a.class) {
                if (f7d != null) {
                    objArr = f7d;
                    this.f10g = objArr;
                    f7d = (Object[]) objArr[0];
                    this.f9f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f8e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0029a.class) {
                if (f5b != null) {
                    objArr = f5b;
                    this.f10g = objArr;
                    f5b = (Object[]) objArr[0];
                    this.f9f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f6c--;
                    return;
                }
            }
        }
        this.f9f = new int[i];
        this.f10g = new Object[(i << 1)];
    }

    public final Object m8b(int i) {
        return this.f10g[(i << 1) + 1];
    }

    public final Object m9c(int i) {
        int i2 = 8;
        Object obj = this.f10g[(i << 1) + 1];
        if (this.f11h <= 1) {
            C0028l.m2a(this.f9f, this.f10g, this.f11h);
            this.f9f = C0032c.f17a;
            this.f10g = C0032c.f19c;
            this.f11h = 0;
        } else if (this.f9f.length <= 8 || this.f11h >= this.f9f.length / 3) {
            this.f11h--;
            if (i < this.f11h) {
                System.arraycopy(this.f9f, i + 1, this.f9f, i, this.f11h - i);
                System.arraycopy(this.f10g, (i + 1) << 1, this.f10g, i << 1, (this.f11h - i) << 1);
            }
            this.f10g[this.f11h << 1] = null;
            this.f10g[(this.f11h << 1) + 1] = null;
        } else {
            if (this.f11h > 8) {
                i2 = this.f11h + (this.f11h >> 1);
            }
            Object obj2 = this.f9f;
            Object obj3 = this.f10g;
            m7a(i2);
            this.f11h--;
            if (i > 0) {
                System.arraycopy(obj2, 0, this.f9f, 0, i);
                System.arraycopy(obj3, 0, this.f10g, 0, i << 1);
            }
            if (i < this.f11h) {
                System.arraycopy(obj2, i + 1, this.f9f, i, this.f11h - i);
                System.arraycopy(obj3, (i + 1) << 1, this.f10g, i << 1, (this.f11h - i) << 1);
            }
        }
        return obj;
    }

    public void clear() {
        if (this.f11h != 0) {
            C0028l.m2a(this.f9f, this.f10g, this.f11h);
            this.f9f = C0032c.f17a;
            this.f10g = C0032c.f19c;
            this.f11h = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return obj == null ? m4a() >= 0 : m6a(obj, obj.hashCode()) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m5a(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f11h) {
            try {
                Object d = m3d(i);
                Object b = m8b(i);
                Object obj2 = map.get(d);
                if (b == null) {
                    if (obj2 != null || !map.containsKey(d)) {
                        return false;
                    }
                } else if (!b.equals(obj2)) {
                    return false;
                }
                i++;
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    public Object get(Object obj) {
        int a = obj == null ? m4a() : m6a(obj, obj.hashCode());
        return a >= 0 ? this.f10g[(a << 1) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.f9f;
        Object[] objArr = this.f10g;
        int i = this.f11h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f11h <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int a;
        int i;
        int i2 = 8;
        if (obj == null) {
            a = m4a();
            i = 0;
        } else {
            i = obj.hashCode();
            a = m6a(obj, i);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            Object obj3 = this.f10g[i3];
            this.f10g[i3] = obj2;
            return obj3;
        }
        a ^= -1;
        if (this.f11h >= this.f9f.length) {
            if (this.f11h >= 8) {
                i2 = this.f11h + (this.f11h >> 1);
            } else if (this.f11h < 4) {
                i2 = 4;
            }
            Object obj4 = this.f9f;
            Object obj5 = this.f10g;
            m7a(i2);
            if (this.f9f.length > 0) {
                System.arraycopy(obj4, 0, this.f9f, 0, obj4.length);
                System.arraycopy(obj5, 0, this.f10g, 0, obj5.length);
            }
            C0028l.m2a(obj4, obj5, this.f11h);
        }
        if (a < this.f11h) {
            System.arraycopy(this.f9f, a, this.f9f, a + 1, this.f11h - a);
            System.arraycopy(this.f10g, a << 1, this.f10g, (a + 1) << 1, (this.f11h - a) << 1);
        }
        this.f9f[a] = i;
        this.f10g[a << 1] = obj;
        this.f10g[(a << 1) + 1] = obj2;
        this.f11h++;
        return null;
    }

    public Object remove(Object obj) {
        int a = obj == null ? m4a() : m6a(obj, obj.hashCode());
        return a >= 0 ? m9c(a) : null;
    }

    public int size() {
        return this.f11h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f11h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f11h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0028l d = m3d(i);
            if (d != this) {
                stringBuilder.append(d);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            d = m8b(i);
            if (d != this) {
                stringBuilder.append(d);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
