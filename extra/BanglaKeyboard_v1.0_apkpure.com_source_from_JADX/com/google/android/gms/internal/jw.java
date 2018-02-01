package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class jw implements SafeParcelable {
    public static final Creator CREATOR = new mp();
    String f1873a;
    String f1874b;
    private final int f1875c;

    jw() {
        this.f1875c = 1;
    }

    jw(int i, String str, String str2) {
        this.f1875c = i;
        this.f1873a = str;
        this.f1874b = str2;
    }

    public final int m2496a() {
        return this.f1875c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mp.m2623a(this, parcel);
    }
}
