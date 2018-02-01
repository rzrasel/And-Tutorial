package com.orange.studio.banglatype;

import android.graphics.BitmapFactory.Options;

public final class aj {
    static int f8133a;
    static int f8134b;

    static int m7294a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = f8133a > 0 ? f8133a : 1024;
        int i6 = f8134b > 0 ? f8134b : 1024;
        if (1024 > i5) {
            i = i5;
        }
        if (1024 > i6) {
            i5 = 1;
            i2 = i6;
        } else {
            i5 = 1;
        }
        while (true) {
            if (i3 / i5 <= i2 && i4 / i5 <= r7) {
                return i5;
            }
            i5 *= 2;
        }
    }
}
