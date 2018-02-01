package com.google.android.gms.internal;

import java.util.Map.Entry;

final class ti<K> implements Entry<K, Object> {
    private Entry<K, th> f7135a;

    private ti(Entry<K, th> entry) {
        this.f7135a = entry;
    }

    public final K getKey() {
        return this.f7135a.getKey();
    }

    public final Object getValue() {
        return ((th) this.f7135a.getValue()) == null ? null : th.m6663a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof tl) {
            th thVar = (th) this.f7135a.getValue();
            tl tlVar = (tl) obj;
            tl tlVar2 = thVar.f7133b;
            thVar.f7132a = null;
            thVar.f7134c = null;
            thVar.f7133b = tlVar;
            return tlVar2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
