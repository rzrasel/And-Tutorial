package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;

final class C0039k implements Collection {
    final /* synthetic */ C0030f f33a;

    C0039k(C0030f c0030f) {
        this.f33a = c0030f;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f33a.mo142c();
    }

    public final boolean contains(Object obj) {
        return this.f33a.mo140b(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f33a.mo134a() == 0;
    }

    public final Iterator iterator() {
        return new C0035g(this.f33a, 1);
    }

    public final boolean remove(Object obj) {
        int b = this.f33a.mo140b(obj);
        if (b < 0) {
            return false;
        }
        this.f33a.mo138a(b);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int i = 0;
        int a = this.f33a.mo134a();
        boolean z = false;
        while (i < a) {
            if (collection.contains(this.f33a.mo136a(i, 1))) {
                this.f33a.mo138a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        int i = 0;
        int a = this.f33a.mo134a();
        boolean z = false;
        while (i < a) {
            if (!collection.contains(this.f33a.mo136a(i, 1))) {
                this.f33a.mo138a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final int size() {
        return this.f33a.mo134a();
    }

    public final Object[] toArray() {
        return this.f33a.m21b(1);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f33a.m18a(objArr, 1);
    }
}
