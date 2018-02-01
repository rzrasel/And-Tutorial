package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class tj<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> f7136a;

    public tj(Iterator<Entry<K, Object>> it) {
        this.f7136a = it;
    }

    public final boolean hasNext() {
        return this.f7136a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f7136a.next();
        return entry.getValue() instanceof th ? new ti(entry) : entry;
    }

    public final void remove() {
        this.f7136a.remove();
    }
}
