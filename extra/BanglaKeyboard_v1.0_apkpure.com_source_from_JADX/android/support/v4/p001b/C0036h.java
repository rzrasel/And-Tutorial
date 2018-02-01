package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class C0036h implements Set {
    final /* synthetic */ C0030f f27a;

    C0036h(C0030f c0030f) {
        this.f27a = c0030f;
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        int a = this.f27a.mo134a();
        for (Entry entry : collection) {
            this.f27a.mo139a(entry.getKey(), entry.getValue());
        }
        return a != this.f27a.mo134a();
    }

    public final void clear() {
        this.f27a.mo142c();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        int a = this.f27a.mo135a(entry.getKey());
        return a >= 0 ? C0032c.m34a(this.f27a.mo136a(a, 1), entry.getValue()) : false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return C0030f.m11a((Set) this, obj);
    }

    public final int hashCode() {
        int a = this.f27a.mo134a() - 1;
        int i = 0;
        while (a >= 0) {
            Object a2 = this.f27a.mo136a(a, 0);
            Object a3 = this.f27a.mo136a(a, 1);
            a--;
            i += (a3 == null ? 0 : a3.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f27a.mo134a() == 0;
    }

    public final Iterator iterator() {
        return new C0038j(this.f27a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f27a.mo134a();
    }

    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
