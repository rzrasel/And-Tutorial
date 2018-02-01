package android.support.v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p021a.C0780a.C0771b;
import android.support.v7.p021a.C0780a.C0773d;
import android.support.v7.p021a.C0780a.C0779j;

public final class C0936a {
    public Context f2878a;

    private C0936a(Context context) {
        this.f2878a = context;
    }

    public static C0936a m2719a(Context context) {
        return new C0936a(context);
    }

    public final int m2720a() {
        Configuration configuration = this.f2878a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) ? 5 : (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) ? 4 : i >= 360 ? 3 : 2;
    }

    public final boolean m2721b() {
        return this.f2878a.getResources().getBoolean(C0771b.abc_action_bar_embed_tabs);
    }

    public final int m2722c() {
        TypedArray obtainStyledAttributes = this.f2878a.obtainStyledAttributes(null, C0779j.ActionBar, C0770a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0779j.ActionBar_height, 0);
        Resources resources = this.f2878a.getResources();
        if (!m2721b()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0773d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public final int m2723d() {
        return this.f2878a.getResources().getDimensionPixelSize(C0773d.abc_action_bar_stacked_tab_max_width);
    }
}
