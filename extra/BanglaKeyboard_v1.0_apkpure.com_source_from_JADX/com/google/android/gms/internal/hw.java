package com.google.android.gms.internal;

public final class hw {
    public static void m2174a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    public static void m2175a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m2176a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
