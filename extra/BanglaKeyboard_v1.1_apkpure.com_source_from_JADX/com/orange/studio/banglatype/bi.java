package com.orange.studio.banglatype;

import android.support.v4.p006a.C0375a;
import android.support.v7.p012d.C0872b;
import android.support.v7.p012d.C0872b.C0868b;
import android.support.v7.p012d.C0872b.C0871c;
import android.support.v7.p012d.C0874c;
import android.support.v7.p012d.C0874c.C0873a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class bi {
    public static final C0874c f8205a = new C0873a().m2557i(1.0f).m2555g(0.0f).m2556h(0.0f).m2548a().f2674a;
    public static final C0874c f8206b = new C0873a().m2552d(0.0f).m2553e(0.26f).m2554f(0.45f).m2549a(0.3f).m2550b(0.7f).m2551c(1.0f).m2557i(0.45f).m2555g(0.15f).m2556h(0.4f).m2548a().f2674a;
    public static final C0874c f8207c = new C0873a().m2552d(0.5f).m2553e(0.74f).m2554f(1.0f).m2549a(0.3f).m2550b(0.7f).m2551c(1.0f).m2557i(0.45f).m2555g(0.15f).m2556h(0.4f).m2548a().f2674a;
    public static final C0874c f8208d = new C0873a().m2552d(0.3f).m2553e(0.5f).m2554f(0.7f).m2549a(0.35f).m2550b(1.0f).m2551c(1.0f).m2557i(0.4f).m2555g(0.4f).m2556h(0.2f).m2548a().f2674a;
    public static final C0874c f8209e = new C0873a().m2552d(0.3f).m2553e(0.5f).m2554f(0.7f).m2549a(0.0f).m2550b(0.3f).m2551c(0.4f).m2557i(0.4f).m2555g(0.4f).m2556h(0.2f).m2548a().f2674a;
    public static final C0874c f8210f = new C0873a().m2552d(0.0f).m2553e(0.26f).m2554f(0.5f).m2549a(0.1f).m2550b(0.6f).m2551c(1.0f).m2557i(0.18f).m2555g(0.22f).m2556h(0.6f).m2548a().f2674a;
    public static final C0874c f8211g = new C0873a().m2552d(0.5f).m2553e(0.74f).m2554f(1.0f).m2549a(0.1f).m2550b(0.7f).m2551c(1.0f).m2557i(0.18f).m2555g(0.22f).m2556h(0.6f).m2548a().f2674a;
    public static final C0874c f8212h = new C0873a().m2552d(0.2f).m2553e(0.5f).m2554f(0.8f).m2549a(0.1f).m2550b(0.6f).m2551c(1.0f).m2557i(0.18f).m2555g(0.22f).m2556h(0.6f).m2548a().f2674a;
    public static final C0868b f8213i = new C17101();
    static int f8214j = 0;
    static boolean f8215k = false;
    private static double[] f8216l;
    private static double[] f8217m;

    static class C17101 implements C0868b {
        C17101() {
        }

        public final boolean mo847a(float[] fArr) {
            boolean z = fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
            return !z;
        }
    }

    static class C17112 implements Comparator<C0871c> {
        C17112() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return Integer.compare(((C0871c) obj2).f2660b, ((C0871c) obj).f2660b);
        }
    }

    static class C17123 implements Comparator<C0871c> {
        C17123() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return Integer.compare(((C0871c) obj).f2660b, ((C0871c) obj2).f2660b);
        }
    }

    private static int m7382a(int i, boolean z) {
        double[] dArr;
        int i2;
        if (z) {
            if (f8217m == null) {
                f8217m = m7387a(true);
            }
            dArr = f8217m;
        } else {
            if (f8216l == null) {
                f8216l = m7387a(false);
            }
            dArr = f8216l;
        }
        double d = Double.MAX_VALUE;
        int i3 = -1;
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        C0375a.m1077a(i, dArr2);
        for (i2 = 0; i2 < dArr.length; i2 += 3) {
            dArr3[0] = dArr[i2 + 0];
            dArr3[1] = dArr[i2 + 1];
            dArr3[2] = dArr[i2 + 2];
            double pow = (Math.pow(dArr2[0] - dArr3[0], 2.0d) + Math.pow(dArr2[1] - dArr3[1], 2.0d)) + Math.pow(dArr2[2] - dArr3[2], 2.0d);
            if (pow < d) {
                i3 = i2;
                d = pow;
            }
        }
        double d2 = Double.MAX_VALUE;
        i2 = -1;
        int i4 = 0;
        while (i4 < dArr.length) {
            dArr3[0] = dArr[i4 + 0];
            dArr3[1] = dArr[i4 + 1];
            dArr3[2] = dArr[i4 + 2];
            pow = Math.sqrt((Math.pow(dArr2[0] - dArr3[0], 2.0d) + Math.pow(dArr2[1] - dArr3[1], 2.0d)) + Math.pow(dArr2[2] - dArr3[2], 2.0d));
            if (pow < d2) {
                i2 = i4;
            } else {
                pow = d2;
            }
            i4 += 3;
            d2 = pow;
        }
        if (i3 != i2) {
            throw new RuntimeException("squared distance not working?");
        }
        i2 = 0;
        int i5 = -1;
        d = Double.MAX_VALUE;
        while (i2 < dArr.length) {
            dArr3[0] = dArr[i2 + 0];
            dArr3[1] = dArr[i2 + 1];
            dArr3[2] = dArr[i2 + 2];
            pow = aa.m7221a(dArr2, dArr3);
            if (pow < d) {
                i4 = i2;
            } else {
                pow = d;
                i4 = i5;
            }
            i2 += 3;
            i5 = i4;
            d = pow;
        }
        if (i3 != i5) {
            C0375a.m1071a(dArr[i5 + 0], dArr[i5 + 1], dArr[i5 + 2]);
        } else {
            i5 = i3;
        }
        return C0375a.m1071a(dArr[i5], dArr[i5 + 1], dArr[i5 + 2]);
    }

    public static C0871c m7383a(C0871c c0871c, boolean z) {
        return c0871c != null ? new C0871c(m7382a(c0871c.f2659a, z), c0871c.f2660b) : null;
    }

    public static C0871c m7384a(C0872b c0872b, String str, float f) {
        C0871c c0871c = null;
        for (String str2 : str.split("[, ]*if[ ]*\\([ ]*|[ ]*\\)[ ]*,[ ]*")) {
            String str22;
            if (str22.length() > 0) {
                float f2 = 0.0f;
                float f3 = 1.0f;
                Object obj = null;
                int indexOf = str22.indexOf(58);
                if (indexOf >= 0) {
                    for (String str3 : str22.substring(0, indexOf).split("[ ]*,[ ]*")) {
                        if (str3.indexOf(45) >= 0) {
                            String[] split = str3.split("[ ]*-[ ]*");
                            switch (split.length) {
                                case 1:
                                    f2 = Float.parseFloat(split[0]);
                                    break;
                                case 2:
                                    f2 = Float.parseFloat(split[0]);
                                    f3 = Float.parseFloat(split[1]);
                                    break;
                                default:
                                    break;
                            }
                        } else if (str3.contains("dark")) {
                            obj = 1;
                        } else if (str3.contains("light")) {
                            obj = -1;
                        }
                    }
                    str22 = str22.substring(indexOf + 1);
                }
                if (f >= f2 && f <= r2) {
                    for (String str4 : r4.toLowerCase().split("[ ]*,[ ]*")) {
                        c0871c = null;
                        if (c0872b != null) {
                            if (str4.contains("neutral")) {
                                c0871c = c0872b.m2547a(f8212h);
                            } else {
                                boolean contains = str4.contains("vibrant");
                                boolean contains2 = str4.contains("muted");
                                boolean contains3 = str4.contains("dominant");
                                if (str4.contains("dark")) {
                                    c0871c = contains ? c0872b.m2547a(C0874c.f2677c) : contains2 ? c0872b.m2547a(C0874c.f2680f) : contains3 ? c0872b.m2547a(f8206b) : c0872b.m2547a(f8210f);
                                } else if (str4.contains("light")) {
                                    c0871c = contains ? c0872b.m2547a(C0874c.f2675a) : contains2 ? c0872b.m2547a(C0874c.f2678d) : contains3 ? c0872b.m2547a(f8207c) : c0872b.m2547a(f8211g);
                                } else if (contains) {
                                    c0871c = c0872b.m2547a(C0874c.f2676b);
                                } else if (contains2) {
                                    c0871c = c0872b.m2547a(C0874c.f2679e);
                                } else if (contains3) {
                                    c0871c = c0872b.m2547a(f8205a);
                                }
                            }
                        }
                        if (!(obj == null || c0871c == null || obj == null)) {
                            boolean c = aa.m7228c(c0871c.f2659a);
                            switch (obj) {
                                case -1:
                                    if (c) {
                                        c0871c = null;
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (!c) {
                                        c0871c = null;
                                        break;
                                    }
                                    break;
                            }
                        }
                        if (c0871c != null) {
                            return c0871c;
                        }
                    }
                    continue;
                }
            }
        }
        return c0871c;
    }

    public static void m7385a(C0872b c0872b) {
        if (!Collections.unmodifiableList(c0872b.f2669a).isEmpty()) {
            c0872b.m2547a(C0874c.f2676b);
            c0872b.m2547a(C0874c.f2677c);
            c0872b.m2547a(C0874c.f2675a);
            c0872b.m2547a(C0874c.f2679e);
            c0872b.m2547a(C0874c.f2680f);
            c0872b.m2547a(C0874c.f2678d);
            if (!Collections.unmodifiableList(c0872b.f2669a).isEmpty()) {
                Collections.max(Collections.unmodifiableList(c0872b.f2669a), new C17123());
            }
            c0872b.m2547a(f8205a);
            c0872b.m2547a(f8206b);
            c0872b.m2547a(f8207c);
            c0872b.m2547a(f8208d);
            c0872b.m2547a(f8209e);
            c0872b.m2547a(f8210f);
            c0872b.m2547a(f8212h);
            c0872b.m2547a(f8211g);
        }
        List arrayList = new ArrayList(Collections.unmodifiableList(c0872b.f2669a));
        Collections.sort(arrayList, new C17112());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        m7390d(c0872b);
        m7389c(c0872b);
        m7388b(c0872b);
        m7388b(c0872b);
    }

    public static boolean m7386a(C0872b c0872b, C0872b c0872b2) {
        if (c0872b == null || c0872b2 == null) {
            return c0872b == c0872b2;
        } else {
            List unmodifiableList = Collections.unmodifiableList(c0872b.f2669a);
            List unmodifiableList2 = Collections.unmodifiableList(c0872b2.f2669a);
            return unmodifiableList == null ? unmodifiableList2 == null : unmodifiableList.equals(unmodifiableList2);
        }
    }

    private static double[] m7387a(boolean z) {
        int[] iArr = z ? new int[]{-12846, -769226, -2937041, -3029783, -10011977, -11457112, -4987396, -16537100, -16611119, -3610935, -11751600, -13070788, -1596, -5317, -278483, -13124, -43230, -1684967, -3155748, -10453621, -12232092, -476208, -1499549, -4056997, -3814679, -12627531, -13615201, -5051406, -16728876, -16738393, -2298424, -7617718, -9920712, -4941, -16121, -24576, -2634552, -8825528, -10665929, -1982745, -6543440, -8708190, -4464901, -14575885, -15108398, -5054501, -16738680, -16746133, -985917, -3285959, -5262293, -8014, -26624, -689152, -657931, -6381922, -10395295} : new int[]{-5138, -12846, -1074534, -1739917, -1092784, -769226, -1754827, -2937041, -3790808, -4776932, -1185802, -3029783, -5005861, -6982195, -8497214, -10011977, -10603087, -11457112, -12245088, -13558894, -1968642, -4987396, -8268550, -11549705, -14043402, -16537100, -16540699, -16611119, -16615491, -16689253, -1509911, -3610935, -5908825, -8271996, -10044566, -11751600, -12345273, -13070788, -13730510, -14983648, -537, -1596, -2659, -3722, -4520, -5317, -141259, -278483, -415707, -688361, -267801, -13124, -21615, -30107, -36797, -43230, -765666, -1684967, -2604267, -4246004, -1249295, -3155748, -5194043, -7297874, -8875876, -10453621, -11243910, -12232092, -13154481, -14273992, -203540, -476208, -749647, -1023342, -1294214, -1499549, -2614432, -4056997, -5434281, -7860657, -1512714, -3814679, -6313766, -8812853, -10720320, -12627531, -13022805, -13615201, -14142061, -15064194, -2033670, -5051406, -8331542, -11677471, -14235942, -16728876, -16732991, -16738393, -16743537, -16752540, -919319, -2298424, -3808859, -5319295, -6501275, -7617718, -8604862, -9920712, -11171025, -13407970, -1823, -4941, -8062, -10929, -13784, -16121, -19712, -24576, -28928, -37120, -1053719, -2634552, -4412764, -6190977, -7508381, -8825528, -9614271, -10665929, -11652050, -12703965, -793099, -1982745, -3238952, -4560696, -5552196, -6543440, -7461718, -8708190, -9823334, -11922292, -1838339, -4464901, -7288071, -10177034, -12409355, -14575885, -14776091, -15108398, -15374912, -15906911, -2034959, -5054501, -8336444, -11684180, -14244198, -16738680, -16742021, -16746133, -16750244, -16757440, -394265, -985917, -1642852, -2300043, -2825897, -3285959, -4142541, -5262293, -6382300, -8227049, -3104, -8014, -13184, -18611, -22746, -26624, -291840, -689152, -1086464, -1683200, -328966, -657931, -1118482, -2039584, -4342339, -6381922, -9079435, -10395295, -12434878, -14606047};
        double[] dArr = new double[(iArr.length * 3)];
        double[] dArr2 = new double[3];
        for (int i = 0; i < iArr.length; i++) {
            C0375a.m1077a(iArr[i], dArr2);
            dArr[(i * 3) + 0] = dArr2[0];
            dArr[(i * 3) + 1] = dArr2[1];
            dArr[(i * 3) + 2] = dArr2[2];
        }
        return dArr;
    }

    public static float m7388b(C0872b c0872b) {
        if (c0872b == null) {
            return -1.0f;
        }
        int i = 0;
        int i2 = 0;
        for (C0871c c0871c : Collections.unmodifiableList(c0872b.f2669a)) {
            if (aa.m7228c(c0871c.f2659a)) {
                i2 = c0871c.f2660b + i2;
            } else {
                i = c0871c.f2660b + i;
            }
        }
        return i2 + i > 0 ? ((float) i2) / ((float) (i + i2)) : 0.0f;
    }

    private static boolean m7389c(C0872b c0872b) {
        int i = 0;
        int i2 = 0;
        for (C0871c c0871c : Collections.unmodifiableList(c0872b.f2669a)) {
            if (aa.m7228c(c0871c.f2659a)) {
                i2++;
            } else {
                i++;
            }
        }
        return i2 >= i;
    }

    private static boolean m7390d(C0872b c0872b) {
        int i = 0;
        int i2 = 0;
        for (C0871c c0871c : Collections.unmodifiableList(c0872b.f2669a)) {
            if (aa.m7228c(c0871c.f2659a)) {
                i2 = c0871c.f2660b + i2;
            } else {
                i = c0871c.f2660b + i;
            }
        }
        return i2 >= i;
    }
}
