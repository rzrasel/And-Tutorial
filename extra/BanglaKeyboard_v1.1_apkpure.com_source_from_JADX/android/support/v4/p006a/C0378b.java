package android.support.v4.p006a;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

public final class C0378b {

    private static class C0376a {
        int f1379a;
        boolean f1380b;

        C0376a() {
        }
    }

    public static class C0377b {
        public char f1381a;
        public float[] f1382b;

        C0377b(char c, float[] fArr) {
            this.f1381a = c;
            this.f1382b = fArr;
        }

        C0377b(C0377b c0377b) {
            this.f1381a = c0377b.f1381a;
            this.f1382b = C0378b.m1091a(c0377b.f1382b, c0377b.f1382b.length);
        }

        private static void m1083a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            int ceil = (int) Math.ceil(Math.abs((4.0d * d9) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d10 = (((-d3) * cos) * sin2) - ((d4 * sin) * cos2);
            double d11 = d9 / ((double) ceil);
            int i = 0;
            cos2 = (sin2 * ((-d3) * sin)) + (cos2 * (d4 * cos));
            sin2 = d10;
            while (i < ceil) {
                double d12 = d8 + d11;
                d10 = Math.sin(d12);
                double cos3 = Math.cos(d12);
                double d13 = (((d3 * cos) * cos3) + d) - ((d4 * sin) * d10);
                double d14 = ((d4 * cos) * d10) + (((d3 * sin) * cos3) + d2);
                double d15 = (((-d3) * cos) * d10) - ((d4 * sin) * cos3);
                cos3 = (cos3 * (d4 * cos)) + (d10 * ((-d3) * sin));
                d10 = Math.tan((d12 - d8) / 2.0d);
                d10 = ((Math.sqrt((d10 * (3.0d * d10)) + 4.0d) - 1.0d) * Math.sin(d12 - d8)) / 3.0d;
                sin2 = (sin2 * d10) + d5;
                double d16 = d6 + (cos2 * d10);
                double d17 = d13 - (d10 * d15);
                d10 = d14 - (d10 * cos3);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) sin2, (float) d16, (float) d17, (float) d10, (float) d13, (float) d14);
                i++;
                sin2 = d15;
                d8 = d12;
                d6 = d14;
                d5 = d13;
                cos2 = cos3;
            }
        }

        private static void m1084a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double toRadians;
            double cos;
            double sin;
            double d;
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            double d7;
            double d8;
            double d9;
            Path path2 = path;
            while (true) {
                toRadians = Math.toRadians((double) f7);
                cos = Math.cos(toRadians);
                sin = Math.sin(toRadians);
                d = ((((double) f) * cos) + (((double) f2) * sin)) / ((double) f5);
                d2 = ((((double) (-f)) * sin) + (((double) f2) * cos)) / ((double) f6);
                d3 = ((((double) f3) * cos) + (((double) f4) * sin)) / ((double) f5);
                d4 = ((((double) (-f3)) * sin) + (((double) f4) * cos)) / ((double) f6);
                d5 = d - d3;
                d6 = d2 - d4;
                d7 = (d + d3) / 2.0d;
                double d10 = (d2 + d4) / 2.0d;
                d8 = (d5 * d5) + (d6 * d6);
                if (d8 != 0.0d) {
                    d9 = (1.0d / d8) - 0.25d;
                    if (d9 >= 0.0d) {
                        break;
                    }
                    Log.w("PathParser", "Points are too far apart " + d8);
                    float sqrt = (float) (Math.sqrt(d8) / 1.99999d);
                    f5 *= sqrt;
                    f6 *= sqrt;
                } else {
                    Log.w("PathParser", " Points are coincident");
                    return;
                }
            }
            d8 = Math.sqrt(d9);
            d5 *= d8;
            d6 *= d8;
            if (z == z2) {
                d6 = d7 - d6;
                d5 += d10;
            } else {
                d6 += d7;
                d5 = d10 - d5;
            }
            d7 = Math.atan2(d2 - d5, d - d6);
            d3 = Math.atan2(d4 - d5, d3 - d6) - d7;
            if (z2 != (d3 >= 0.0d)) {
                d3 = d3 > 0.0d ? d3 - 6.283185307179586d : d3 + 6.283185307179586d;
            }
            d6 *= (double) f5;
            d = ((double) f6) * d5;
            C0377b.m1083a(path2, (d6 * cos) - (d * sin), (d6 * sin) + (cos * d), (double) f5, (double) f6, (double) f, (double) f2, toRadians, d7, d3);
        }

        public static void m1085a(C0377b[] c0377bArr, Path path) {
            float[] fArr = new float[6];
            int i = 0;
            char c = 'm';
            while (i < c0377bArr.length) {
                int i2;
                char c2 = c0377bArr[i].f1381a;
                float[] fArr2 = c0377bArr[i].f1382b;
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = fArr[5];
                switch (c2) {
                    case 'A':
                    case 'a':
                        i2 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i2 = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i2 = 1;
                        break;
                    case 'L':
                    case 'M':
                    case 'T':
                    case 'l':
                    case 'm':
                    case 't':
                        i2 = 2;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i2 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f5, f6);
                        f4 = f6;
                        f3 = f5;
                        f2 = f6;
                        f = f5;
                        i2 = 2;
                        break;
                    default:
                        i2 = 2;
                        break;
                }
                int i3 = 0;
                float f7 = f6;
                float f8 = f5;
                float f9 = f2;
                float f10 = f;
                while (i3 < fArr2.length) {
                    switch (c2) {
                        case 'A':
                            C0377b.m1084a(path, f10, f9, fArr2[i3 + 5], fArr2[i3 + 6], fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                            f3 = fArr2[i3 + 5];
                            f4 = fArr2[i3 + 6];
                            f6 = f7;
                            f5 = f8;
                            f2 = f4;
                            f = f3;
                            break;
                        case 'C':
                            path.cubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3], fArr2[i3 + 4], fArr2[i3 + 5]);
                            f5 = fArr2[i3 + 4];
                            f6 = fArr2[i3 + 5];
                            f3 = fArr2[i3 + 2];
                            f4 = fArr2[i3 + 3];
                            f2 = f6;
                            f = f5;
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 'H':
                            path.lineTo(fArr2[i3 + 0], f9);
                            f6 = f7;
                            f2 = f9;
                            f = fArr2[i3 + 0];
                            f5 = f8;
                            break;
                        case 'L':
                            path.lineTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                            f5 = fArr2[i3 + 0];
                            f2 = fArr2[i3 + 1];
                            f = f5;
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 'M':
                            f5 = fArr2[i3 + 0];
                            f6 = fArr2[i3 + 1];
                            if (i3 <= 0) {
                                path.moveTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                                f2 = f6;
                                f = f5;
                                break;
                            }
                            path.lineTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                            f2 = f6;
                            f = f5;
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 'Q':
                            path.quadTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3]);
                            f3 = fArr2[i3 + 0];
                            f4 = fArr2[i3 + 1];
                            f5 = fArr2[i3 + 2];
                            f2 = fArr2[i3 + 3];
                            f = f5;
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 'S':
                            if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                f6 = (2.0f * f9) - f4;
                                f4 = (2.0f * f10) - f3;
                            } else {
                                f6 = f9;
                                f4 = f10;
                            }
                            path.cubicTo(f4, f6, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3]);
                            f3 = fArr2[i3 + 0];
                            f4 = fArr2[i3 + 1];
                            f5 = fArr2[i3 + 2];
                            f2 = fArr2[i3 + 3];
                            f = f5;
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 'T':
                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                f10 = (2.0f * f10) - f3;
                                f9 = (2.0f * f9) - f4;
                            }
                            path.quadTo(f10, f9, fArr2[i3 + 0], fArr2[i3 + 1]);
                            f5 = fArr2[i3 + 0];
                            f4 = f9;
                            f3 = f10;
                            f2 = fArr2[i3 + 1];
                            f = f5;
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 'V':
                            path.lineTo(f10, fArr2[i3 + 0]);
                            f5 = f8;
                            f2 = fArr2[i3 + 0];
                            f = f10;
                            f6 = f7;
                            break;
                        case 'a':
                            C0377b.m1084a(path, f10, f9, fArr2[i3 + 5] + f10, fArr2[i3 + 6] + f9, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                            f3 = f10 + fArr2[i3 + 5];
                            f4 = f9 + fArr2[i3 + 6];
                            f6 = f7;
                            f5 = f8;
                            f2 = f4;
                            f = f3;
                            break;
                        case 'c':
                            path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3], fArr2[i3 + 4], fArr2[i3 + 5]);
                            f3 = f10 + fArr2[i3 + 2];
                            f4 = f9 + fArr2[i3 + 3];
                            f2 = f9 + fArr2[i3 + 5];
                            f = f10 + fArr2[i3 + 4];
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 'h':
                            path.rLineTo(fArr2[i3 + 0], 0.0f);
                            f6 = f7;
                            f2 = f9;
                            f = f10 + fArr2[i3 + 0];
                            f5 = f8;
                            break;
                        case 'l':
                            path.rLineTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                            f2 = f9 + fArr2[i3 + 1];
                            f = f10 + fArr2[i3 + 0];
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 'm':
                            f5 = f10 + fArr2[i3 + 0];
                            f6 = f9 + fArr2[i3 + 1];
                            if (i3 <= 0) {
                                path.rMoveTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                                f2 = f6;
                                f = f5;
                                break;
                            }
                            path.rLineTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                            f2 = f6;
                            f = f5;
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 'q':
                            path.rQuadTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3]);
                            f3 = f10 + fArr2[i3 + 0];
                            f4 = f9 + fArr2[i3 + 1];
                            f2 = f9 + fArr2[i3 + 3];
                            f = f10 + fArr2[i3 + 2];
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 's':
                            f6 = 0.0f;
                            if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                f6 = f9 - f4;
                                f4 = f10 - f3;
                            } else {
                                f4 = 0.0f;
                            }
                            path.rCubicTo(f4, f6, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3]);
                            f3 = f10 + fArr2[i3 + 0];
                            f4 = f9 + fArr2[i3 + 1];
                            f2 = f9 + fArr2[i3 + 3];
                            f = f10 + fArr2[i3 + 2];
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 't':
                            float f11;
                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                f11 = f9 - f4;
                                f4 = f10 - f3;
                            } else {
                                f11 = 0.0f;
                                f4 = 0.0f;
                            }
                            path.rQuadTo(f4, f11, fArr2[i3 + 0], fArr2[i3 + 1]);
                            f3 = f10 + f4;
                            f4 = f9 + f11;
                            f2 = f9 + fArr2[i3 + 1];
                            f = f10 + fArr2[i3 + 0];
                            f6 = f7;
                            f5 = f8;
                            break;
                        case 'v':
                            path.rLineTo(0.0f, fArr2[i3 + 0]);
                            f5 = f8;
                            f2 = f9 + fArr2[i3 + 0];
                            f = f10;
                            f6 = f7;
                            break;
                        default:
                            f6 = f7;
                            f5 = f8;
                            f2 = f9;
                            f = f10;
                            break;
                    }
                    i3 += i2;
                    f7 = f6;
                    f8 = f5;
                    f9 = f2;
                    f10 = f;
                    c = c2;
                }
                fArr[0] = f10;
                fArr[1] = f9;
                fArr[2] = f3;
                fArr[3] = f4;
                fArr[4] = f8;
                fArr[5] = f7;
                char c3 = c0377bArr[i].f1381a;
                i++;
                c = c3;
            }
        }

        public final void m1086a(C0377b c0377b, C0377b c0377b2, float f) {
            for (int i = 0; i < c0377b.f1382b.length; i++) {
                this.f1382b[i] = (c0377b.f1382b[i] * (1.0f - f)) + (c0377b2.f1382b[i] * f);
            }
        }
    }

    private static int m1087a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    public static Path m1088a(String str) {
        Path path = new Path();
        C0377b[] b = C0378b.m1093b(str);
        if (b == null) {
            return null;
        }
        try {
            C0377b.m1085a(b, path);
            return path;
        } catch (Throwable e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    private static void m1089a(ArrayList<C0377b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0377b(c, fArr));
    }

    public static boolean m1090a(C0377b[] c0377bArr, C0377b[] c0377bArr2) {
        if (c0377bArr == null || c0377bArr2 == null || c0377bArr.length != c0377bArr2.length) {
            return false;
        }
        int i = 0;
        while (i < c0377bArr.length) {
            if (c0377bArr[i].f1381a != c0377bArr2[i].f1381a || c0377bArr[i].f1382b.length != c0377bArr2[i].f1382b.length) {
                return false;
            }
            i++;
        }
        return true;
    }

    static float[] m1091a(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i + 0;
        length = Math.min(i2, length + 0);
        Object obj = new float[i2];
        System.arraycopy(fArr, 0, obj, 0, length);
        return obj;
    }

    public static C0377b[] m1092a(C0377b[] c0377bArr) {
        if (c0377bArr == null) {
            return null;
        }
        C0377b[] c0377bArr2 = new C0377b[c0377bArr.length];
        for (int i = 0; i < c0377bArr.length; i++) {
            c0377bArr2[i] = new C0377b(c0377bArr[i]);
        }
        return c0377bArr2;
    }

    public static C0377b[] m1093b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a = C0378b.m1087a(str, i);
            String trim = str.substring(i2, a).trim();
            if (trim.length() > 0) {
                C0378b.m1089a(arrayList, trim.charAt(0), C0378b.m1094c(trim));
            }
            i = a + 1;
            i2 = a;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            C0378b.m1089a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0377b[]) arrayList.toArray(new C0377b[arrayList.size()]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] m1094c(java.lang.String r13) {
        /*
        r3 = 1;
        r2 = 0;
        r0 = r13.charAt(r2);
        r1 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r0 == r1) goto L_0x0012;
    L_0x000a:
        r0 = r13.charAt(r2);
        r1 = 90;
        if (r0 != r1) goto L_0x0015;
    L_0x0012:
        r0 = new float[r2];
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = r13.length();	 Catch:{ NumberFormatException -> 0x008a }
        r8 = new float[r0];	 Catch:{ NumberFormatException -> 0x008a }
        r9 = new android.support.v4.a.b$a;	 Catch:{ NumberFormatException -> 0x008a }
        r9.<init>();	 Catch:{ NumberFormatException -> 0x008a }
        r10 = r13.length();	 Catch:{ NumberFormatException -> 0x008a }
        r7 = r3;
        r1 = r2;
    L_0x0026:
        if (r7 >= r10) goto L_0x0085;
    L_0x0028:
        r0 = 0;
        r9.f1380b = r0;	 Catch:{ NumberFormatException -> 0x008a }
        r5 = r2;
        r0 = r2;
        r4 = r2;
        r6 = r7;
    L_0x002f:
        r11 = r13.length();	 Catch:{ NumberFormatException -> 0x008a }
        if (r6 >= r11) goto L_0x0068;
    L_0x0035:
        r11 = r13.charAt(r6);	 Catch:{ NumberFormatException -> 0x008a }
        switch(r11) {
            case 32: goto L_0x0048;
            case 44: goto L_0x0048;
            case 45: goto L_0x004c;
            case 46: goto L_0x0057;
            case 69: goto L_0x0064;
            case 101: goto L_0x0064;
            default: goto L_0x003c;
        };	 Catch:{ NumberFormatException -> 0x008a }
    L_0x003c:
        r5 = r4;
        r4 = r0;
        r0 = r2;
    L_0x003f:
        if (r5 != 0) goto L_0x0068;
    L_0x0041:
        r6 = r6 + 1;
        r12 = r0;
        r0 = r4;
        r4 = r5;
        r5 = r12;
        goto L_0x002f;
    L_0x0048:
        r4 = r0;
        r5 = r3;
        r0 = r2;
        goto L_0x003f;
    L_0x004c:
        if (r6 == r7) goto L_0x003c;
    L_0x004e:
        if (r5 != 0) goto L_0x003c;
    L_0x0050:
        r4 = 1;
        r9.f1380b = r4;	 Catch:{ NumberFormatException -> 0x008a }
        r4 = r0;
        r5 = r3;
        r0 = r2;
        goto L_0x003f;
    L_0x0057:
        if (r0 != 0) goto L_0x005d;
    L_0x0059:
        r0 = r2;
        r5 = r4;
        r4 = r3;
        goto L_0x003f;
    L_0x005d:
        r4 = 1;
        r9.f1380b = r4;	 Catch:{ NumberFormatException -> 0x008a }
        r4 = r0;
        r5 = r3;
        r0 = r2;
        goto L_0x003f;
    L_0x0064:
        r5 = r4;
        r4 = r0;
        r0 = r3;
        goto L_0x003f;
    L_0x0068:
        r9.f1379a = r6;	 Catch:{ NumberFormatException -> 0x008a }
        r4 = r9.f1379a;	 Catch:{ NumberFormatException -> 0x008a }
        if (r7 >= r4) goto L_0x00a6;
    L_0x006e:
        r0 = r1 + 1;
        r5 = r13.substring(r7, r4);	 Catch:{ NumberFormatException -> 0x008a }
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x008a }
        r8[r1] = r5;	 Catch:{ NumberFormatException -> 0x008a }
    L_0x007a:
        r1 = r9.f1380b;	 Catch:{ NumberFormatException -> 0x008a }
        if (r1 == 0) goto L_0x0081;
    L_0x007e:
        r7 = r4;
        r1 = r0;
        goto L_0x0026;
    L_0x0081:
        r7 = r4 + 1;
        r1 = r0;
        goto L_0x0026;
    L_0x0085:
        r0 = android.support.v4.p006a.C0378b.m1091a(r8, r1);	 Catch:{ NumberFormatException -> 0x008a }
        goto L_0x0014;
    L_0x008a:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r3 = "error in parsing \"";
        r2.<init>(r3);
        r2 = r2.append(r13);
        r3 = "\"";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x00a6:
        r0 = r1;
        goto L_0x007a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.b.c(java.lang.String):float[]");
    }
}
