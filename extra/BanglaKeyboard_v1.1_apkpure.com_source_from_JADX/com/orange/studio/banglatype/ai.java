package com.orange.studio.banglatype;

import java.lang.reflect.Array;

public final class ai {
    public static int m7292a(int i, int i2) {
        return (i * 37) + i2;
    }

    public static int m7293a(int i, Object obj) {
        if (obj == null) {
            return m7292a(i, 0);
        }
        if (!obj.getClass().isArray()) {
            return m7292a(i, obj.hashCode());
        }
        int length = Array.getLength(obj);
        int i2 = 0;
        int i3 = i;
        while (i2 < length) {
            i = m7293a(i3, Array.get(obj, i2));
            i2++;
            i3 = i;
        }
        return i3;
    }
}
