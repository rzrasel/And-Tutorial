package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;

final class C0533r {
    public static int m3726a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException e) {
            "Invalid version number: " + VERSION.SDK;
            C0535t.m3730a();
            return 0;
        }
    }
}
