package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ju implements SafeParcelable {
    public static final Creator CREATOR = new mo();
    long f1870a;
    long f1871b;
    private final int f1872c;

    ju() {
        this.f1872c = 1;
    }

    ju(int i, long j, long j2) {
        this.f1872c = i;
        this.f1870a = j;
        this.f1871b = j2;
    }

    public final int m2494a() {
        return this.f1872c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mo.m2622a(this, parcel);
    }
}
