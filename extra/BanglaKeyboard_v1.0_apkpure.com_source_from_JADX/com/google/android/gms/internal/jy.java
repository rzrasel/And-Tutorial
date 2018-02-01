package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class jy implements SafeParcelable {
    public static final Creator CREATOR = new mq();
    String f1876a;
    String f1877b;
    ju f1878c;
    jw f1879d;
    jw f1880e;
    private final int f1881f;

    jy() {
        this.f1881f = 1;
    }

    jy(int i, String str, String str2, ju juVar, jw jwVar, jw jwVar2) {
        this.f1881f = i;
        this.f1876a = str;
        this.f1877b = str2;
        this.f1878c = juVar;
        this.f1879d = jwVar;
        this.f1880e = jwVar2;
    }

    public final int m2498a() {
        return this.f1881f;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mq.m2624a(this, parcel, i);
    }
}
