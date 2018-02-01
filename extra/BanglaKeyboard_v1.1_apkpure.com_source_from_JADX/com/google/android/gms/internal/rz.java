package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class rz implements Iterator {
    private int f7071a = 0;
    private final int f7072b = this.f7073c.mo2239a();
    private /* synthetic */ ry f7073c;

    rz(ry ryVar) {
        this.f7073c = ryVar;
    }

    private final byte m6530a() {
        try {
            ry ryVar = this.f7073c;
            int i = this.f7071a;
            this.f7071a = i + 1;
            return ryVar.mo2238a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f7071a < this.f7072b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(m6530a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
