package android.support.v4.content.p015a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public final class C0438c {
    public static float m1157a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !C0438c.m1167a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int m1158a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int m1159a(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static int m1160a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        return !C0438c.m1167a(xmlPullParser, str) ? 0 : typedArray.getResourceId(i, 0);
    }

    public static int m1161a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0438c.m1167a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static TypedArray m1162a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue m1163a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        return !C0438c.m1167a(xmlPullParser, str) ? null : typedArray.peekValue(0);
    }

    public static String m1164a(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean m1165a(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean m1166a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !C0438c.m1167a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    public static boolean m1167a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int m1168b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0438c.m1167a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static CharSequence m1169b(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String m1170b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        return !C0438c.m1167a(xmlPullParser, str) ? null : typedArray.getString(i);
    }

    public static CharSequence[] m1171c(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }
}
