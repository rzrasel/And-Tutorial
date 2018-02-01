package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.C0326f;
import com.google.android.gms.ads.C0220d;

public final class an {
    private final C0220d[] f945a;
    private final String f946b;

    public an(Context context, AttributeSet attributeSet) {
        int i = 1;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0326f.AdsAttrs);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(1);
        int i2 = !TextUtils.isEmpty(string) ? 1 : 0;
        if (TextUtils.isEmpty(string2)) {
            i = 0;
        }
        if (i2 != 0 && r1 == 0) {
            this.f945a = m1647a(string);
        } else if (i2 == 0 && r1 != 0) {
            this.f945a = m1647a(string2);
        } else if (i2 != 0) {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        this.f946b = obtainAttributes.getString(2);
        if (TextUtils.isEmpty(this.f946b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static C0220d[] m1647a(String str) {
        String[] split = str.split("\\s*,\\s*");
        C0220d[] c0220dArr = new C0220d[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    c0220dArr[i] = new C0220d("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + trim);
                }
            } else if ("BANNER".equals(trim)) {
                c0220dArr[i] = C0220d.f420a;
            } else if ("LARGE_BANNER".equals(trim)) {
                c0220dArr[i] = C0220d.f422c;
            } else if ("FULL_BANNER".equals(trim)) {
                c0220dArr[i] = C0220d.f421b;
            } else if ("LEADERBOARD".equals(trim)) {
                c0220dArr[i] = C0220d.f423d;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                c0220dArr[i] = C0220d.f424e;
            } else if ("SMART_BANNER".equals(trim)) {
                c0220dArr[i] = C0220d.f426g;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                c0220dArr[i] = C0220d.f425f;
            } else {
                throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + trim);
            }
        }
        if (c0220dArr.length != 0) {
            return c0220dArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + str);
    }

    public final String m1648a() {
        return this.f946b;
    }

    public final C0220d[] m1649a(boolean z) {
        if (z || this.f945a.length == 1) {
            return this.f945a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
