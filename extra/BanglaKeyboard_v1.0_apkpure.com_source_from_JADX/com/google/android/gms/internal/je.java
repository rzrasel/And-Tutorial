package com.google.android.gms.internal;

import android.os.Looper;

public final class je {
    public static Object m2473a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static Object m2474a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void m2475a(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void m2476a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m2477a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void m2478b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m2479b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
