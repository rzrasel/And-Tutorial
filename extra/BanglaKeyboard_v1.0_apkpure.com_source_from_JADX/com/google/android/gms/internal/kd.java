package com.google.android.gms.internal;

public final class kd implements kc {
    private static kd f1883a;

    public static synchronized kc m2514b() {
        kc kcVar;
        synchronized (kd.class) {
            if (f1883a == null) {
                f1883a = new kd();
            }
            kcVar = f1883a;
        }
        return kcVar;
    }

    public final long mo937a() {
        return System.currentTimeMillis();
    }
}
