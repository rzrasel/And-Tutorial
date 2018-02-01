package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;

public final class C1536e {
    public static Boolean f4658a;
    public static Boolean f4659b;
    private static Boolean f4660c;

    @TargetApi(21)
    public static boolean m3938a(Context context) {
        if (f4660c == null) {
            boolean z = C1538g.m3945e() && context.getPackageManager().hasSystemFeature("cn.google");
            f4660c = Boolean.valueOf(z);
        }
        return f4660c.booleanValue();
    }
}
