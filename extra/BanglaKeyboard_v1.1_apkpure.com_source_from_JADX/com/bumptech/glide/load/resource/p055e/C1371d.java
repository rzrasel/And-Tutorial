package com.bumptech.glide.load.resource.p055e;

import com.bumptech.glide.p042h.C1161g;
import java.util.HashMap;
import java.util.Map;

public final class C1371d {
    private static final C1161g f3835a = new C1161g();
    private final Map<C1161g, C1368c<?, ?>> f3836b = new HashMap();

    public final <Z, R> C1368c<Z, R> m3556a(Class<Z> cls, Class<R> cls2) {
        if (cls.equals(cls2)) {
            return C1372e.m3558b();
        }
        synchronized (f3835a) {
            f3835a.m3148a(cls, cls2);
            C1368c<Z, R> c1368c = (C1368c) this.f3836b.get(f3835a);
        }
        if (c1368c != null) {
            return c1368c;
        }
        throw new IllegalArgumentException("No transcoder registered for " + cls + " and " + cls2);
    }

    public final <Z, R> void m3557a(Class<Z> cls, Class<R> cls2, C1368c<Z, R> c1368c) {
        this.f3836b.put(new C1161g(cls, cls2), c1368c);
    }
}
