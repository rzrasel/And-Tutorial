package com.google.android.gms.common.util;

import android.os.Build.VERSION;

public final class C1538g {
    public static boolean m3941a() {
        return VERSION.SDK_INT >= 15;
    }

    public static boolean m3942b() {
        return VERSION.SDK_INT >= 17;
    }

    public static boolean m3943c() {
        return VERSION.SDK_INT >= 18;
    }

    public static boolean m3944d() {
        return VERSION.SDK_INT >= 19;
    }

    public static boolean m3945e() {
        return VERSION.SDK_INT >= 21;
    }

    public static boolean m3946f() {
        return VERSION.SDK_INT >= 24;
    }

    public static boolean m3947g() {
        return VERSION.SDK_INT > 25 || "O".equals(VERSION.CODENAME) || VERSION.CODENAME.startsWith("OMR") || VERSION.CODENAME.startsWith("ODR");
    }
}
