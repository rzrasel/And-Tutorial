package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class C1515s {
    private final List<String> f4583a;
    private final Object f4584b;

    private C1515s(Object obj) {
        this.f4584b = C1516t.m3860a(obj);
        this.f4583a = new ArrayList();
    }

    public final C1515s m3859a(String str, Object obj) {
        List list = this.f4583a;
        String str2 = (String) C1516t.m3860a((Object) str);
        String valueOf = String.valueOf(obj);
        list.add(new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length()).append(str2).append("=").append(valueOf).toString());
        return this;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder(100).append(this.f4584b.getClass().getSimpleName()).append('{');
        int size = this.f4583a.size();
        for (int i = 0; i < size; i++) {
            append.append((String) this.f4583a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
