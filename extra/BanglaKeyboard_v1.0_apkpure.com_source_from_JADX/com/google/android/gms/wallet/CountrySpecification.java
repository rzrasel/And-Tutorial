package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@Deprecated
public class CountrySpecification implements SafeParcelable {
    public static final Creator CREATOR = new C0543c();
    String f2394a;
    private final int f2395b;

    CountrySpecification(int i, String str) {
        this.f2395b = i;
        this.f2394a = str;
    }

    public final int m3749a() {
        return this.f2395b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0543c.m3763a(this, parcel);
    }
}
