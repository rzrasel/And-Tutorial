package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class tx implements Iterator<Entry<K, V>> {
    private int f7150a;
    private boolean f7151b;
    private Iterator<Entry<K, V>> f7152c;
    private /* synthetic */ tr f7153d;

    private tx(tr trVar) {
        this.f7153d = trVar;
        this.f7150a = -1;
    }

    private final Iterator<Entry<K, V>> m6687a() {
        if (this.f7152c == null) {
            this.f7152c = this.f7153d.f7142d.entrySet().iterator();
        }
        return this.f7152c;
    }

    public final boolean hasNext() {
        return this.f7150a + 1 < this.f7153d.f7141c.size() || m6687a().hasNext();
    }

    public final /* synthetic */ Object next() {
        this.f7151b = true;
        int i = this.f7150a + 1;
        this.f7150a = i;
        return i < this.f7153d.f7141c.size() ? (Entry) this.f7153d.f7141c.get(this.f7150a) : (Entry) m6687a().next();
    }

    public final void remove() {
        if (this.f7151b) {
            this.f7151b = false;
            this.f7153d.m6676d();
            if (this.f7150a < this.f7153d.f7141c.size()) {
                tr trVar = this.f7153d;
                int i = this.f7150a;
                this.f7150a = i - 1;
                trVar.m6674c(i);
                return;
            }
            m6687a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
