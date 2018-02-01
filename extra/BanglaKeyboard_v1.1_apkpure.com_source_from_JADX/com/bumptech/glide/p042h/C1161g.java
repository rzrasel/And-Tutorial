package com.bumptech.glide.p042h;

public final class C1161g {
    private Class<?> f3447a;
    private Class<?> f3448b;

    public C1161g(Class<?> cls, Class<?> cls2) {
        m3148a(cls, cls2);
    }

    public final void m3148a(Class<?> cls, Class<?> cls2) {
        this.f3447a = cls;
        this.f3448b = cls2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1161g c1161g = (C1161g) obj;
        return !this.f3447a.equals(c1161g.f3447a) ? false : this.f3448b.equals(c1161g.f3448b);
    }

    public final int hashCode() {
        return (this.f3447a.hashCode() * 31) + this.f3448b.hashCode();
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f3447a + ", second=" + this.f3448b + '}';
    }
}
