package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class jc {
    private final List f1845a;
    private final Object f1846b;

    private jc(Object obj) {
        this.f1846b = je.m2473a(obj);
        this.f1845a = new ArrayList();
    }

    public final jc m2471a(String str, Object obj) {
        this.f1845a.add(((String) je.m2473a((Object) str)) + "=" + String.valueOf(obj));
        return this;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder(100).append(this.f1846b.getClass().getSimpleName()).append('{');
        int size = this.f1845a.size();
        for (int i = 0; i < size; i++) {
            append.append((String) this.f1845a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
