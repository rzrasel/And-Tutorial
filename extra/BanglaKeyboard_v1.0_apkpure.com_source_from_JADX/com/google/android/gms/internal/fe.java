package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class fe implements SafeParcelable {
    private static final Object f705b = new Object();
    private static ClassLoader f706c = null;
    private static Integer f707d = null;
    public boolean f708a = false;

    private static ClassLoader mo701a() {
        ClassLoader classLoader;
        synchronized (f705b) {
            classLoader = f706c;
        }
        return classLoader;
    }

    private static boolean m1163a(Class cls) {
        boolean z = false;
        try {
            z = SafeParcelable.NULL.equals(cls.getField("NULL").get(null));
        } catch (NoSuchFieldException e) {
        } catch (IllegalAccessException e2) {
        }
        return z;
    }

    protected static boolean m1164b(String str) {
        ClassLoader a = mo701a();
        if (a == null) {
            return true;
        }
        try {
            return m1163a(a.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    protected static Integer m1165z() {
        Integer num;
        synchronized (f705b) {
            num = f707d;
        }
        return num;
    }
}
