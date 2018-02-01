package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class jk implements SafeParcelable {
    public static final Creator CREATOR = new mj();
    String f1848a;
    String f1849b;
    private final int f1850c;

    jk() {
        this.f1850c = 1;
    }

    jk(int i, String str, String str2) {
        this.f1850c = i;
        this.f1848a = str;
        this.f1849b = str2;
    }

    public final int m2486a() {
        return this.f1850c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mj.m2617a(this, parcel);
    }
}
