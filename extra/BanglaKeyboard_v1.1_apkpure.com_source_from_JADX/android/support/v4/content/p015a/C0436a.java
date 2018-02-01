package android.support.v4.content.p015a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p003a.C0054a.C0053h;
import android.support.v4.p016d.C0444a;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class C0436a {

    public interface C0432a {
    }

    public static final class C0433b implements C0432a {
        public final C0434c[] f1411a;

        public C0433b(C0434c[] c0434cArr) {
            this.f1411a = c0434cArr;
        }
    }

    public static final class C0434c {
        public final String f1412a;
        public int f1413b;
        public boolean f1414c;
        public int f1415d;

        public C0434c(String str, int i, boolean z, int i2) {
            this.f1412a = str;
            this.f1413b = i;
            this.f1414c = z;
            this.f1415d = i2;
        }
    }

    public static final class C0435d implements C0432a {
        public final C0444a f1416a;
        public final int f1417b;
        public final int f1418c;

        public C0435d(C0444a c0444a, int i, int i2) {
            this.f1416a = c0444a;
            this.f1418c = i;
            this.f1417b = i2;
        }
    }

    public static C0432a m1149a(XmlPullParser xmlPullParser, Resources resources) {
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
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return C0436a.m1153b(xmlPullParser, resources);
        }
        C0436a.m1152a(xmlPullParser);
        return null;
    }

    public static List<List<byte[]>> m1150a(Resources resources, int i) {
        List<List<byte[]>> list = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                List<List<byte[]>> arrayList = new ArrayList();
                if ((obtainTypedArray.getResourceId(0, 0) != 0 ? 1 : 0) != 0) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        arrayList.add(C0436a.m1151a(resources.getStringArray(obtainTypedArray.getResourceId(i2, 0))));
                    }
                    list = arrayList;
                } else {
                    arrayList.add(C0436a.m1151a(resources.getStringArray(i)));
                    list = arrayList;
                }
            }
            obtainTypedArray.recycle();
        }
        return list != null ? list : Collections.emptyList();
    }

    private static List<byte[]> m1151a(String[] strArr) {
        List<byte[]> arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    private static void m1152a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
                default:
                    break;
            }
        }
    }

    private static C0432a m1153b(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0053h.FontFamily);
        String string = obtainAttributes.getString(C0053h.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0053h.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0053h.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0053h.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0053h.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0053h.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            List arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(C0436a.m1154c(xmlPullParser, resources));
                    } else {
                        C0436a.m1152a(xmlPullParser);
                    }
                }
            }
            return arrayList.isEmpty() ? null : new C0433b((C0434c[]) arrayList.toArray(new C0434c[arrayList.size()]));
        } else {
            while (xmlPullParser.next() != 3) {
                C0436a.m1152a(xmlPullParser);
            }
            return new C0435d(new C0444a(string, string2, string3, C0436a.m1150a(resources, resourceId)), integer, integer2);
        }
    }

    private static C0434c m1154c(XmlPullParser xmlPullParser, Resources resources) {
        boolean z = true;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0053h.FontFamilyFont);
        int i = obtainAttributes.getInt(C0053h.FontFamilyFont_fontWeight, 400);
        if (1 != obtainAttributes.getInt(C0053h.FontFamilyFont_fontStyle, 0)) {
            z = false;
        }
        int resourceId = obtainAttributes.getResourceId(C0053h.FontFamilyFont_font, 0);
        String string = obtainAttributes.getString(C0053h.FontFamilyFont_font);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            C0436a.m1152a(xmlPullParser);
        }
        return new C0434c(string, i, z, resourceId);
    }
}
