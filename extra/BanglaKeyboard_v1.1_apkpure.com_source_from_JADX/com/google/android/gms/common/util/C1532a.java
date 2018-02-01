package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.lm;

public final class C1532a {
    public static boolean m3929a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (lm.m5976a(context).m5973a(str, 0).flags & 2097152) != 0;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
