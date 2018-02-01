package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@Deprecated
public final class Address implements SafeParcelable {
    public static final Creator CREATOR = new C0541a();
    String f2378a;
    String f2379b;
    String f2380c;
    String f2381d;
    String f2382e;
    String f2383f;
    String f2384g;
    String f2385h;
    String f2386i;
    boolean f2387j;
    String f2388k;
    private final int f2389l;

    Address() {
        this.f2389l = 1;
    }

    Address(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.f2389l = i;
        this.f2378a = str;
        this.f2379b = str2;
        this.f2380c = str3;
        this.f2381d = str4;
        this.f2382e = str5;
        this.f2383f = str6;
        this.f2384g = str7;
        this.f2385h = str8;
        this.f2386i = str9;
        this.f2387j = z;
        this.f2388k = str10;
    }

    public final int m3747a() {
        return this.f2389l;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0541a.m3761a(this, parcel);
    }
}
