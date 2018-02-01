package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class sm {
    static final sm f7097a = new sm((byte) 0);
    private static volatile boolean f7098b = false;
    private static final Class<?> f7099c = m6624b();
    private final Map<Object, Object> f7100d;

    sm() {
        this.f7100d = new HashMap();
    }

    private sm(byte b) {
        this.f7100d = Collections.emptyMap();
    }

    public static sm m6623a() {
        return sl.m6621a();
    }

    private static Class<?> m6624b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
