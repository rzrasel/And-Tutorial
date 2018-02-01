package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

final class C0505e implements C0503g {
    private Context f2249a;

    private C0505e(Context context) {
        this.f2249a = context;
    }

    public final Drawable mo1311a(int i) {
        try {
            String str;
            Resources resources = this.f2249a.createPackageContext("com.google.android.gms", 4).getResources();
            String str2 = "com.google.android.gms";
            switch (i) {
                case 0:
                    str = "ic_plusone_small";
                    break;
                case 1:
                    str = "ic_plusone_medium";
                    break;
                case 2:
                    str = "ic_plusone_tall";
                    break;
                default:
                    str = "ic_plusone_standard";
                    break;
            }
            return resources.getDrawable(resources.getIdentifier(str, "drawable", str2));
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public final boolean mo1312a() {
        try {
            this.f2249a.createPackageContext("com.google.android.gms", 4).getResources();
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
