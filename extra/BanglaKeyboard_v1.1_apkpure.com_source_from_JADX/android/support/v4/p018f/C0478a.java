package android.support.v4.p018f;

import android.support.v4.p018f.C0475h.C0487b;
import android.support.v4.p018f.C0475h.C0490e;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C0478a<K, V> extends C0477m<K, V> implements Map<K, V> {
    C0475h<K, V> f1522a;

    class C04761 extends C0475h<K, V> {
        final /* synthetic */ C0478a f1514a;

        C04761(C0478a c0478a) {
            this.f1514a = c0478a;
        }

        protected final int mo475a() {
            return this.f1514a.h;
        }

        protected final int mo476a(Object obj) {
            return this.f1514a.m1246a(obj);
        }

        protected final Object mo477a(int i, int i2) {
            return this.f1514a.g[(i << 1) + i2];
        }

        protected final V mo478a(int i, V v) {
            C0477m c0477m = this.f1514a;
            int i2 = (i << 1) + 1;
            V v2 = c0477m.f1520g[i2];
            c0477m.f1520g[i2] = v;
            return v2;
        }

        protected final void mo479a(int i) {
            this.f1514a.m1251d(i);
        }

        protected final void mo480a(K k, V v) {
            this.f1514a.put(k, v);
        }

        protected final int mo481b(Object obj) {
            return this.f1514a.m1248b(obj);
        }

        protected final Map<K, V> mo482b() {
            return this.f1514a;
        }

        protected final void mo483c() {
            this.f1514a.clear();
        }
    }

    public C0478a(int i) {
        super(i);
    }

    public C0478a(C0477m c0477m) {
        super(c0477m);
    }

    private C0475h<K, V> m1252a() {
        if (this.f1522a == null) {
            this.f1522a = new C04761(this);
        }
        return this.f1522a;
    }

    public Set<Entry<K, V>> entrySet() {
        C0475h a = m1252a();
        if (a.f1511b == null) {
            a.f1511b = new C0487b(a);
        }
        return a.f1511b;
    }

    public Set<K> keySet() {
        return m1252a().m1231d();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m1247a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        C0475h a = m1252a();
        if (a.f1513d == null) {
            a.f1513d = new C0490e(a);
        }
        return a.f1513d;
    }
}
