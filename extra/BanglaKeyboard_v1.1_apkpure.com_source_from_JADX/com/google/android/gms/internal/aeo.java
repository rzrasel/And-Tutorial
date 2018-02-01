package com.google.android.gms.internal;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@aqv
public final class aeo extends afu {
    private static final int f4962i = Color.rgb(12, 174, 206);
    private static final int f4963j;
    private static int f4964k;
    private static int f4965l = f4962i;
    final String f4966a;
    final List<aeq> f4967b = new ArrayList();
    final int f4968c;
    final int f4969d;
    final int f4970e;
    final int f4971f;
    final int f4972g;
    final boolean f4973h;
    private final List<afy> f4974m = new ArrayList();

    static {
        int rgb = Color.rgb(204, 204, 204);
        f4963j = rgb;
        f4964k = rgb;
    }

    public aeo(String str, List<aeq> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f4966a = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                aeq com_google_android_gms_internal_aeq = (aeq) list.get(i3);
                this.f4967b.add(com_google_android_gms_internal_aeq);
                this.f4974m.add(com_google_android_gms_internal_aeq);
            }
        }
        this.f4968c = num != null ? num.intValue() : f4964k;
        this.f4969d = num2 != null ? num2.intValue() : f4965l;
        this.f4970e = num3 != null ? num3.intValue() : 12;
        this.f4971f = i;
        this.f4972g = i2;
        this.f4973h = z;
    }

    public final String mo1748a() {
        return this.f4966a;
    }

    public final List<afy> mo1749b() {
        return this.f4974m;
    }
}
