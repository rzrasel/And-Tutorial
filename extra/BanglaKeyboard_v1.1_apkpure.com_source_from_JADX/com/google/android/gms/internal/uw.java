package com.google.android.gms.internal;

public final class uw<M extends uv<M>, T> {
    protected final Class<T> f7234a;
    public final int f7235b;
    protected final boolean f7236c;
    private int f7237d;

    protected final int m6796a(Object obj) {
        int i = this.f7235b >>> 3;
        switch (this.f7237d) {
            case 10:
                return (ut.m6783c(i << 3) << 1) + ((vb) obj).m5901e();
            case 11:
                return ut.m6778b(i, (vb) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.f7237d);
        }
    }

    protected final void m6797a(Object obj, ut utVar) {
        try {
            utVar.m6793b(this.f7235b);
            switch (this.f7237d) {
                case 10:
                    int i = this.f7235b >>> 3;
                    ((vb) obj).mo2195a(utVar);
                    utVar.m6795c(i, 4);
                    return;
                case 11:
                    utVar.m6792a((vb) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.f7237d);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw)) {
            return false;
        }
        uw uwVar = (uw) obj;
        return this.f7237d == uwVar.f7237d && this.f7234a == uwVar.f7234a && this.f7235b == uwVar.f7235b && this.f7236c == uwVar.f7236c;
    }

    public final int hashCode() {
        return (this.f7236c ? 1 : 0) + ((((((this.f7237d + 1147) * 31) + this.f7234a.hashCode()) * 31) + this.f7235b) * 31);
    }
}
