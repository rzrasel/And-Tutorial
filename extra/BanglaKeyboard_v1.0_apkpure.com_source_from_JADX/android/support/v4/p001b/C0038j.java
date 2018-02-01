package android.support.v4.p001b;

import java.util.Iterator;
import java.util.Map.Entry;

final class C0038j implements Iterator, Entry {
    int f29a;
    int f30b;
    boolean f31c = false;
    final /* synthetic */ C0030f f32d;

    C0038j(C0030f c0030f) {
        this.f32d = c0030f;
        this.f29a = c0030f.mo134a() - 1;
        this.f30b = -1;
    }

    public final boolean equals(Object obj) {
        if (!this.f31c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Entry)) {
            return false;
        } else {
            Entry entry = (Entry) obj;
            return C0032c.m34a(entry.getKey(), this.f32d.mo136a(this.f30b, 0)) && C0032c.m34a(entry.getValue(), this.f32d.mo136a(this.f30b, 1));
        }
    }

    public final Object getKey() {
        if (this.f31c) {
            return this.f32d.mo136a(this.f30b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f31c) {
            return this.f32d.mo136a(this.f30b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        return this.f30b < this.f29a;
    }

    public final int hashCode() {
        int i = 0;
        if (this.f31c) {
            Object a = this.f32d.mo136a(this.f30b, 0);
            Object a2 = this.f32d.mo136a(this.f30b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f30b++;
        this.f31c = true;
        return this;
    }

    public final void remove() {
        if (this.f31c) {
            this.f32d.mo138a(this.f30b);
            this.f30b--;
            this.f29a--;
            this.f31c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f31c) {
            return this.f32d.mo137a(this.f30b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
