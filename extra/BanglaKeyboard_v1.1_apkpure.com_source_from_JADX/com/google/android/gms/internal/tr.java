package com.google.android.gms.internal;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class tr<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    boolean f7139a;
    private final int f7140b;
    private List<tw> f7141c;
    private Map<K, V> f7142d;
    private volatile ty f7143e;
    private Map<K, V> f7144f;

    private tr(int i) {
        this.f7140b = i;
        this.f7141c = Collections.emptyList();
        this.f7142d = Collections.emptyMap();
        this.f7144f = Collections.emptyMap();
    }

    private final int m6669a(K k) {
        int compareTo;
        int size = this.f7141c.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo((Comparable) ((tw) this.f7141c.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        int i2 = size;
        while (i <= i2) {
            size = (i + i2) / 2;
            compareTo = k.compareTo((Comparable) ((tw) this.f7141c.get(size)).getKey());
            if (compareTo < 0) {
                i2 = size - 1;
            } else if (compareTo <= 0) {
                return size;
            } else {
                i = size + 1;
            }
        }
        return -(i + 1);
    }

    static <FieldDescriptorType extends sp<FieldDescriptorType>> tr<FieldDescriptorType, Object> m6670a(int i) {
        return new ts(i);
    }

    private final V m6674c(int i) {
        m6676d();
        V value = ((tw) this.f7141c.remove(i)).getValue();
        if (!this.f7142d.isEmpty()) {
            Iterator it = m6677e().entrySet().iterator();
            this.f7141c.add(new tw(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final void m6676d() {
        if (this.f7139a) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> m6677e() {
        m6676d();
        if (this.f7142d.isEmpty() && !(this.f7142d instanceof TreeMap)) {
            this.f7142d = new TreeMap();
            this.f7144f = ((TreeMap) this.f7142d).descendingMap();
        }
        return (SortedMap) this.f7142d;
    }

    public final V m6678a(K k, V v) {
        m6676d();
        int a = m6669a((Comparable) k);
        if (a >= 0) {
            return ((tw) this.f7141c.get(a)).setValue(v);
        }
        m6676d();
        if (this.f7141c.isEmpty() && !(this.f7141c instanceof ArrayList)) {
            this.f7141c = new ArrayList(this.f7140b);
        }
        int i = -(a + 1);
        if (i >= this.f7140b) {
            return m6677e().put(k, v);
        }
        if (this.f7141c.size() == this.f7140b) {
            tw twVar = (tw) this.f7141c.remove(this.f7140b - 1);
            m6677e().put((Comparable) twVar.getKey(), twVar.getValue());
        }
        this.f7141c.add(i, new tw(this, k, v));
        return null;
    }

    public void mo2288a() {
        if (!this.f7139a) {
            this.f7142d = this.f7142d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7142d);
            this.f7144f = this.f7144f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7144f);
            this.f7139a = true;
        }
    }

    public final int m6680b() {
        return this.f7141c.size();
    }

    public final Entry<K, V> m6681b(int i) {
        return (Entry) this.f7141c.get(i);
    }

    public final Iterable<Entry<K, V>> m6682c() {
        return this.f7142d.isEmpty() ? tt.m6684a() : this.f7142d.entrySet();
    }

    public void clear() {
        m6676d();
        if (!this.f7141c.isEmpty()) {
            this.f7141c.clear();
        }
        if (!this.f7142d.isEmpty()) {
            this.f7142d.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m6669a(comparable) >= 0 || this.f7142d.containsKey(comparable);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f7143e == null) {
            this.f7143e = new ty();
        }
        return this.f7143e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr)) {
            return super.equals(obj);
        }
        tr trVar = (tr) obj;
        int size = size();
        if (size != trVar.size()) {
            return false;
        }
        int b = m6680b();
        if (b != trVar.m6680b()) {
            return entrySet().equals(trVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!m6681b(i).equals(trVar.m6681b(i))) {
                return false;
            }
        }
        return b != size ? this.f7142d.equals(trVar.f7142d) : true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m6669a(comparable);
        return a >= 0 ? ((tw) this.f7141c.get(a)).getValue() : this.f7142d.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < m6680b(); i2++) {
            i += ((tw) this.f7141c.get(i2)).hashCode();
        }
        return this.f7142d.size() > 0 ? this.f7142d.hashCode() + i : i;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m6678a((Comparable) obj, obj2);
    }

    public V remove(Object obj) {
        m6676d();
        Comparable comparable = (Comparable) obj;
        int a = m6669a(comparable);
        return a >= 0 ? m6674c(a) : this.f7142d.isEmpty() ? null : this.f7142d.remove(comparable);
    }

    public int size() {
        return this.f7141c.size() + this.f7142d.size();
    }
}
