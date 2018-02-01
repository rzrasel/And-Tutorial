package com.google.android.gms.internal;

import android.util.Log;

public final class gb {
    public static void m2069a(String str) {
        if (m2071a(5)) {
            Log.w("Ads", str);
        }
    }

    public static void m2070a(String str, Throwable th) {
        if (m2071a(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static boolean m2071a(int i) {
        return (i >= 5 || Log.isLoggable("Ads", i)) && i != 2;
    }
}
