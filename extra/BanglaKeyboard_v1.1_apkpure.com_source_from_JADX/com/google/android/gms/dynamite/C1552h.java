package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

final class C1552h extends PathClassLoader {
    C1552h(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    protected final Class<?> loadClass(String str, boolean z) {
        if (!(str.startsWith("java.") || str.startsWith("android."))) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException e) {
            }
        }
        return super.loadClass(str, z);
    }
}
