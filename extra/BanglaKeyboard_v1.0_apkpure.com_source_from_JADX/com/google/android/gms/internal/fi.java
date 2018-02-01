package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Locale;

public final class fi {
    private static final Object f1400a = new Object();
    private static String f1401b;

    public static String m1983a() {
        String str;
        synchronized (f1400a) {
            str = f1401b;
        }
        return str;
    }

    public static String m1984a(Context context, String str, String str2) {
        String str3;
        synchronized (f1400a) {
            if (f1401b == null && !TextUtils.isEmpty(str)) {
                try {
                    ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
                    Class cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
                    BigInteger bigInteger = new BigInteger(new byte[1]);
                    String[] split = str.split(",");
                    BigInteger bigInteger2 = bigInteger;
                    for (int i = 0; i < split.length; i++) {
                        if (fo.m2002a(classLoader, cls, split[i])) {
                            bigInteger2 = bigInteger2.setBit(i);
                        }
                    }
                    f1401b = String.format(Locale.US, "%X", new Object[]{bigInteger2});
                } catch (Throwable th) {
                    f1401b = "err";
                }
            }
            str3 = f1401b;
        }
        return str3;
    }
}
