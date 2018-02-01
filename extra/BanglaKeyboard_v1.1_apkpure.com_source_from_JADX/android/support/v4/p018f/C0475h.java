package android.support.v4.p018f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class C0475h<K, V> {
    C0487b f1511b;
    C0488c f1512c;
    C0490e f1513d;

    final class C0486a<T> implements Iterator<T> {
        final int f1545a;
        int f1546b;
        int f1547c;
        boolean f1548d = false;
        final /* synthetic */ C0475h f1549e;

        C0486a(C0475h c0475h, int i) {
            this.f1549e = c0475h;
            this.f1545a = i;
            this.f1546b = c0475h.mo475a();
        }

        public final boolean hasNext() {
            return this.f1547c < this.f1546b;
        }

        public final T next() {
            if (hasNext()) {
                T a = this.f1549e.mo477a(this.f1547c, this.f1545a);
                this.f1547c++;
                this.f1548d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f1548d) {
                this.f1547c--;
                this.f1546b--;
                this.f1548d = false;
                this.f1549e.mo479a(this.f1547c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class C0487b implements Set<Entry<K, V>> {
        final /* synthetic */ C0475h f1550a;

        C0487b(C0475h c0475h) {
            this.f1550a = c0475h;
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = this.f1550a.mo475a();
            for (Entry entry : collection) {
                this.f1550a.mo480a(entry.getKey(), entry.getValue());
            }
            return a != this.f1550a.mo475a();
        }

        public final void clear() {
            this.f1550a.mo483c();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = this.f1550a.mo476a(entry.getKey());
            return a >= 0 ? C0481c.m1271a(this.f1550a.mo477a(a, 1), entry.getValue()) : false;
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
            return C0475h.m1219a((Set) this, obj);
        }

        public final int hashCode() {
            int a = this.f1550a.mo475a() - 1;
            int i = 0;
            while (a >= 0) {
                Object a2 = this.f1550a.mo477a(a, 0);
                Object a3 = this.f1550a.mo477a(a, 1);
                a--;
                i += (a3 == null ? 0 : a3.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }

        public final boolean isEmpty() {
            return this.f1550a.mo475a() == 0;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C0489d(this.f1550a);
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return this.f1550a.mo475a();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class C0488c implements Set<K> {
        final /* synthetic */ C0475h f1551a;

        C0488c(C0475h c0475h) {
            this.f1551a = c0475h;
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            this.f1551a.mo483c();
        }

        public final boolean contains(Object obj) {
            return this.f1551a.mo476a(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            Map b = this.f1551a.mo482b();
            for (Object containsKey : collection) {
                if (!b.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return C0475h.m1219a((Set) this, obj);
        }

        public final int hashCode() {
            int i = 0;
            for (int a = this.f1551a.mo475a() - 1; a >= 0; a--) {
                Object a2 = this.f1551a.mo477a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public final boolean isEmpty() {
            return this.f1551a.mo475a() == 0;
        }

        public final Iterator<K> iterator() {
            return new C0486a(this.f1551a, 0);
        }

        public final boolean remove(Object obj) {
            int a = this.f1551a.mo476a(obj);
            if (a < 0) {
                return false;
            }
            this.f1551a.mo479a(a);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map b = this.f1551a.mo482b();
            int size = b.size();
            for (Object remove : collection) {
                b.remove(remove);
            }
            return size != b.size();
        }

        public final boolean retainAll(Collection<?> collection) {
            return C0475h.m1218a(this.f1551a.mo482b(), (Collection) collection);
        }

        public final int size() {
            return this.f1551a.mo475a();
        }

        public final Object[] toArray() {
            return this.f1551a.m1229b(0);
        }

        public final <T> T[] toArray(T[] tArr) {
            return this.f1551a.m1226a((Object[]) tArr, 0);
        }
    }

    final class C0489d implements Iterator<Entry<K, V>>, Entry<K, V> {
        int f1552a;
        int f1553b;
        boolean f1554c = false;
        final /* synthetic */ C0475h f1555d;

        C0489d(C0475h c0475h) {
            this.f1555d = c0475h;
            this.f1552a = c0475h.mo475a() - 1;
            this.f1553b = -1;
        }

        public final boolean equals(Object obj) {
            if (!this.f1554c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) obj;
                return C0481c.m1271a(entry.getKey(), this.f1555d.mo477a(this.f1553b, 0)) && C0481c.m1271a(entry.getValue(), this.f1555d.mo477a(this.f1553b, 1));
            }
        }

        public final K getKey() {
            if (this.f1554c) {
                return this.f1555d.mo477a(this.f1553b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f1554c) {
                return this.f1555d.mo477a(this.f1553b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            return this.f1553b < this.f1552a;
        }

        public final int hashCode() {
            int i = 0;
            if (this.f1554c) {
                Object a = this.f1555d.mo477a(this.f1553b, 0);
                Object a2 = this.f1555d.mo477a(this.f1553b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return i ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final /* synthetic */ Object next() {
            if (hasNext()) {
                this.f1553b++;
                this.f1554c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f1554c) {
                this.f1555d.mo479a(this.f1553b);
                this.f1553b--;
                this.f1552a--;
                this.f1554c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final V setValue(V v) {
            if (this.f1554c) {
                return this.f1555d.mo478a(this.f1553b, (Object) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class C0490e implements Collection<V> {
        final /* synthetic */ C0475h f1556a;

        C0490e(C0475h c0475h) {
            this.f1556a = c0475h;
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            this.f1556a.mo483c();
        }

        public final boolean contains(Object obj) {
            return this.f1556a.mo481b(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return this.f1556a.mo475a() == 0;
        }

        public final Iterator<V> iterator() {
            return new C0486a(this.f1556a, 1);
        }

        public final boolean remove(Object obj) {
            int b = this.f1556a.mo481b(obj);
            if (b < 0) {
                return false;
            }
            this.f1556a.mo479a(b);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int i = 0;
            int a = this.f1556a.mo475a();
            boolean z = false;
            while (i < a) {
                if (collection.contains(this.f1556a.mo477a(i, 1))) {
                    this.f1556a.mo479a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int i = 0;
            int a = this.f1556a.mo475a();
            boolean z = false;
            while (i < a) {
                if (!collection.contains(this.f1556a.mo477a(i, 1))) {
                    this.f1556a.mo479a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final int size() {
            return this.f1556a.mo475a();
        }

        public final Object[] toArray() {
            return this.f1556a.m1229b(1);
        }

        public final <T> T[] toArray(T[] tArr) {
            return this.f1556a.m1226a((Object[]) tArr, 1);
        }
    }

    C0475h() {
    }

    public static <K, V> boolean m1218a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <T> boolean m1219a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    protected abstract int mo475a();

    protected abstract int mo476a(Object obj);

    protected abstract Object mo477a(int i, int i2);

    protected abstract V mo478a(int i, V v);

    protected abstract void mo479a(int i);

    protected abstract void mo480a(K k, V v);

    public final <T> T[] m1226a(T[] tArr, int i) {
        int a = mo475a();
        T[] tArr2 = tArr.length < a ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a) : tArr;
        for (int i2 = 0; i2 < a; i2++) {
            tArr2[i2] = mo477a(i2, i);
        }
        if (tArr2.length > a) {
            tArr2[a] = null;
        }
        return tArr2;
    }

    protected abstract int mo481b(Object obj);

    protected abstract Map<K, V> mo482b();

    public final Object[] m1229b(int i) {
        int a = mo475a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo477a(i2, i);
        }
        return objArr;
    }

    protected abstract void mo483c();

    public final Set<K> m1231d() {
        if (this.f1512c == null) {
            this.f1512c = new C0488c(this);
        }
        return this.f1512c;
    }
}
