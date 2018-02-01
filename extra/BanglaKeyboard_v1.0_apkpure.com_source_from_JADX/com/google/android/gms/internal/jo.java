package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class jo implements SafeParcelable {
    public static final Creator CREATOR = new mm();
    String f1855a;
    jp f1856b;
    String f1857c;
    ju f1858d;
    private final int f1859e;

    jo() {
        this.f1859e = 1;
    }

    jo(int i, String str, jp jpVar, String str2, ju juVar) {
        this.f1859e = i;
        this.f1855a = str;
        this.f1856b = jpVar;
        this.f1857c = str2;
        this.f1858d = juVar;
    }

    public final int m2489a() {
        return this.f1859e;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mm.m2620a(this, parcel, i);
    }
}
