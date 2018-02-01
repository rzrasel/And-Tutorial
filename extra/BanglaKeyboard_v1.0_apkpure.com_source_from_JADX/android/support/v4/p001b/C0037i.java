package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class C0037i implements Set {
    final /* synthetic */ C0030f f28a;

    C0037i(C0030f c0030f) {
        this.f28a = c0030f;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f28a.mo142c();
    }

    public final boolean contains(Object obj) {
        return this.f28a.mo135a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        Map b = this.f28a.mo141b();
        for (Object containsKey : collection) {
            if (!b.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return C0030f.m11a((Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int a = this.f28a.mo134a() - 1; a >= 0; a--) {
            Object a2 = this.f28a.mo136a(a, 0);
            i += a2 == null ? 0 : a2.hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f28a.mo134a() == 0;
    }

    public final Iterator iterator() {
        return new C0035g(this.f28a, 0);
    }

    public final boolean remove(Object obj) {
        int a = this.f28a.mo135a(obj);
        if (a < 0) {
            return false;
        }
        this.f28a.mo138a(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        Map b = this.f28a.mo141b();
        int size = b.size();
        for (Object remove : collection) {
            b.remove(remove);
        }
        return size != b.size();
    }

    public final boolean retainAll(Collection collection) {
        Map b = this.f28a.mo141b();
        int size = b.size();
        Iterator it = b.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != b.size();
    }

    public final int size() {
        return this.f28a.mo134a();
    }

    public final Object[] toArray() {
        return this.f28a.m21b(0);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f28a.m18a(objArr, 0);
    }
}
