package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class cb implements SafeParcelable {
    public static final ck CREATOR = new ck();
    public final int f1092a;
    public final String f1093b;
    public final String f1094c;
    public final String f1095d;
    public final String f1096e;
    public final String f1097f;
    public final String f1098g;
    public final String f1099h;

    public cb(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f1092a = i;
        this.f1093b = str;
        this.f1094c = str2;
        this.f1095d = str3;
        this.f1096e = str4;
        this.f1097f = str5;
        this.f1098g = str6;
        this.f1099h = str7;
    }

    public cb(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(1, str, str2, str3, str4, str5, str6, str7);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ck.m1788a(this, parcel);
    }
}
