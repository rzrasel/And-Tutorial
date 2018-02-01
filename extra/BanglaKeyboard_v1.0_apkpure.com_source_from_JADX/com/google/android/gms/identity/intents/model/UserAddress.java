package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UserAddress implements SafeParcelable {
    public static final Creator CREATOR = new C0352b();
    String f860a;
    String f861b;
    String f862c;
    String f863d;
    String f864e;
    String f865f;
    String f866g;
    String f867h;
    String f868i;
    String f869j;
    String f870k;
    String f871l;
    boolean f872m;
    String f873n;
    String f874o;
    private final int f875p;

    UserAddress() {
        this.f875p = 1;
    }

    UserAddress(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.f875p = i;
        this.f860a = str;
        this.f861b = str2;
        this.f862c = str3;
        this.f863d = str4;
        this.f864e = str5;
        this.f865f = str6;
        this.f866g = str7;
        this.f867h = str8;
        this.f868i = str9;
        this.f869j = str10;
        this.f870k = str11;
        this.f871l = str12;
        this.f872m = z;
        this.f873n = str13;
        this.f874o = str14;
    }

    public final int m1608a() {
        return this.f875p;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0352b.m1610a(this, parcel);
    }
}
