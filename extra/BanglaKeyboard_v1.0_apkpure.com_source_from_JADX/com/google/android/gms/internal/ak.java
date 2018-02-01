package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.C0220d;
import com.google.android.gms.ads.C0223f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ak implements SafeParcelable {
    public static final C0402q CREATOR = new C0402q();
    public final int f934a;
    public final String f935b;
    public final int f936c;
    public final int f937d;
    public final boolean f938e;
    public final int f939f;
    public final int f940g;
    public final ak[] f941h;

    public ak() {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }

    ak(int i, String str, int i2, int i3, boolean z, int i4, int i5, ak[] akVarArr) {
        this.f934a = i;
        this.f935b = str;
        this.f936c = i2;
        this.f937d = i3;
        this.f938e = z;
        this.f939f = i4;
        this.f940g = i5;
        this.f941h = akVarArr;
    }

    public ak(Context context, C0220d c0220d) {
        this(context, new C0220d[]{c0220d});
    }

    public ak(Context context, C0220d[] c0220dArr) {
        int i;
        int i2;
        int i3 = 0;
        C0220d c0220d = c0220dArr[0];
        this.f934a = 2;
        this.f938e = false;
        this.f939f = c0220d.m921b();
        this.f936c = c0220d.m919a();
        int i4 = this.f939f == -1 ? 1 : 0;
        int i5 = this.f936c == -2 ? 1 : 0;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (i4 != 0) {
            this.f940g = displayMetrics.widthPixels;
            i = (int) (((float) this.f940g) / displayMetrics.density);
        } else {
            i2 = this.f939f;
            this.f940g = fz.m2029a(displayMetrics, this.f939f);
            i = i2;
        }
        i2 = i5 != 0 ? m1643c(displayMetrics) : this.f936c;
        this.f937d = fz.m2029a(displayMetrics, i2);
        if (i4 == 0 && i5 == 0) {
            this.f935b = c0220d.toString();
        } else {
            this.f935b = i + "x" + i2 + "_as";
        }
        if (c0220dArr.length > 1) {
            this.f941h = new ak[c0220dArr.length];
            while (i3 < c0220dArr.length) {
                this.f941h[i3] = new ak(context, c0220dArr[i3]);
                i3++;
            }
            return;
        }
        this.f941h = null;
    }

    public ak(ak akVar, ak[] akVarArr) {
        this(2, akVar.f935b, akVar.f936c, akVar.f937d, akVar.f938e, akVar.f939f, akVar.f940g, akVarArr);
    }

    public static int m1641a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int m1642b(DisplayMetrics displayMetrics) {
        return (int) (((float) m1643c(displayMetrics)) * displayMetrics.density);
    }

    private static int m1643c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= 720 ? 50 : 90;
    }

    public final C0220d m1644a() {
        return C0223f.m928a(this.f939f, this.f936c, this.f935b);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0402q.m2753a(this, parcel, i);
    }
}
