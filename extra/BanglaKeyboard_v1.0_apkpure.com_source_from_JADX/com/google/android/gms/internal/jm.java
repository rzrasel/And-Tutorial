package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class jm implements SafeParcelable {
    public static final Creator CREATOR = new mk();
    String f1851a;
    String f1852b;
    ArrayList f1853c;
    private final int f1854d;

    jm() {
        this.f1854d = 1;
        this.f1853c = new ArrayList();
    }

    jm(int i, String str, String str2, ArrayList arrayList) {
        this.f1854d = i;
        this.f1851a = str;
        this.f1852b = str2;
        this.f1853c = arrayList;
    }

    public final int m2488a() {
        return this.f1854d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mk.m2618a(this, parcel);
    }
}
