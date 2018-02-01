package android.support.v4.content;

import android.support.v4.p018f.C0482d;

public final class C0439b<D> {
    public int f1419a;
    public C0423b<D> f1420b;
    public C0422a<D> f1421c;
    public boolean f1422d;
    public boolean f1423e;
    public boolean f1424f;
    public boolean f1425g;
    public boolean f1426h;

    public interface C0422a<D> {
    }

    public interface C0423b<D> {
    }

    public final void m1172a(C0422a<D> c0422a) {
        if (this.f1421c == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1421c != c0422a) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f1421c = null;
        }
    }

    public final void m1173a(C0423b<D> c0423b) {
        if (this.f1420b == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1420b != c0423b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f1420b = null;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0482d.m1274a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f1419a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
