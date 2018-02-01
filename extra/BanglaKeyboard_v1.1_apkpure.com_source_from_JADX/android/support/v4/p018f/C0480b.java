package android.support.v4.p018f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class C0480b<E> implements Collection<E>, Set<E> {
    static Object[] f1524a;
    static int f1525b;
    static Object[] f1526c;
    static int f1527d;
    private static final int[] f1528j = new int[0];
    private static final Object[] f1529k = new Object[0];
    final boolean f1530e;
    int[] f1531f;
    public Object[] f1532g;
    int f1533h;
    C0475h<E, E> f1534i;

    class C04791 extends C0475h<E, E> {
        final /* synthetic */ C0480b f1523a;

        C04791(C0480b c0480b) {
            this.f1523a = c0480b;
        }

        protected final int mo475a() {
            return this.f1523a.f1533h;
        }

        protected final int mo476a(Object obj) {
            return this.f1523a.m1266a(obj);
        }

        protected final Object mo477a(int i, int i2) {
            return this.f1523a.f1532g[i];
        }

        protected final E mo478a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        protected final void mo479a(int i) {
            this.f1523a.m1267a(i);
        }

        protected final void mo480a(E e, E e2) {
            this.f1523a.add(e);
        }

        protected final int mo481b(Object obj) {
            return this.f1523a.m1266a(obj);
        }

        protected final Map<E, E> mo482b() {
            throw new UnsupportedOperationException("not a map");
        }

        protected final void mo483c() {
            this.f1523a.clear();
        }
    }

    public C0480b() {
        this(0);
    }

    public C0480b(byte b) {
        this(7);
    }

    private C0480b(int i) {
        this.f1530e = false;
        if (i == 0) {
            this.f1531f = f1528j;
            this.f1532g = f1529k;
        } else {
            m1265b(i);
        }
        this.f1533h = 0;
    }

    private int m1262a() {
        int i = this.f1533h;
        if (i == 0) {
            return -1;
        }
        int a = C0481c.m1269a(this.f1531f, i, 0);
        if (a < 0 || this.f1532g[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1531f[i2] == 0) {
            if (this.f1532g[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f1531f[a] == 0) {
            if (this.f1532g[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private int m1263a(Object obj, int i) {
        int i2 = this.f1533h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0481c.m1269a(this.f1531f, i2, i);
        if (a < 0 || obj.equals(this.f1532g[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1531f[i3] == i) {
            if (obj.equals(this.f1532g[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f1531f[a] == i) {
            if (obj.equals(this.f1532g[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    private static void m1264a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (C0480b.class) {
                if (f1527d < 10) {
                    objArr[0] = f1526c;
                    objArr[1] = iArr;
                    for (i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1526c = objArr;
                    f1527d++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0480b.class) {
                if (f1525b < 10) {
                    objArr[0] = f1524a;
                    objArr[1] = iArr;
                    for (i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1524a = objArr;
                    f1525b++;
                }
            }
        }
    }

    private void m1265b(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0480b.class) {
                if (f1526c != null) {
                    objArr = f1526c;
                    this.f1532g = objArr;
                    f1526c = (Object[]) objArr[0];
                    this.f1531f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1527d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0480b.class) {
                if (f1524a != null) {
                    objArr = f1524a;
                    this.f1532g = objArr;
                    f1524a = (Object[]) objArr[0];
                    this.f1531f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1525b--;
                    return;
                }
            }
        }
        this.f1531f = new int[i];
        this.f1532g = new Object[i];
    }

    public final int m1266a(Object obj) {
        if (obj == null) {
            return m1262a();
        }
        return m1263a(obj, this.f1530e ? System.identityHashCode(obj) : obj.hashCode());
    }

    public final E m1267a(int i) {
        int i2 = 8;
        E e = this.f1532g[i];
        if (this.f1533h <= 1) {
            C0480b.m1264a(this.f1531f, this.f1532g, this.f1533h);
            this.f1531f = f1528j;
            this.f1532g = f1529k;
            this.f1533h = 0;
        } else if (this.f1531f.length <= 8 || this.f1533h >= this.f1531f.length / 3) {
            this.f1533h--;
            if (i < this.f1533h) {
                System.arraycopy(this.f1531f, i + 1, this.f1531f, i, this.f1533h - i);
                System.arraycopy(this.f1532g, i + 1, this.f1532g, i, this.f1533h - i);
            }
            this.f1532g[this.f1533h] = null;
        } else {
            if (this.f1533h > 8) {
                i2 = this.f1533h + (this.f1533h >> 1);
            }
            Object obj = this.f1531f;
            Object obj2 = this.f1532g;
            m1265b(i2);
            this.f1533h--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.f1531f, 0, i);
                System.arraycopy(obj2, 0, this.f1532g, 0, i);
            }
            if (i < this.f1533h) {
                System.arraycopy(obj, i + 1, this.f1531f, i, this.f1533h - i);
                System.arraycopy(obj2, i + 1, this.f1532g, i, this.f1533h - i);
            }
        }
        return e;
    }

    public final boolean add(E e) {
        int a;
        int i;
        if (e == null) {
            a = m1262a();
            i = 0;
        } else {
            a = this.f1530e ? System.identityHashCode(e) : e.hashCode();
            i = a;
            a = m1263a(e, a);
        }
        if (a >= 0) {
            return false;
        }
        int i2 = a ^ -1;
        if (this.f1533h >= this.f1531f.length) {
            a = this.f1533h >= 8 ? this.f1533h + (this.f1533h >> 1) : this.f1533h >= 4 ? 8 : 4;
            Object obj = this.f1531f;
            Object obj2 = this.f1532g;
            m1265b(a);
            if (this.f1531f.length > 0) {
                System.arraycopy(obj, 0, this.f1531f, 0, obj.length);
                System.arraycopy(obj2, 0, this.f1532g, 0, obj2.length);
            }
            C0480b.m1264a(obj, obj2, this.f1533h);
        }
        if (i2 < this.f1533h) {
            System.arraycopy(this.f1531f, i2, this.f1531f, i2 + 1, this.f1533h - i2);
            System.arraycopy(this.f1532g, i2, this.f1532g, i2 + 1, this.f1533h - i2);
        }
        this.f1531f[i2] = i;
        this.f1532g[i2] = e;
        this.f1533h++;
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        Object obj;
        boolean z = false;
        int size = this.f1533h + collection.size();
        if (this.f1531f.length < size) {
            obj = this.f1531f;
            Object obj2 = this.f1532g;
            m1265b(size);
            if (this.f1533h > 0) {
                System.arraycopy(obj, 0, this.f1531f, 0, this.f1533h);
                System.arraycopy(obj2, 0, this.f1532g, 0, this.f1533h);
            }
            C0480b.m1264a(obj, obj2, this.f1533h);
        }
        for (Object obj3 : collection) {
            z |= add(obj3);
        }
        return z;
    }

    public final void clear() {
        if (this.f1533h != 0) {
            C0480b.m1264a(this.f1531f, this.f1532g, this.f1533h);
            this.f1531f = f1528j;
            this.f1532g = f1529k;
            this.f1533h = 0;
        }
    }

    public final boolean contains(Object obj) {
        return m1266a(obj) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f1533h) {
            try {
                if (!set.contains(this.f1532g[i])) {
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

    public final int hashCode() {
        int i = 0;
        int[] iArr = this.f1531f;
        int i2 = 0;
        while (i < this.f1533h) {
            i2 += iArr[i];
            i++;
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.f1533h <= 0;
    }

    public final Iterator<E> iterator() {
        if (this.f1534i == null) {
            this.f1534i = new C04791(this);
        }
        return this.f1534i.m1231d().iterator();
    }

    public final boolean remove(Object obj) {
        int a = m1266a(obj);
        if (a < 0) {
            return false;
        }
        m1267a(a);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1533h - 1; i >= 0; i--) {
            if (!collection.contains(this.f1532g[i])) {
                m1267a(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f1533h;
    }

    public final Object[] toArray() {
        Object obj = new Object[this.f1533h];
        System.arraycopy(this.f1532g, 0, obj, 0, this.f1533h);
        return obj;
    }

    public final <T> T[] toArray(T[] tArr) {
        Object obj = tArr.length < this.f1533h ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1533h) : tArr;
        System.arraycopy(this.f1532g, 0, obj, 0, this.f1533h);
        if (obj.length > this.f1533h) {
            obj[this.f1533h] = null;
        }
        return obj;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1533h * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1533h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0480b c0480b = this.f1532g[i];
            if (c0480b != this) {
                stringBuilder.append(c0480b);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
