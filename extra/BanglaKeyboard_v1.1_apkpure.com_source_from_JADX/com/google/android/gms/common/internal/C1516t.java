package com.google.android.gms.common.internal;

import android.text.TextUtils;
import com.google.android.gms.common.util.C1539h;

public final class C1516t {
    public static <T> T m3860a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    public static <T> T m3861a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String m3862a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String m3863a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void m3864a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m3865a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void m3866a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void m3867b(String str) {
        if (!C1539h.m3948a()) {
            throw new IllegalStateException(str);
        }
    }

    public static void m3868b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void m3869c(String str) {
        if (C1539h.m3948a()) {
            throw new IllegalStateException(str);
        }
    }
}
