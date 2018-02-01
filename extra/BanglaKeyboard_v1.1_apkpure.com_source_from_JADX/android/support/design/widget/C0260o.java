package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.p021a.C0780a.C0770a;

final class C0260o {
    private static final int[] f1078a = new int[]{C0770a.colorPrimary};

    static void m694a(Context context) {
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1078a);
        if (!obtainStyledAttributes.hasValue(0)) {
            i = 1;
        }
        obtainStyledAttributes.recycle();
        if (i != 0) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
