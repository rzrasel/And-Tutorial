package com.google.android.gms.internal;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class rw<E> extends AbstractList<E> implements te<E> {
    boolean f7067a = true;

    rw() {
    }

    public final boolean mo2235a() {
        return this.f7067a;
    }

    public void add(int i, E e) {
        m6513c();
        super.add(i, e);
    }

    public boolean add(E e) {
        m6513c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        m6513c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        m6513c();
        return super.addAll(collection);
    }

    public final void mo2236b() {
        this.f7067a = false;
    }

    protected final void m6513c() {
        if (!this.f7067a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        m6513c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public E remove(int i) {
        m6513c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        m6513c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        m6513c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        m6513c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        m6513c();
        return super.set(i, e);
    }
}
