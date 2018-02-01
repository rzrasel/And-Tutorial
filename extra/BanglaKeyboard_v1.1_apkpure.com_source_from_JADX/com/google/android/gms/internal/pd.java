package com.google.android.gms.internal;

import android.os.Looper;
import android.util.DisplayMetrics;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.UUID;

public final class pd {
    private static final char[] f6948a = "0123456789abcdef".toCharArray();

    public static long m6371a(double d, int i, DisplayMetrics displayMetrics) {
        return Math.round((((double) i) * d) / ((double) displayMetrics.density));
    }

    public static Long m6372a() {
        return Long.valueOf(Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")).getTime().getTime());
    }

    public static String m6373a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return lp.m5984a(bArr, true);
    }

    public static String m6374a(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean m6375a(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static boolean m6376b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean m6377b(String str) {
        return str == null || str.isEmpty();
    }
}
