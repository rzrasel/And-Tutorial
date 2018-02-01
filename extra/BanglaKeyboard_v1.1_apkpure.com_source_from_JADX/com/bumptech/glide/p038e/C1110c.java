package com.bumptech.glide.p038e;

import com.bumptech.glide.p042h.C1161g;
import java.util.HashMap;
import java.util.Map;

public final class C1110c {
    private static final C1161g f3316a = new C1161g();
    private final Map<C1161g, C1107b<?, ?>> f3317b = new HashMap();

    public final <T, Z> C1107b<T, Z> m3009a(Class<T> cls, Class<Z> cls2) {
        C1107b<T, Z> c1107b;
        synchronized (f3316a) {
            f3316a.m3148a(cls, cls2);
            c1107b = (C1107b) this.f3317b.get(f3316a);
        }
        return c1107b == null ? C1111d.m3011e() : c1107b;
    }

    public final <T, Z> void m3010a(Class<T> cls, Class<Z> cls2, C1107b<T, Z> c1107b) {
        this.f3317b.put(new C1161g(cls, cls2), c1107b);
    }
}
