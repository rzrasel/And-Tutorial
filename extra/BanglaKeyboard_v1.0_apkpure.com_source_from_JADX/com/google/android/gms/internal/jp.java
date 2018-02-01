package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class jp implements SafeParcelable {
    public static final Creator CREATOR = new ml();
    int f1860a;
    String f1861b;
    double f1862c;
    String f1863d;
    long f1864e;
    int f1865f;
    private final int f1866g;

    jp() {
        this.f1866g = 1;
        this.f1865f = -1;
        this.f1860a = -1;
        this.f1862c = -1.0d;
    }

    jp(int i, int i2, String str, double d, String str2, long j, int i3) {
        this.f1866g = i;
        this.f1860a = i2;
        this.f1861b = str;
        this.f1862c = d;
        this.f1863d = str2;
        this.f1864e = j;
        this.f1865f = i3;
    }

    public final int m2490a() {
        return this.f1866g;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ml.m2619a(this, parcel);
    }
}
