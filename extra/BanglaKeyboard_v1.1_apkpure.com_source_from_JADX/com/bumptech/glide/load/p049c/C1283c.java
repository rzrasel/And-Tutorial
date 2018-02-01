package com.bumptech.glide.load.p049c;

import android.content.Context;
import com.bumptech.glide.load.p043a.C1165c;
import java.util.HashMap;
import java.util.Map;

public final class C1283c {
    private static final C1252l f3650c = new C12821();
    private final Map<Class, Map<Class, C1250m>> f3651a = new HashMap();
    private final Map<Class, Map<Class, C1252l>> f3652b = new HashMap();
    private final Context f3653d;

    static class C12821 implements C1252l {
        C12821() {
        }

        public final C1165c mo1372a(Object obj, int i, int i2) {
            throw new NoSuchMethodError("This should never be called!");
        }

        public final String toString() {
            return "NULL_MODEL_LOADER";
        }
    }

    public C1283c(Context context) {
        this.f3653d = context.getApplicationContext();
    }

    private <T, Y> void m3373a(Class<T> cls, Class<Y> cls2, C1252l<T, Y> c1252l) {
        Map map = (Map) this.f3652b.get(cls);
        if (map == null) {
            map = new HashMap();
            this.f3652b.put(cls, map);
        }
        map.put(cls2, c1252l);
    }

    public final synchronized <T, Y> C1252l<T, Y> m3374a(Class<T> cls, Class<Y> cls2) {
        C1252l<T, Y> c1252l;
        Map map = (Map) this.f3652b.get(cls);
        c1252l = map != null ? (C1252l) map.get(cls2) : null;
        if (c1252l == null) {
            C1252l<T, Y> a;
            map = (Map) this.f3651a.get(cls);
            C1250m c1250m = map != null ? (C1250m) map.get(cls2) : null;
            if (c1250m == null) {
                C1250m c1250m2 = c1250m;
                for (Class cls3 : this.f3651a.keySet()) {
                    if (cls3.isAssignableFrom(cls)) {
                        map = (Map) this.f3651a.get(cls3);
                        if (map != null) {
                            c1250m = (C1250m) map.get(cls2);
                            if (c1250m != null) {
                                break;
                            }
                            c1250m2 = c1250m;
                        }
                    }
                    c1250m = c1250m2;
                    c1250m2 = c1250m;
                }
                c1250m = c1250m2;
            }
            if (c1250m != null) {
                a = c1250m.mo1371a(this.f3653d, this);
                m3373a((Class) cls, (Class) cls2, (C1252l) a);
            } else {
                m3373a((Class) cls, (Class) cls2, f3650c);
                a = c1252l;
            }
            c1252l = a;
        } else if (f3650c.equals(c1252l)) {
            c1252l = null;
        }
        return c1252l;
    }

    public final synchronized <T, Y> C1250m<T, Y> m3375a(Class<T> cls, Class<Y> cls2, C1250m<T, Y> c1250m) {
        C1250m<T, Y> c1250m2;
        this.f3652b.clear();
        Map map = (Map) this.f3651a.get(cls);
        if (map == null) {
            map = new HashMap();
            this.f3651a.put(cls, map);
        }
        c1250m2 = (C1250m) map.put(cls2, c1250m);
        if (c1250m2 != null) {
            for (Map containsValue : this.f3651a.values()) {
                if (containsValue.containsValue(c1250m2)) {
                    c1250m2 = null;
                    break;
                }
            }
        }
        return c1250m2;
    }
}
