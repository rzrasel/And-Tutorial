package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class js implements SafeParcelable {
    public static final Creator CREATOR = new mn();
    String f1867a;
    String f1868b;
    private final int f1869c;

    js() {
        this.f1869c = 1;
    }

    js(int i, String str, String str2) {
        this.f1869c = i;
        this.f1867a = str;
        this.f1868b = str2;
    }

    public final int m2492a() {
        return this.f1869c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mn.m2621a(this, parcel);
    }
}
