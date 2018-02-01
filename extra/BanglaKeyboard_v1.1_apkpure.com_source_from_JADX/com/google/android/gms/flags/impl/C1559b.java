package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.lv;

public final class C1559b extends C1558a<Boolean> {
    public static Boolean m3983a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) lv.m5999a(new C1560c(sharedPreferences, str, bool));
        } catch (Exception e) {
            String str2 = "FlagDataUtils";
            String str3 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return bool;
        }
    }
}
