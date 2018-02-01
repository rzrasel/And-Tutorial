package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.lv;

public final class C1565h extends C1558a<String> {
    public static String m3986a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) lv.m5999a(new C1566i(sharedPreferences, str, str2));
        } catch (Exception e) {
            String str3 = "FlagDataUtils";
            String str4 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            return str2;
        }
    }
}
