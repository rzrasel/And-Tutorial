package com.google.android.gms.internal;

import android.support.v4.app.NotificationCompat;
import java.io.UnsupportedEncodingException;

public final class mw {
    private final byte[] f1956a;
    private final int f1957b;
    private int f1958c = 0;

    private mw(byte[] bArr, int i) {
        this.f1956a = bArr;
        this.f1957b = i + 0;
    }

    public static int m2631a(int i) {
        return m2640c(1) + m2635b(i);
    }

    public static int m2632a(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    private static int m2633a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return bytes.length + m2643e(bytes.length);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static mw m2634a(byte[] bArr, int i) {
        return new mw(bArr, i);
    }

    public static int m2635b(int i) {
        return i >= 0 ? m2643e(i) : 10;
    }

    public static int m2636b(int i, na naVar) {
        int c = m2640c(i);
        int a = naVar.mo699a();
        return c + (a + m2643e(a));
    }

    public static int m2637b(int i, String str) {
        return m2640c(i) + m2633a(str);
    }

    private void m2638b(int i, int i2) {
        m2653d(nd.m2666a(i, i2));
    }

    private void m2639b(long j) {
        while ((-128 & j) != 0) {
            m2644f((((int) j) & 127) | NotificationCompat.FLAG_HIGH_PRIORITY);
            j >>>= 7;
        }
        m2644f((int) j);
    }

    public static int m2640c(int i) {
        return m2643e(nd.m2666a(i, 0));
    }

    public static int m2641c(int i, long j) {
        return m2640c(i) + m2632a(m2642c(j));
    }

    private static long m2642c(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static int m2643e(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    private void m2644f(int i) {
        byte b = (byte) i;
        if (this.f1958c == this.f1957b) {
            throw new mx(this.f1958c, this.f1957b);
        }
        byte[] bArr = this.f1956a;
        int i2 = this.f1958c;
        this.f1958c = i2 + 1;
        bArr[i2] = b;
    }

    public final int m2645a() {
        return this.f1957b - this.f1958c;
    }

    public final void m2646a(int i, int i2) {
        m2638b(i, 0);
        if (i2 >= 0) {
            m2653d(i2);
        } else {
            m2639b((long) i2);
        }
    }

    public final void m2647a(int i, long j) {
        m2638b(i, 0);
        m2639b(j);
    }

    public final void m2648a(int i, na naVar) {
        m2638b(i, 2);
        m2653d(naVar.m1116c());
        naVar.mo697a(this);
    }

    public final void m2649a(int i, String str) {
        m2638b(i, 2);
        byte[] bytes = str.getBytes("UTF-8");
        m2653d(bytes.length);
        m2651a(bytes);
    }

    public final void m2650a(int i, boolean z) {
        int i2 = 0;
        m2638b(i, 0);
        if (z) {
            i2 = 1;
        }
        m2644f(i2);
    }

    public final void m2651a(byte[] bArr) {
        int length = bArr.length;
        if (this.f1957b - this.f1958c >= length) {
            System.arraycopy(bArr, 0, this.f1956a, this.f1958c, length);
            this.f1958c = length + this.f1958c;
            return;
        }
        throw new mx(this.f1958c, this.f1957b);
    }

    public final void m2652b(int i, long j) {
        m2638b(i, 0);
        m2639b(m2642c(j));
    }

    public final void m2653d(int i) {
        while ((i & -128) != 0) {
            m2644f((i & 127) | NotificationCompat.FLAG_HIGH_PRIORITY);
            i >>>= 7;
        }
        m2644f(i);
    }
}
