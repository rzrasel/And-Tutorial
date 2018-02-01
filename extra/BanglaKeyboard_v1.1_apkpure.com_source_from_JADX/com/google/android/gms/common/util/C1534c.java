package com.google.android.gms.common.util;

import android.support.v4.p018f.C0478a;
import java.util.HashMap;
import java.util.Map;

public final class C1534c {
    public static <K, V> Map<K, V> m3933a(int i) {
        return i <= 256 ? new C0478a(i) : new HashMap(i, 1.0f);
    }
}
