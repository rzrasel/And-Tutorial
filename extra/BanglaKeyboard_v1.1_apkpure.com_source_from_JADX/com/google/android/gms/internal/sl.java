package com.google.android.gms.internal;

final class sl {
    private static Class<?> f7096a = m6622b();

    public static sm m6621a() {
        if (f7096a != null) {
            try {
                return (sm) f7096a.getMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
            }
        }
        return sm.f7097a;
    }

    private static Class<?> m6622b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
