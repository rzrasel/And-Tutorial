package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

final class tq<E> extends rw<E> {
    private static final tq<Object> f7137b;
    private final List<E> f7138c;

    static {
        rw tqVar = new tq();
        f7137b = tqVar;
        tqVar.f7067a = false;
    }

    tq() {
        this(new ArrayList(10));
    }

    private tq(List<E> list) {
        this.f7138c = list;
    }

    public static <E> tq<E> m6667d() {
        return f7137b;
    }

    public final /* synthetic */ te mo2284a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        List arrayList = new ArrayList(i);
        arrayList.addAll(this.f7138c);
        return new tq(arrayList);
    }

    public final void add(int i, E e) {
        m6513c();
        this.f7138c.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f7138c.get(i);
    }

    public final E remove(int i) {
        m6513c();
        E remove = this.f7138c.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        m6513c();
        E e2 = this.f7138c.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f7138c.size();
    }
}
