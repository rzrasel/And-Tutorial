package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.lv;

public final class C1567j {
    private static SharedPreferences f4699a = null;

    public static SharedPreferences m3987a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f4699a == null) {
                f4699a = (SharedPreferences) lv.m5999a(new C1568k(context));
            }
            sharedPreferences = f4699a;
        }
        return sharedPreferences;
    }
}
