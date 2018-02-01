package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class dx implements SafeParcelable {
    public static final gc CREATOR = new gc();
    public final int f1221a;
    public String f1222b;
    public int f1223c;
    public int f1224d;
    public boolean f1225e;

    public dx() {
        this(1, "afma-sdk-a-v4452000.4452000.0", 4452000, 4452000, true);
    }

    dx(int i, String str, int i2, int i3, boolean z) {
        this.f1221a = i;
        this.f1222b = str;
        this.f1223c = i2;
        this.f1224d = i3;
        this.f1225e = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        gc.m2072a(this, parcel);
    }
}
