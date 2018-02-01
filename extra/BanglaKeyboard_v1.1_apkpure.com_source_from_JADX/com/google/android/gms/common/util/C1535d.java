package com.google.android.gms.common.util;

import android.os.SystemClock;

public final class C1535d implements C1533b {
    private static C1535d f4657a = new C1535d();

    private C1535d() {
    }

    public static C1533b m3934d() {
        return f4657a;
    }

    public final long mo1669a() {
        return System.currentTimeMillis();
    }

    public final long mo1670b() {
        return SystemClock.elapsedRealtime();
    }

    public final long mo1671c() {
        return System.nanoTime();
    }
}
