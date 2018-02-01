package com.bumptech.glide.p042h;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

public final class C1158d {
    private static final double f3441a;

    static {
        double d = 1.0d;
        if (17 <= VERSION.SDK_INT) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f3441a = d;
    }

    public static double m3138a(long j) {
        return ((double) (C1158d.m3139a() - j)) * f3441a;
    }

    @TargetApi(17)
    public static long m3139a() {
        return 17 <= VERSION.SDK_INT ? SystemClock.elapsedRealtimeNanos() : System.currentTimeMillis();
    }
}
