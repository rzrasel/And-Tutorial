package com.bumptech.glide.p042h;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public final class C1163h {
    private static final char[] f3450a = "0123456789abcdef".toCharArray();
    private static final char[] f3451b = new char[64];
    private static final char[] f3452c = new char[40];

    static /* synthetic */ class C11621 {
        static final /* synthetic */ int[] f3449a = new int[Config.values().length];

        static {
            try {
                f3449a[Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f3449a[Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f3449a[Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f3449a[Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public static int m3149a(int i, int i2, Config config) {
        int i3;
        int i4 = i * i2;
        if (config == null) {
            config = Config.ARGB_8888;
        }
        switch (C11621.f3449a[config.ordinal()]) {
            case 1:
                i3 = 1;
                break;
            case 2:
            case 3:
                i3 = 2;
                break;
            default:
                i3 = 4;
                break;
        }
        return i3 * i4;
    }

    @TargetApi(19)
    public static int m3150a(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException e) {
            }
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    public static String m3151a(byte[] bArr) {
        String str;
        synchronized (f3451b) {
            char[] cArr = f3451b;
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] & 255;
                cArr[i * 2] = f3450a[i2 >>> 4];
                cArr[(i * 2) + 1] = f3450a[i2 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }

    public static <T> List<T> m3152a(Collection<T> collection) {
        List<T> arrayList = new ArrayList(collection.size());
        for (T add : collection) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static <T> Queue<T> m3153a(int i) {
        return new ArrayDeque(i);
    }

    public static void m3154a() {
        if (!C1163h.m3156b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean m3155a(int i, int i2) {
        return C1163h.m3157b(i) && C1163h.m3157b(i2);
    }

    public static boolean m3156b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean m3157b(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean m3158c() {
        return !C1163h.m3156b();
    }
}
