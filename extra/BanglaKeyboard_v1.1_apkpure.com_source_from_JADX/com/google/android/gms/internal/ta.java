package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class ta {
    static final Charset f7125a = Charset.forName("UTF-8");
    public static final byte[] f7126b;
    private static Charset f7127c = Charset.forName("ISO-8859-1");
    private static ByteBuffer f7128d;
    private static si f7129e = si.m6551a(f7126b);

    static {
        byte[] bArr = new byte[0];
        f7126b = bArr;
        f7128d = ByteBuffer.wrap(bArr);
    }

    static int m6655a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static <T> T m6656a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }
}
