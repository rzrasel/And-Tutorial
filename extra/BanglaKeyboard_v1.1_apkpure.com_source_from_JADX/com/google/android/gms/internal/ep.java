package com.google.android.gms.internal;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.math.BigInteger;
import java.util.Locale;

@aqv
public final class ep {
    private static final Object f6063a = new Object();
    private static String f6064b;

    public static String m5368a() {
        String str;
        synchronized (f6063a) {
            str = f6064b;
        }
        return str;
    }

    public static String m5369a(Context context, String str, String str2) {
        String str3;
        synchronized (f6063a) {
            if (f6064b == null && !TextUtils.isEmpty(str)) {
                try {
                    ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
                    Class cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
                    BigInteger bigInteger = new BigInteger(new byte[1]);
                    String[] split = str.split(",");
                    BigInteger bigInteger2 = bigInteger;
                    for (int i = 0; i < split.length; i++) {
                        zzbv.zzea();
                        if (gb.m5462a(classLoader, cls, split[i])) {
                            bigInteger2 = bigInteger2.setBit(i);
                        }
                    }
                    f6064b = String.format(Locale.US, "%X", new Object[]{bigInteger2});
                } catch (Throwable th) {
                    f6064b = NotificationCompat.CATEGORY_ERROR;
                }
            }
            str3 = f6064b;
        }
        return str3;
    }
}
