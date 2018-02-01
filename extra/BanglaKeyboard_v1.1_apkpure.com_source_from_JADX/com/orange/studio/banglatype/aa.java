package com.orange.studio.banglatype;

import android.content.res.ColorStateList;
import android.graphics.Color;

public final class aa {
    static final int[] f8032a = new int[]{-16842910};
    static final int[] f8033b = new int[]{16842908};
    static final int[] f8034c = new int[]{16843518};
    static final int[] f8035d = new int[]{16842919};
    static final int[] f8036e = new int[]{16842912};
    static final int[] f8037f = new int[]{16842913};
    static final int[] f8038g = new int[]{-16842919, -16842908};
    static final int[] f8039h = new int[0];
    static final int[] f8040i = new int[]{16842919, 16842910};
    static final int[] f8041j = new int[]{16842908, 16842910};
    static final int[] f8042k = new int[]{16842912, 16842910};
    static final int[] f8043l = new int[]{16842913, 16842910};

    public static double m7221a(double[] dArr, double[] dArr2) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr2[0];
        double d5 = dArr2[1];
        double d6 = dArr2[2];
        double d7 = (d + d4) / 2.0d;
        double sqrt = (Math.sqrt((d2 * d2) + (d3 * d3)) + Math.sqrt((d5 * d5) + (d6 * d6))) / 2.0d;
        sqrt = (1.0d - Math.sqrt(Math.pow(sqrt, 7.0d) / (Math.pow(sqrt, 7.0d) + Math.pow(25.0d, 7.0d)))) / 2.0d;
        d2 *= 1.0d + sqrt;
        d5 *= sqrt + 1.0d;
        sqrt = Math.sqrt((d2 * d2) + (d3 * d3));
        double sqrt2 = Math.sqrt((d5 * d5) + (d6 * d6));
        double d8 = (sqrt + sqrt2) / 2.0d;
        d3 = Math.atan2(d3, d2) + (((double) (Math.atan2(d3, d2) < 0.0d ? 1 : 0)) * 6.283185307179586d);
        d5 = Math.atan2(d6, d5) + (((double) (Math.atan2(d6, d5) < 0.0d ? 1 : 0)) * 6.283185307179586d);
        d2 = Math.abs(d3 - d5) > 3.141592653589793d ? ((d3 + d5) + 6.283185307179586d) / 2.0d : (d3 + d5) / 2.0d;
        d6 = (((1.0d - (0.17d * Math.cos(d2 - 0.5235987755982988d))) + (0.24d * Math.cos(2.0d * d2))) + (0.32d * Math.cos((3.0d * d2) + 0.10471975511965977d))) - (0.2d * Math.cos((4.0d * d2) - 1.0995574287564276d));
        d3 = Math.abs(d3 - d5) <= 3.141592653589793d ? d5 - d3 : d5 <= d3 ? (d5 - d3) + 6.283185307179586d : (d5 - d3) - 6.283185307179586d;
        d = d4 - d;
        d4 = sqrt2 - sqrt;
        d3 = Math.sin(d3 / 2.0d) * (2.0d * Math.sqrt(sqrt * sqrt2));
        d5 = 1.0d + (((0.015d * (d7 - 50.0d)) * (d7 - 50.0d)) / Math.sqrt(((d7 - 50.0d) * (d7 - 50.0d)) + 20.0d));
        d7 = 1.0d + (0.045d * d8);
        d6 = (d6 * (0.015d * d8)) + 1.0d;
        return Math.sqrt((((Math.sin((Math.exp((((d2 * 57.29577951308232d) - 275.0d) / 25.0d) * (-(((57.29577951308232d * d2) - 275.0d) / 25.0d))) * 0.5235987755982988d) * 2.0d) * (-(2.0d * Math.sqrt(Math.pow(d8, 7.0d) / (Math.pow(d8, 7.0d) + Math.pow(25.0d, 7.0d)))))) * (d4 / (1.0d * d7))) * (d3 / (1.0d * d6))) + ((((d / (d5 * 1.0d)) * (d / (1.0d * d5))) + ((d4 / (1.0d * d7)) * (d4 / (1.0d * d7)))) + ((d3 / (1.0d * d6)) * (d3 / (1.0d * d6)))));
    }

    public static int m7222a(int i, int i2) {
        return (16777215 & i) | (i2 << 24);
    }

    public static int m7223a(boolean z) {
        return z ? -1 : -570425344;
    }

    public static String m7224a(int i) {
        return String.format("%08X", new Object[]{Integer.valueOf(i)});
    }

    public static String m7225a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return "ColorStateList:null";
        }
        int defaultColor = colorStateList.getDefaultColor();
        if (!colorStateList.isStateful()) {
            return "ColorStateList(stateful:false, default:" + m7224a(defaultColor) + ")";
        }
        String str = "ColorStateList(stateful:true, default:" + m7224a(defaultColor);
        int colorForState = colorStateList.getColorForState(f8032a, defaultColor);
        if (colorForState != defaultColor) {
            str = str + ", disabled:" + m7224a(colorForState);
        }
        colorForState = colorStateList.getColorForState(f8040i, defaultColor);
        if (colorForState != defaultColor) {
            str = str + ", pressed:" + m7224a(colorForState);
        }
        colorForState = colorStateList.getColorForState(f8041j, defaultColor);
        if (colorForState != defaultColor) {
            str = str + ", focused:" + m7224a(colorForState);
        }
        colorForState = colorStateList.getColorForState(f8043l, defaultColor);
        if (colorForState != defaultColor) {
            str = str + ", selected:" + m7224a(colorForState);
        }
        if (colorStateList.getColorForState(f8042k, defaultColor) != defaultColor) {
            str = str + ", checked:" + m7224a(colorForState);
        }
        return str + ")";
    }

    public static int m7226b(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.8f;
        return Color.HSVToColor(fArr);
    }

    public static int m7227b(boolean z) {
        return z ? -1275068417 : -1979711488;
    }

    public static boolean m7228c(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        return ((int) (((((double) (green * green)) * 0.691d) + (((double) (red * red)) * 0.241d)) + (((double) (blue * blue)) * 0.068d))) < 16900;
    }
}
