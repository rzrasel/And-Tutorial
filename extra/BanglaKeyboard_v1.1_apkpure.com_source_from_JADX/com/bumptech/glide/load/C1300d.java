package com.bumptech.glide.load;

import com.bumptech.glide.load.p044b.C1241l;
import java.util.Arrays;
import java.util.Collection;

public final class C1300d<T> implements C1299g<T> {
    private final Collection<? extends C1299g<T>> f3685a;
    private String f3686b;

    @SafeVarargs
    public C1300d(C1299g<T>... c1299gArr) {
        if (c1299gArr.length <= 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f3685a = Arrays.asList(c1299gArr);
    }

    public final C1241l<T> mo1379a(C1241l<T> c1241l, int i, int i2) {
        C1241l<T> c1241l2 = c1241l;
        for (C1299g a : this.f3685a) {
            C1241l<T> a2 = a.mo1379a(c1241l2, i, i2);
            if (!(c1241l2 == null || c1241l2.equals(c1241l) || c1241l2.equals(a2))) {
                c1241l2.mo1369c();
            }
            c1241l2 = a2;
        }
        return c1241l2;
    }

    public final String mo1380a() {
        if (this.f3686b == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (C1299g a : this.f3685a) {
                stringBuilder.append(a.mo1380a());
            }
            this.f3686b = stringBuilder.toString();
        }
        return this.f3686b;
    }
}
