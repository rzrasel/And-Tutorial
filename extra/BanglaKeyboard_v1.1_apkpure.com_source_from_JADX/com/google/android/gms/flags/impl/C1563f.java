package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.lv;

public final class C1563f extends C1558a<Long> {
    public static Long m3985a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) lv.m5999a(new C1564g(sharedPreferences, str, l));
        } catch (Exception e) {
            String str2 = "FlagDataUtils";
            String str3 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return l;
        }
    }
}
