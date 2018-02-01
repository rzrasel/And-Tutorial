package android.support.v4.p006a;

import android.graphics.Color;

public final class C0375a {
    private static final ThreadLocal<double[]> f1378a = new ThreadLocal();

    private static double m1068a(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((903.3d * d) + 16.0d) / 116.0d;
    }

    private static double m1069a(int i) {
        double[] a = C0375a.m1079a();
        C0375a.m1075a(Color.red(i), Color.green(i), Color.blue(i), a);
        return a[1] / 100.0d;
    }

    private static float m1070a(float f, float f2) {
        return f < 0.0f ? 0.0f : f <= f2 ? f : f2;
    }

    public static int m1071a(double d, double d2, double d3) {
        double[] a = C0375a.m1079a();
        double d4 = (16.0d + d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double pow = Math.pow(d5, 3.0d);
        d5 = pow > 0.008856d ? pow : ((116.0d * d5) - 16.0d) / 903.3d;
        pow = d > 7.9996247999999985d ? Math.pow(d4, 3.0d) : d / 903.3d;
        d4 = Math.pow(d6, 3.0d);
        if (d4 <= 0.008856d) {
            d4 = ((116.0d * d6) - 16.0d) / 903.3d;
        }
        a[0] = d5 * 95.047d;
        a[1] = pow * 100.0d;
        a[2] = d4 * 108.883d;
        pow = a[0];
        d4 = a[1];
        d5 = a[2];
        double d7 = (((3.2406d * pow) + (-1.5372d * d4)) + (-0.4986d * d5)) / 100.0d;
        d6 = (((-0.9689d * pow) + (1.8758d * d4)) + (0.0415d * d5)) / 100.0d;
        double d8 = (((pow * 0.0557d) + (d4 * -0.204d)) + (1.057d * d5)) / 100.0d;
        return Color.rgb(C0375a.m1080b((int) Math.round((d7 > 0.0031308d ? (1.055d * Math.pow(d7, 0.4166666666666667d)) - 0.055d : 12.92d * d7) * 255.0d)), C0375a.m1080b((int) Math.round((d6 > 0.0031308d ? (1.055d * Math.pow(d6, 0.4166666666666667d)) - 0.055d : 12.92d * d6) * 255.0d)), C0375a.m1080b((int) Math.round((d8 > 0.0031308d ? (1.055d * Math.pow(d8, 0.4166666666666667d)) - 0.055d : 12.92d * d8) * 255.0d)));
    }

    public static int m1072a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, C0375a.m1074a(Color.red(i), alpha2, Color.red(i2), alpha, i3), C0375a.m1074a(Color.green(i), alpha2, Color.green(i2), alpha, i3), C0375a.m1074a(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int m1073a(int i, int i2, float f) {
        int i3 = 0;
        int i4 = 255;
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        } else if (C0375a.m1082c(C0375a.m1081b(i, 255), i2) < ((double) f)) {
            return -1;
        } else {
            int i5 = 0;
            while (i5 <= 10 && i4 - i3 > 1) {
                int i6 = (i3 + i4) / 2;
                if (C0375a.m1082c(C0375a.m1081b(i, i6), i2) >= ((double) f)) {
                    i4 = i6;
                    i6 = i3;
                }
                i5++;
                i3 = i6;
            }
            return i4;
        }
    }

    private static int m1074a(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? 0 : (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    private static void m1075a(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) i) / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        d = ((double) i2) / 255.0d;
        double pow2 = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        d = ((double) i3) / 255.0d;
        d = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        dArr[0] = 100.0d * (((0.4124d * pow) + (0.3576d * pow2)) + (0.1805d * d));
        dArr[1] = 100.0d * (((0.2126d * pow) + (0.7152d * pow2)) + (0.0722d * d));
        dArr[2] = ((d * 0.9505d) + ((pow2 * 0.1192d) + (pow * 0.0193d))) * 100.0d;
    }

    public static void m1076a(int i, int i2, int i3, float[] fArr) {
        float f = ((float) i) / 255.0f;
        float f2 = ((float) i2) / 255.0f;
        float f3 = ((float) i3) / 255.0f;
        float max = Math.max(f, Math.max(f2, f3));
        float min = Math.min(f, Math.min(f2, f3));
        float f4 = max - min;
        float f5 = (max + min) / 2.0f;
        if (max == min) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f = max == f ? ((f2 - f3) / f4) % 6.0f : max == f2 ? ((f3 - f) / f4) + 2.0f : ((f - f2) / f4) + 4.0f;
            f2 = f4 / (1.0f - Math.abs((2.0f * f5) - 1.0f));
        }
        f = (f * 60.0f) % 360.0f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        fArr[0] = C0375a.m1070a(f, 360.0f);
        fArr[1] = C0375a.m1070a(f2, 1.0f);
        fArr[2] = C0375a.m1070a(f5, 1.0f);
    }

    public static void m1077a(int i, double[] dArr) {
        C0375a.m1075a(Color.red(i), Color.green(i), Color.blue(i), dArr);
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        d = C0375a.m1068a(d / 95.047d);
        d2 = C0375a.m1068a(d2 / 100.0d);
        d3 = C0375a.m1068a(d3 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * d2) - 16.0d);
        dArr[1] = (d - d2) * 500.0d;
        dArr[2] = (d2 - d3) * 200.0d;
    }

    public static void m1078a(int i, float[] fArr) {
        C0375a.m1076a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    private static double[] m1079a() {
        double[] dArr = (double[]) f1378a.get();
        if (dArr != null) {
            return dArr;
        }
        Object obj = new double[3];
        f1378a.set(obj);
        return obj;
    }

    private static int m1080b(int i) {
        return i < 0 ? 0 : i > 255 ? 255 : i;
    }

    public static int m1081b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (16777215 & i) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    private static double m1082c(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = C0375a.m1072a(i, i2);
        }
        double a = C0375a.m1069a(i) + 0.05d;
        double a2 = C0375a.m1069a(i2) + 0.05d;
        return Math.max(a, a2) / Math.min(a, a2);
    }
}
