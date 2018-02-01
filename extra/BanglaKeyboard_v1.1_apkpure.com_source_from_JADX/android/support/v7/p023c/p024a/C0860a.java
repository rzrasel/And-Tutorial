package android.support.v7.p023c.p024a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.p006a.C0375a;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p021a.C0780a.C0779j;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class C0860a {
    public static ColorStateList m2511a(Resources resources, XmlPullParser xmlPullParser, Theme theme) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return C0860a.m2512a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static ColorStateList m2512a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        Object a;
        int depth = xmlPullParser.getDepth() + 1;
        Object obj = new int[20][];
        int i = 0;
        Object obj2 = new int[20];
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            } else if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                int[] iArr = C0779j.ColorStateListItem;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int color = obtainAttributes.getColor(C0779j.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (obtainAttributes.hasValue(C0779j.ColorStateListItem_android_alpha)) {
                    f = obtainAttributes.getFloat(C0779j.ColorStateListItem_android_alpha, 1.0f);
                } else if (obtainAttributes.hasValue(C0779j.ColorStateListItem_alpha)) {
                    f = obtainAttributes.getFloat(C0779j.ColorStateListItem_alpha, 1.0f);
                }
                obtainAttributes.recycle();
                int i2 = 0;
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i3 = 0;
                while (i3 < attributeCount) {
                    next = attributeSet.getAttributeNameResource(i3);
                    if (next == 16843173 || next == 16843551 || next == C0770a.alpha) {
                        next = i2;
                    } else {
                        int i4 = i2 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            next = -next;
                        }
                        iArr2[i2] = next;
                        next = i4;
                    }
                    i3++;
                    i2 = next;
                }
                Object trimStateSet = StateSet.trimStateSet(iArr2, i2);
                a = C0863c.m2518a((int[]) obj2, i, C0375a.m1081b(color, Math.round(((float) Color.alpha(color)) * f)));
                i++;
                obj = (int[][]) C0863c.m2519a((Object[]) obj, i, trimStateSet);
                obj2 = a;
            }
        }
        a = new int[i];
        Object obj3 = new int[i][];
        System.arraycopy(obj2, 0, a, 0, i);
        System.arraycopy(obj, 0, obj3, 0, i);
        return new ColorStateList(obj3, a);
    }
}
