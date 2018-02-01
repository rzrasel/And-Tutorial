package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.drawable.Drawable;

final class C0506f implements C0503g {
    private Context f2250a;

    private C0506f(Context context) {
        this.f2250a = context;
    }

    public final Drawable mo1311a(int i) {
        String str;
        switch (i) {
            case 0:
                str = "ic_plusone_small_off_client";
                break;
            case 1:
                str = "ic_plusone_medium_off_client";
                break;
            case 2:
                str = "ic_plusone_tall_off_client";
                break;
            default:
                str = "ic_plusone_standard_off_client";
                break;
        }
        return this.f2250a.getResources().getDrawable(this.f2250a.getResources().getIdentifier(str, "drawable", this.f2250a.getPackageName()));
    }

    public final boolean mo1312a() {
        return (this.f2250a.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", this.f2250a.getPackageName()) == 0 || this.f2250a.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", this.f2250a.getPackageName()) == 0 || this.f2250a.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", this.f2250a.getPackageName()) == 0 || this.f2250a.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", this.f2250a.getPackageName()) == 0) ? false : true;
    }
}
