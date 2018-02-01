package com.bumptech.glide.p042h;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class C1159e<T, Y> {
    private int f3442a;
    public final LinkedHashMap<T, Y> f3443b = new LinkedHashMap(100, 0.75f, true);
    public int f3444c = 0;
    private final int f3445d;

    public C1159e(int i) {
        this.f3445d = i;
        this.f3442a = i;
    }

    public int mo1352a(Y y) {
        return 1;
    }

    public final void m3141a() {
        m3145b(0);
    }

    public void mo1357a(T t, Y y) {
    }

    public final Y m3143b(T t) {
        return this.f3443b.get(t);
    }

    public final Y m3144b(T t, Y y) {
        if (mo1352a(y) >= this.f3442a) {
            mo1357a(t, y);
            return null;
        }
        Y put = this.f3443b.put(t, y);
        if (y != null) {
            this.f3444c += mo1352a(y);
        }
        if (put != null) {
            this.f3444c -= mo1352a(put);
        }
        m3145b(this.f3442a);
        return put;
    }

    public final void m3145b(int i) {
        while (this.f3444c > i) {
            Entry entry = (Entry) this.f3443b.entrySet().iterator().next();
            Object value = entry.getValue();
            this.f3444c -= mo1352a(value);
            Object key = entry.getKey();
            this.f3443b.remove(key);
            mo1357a(key, value);
        }
    }
}
