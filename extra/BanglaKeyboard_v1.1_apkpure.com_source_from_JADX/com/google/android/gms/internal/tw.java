package com.google.android.gms.internal;

import java.util.Map.Entry;

final class tw implements Comparable<tw>, Entry<K, V> {
    private final K f7147a;
    private V f7148b;
    private /* synthetic */ tr f7149c;

    tw(tr trVar, K k, V v) {
        this.f7149c = trVar;
        this.f7147a = k;
        this.f7148b = v;
    }

    tw(tr trVar, Entry<K, V> entry) {
        this(trVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean m6686a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((tw) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m6686a(this.f7147a, entry.getKey()) && m6686a(this.f7148b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f7147a;
    }

    public final V getValue() {
        return this.f7148b;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f7147a == null ? 0 : this.f7147a.hashCode();
        if (this.f7148b != null) {
            i = this.f7148b.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f7149c.m6676d();
        V v2 = this.f7148b;
        this.f7148b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7147a);
        String valueOf2 = String.valueOf(this.f7148b);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }
}
