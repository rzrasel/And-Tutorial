package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CountrySpecification implements SafeParcelable {
    public static final Creator CREATOR = new C0351a();
    String f858a;
    private final int f859b;

    CountrySpecification(int i, String str) {
        this.f859b = i;
        this.f858a = str;
    }

    public final int m1607a() {
        return this.f859b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0351a.m1609a(this, parcel);
    }
}
