package com.google.android.gms.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class ty extends AbstractSet<Entry<K, V>> {
    private /* synthetic */ tr f7154a;

    private ty(tr trVar) {
        this.f7154a = trVar;
    }

    public final /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f7154a.m6678a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f7154a.clear();
    }

    public final boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f7154a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new tx(this.f7154a);
    }

    public final boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f7154a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f7154a.size();
    }
}
