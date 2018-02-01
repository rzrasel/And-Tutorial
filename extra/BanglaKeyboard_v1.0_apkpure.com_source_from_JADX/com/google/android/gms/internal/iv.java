package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class iv implements SafeParcelable {
    public static final Creator CREATOR = new lv();
    int[] f1838a;
    private final int f1839b;

    iv() {
        this(1, null);
    }

    iv(int i, int[] iArr) {
        this.f1839b = i;
        this.f1838a = iArr;
    }

    public final int m2436a() {
        return this.f1839b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        lv.m2560a(this, parcel);
    }
}
