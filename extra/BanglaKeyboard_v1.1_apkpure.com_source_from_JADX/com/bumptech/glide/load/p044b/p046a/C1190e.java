package com.bumptech.glide.load.p044b.p046a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class C1190e<K extends C1181h, V> {
    private final C1189a<K, V> f3493a = new C1189a();
    private final Map<K, C1189a<K, V>> f3494b = new HashMap();

    private static class C1189a<K, V> {
        final K f3489a;
        List<V> f3490b;
        C1189a<K, V> f3491c;
        C1189a<K, V> f3492d;

        public C1189a() {
            this(null);
        }

        public C1189a(K k) {
            this.f3492d = this;
            this.f3491c = this;
            this.f3489a = k;
        }

        public final V m3232a() {
            int b = m3233b();
            return b > 0 ? this.f3490b.remove(b - 1) : null;
        }

        public final int m3233b() {
            return this.f3490b != null ? this.f3490b.size() : 0;
        }
    }

    C1190e() {
    }

    private static <K, V> void m3234a(C1189a<K, V> c1189a) {
        c1189a.f3491c.f3492d = c1189a;
        c1189a.f3492d.f3491c = c1189a;
    }

    private static <K, V> void m3235b(C1189a<K, V> c1189a) {
        c1189a.f3492d.f3491c = c1189a.f3491c;
        c1189a.f3491c.f3492d = c1189a.f3492d;
    }

    public final V m3236a() {
        for (C1189a c1189a = this.f3493a.f3492d; !c1189a.equals(this.f3493a); c1189a = c1189a.f3492d) {
            V a = c1189a.m3232a();
            if (a != null) {
                return a;
            }
            C1190e.m3235b(c1189a);
            this.f3494b.remove(c1189a.f3489a);
            ((C1181h) c1189a.f3489a).mo1334a();
        }
        return null;
    }

    public final V m3237a(K k) {
        C1189a c1189a = (C1189a) this.f3494b.get(k);
        if (c1189a == null) {
            c1189a = new C1189a(k);
            this.f3494b.put(k, c1189a);
        } else {
            k.mo1334a();
        }
        C1190e.m3235b(c1189a);
        c1189a.f3492d = this.f3493a;
        c1189a.f3491c = this.f3493a.f3491c;
        C1190e.m3234a(c1189a);
        return c1189a.m3232a();
    }

    public final void m3238a(K k, V v) {
        C1189a c1189a = (C1189a) this.f3494b.get(k);
        if (c1189a == null) {
            c1189a = new C1189a(k);
            C1190e.m3235b(c1189a);
            c1189a.f3492d = this.f3493a.f3492d;
            c1189a.f3491c = this.f3493a;
            C1190e.m3234a(c1189a);
            this.f3494b.put(k, c1189a);
        } else {
            k.mo1334a();
        }
        if (c1189a.f3490b == null) {
            c1189a.f3490b = new ArrayList();
        }
        c1189a.f3490b.add(v);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        Object obj = null;
        for (C1189a c1189a = this.f3493a.f3491c; !c1189a.equals(this.f3493a); c1189a = c1189a.f3491c) {
            obj = 1;
            stringBuilder.append('{').append(c1189a.f3489a).append(':').append(c1189a.m3233b()).append("}, ");
        }
        if (obj != null) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        return stringBuilder.append(" )").toString();
    }
}
