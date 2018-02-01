package android.support.v4.p018f;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class C0477m<K, V> {
    static Object[] f1515b;
    static int f1516c;
    static Object[] f1517d;
    static int f1518e;
    int[] f1519f;
    Object[] f1520g;
    int f1521h;

    public C0477m() {
        this.f1519f = C0481c.f1535a;
        this.f1520g = C0481c.f1537c;
        this.f1521h = 0;
    }

    public C0477m(int i) {
        if (i == 0) {
            this.f1519f = C0481c.f1535a;
            this.f1520g = C0481c.f1537c;
        } else {
            m1245e(i);
        }
        this.f1521h = 0;
    }

    public C0477m(C0477m<K, V> c0477m) {
        int i = 0;
        this();
        if (c0477m != null) {
            int i2 = c0477m.f1521h;
            m1247a(this.f1521h + i2);
            if (this.f1521h != 0) {
                while (i < i2) {
                    put(c0477m.m1249b(i), c0477m.m1250c(i));
                    i++;
                }
            } else if (i2 > 0) {
                System.arraycopy(c0477m.f1519f, 0, this.f1519f, 0, i2);
                System.arraycopy(c0477m.f1520g, 0, this.f1520g, 0, i2 << 1);
                this.f1521h = i2;
            }
        }
    }

    private int m1241a() {
        int i = this.f1521h;
        if (i == 0) {
            return -1;
        }
        int a = C0477m.m1243a(this.f1519f, i, 0);
        if (a < 0 || this.f1520g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1519f[i2] == 0) {
            if (this.f1520g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f1519f[a] == 0) {
            if (this.f1520g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private int m1242a(Object obj, int i) {
        int i2 = this.f1521h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0477m.m1243a(this.f1519f, i2, i);
        if (a < 0 || obj.equals(this.f1520g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1519f[i3] == i) {
            if (obj.equals(this.f1520g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f1519f[a] == i) {
            if (obj.equals(this.f1520g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    private static int m1243a(int[] iArr, int i, int i2) {
        try {
            return C0481c.m1269a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    private static void m1244a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (C0478a.class) {
                if (f1518e < 10) {
                    objArr[0] = f1517d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1517d = objArr;
                    f1518e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0478a.class) {
                if (f1516c < 10) {
                    objArr[0] = f1515b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1515b = objArr;
                    f1516c++;
                }
            }
        }
    }

    private void m1245e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0478a.class) {
                if (f1517d != null) {
                    objArr = f1517d;
                    this.f1520g = objArr;
                    f1517d = (Object[]) objArr[0];
                    this.f1519f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1518e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0478a.class) {
                if (f1515b != null) {
                    objArr = f1515b;
                    this.f1520g = objArr;
                    f1515b = (Object[]) objArr[0];
                    this.f1519f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1516c--;
                    return;
                }
            }
        }
        this.f1519f = new int[i];
        this.f1520g = new Object[(i << 1)];
    }

    public final int m1246a(Object obj) {
        return obj == null ? m1241a() : m1242a(obj, obj.hashCode());
    }

    public final void m1247a(int i) {
        int i2 = this.f1521h;
        if (this.f1519f.length < i) {
            int[] iArr = this.f1519f;
            Object[] objArr = this.f1520g;
            m1245e(i);
            if (this.f1521h > 0) {
                System.arraycopy(iArr, 0, this.f1519f, 0, i2);
                System.arraycopy(objArr, 0, this.f1520g, 0, i2 << 1);
            }
            C0477m.m1244a(iArr, objArr, i2);
        }
        if (this.f1521h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    final int m1248b(Object obj) {
        int i = 1;
        int i2 = this.f1521h * 2;
        Object[] objArr = this.f1520g;
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

    public final K m1249b(int i) {
        return this.f1520g[i << 1];
    }

    public final V m1250c(int i) {
        return this.f1520g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f1521h > 0) {
            int[] iArr = this.f1519f;
            Object[] objArr = this.f1520g;
            int i = this.f1521h;
            this.f1519f = C0481c.f1535a;
            this.f1520g = C0481c.f1537c;
            this.f1521h = 0;
            C0477m.m1244a(iArr, objArr, i);
        }
        if (this.f1521h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m1246a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m1248b(obj) >= 0;
    }

    public final V m1251d(int i) {
        int i2 = 8;
        V v = this.f1520g[(i << 1) + 1];
        int i3 = this.f1521h;
        if (i3 <= 1) {
            C0477m.m1244a(this.f1519f, this.f1520g, i3);
            this.f1519f = C0481c.f1535a;
            this.f1520g = C0481c.f1537c;
            i2 = 0;
        } else {
            int i4 = i3 - 1;
            if (this.f1519f.length <= 8 || this.f1521h >= this.f1519f.length / 3) {
                if (i < i4) {
                    System.arraycopy(this.f1519f, i + 1, this.f1519f, i, i4 - i);
                    System.arraycopy(this.f1520g, (i + 1) << 1, this.f1520g, i << 1, (i4 - i) << 1);
                }
                this.f1520g[i4 << 1] = null;
                this.f1520g[(i4 << 1) + 1] = null;
                i2 = i4;
            } else {
                if (i3 > 8) {
                    i2 = (i3 >> 1) + i3;
                }
                Object obj = this.f1519f;
                Object obj2 = this.f1520g;
                m1245e(i2);
                if (i3 != this.f1521h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(obj, 0, this.f1519f, 0, i);
                    System.arraycopy(obj2, 0, this.f1520g, 0, i << 1);
                }
                if (i < i4) {
                    System.arraycopy(obj, i + 1, this.f1519f, i, i4 - i);
                    System.arraycopy(obj2, (i + 1) << 1, this.f1520g, i << 1, (i4 - i) << 1);
                }
                i2 = i4;
            }
        }
        if (i3 != this.f1521h) {
            throw new ConcurrentModificationException();
        }
        this.f1521h = i2;
        return v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        int i;
        Object b;
        Object c;
        Object obj2;
        if (obj instanceof C0477m) {
            C0477m c0477m = (C0477m) obj;
            if (size() != c0477m.size()) {
                return false;
            }
            i = 0;
            while (i < this.f1521h) {
                try {
                    b = m1249b(i);
                    c = m1250c(i);
                    obj2 = c0477m.get(b);
                    if (c == null) {
                        if (obj2 != null || !c0477m.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
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
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            i = 0;
            while (i < this.f1521h) {
                try {
                    b = m1249b(i);
                    c = m1250c(i);
                    obj2 = map.get(b);
                    if (c == null) {
                        if (obj2 != null || !map.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return true;
        }
    }

    public V get(Object obj) {
        int a = m1246a(obj);
        return a >= 0 ? this.f1520g[(a << 1) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.f1519f;
        Object[] objArr = this.f1520g;
        int i = this.f1521h;
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
        return this.f1521h <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = 8;
        int i3 = this.f1521h;
        if (k == null) {
            a = m1241a();
            i = 0;
        } else {
            i = k.hashCode();
            a = m1242a(k, i);
        }
        if (a >= 0) {
            int i4 = (a << 1) + 1;
            V v2 = this.f1520g[i4];
            this.f1520g[i4] = v;
            return v2;
        }
        a ^= -1;
        if (i3 >= this.f1519f.length) {
            if (i3 >= 8) {
                i2 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i2 = 4;
            }
            int[] iArr = this.f1519f;
            Object[] objArr = this.f1520g;
            m1245e(i2);
            if (i3 != this.f1521h) {
                throw new ConcurrentModificationException();
            }
            if (this.f1519f.length > 0) {
                System.arraycopy(iArr, 0, this.f1519f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1520g, 0, objArr.length);
            }
            C0477m.m1244a(iArr, objArr, i3);
        }
        if (a < i3) {
            System.arraycopy(this.f1519f, a, this.f1519f, a + 1, i3 - a);
            System.arraycopy(this.f1520g, a << 1, this.f1520g, (a + 1) << 1, (this.f1521h - a) << 1);
        }
        if (i3 != this.f1521h || a >= this.f1519f.length) {
            throw new ConcurrentModificationException();
        }
        this.f1519f[a] = i;
        this.f1520g[a << 1] = k;
        this.f1520g[(a << 1) + 1] = v;
        this.f1521h++;
        return null;
    }

    public V remove(Object obj) {
        int a = m1246a(obj);
        return a >= 0 ? m1251d(a) : null;
    }

    public int size() {
        return this.f1521h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1521h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1521h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0477m b = m1249b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m1250c(i);
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
